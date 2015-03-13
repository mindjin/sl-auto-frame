package com.sl.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class GenericDAO<T extends BaseEntity,ID extends Serializable> implements DAO<T, ID> {
	
	private Class<T> entity;
	private Session session;
	public GenericDAO(Class<T> entity){
		this.entity = entity;
	}
	
	private Session createNewSession(){
		return HibernateUtil.getSessionFactory().getCurrentSession();		
	}
	
	private void startNewTransaction(Session session){
		session.beginTransaction();
	}
	
	private void createNewSessionAndTransaction() {
        session = createNewSession();

        if (session != null) {
            startNewTransaction(session);
        }
    }
	
	 private void commitTransaction() {
	        if (session != null) {
	            session.getTransaction().commit();
	        }
	    }
	 
	 private void rollbackTransaction() {
	        if (session != null && session.getTransaction().isActive()) {
	            session.getTransaction().rollback();
	        }
	    }

	@SuppressWarnings("unchecked")
	@Override
	public T findById(ID id) {
		 T object = null;

	        try {
	            createNewSessionAndTransaction();
	            if (session != null) {
	                object = (T) session.get(entity, id);
	            }
	            commitTransaction();
	        } catch (HibernateException e) {
	            rollbackTransaction();
	            object = null;
	        }

	        return object;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		 List<T> objects = null;

	        try {
	            createNewSessionAndTransaction();
	            if (session != null) {
	                objects = (List<T>) session.createQuery(String.format("from %s", entity.getSimpleName())).list();
	            }
	            commitTransaction();
	        } catch (HibernateException e) {
	            rollbackTransaction();
	            objects = null;
	        }

	        return objects;
	}

	@Override
	public void save(T entity) {
		  try {
	            createNewSessionAndTransaction();
	            if (session != null && entity != null) {
	                session.merge(entity);
	            }
	            commitTransaction();
	        } catch (HibernateException e) {
	            rollbackTransaction();
	        }
	    }
	

}
