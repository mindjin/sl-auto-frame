package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="promoactions")
public class PromoactionsDB extends BaseEntity{
	
	private static final long serialVersionUID = 8750862723687247404L;

	@Column
	private String name;	

	@Column
	private String sortOrder;
	
	@Column
	private String overloadServiceSpecParams;
	
	@Column
	private String externalId;
	
	@Column
	private String startDate;
	
	@Column
	private String endDate;
	
	@Column
	private String duration;
	
	@Column
	private String durationType;
	
	@Column
	private String startMessage;
	
	@Column
	private String notifyThreshold;
	
	@Column
	private String notifyTimeout;
	
	@Column
	private String serviceSpecs;
	
	@Column
	private String messageFilters;

	@Column
	private String isCheckUserInFilter;
	
	@Column
	private String description;
	
	@Column
	private String notifyStartText;
	
	@Column
	private String notifyText;
	
	public String getName() {
		return name;
	}

	public PromoactionsDB setName(String name) {
		this.name = name;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public PromoactionsDB setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		return this;
	}

	public String getOverloadServiceSpecParams() {
		return overloadServiceSpecParams;
	}

	public PromoactionsDB setOverloadServiceSpecParams(String overloadServiceSpecParams) {
		this.overloadServiceSpecParams = overloadServiceSpecParams;
		return this;
	}

	public String getExternalId() {
		return externalId;
	}

	public PromoactionsDB setExternalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	public String getStartDate() {
		return startDate;
	}

	public PromoactionsDB setStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}

	public String getEndDate() {
		return endDate;
	}

	public PromoactionsDB setEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}

	public String getDuration() {
		return duration;
	}

	public PromoactionsDB setDuration(String duration) {
		this.duration = duration;
		return this;
	}

	public String getDurationType() {
		return durationType;
	}

	public PromoactionsDB setDurationType(String durationType) {
		this.durationType = durationType;
		return this;
	}

	public String getStartMessage() {
		return startMessage;
	}

	public PromoactionsDB setStartMessage(String startMessage) {
		this.startMessage = startMessage;
		return this;
	}

	public String getNotifyThreshold() {
		return notifyThreshold;
	}

	public PromoactionsDB setNotifyThreshold(String notifyThreshold) {
		this.notifyThreshold = notifyThreshold;
		return this;
	}

	public String getNotifyTimeout() {
		return notifyTimeout;
	}

	public PromoactionsDB setNotifyTimeout(String notifyTimeout) {
		this.notifyTimeout = notifyTimeout;
		return this;
	}

	public String getServiceSpecs() {
		return serviceSpecs;
	}

	public PromoactionsDB setServiceSpecs(String serviceSpecs) {
		this.serviceSpecs = serviceSpecs;
		return this;
	}

	public String getMessageFilters() {
		return messageFilters;
	}

	public PromoactionsDB setMessageFilters(String messageFilters) {
		this.messageFilters = messageFilters;
		return this;
	}

	public String getIsCheckUserInFilter() {
		return isCheckUserInFilter;
	}

	public PromoactionsDB setIsCheckUserInFilter(String isCheckUserInFilter) {
		this.isCheckUserInFilter = isCheckUserInFilter;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public PromoactionsDB setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getNotifyStartText() {
		return notifyStartText;
	}

	public PromoactionsDB setNotifyStartText(String notifyStartText) {
		this.notifyStartText = notifyStartText;
		return this;
	}

	public String getNotifyText() {
		return notifyText;
	}

	public PromoactionsDB setNotifyText(String notifyText) {
		this.notifyText = notifyText;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "[name : " + getName() + ";\n" + 
	        	//	"sortOrder : " + getSortOrder() + ";\n" +
	        		"overloadServiceSpecParams : " + getOverloadServiceSpecParams() + ";\n" +
	        		"externalId : " + getExternalId() + ";\n" +
//	        		"startDate : " + getStartDate() + ";\n" +
//	        		"endDate : " + getEndDate() + ";\n" +
	        		"duration : " + getDuration() + ";\n" +
	        		"durationType : " + getDurationType() + ";\n" +
	        		"startMessage : " + getStartMessage() + ";\n" +
	        		"notifyThreshold : " + getNotifyThreshold() + ";\n" +
	        		"notifyTimeout : " + getNotifyTimeout() + ";\n" +
//	        		"serviceSpecs : " + getServiceSpecs() + ";\n" +
	        		"messageFilters : " + getMessageFilters() + ";\n" +
	                "isCheckUserInFilter : " + getIsCheckUserInFilter() + ";\n" +
	                "description : " + getDescription() + ";\n" +
	                "notifyStartText : " + getNotifyStartText() + ";\n" +
	                "notifyText : " + getNotifyText() + ";]\n";
	    }

}
