package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;

@DynamicUpdate
@Entity
@Table(name="audiopids")
public class AudioPIDsDB  extends BaseEntity{
	

	private static final long serialVersionUID = -9135457247323586553L;

	@Column
	private String name;
	
	@Column
	private String PID;
	
	@Column
	private String audioPIDType;

	@Column
	private String locations;

	public String getName() {
		return name;
	}

	public AudioPIDsDB setName(String name) {
		this.name = name;

		return this;
	}

	public String getPID() {
		return PID;
	}

	public AudioPIDsDB setPID(String pID) {
		PID = pID;
		return this;
	}

	public String getAudioPIDType() {
		return audioPIDType;
	}

	public AudioPIDsDB setAudioPIDType(String audioPIDType) {
		this.audioPIDType = audioPIDType;
		return this;
	}

	public String getLocations() {
		return locations;
	}

	public AudioPIDsDB setLocations(String locations) {
		this.locations = locations;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "[name : " + getName() + ";\n" + 
	        		"PID : " + getPID() + ";\n" +
	        		"audioPIDType : " + getAudioPIDType() + ";\n" +
	        		"locations : " + getLocations() + ";\n]";
	    }

	
}
