package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="ottpreviewassets")
public class OttPreviewAssetsDB  extends BaseEntity{
	
	
	private static final long serialVersionUID = 9011116877286237140L;
	
	@Column
	private String bitrate;
	@Column
	private String containerType;
	@Column
	private String durationTime;
	@Column
	private String isCrypted;
	@Column
	private String name;
	@Column
	private String status;
	@Column
	private String transport;
	
	public String getBitrate() {
		return bitrate;
	}
	public OttPreviewAssetsDB setBitrate(String bitrate) {
		this.bitrate = bitrate;
		return this;
	}
	public String getContainerType() {
		return containerType;
	}
	public OttPreviewAssetsDB setContainerType(String containerType) {
		this.containerType = containerType;
		return this;
	}
	public String getDurationTime() {
		return durationTime;
	}
	public OttPreviewAssetsDB setDurationTime(String durationTime) {
		this.durationTime = durationTime;
		return this;
	}
	public String getIsCrypted() {
		return isCrypted;
	}
	public OttPreviewAssetsDB setIsCrypted(String isCrypted) {
		this.isCrypted = isCrypted;
		return this;
	}
	public String getName() {
		return name;
	}
	public OttPreviewAssetsDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getStatus() {
		return status;
	}
	public OttPreviewAssetsDB setStatus(String status) {
		this.status = status;
		return this;
	}
	public String getTransport() {
		return transport;
	}
	public OttPreviewAssetsDB setTransport(String transport) {
		this.transport = transport;
		return this;
	}
	
	@Override
    public String toString() {
        return "[bitrate : " + getBitrate() + ";\n" +
        		"containerType : " + getContainerType() + ";\n" +
//        		"durationTime : " + getDurationTime() + ";\n" +
        		"isCrypted : " + getIsCrypted() + ";\n" +
        		"name : " + getName() + ";\n" +
        		"status : " + getStatus() + ";\n" +
        		"transport : " + getTransport() + ";\n]";
    }
	
	

}
