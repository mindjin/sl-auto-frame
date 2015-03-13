package com.sl.hibernate;

import java.io.Serializable;
import java.util.List;

public interface DAO<T extends BaseEntity, ID extends Serializable> {
	 T findById(ID id);

	    List<T> findAll();

	    void save(final T entity);
}
