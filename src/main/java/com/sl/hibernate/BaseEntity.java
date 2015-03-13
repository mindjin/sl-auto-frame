package com.sl.hibernate;



import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class BaseEntity implements Serializable{

	
	private static final long serialVersionUID = -1060280260957105232L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Transient
    private DAO dao;
	
	public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
    
    public void setDAO(DAO dao){
    	this.dao = dao;
    }
    
    public void save() {
        dao.save(this);
    }
	
}
