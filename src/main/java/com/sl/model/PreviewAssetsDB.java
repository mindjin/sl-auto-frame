package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="previewassets")
public class PreviewAssetsDB extends BaseEntity{
	
	private static final long serialVersionUID = 4390928345416702829L;
	
	@Column
	private String bitrate;
	@Column
	private String containerType;
	@Column
	private String durationTime;
	@Column
	private String isCrypted;
	@Column
	private String priority;
	@Column
	private String status;
	@Column
	private String transport;	
	@Column
	private String name;
	
	
	
	public String getBitrate() {
		return bitrate;
	}
	public PreviewAssetsDB setBitrate(String bitrate) {
		this.bitrate = bitrate;
		return this;
	}
	public String getContainerType() {
		return containerType;
	}
	public PreviewAssetsDB setContainerType(String containerType) {
		this.containerType = containerType;
		return this;
	}
	public String getDurationTime() {
		return durationTime;
	}
	public PreviewAssetsDB setDurationTime(String durationTime) {
		this.durationTime = durationTime;
		return this;
	}
	public String getIsCrypted() {
		return isCrypted;
	}
	public PreviewAssetsDB setIsCrypted(String isCrypted) {
		this.isCrypted = isCrypted;
		return this;
	}
	public String getPriority() {
		return priority;
	}
	public PreviewAssetsDB setPriority(String priority) {
		this.priority = priority;
		return this;
	}
	public String getStatus() {
		return status;
	}
	public PreviewAssetsDB setStatus(String status) {
		this.status = status;
		return this;
	}
	public String getTransport() {
		return transport;
	}
	public PreviewAssetsDB setTransport(String transport) {
		this.transport = transport;
		return this;
	}
	
	public String getName() {
		return name;
	}
	public PreviewAssetsDB setName(String name) {
		this.name = name;
		return this;
	}
	
	@Override
    public String toString() {
        return "[bitrate : " + getBitrate() + ";\n" +
        		"containerType : " + getContainerType() + ";\n" +
//        		"durationTime : " + getDurationTime() + ";\n" +
        		"isCrypted : " + getIsCrypted() + ";\n" +
        		"priority : " + getPriority() + ";\n" +
        		"status : " + getStatus() + ";\n" +
        		"transport : " + getTransport() + ";\n" +
        		"name : " + getName() + ";\n]";
    }
	
	

}
