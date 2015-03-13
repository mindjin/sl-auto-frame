package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="audiopid")
public class AudioPidDB extends BaseEntity{

	
	private static final long serialVersionUID = 1497537010243387283L;

	@Column
	private String name;
	
	@Column
	private String PID;
	
	@Column
	private String audioPIDType;

	public String getName() {
		return name;
	}

	public AudioPidDB setName(String name) {
		this.name = name;
		return this;
	}

	public String getPID() {
		return PID;
	}

	public AudioPidDB setPID(String pID) {
		PID = pID;
		return this;
	}

	public String getAudioPIDType() {
		return audioPIDType;
	}

	public AudioPidDB setAudioPIDType(String audioPIDType) {
		this.audioPIDType = audioPIDType;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "[name : " + getName() + ";\n" + 
	        		"PID : " + getPID() + ";\n" +
	        		"audioPIDType : " + getAudioPIDType() + ";\n]";
	    }
	
	
}
