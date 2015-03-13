package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="otturl")
public class OttUrlDB extends BaseEntity{
	
	
	private static final long serialVersionUID = 303390538272749811L;
	@Column
	private String epgOffset;
	@Column
	private String externalId;
	@Column
	private String location;
	@Column
	private String url;
	
	
	public String getEpgOffset() {
		return epgOffset;
	}
	public OttUrlDB setEpgOffset(String epgOffset) {
		this.epgOffset = epgOffset;
		return this;
	}
	public String getExternalId() {
		return externalId;
	}
	public OttUrlDB setExternalId(String externalId) {
		this.externalId = externalId;
		return this;
	}
	public String getLocation() {
		return location;
	}
	public OttUrlDB setLocation(String location) {
		this.location = location;
		return this;
	}
	public String getUrl() {
		return url;
	}
	public OttUrlDB setUrl(String url) {
		this.url = url;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "epgOffset : " + getEpgOffset() + ";\n" + 
	        		"externalId : " + getExternalId() + ";\n" + 
	        		"location : " + getLocation() + ";\n" + 
	        		"url : " + getExternalId() + ";\n]";	        		

	    }


	
}
