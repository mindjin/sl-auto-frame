package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;

@DynamicUpdate
@Entity
@Table(name="assetsott")
public class AssetsOttDB extends BaseEntity{
	
	
	private static final long serialVersionUID = -872594617046419097L;
	@Column
	private String name;
	@Column
	private String assetType;
	@Column
	private String bitrate;
	@Column
	private String containerType;
	@Column
	private String durationTime;
	@Column
	private String status;
	@Column
	private String isCrypted;
	@Column
	private String isDeleted;
	@Column
	private String transport;
	@Column
	private String locations;
	public String getName() {
		return name;
	}
	public AssetsOttDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getAssetType() {
		return assetType;
	}
	public AssetsOttDB setAssetType(String assetType) {
		this.assetType = assetType;
		return this;
	}
	public String getBitrate() {
		return bitrate;
	}
	public AssetsOttDB setBitrate(String bitrate) {
		this.bitrate = bitrate;
		return this;
	}
	public String getContainerType() {
		return containerType;
	}
	public AssetsOttDB setContainerType(String containerType) {
		this.containerType = containerType;
		return this;
	}
	public String getDurationTime() {
		return durationTime;
	}
	public AssetsOttDB setDurationTime(String durationTime) {
		this.durationTime = durationTime;
		return this;
	}
	public String getStatus() {
		return status;
	}
	public AssetsOttDB setStatus(String status) {
		this.status = status;
		return this;
	}
	public String getIsCrypted() {
		return isCrypted;
	}
	public AssetsOttDB setIsCrypted(String isCrypted) {
		this.isCrypted = isCrypted;
		return this;
	}
	public String getIsDeleted() {
		return isDeleted;
	}
	public AssetsOttDB setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
		return this;
	}
	public String getTransport() {
		return transport;
	}
	public AssetsOttDB setTransport(String transport) {
		this.transport = transport;
		return this;
	}
	public String getLocations() {
		return locations;
	}
	public AssetsOttDB setLocations(String locations) {
		this.locations = locations;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "[name : " + getName() + ";\n" + 
"assetType : " + getAssetType() + ";\n" + 
"bitrate : " + getBitrate() + ";\n" + 
"containerType : " + getContainerType() + ";\n" + 
//"durationTime : " + getDurationTime() + ";\n" + 
"status : " + getStatus() + ";\n" + 
"isCrypted : " + getIsCrypted() + ";\n" + 
"isDeleted : " + getIsDeleted() + ";\n" + 
"transport : " + getTransport() + ";\n" + 
"Locations : " + getLocations() + ";\n]";
	    }

	
}
