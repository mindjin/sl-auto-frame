package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="karaoke")
public class KaraokeDB extends BaseEntity{	
	
	private static final long serialVersionUID = 6807352548751928535L;
	
	@Column
	private String name;
	@Column
	private String locations;
	@Column
	private String karaokePackages;
	@Column
	private String genres;
	@Column
	private String performer;
	@Column
	private String startDate;
	@Column
	private String endDate;
	@Column
	private String descriptionOrInstruction;
	@Column
	private String contractor;
	@Column
	private String externalId;
	@Column
	private String ownerId;
	
	
	public String getName() {
		return name;
	}
	public KaraokeDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getLocations() {
		return locations;
	}
	public KaraokeDB setLocations(String locations) {
		this.locations = locations;
		return this;
	}
	public String getKaraokePackages() {
		return karaokePackages;
	}
	public KaraokeDB setKaraokePackages(String karaokePackages) {
		this.karaokePackages = karaokePackages;
		return this;
	}
	public String getGenres() {
		return genres;
	}
	public KaraokeDB setGenres(String genres) {
		this.genres = genres;
		return this;
	}
	public String getPerformer() {
		return performer;
	}
	public KaraokeDB setPerformer(String performer) {
		this.performer = performer;
		return this;
	}
	public String getStartDate() {
		return startDate;
	}
	public KaraokeDB setStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}
	public String getEndDate() {
		return endDate;
	}
	public KaraokeDB setEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}
	public String getDescriptionOrInstruction() {
		return descriptionOrInstruction;
	}
	public KaraokeDB setDescriptionOrInstruction(String descriptionOrInstruction) {
		this.descriptionOrInstruction = descriptionOrInstruction;
		return this;
	}
	public String getContractor() {
		return contractor;
	}
	public KaraokeDB setContractor(String contractor) {
		this.contractor = contractor;
		return this;
	}
	public String getExternalId() {
		return externalId;
	}
	public KaraokeDB setExternalId(String externalId) {
		this.externalId = externalId;
		return this;
	}
	
	public String getOwnerId() {
		return ownerId;
	}
	public KaraokeDB setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "[name : " + getName() + ";\n" + 
	        		"locations : " + getLocations() + ";\n" +
	        		"karaokePackages : " + getKaraokePackages() + ";\n" +
	        		"genres : " + getGenres() + ";\n" +
	        		"performer : " + getPerformer() + ";\n" +
//	        		"startDate : " + getStartDate() + ";\n" +
//	        		"endDate : " + getEndDate() + ";\n" +
	        		"descriptionOrInstruction : " + getDescriptionOrInstruction() + ";\n" +
	        		"contractor : " + getContractor() + ";\n" +
	        		"externalId : " + getExternalId() + ";\n" +
	        		"ownerId : " + getOwnerId() + ";\n]";
	        
	    }
	
	

}
