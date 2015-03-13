package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="multicastgroup")
public class MulticastGroupDB extends BaseEntity{
	
	private static final long serialVersionUID = 8782184773785555999L;
	@Column
	private String backupUrl1;
	@Column
	private String backupUrl2;
	@Column
	private String bitrate;
	@Column
	private String externalId;
	@Column
	private String hqUrl;
	@Column
	private String location;
	@Column
	private String nPVRChannelID;
	@Column
	private String pipUrl;
	@Column
	private String plcUrl;
	@Column
	private String url;
	@Column
	private String viewPVRChannelID;
	@Column
	private String smartRecorders;
	
	public String getBackupUrl1() {
		return backupUrl1;
	}
	public MulticastGroupDB setBackupUrl1(String backupUrl1) {
		this.backupUrl1 = backupUrl1;
		return this;
	}
	public String getBackupUrl2() {
		return backupUrl2;
	}
	public MulticastGroupDB setBackupUrl2(String backupUrl2) {
		this.backupUrl2 = backupUrl2;
		return this;
	}
	public String getBitrate() {
		return bitrate;
	}
	public MulticastGroupDB setBitrate(String bitrate) {
		this.bitrate = bitrate;
		return this;
	}
	public String getExternalId() {
		return externalId;
	}
	public MulticastGroupDB setExternalId(String externalId) {
		this.externalId = externalId;
		return this;
	}
	public String getHqUrl() {
		return hqUrl;
	}
	public MulticastGroupDB setHqUrl(String hqUrl) {
		this.hqUrl = hqUrl;
		return this;
	}
	public String getLocation() {
		return location;
	}
	public MulticastGroupDB setLocation(String location) {
		this.location = location;
		return this;
	}
	public String getNPVRChannelID() {
		return nPVRChannelID;
	}
	public MulticastGroupDB setNPVRChannelID(String nPVRChannelID) {
		this.nPVRChannelID = nPVRChannelID;
		return this;
	}
	public String getPipUrl() {
		return pipUrl;
	}
	public MulticastGroupDB setPipUrl(String pipUrl) {
		this.pipUrl = pipUrl;
		return this;
	}
	public String getPlcUrl() {
		return plcUrl;
	}
	public MulticastGroupDB setPlcUrl(String plcUrl) {
		this.plcUrl = plcUrl;
		return this;
	}
	public String getUrl() {
		return url;
	}
	public MulticastGroupDB setUrl(String url) {
		this.url = url;
		return this;
	}
	public String getViewPVRChannelID() {
		return viewPVRChannelID;
	}
	public MulticastGroupDB setViewPVRChannelID(String viewPVRChannelID) {
		this.viewPVRChannelID = viewPVRChannelID;
		return this;
	}
	public String getSmartRecorders() {
		return smartRecorders;
	}
	public MulticastGroupDB setSmartRecorders(String smartRecorders) {
		this.smartRecorders = smartRecorders;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "backupUrl1 : " + getBackupUrl1() + ";\n" + 
	        		"backupUrl2 : " + getBackupUrl2() + ";\n" + 
	        		"bitrate : " + getBitrate() + ";\n" + 
	        		"externalId : " + getExternalId() + ";\n" + 
	        		"hqUrl : " + getHqUrl() + ";\n" + 
	        		"location : " + getLocation() + ";\n" + 
	        		"nPVRChannelID : " + getNPVRChannelID() + ";\n" + 
	        		"pipUrl : " + getPipUrl() + ";\n" + 
	        		"plcUrl : " + getPlcUrl() + ";\n" + 
	        		"url : " + getUrl() + ";\n" + 
	        		"viewPVRChannelID : " + getViewPVRChannelID() + ";\n" + 
	        		"smartRecorders : " + getSmartRecorders() + ";\n]";
	    }

}
