package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="banners")
public class BannersDB extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -398146325969613128L;

	@Column
	private String name;	
	
	@Column
	private String description;
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
    public String toString() {
        return "[name : " + getName() + ";\n" + 
        "description : " + getDescription() + ";\n";


	}
        
}
