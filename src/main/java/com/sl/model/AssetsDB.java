package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="assets")
public class AssetsDB extends BaseEntity{	
	
	private static final long serialVersionUID = 2181493163146747150L;

	@Column
	private String name;
	@Column
	private String smExternalId;
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
	private String priority;
	@Column
	private String isCrypted;
	@Column
	private String isDeleted;
	@Column
	private String transport;
	@Column
	private String avalabiltyOnVideoServers;
	
	public String getName() {
		return name;
	}
	public AssetsDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getSmExternalId() {
		return smExternalId;
	}
	public AssetsDB setSmExternalId(String smExternalId) {
		this.smExternalId = smExternalId;
		return this;
	}
	public String getAssetType() {
		return assetType;
	}
	public AssetsDB setAssetType(String assetType) {
		this.assetType = assetType;
		return this;
	}
	public String getBitrate() {
		return bitrate;
	}
	public AssetsDB setBitrate(String bitrate) {
		this.bitrate = bitrate;
		return this;
	}
	public String getContainerType() {
		return containerType;
	}
	public AssetsDB setContainerType(String containerType) {
		this.containerType = containerType;
		return this;
	}
	public String getDurationTime() {
		return durationTime;
	}
	public AssetsDB setDurationTime(String durationTime) {
		this.durationTime = durationTime;
		return this;
	}
	public String getStatus() {
		return status;
	}
	public AssetsDB setStatus(String status) {
		this.status = status;
		return this;
	}
	public String getPriority() {
		return priority;
	}
	public AssetsDB setPriority(String priority) {
		this.priority = priority;
		return this;
	}
	public String getIsCrypted() {
		return isCrypted;
	}
	public AssetsDB setIsCrypted(String isCrypted) {
		this.isCrypted = isCrypted;
		return this;
	}
	public String getIsDeleted() {
		return isDeleted;
	}
	public AssetsDB setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
		return this;
	}
	public String getTransport() {
		return transport;
	}
	public AssetsDB setTransport(String transport) {
		this.transport = transport;
		return this;
	}
	public String getAvalabiltyOnVideoServers() {
		return avalabiltyOnVideoServers;
	}
	public AssetsDB setAvalabiltyOnVideoServers(
			String avalabiltyOnVideoServers) {
		this.avalabiltyOnVideoServers = avalabiltyOnVideoServers;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "[name : " + getName() + ";\n" + 
	        		"smExternalId : " + getSmExternalId() + ";\n" +
	        		"assetType : " + getAssetType() + ";\n" +
	        		"bitrate : " + getBitrate() + ";\n" +
	        		"containerType : " + getContainerType() + ";\n" +
//	        		"durationTime : " + getDurationTime() + ";\n" +
	        		"status : " + getStatus() + ";\n" +
	        		"priority : " + getPriority() + ";\n" +
	        		"isCrypted : " + getIsCrypted() + ";\n" +
	        		"isDeleted : " + getIsDeleted() + ";\n" +
	        		"transport : " + getTransport() + ";\n" +
	        		"avalabiltyOnVideoServers : " + getAvalabiltyOnVideoServers() + ";\n]";
	        
	    }

}
