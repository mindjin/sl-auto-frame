package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;

@DynamicUpdate
@Entity
@Table(name="dvbturl")
public class DvbtUrlDB extends BaseEntity{
	

	private static final long serialVersionUID = -780077066249333771L;
	
	@Column
	private String url;

	public String getUrl() {
		return url;
	}

	public DvbtUrlDB setUrl(String url) {
		this.url = url;
		return this;
	}

	 @Override
	    public String toString() {
	        return "url : " + getUrl() + ";\n]";
	    }
	
}
