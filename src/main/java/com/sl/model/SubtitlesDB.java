package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;

@DynamicUpdate
@Entity
@Table(name="subtitles")
public class SubtitlesDB extends BaseEntity{

	
	
	private static final long serialVersionUID = 6303060726908674421L;
	
	@Column
	private String name;
	@Column
	private String PID;
	@Column
	private String teletextPage;
	@Column
	private String locations;
	
	public String getName() {
		return name;
	}
	public SubtitlesDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getPID() {
		return PID;
	}
	public SubtitlesDB setPID(String pID) {
		PID = pID;
		return this;
	}
	public String getTeletextPage() {
		return teletextPage;
	}
	public SubtitlesDB setTeletextPage(String teletextPage) {
		this.teletextPage = teletextPage;
		return this;
	}
	public String getLocations() {
		return locations;
	}
	public SubtitlesDB setLocations(String locations) {
		this.locations = locations;
		return this;
	}
	
	@Override
    public String toString() {
        return "[name : " + getName() + ";\n" + 
        		"PID : " + getPID() + ";\n" +
        		"teletextPage : " + getTeletextPage() + ";\n" +
        		"locations : " + getLocations() + ";\n]";
    }
	
}
