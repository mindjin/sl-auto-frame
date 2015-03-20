package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;

@DynamicUpdate
@Entity
@Table(name="serviceplans")
public class ServicePlansDB extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7767517364928908798L;

	private String name;
	@Column	
	private String startDate;
	@Column	
	private String endDate;
	@Column	
	private String status;
	@Column	
	private String serviceProvider;
	@Column	
	private String currency;
	@Column	
	private String externalId;
	@Column	
	private String nonBlockedPacks;
	@Column  	
	private String isTest;
	
	
	public String getName() {
		return name;
	}
	public ServicePlansDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getStartDate() {
		return startDate;
	}
	public ServicePlansDB setStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}
	public String getEndDate() {
		return endDate;
	}
	public ServicePlansDB setEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}
	public String getStatus() {
		return status;
	}
	public ServicePlansDB setStatus(String status) {
		this.status = status;
		return this;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public ServicePlansDB setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
		return this;
	}
	public String getCurrency() {
		return currency;
	}
	public ServicePlansDB setCurrency(String currency) {
		this.currency = currency;
		return this;
	}
	public String getExternalId() {
		return externalId;
	}
	public ServicePlansDB setExternalId(String externalId) {
		this.externalId = externalId;
		return this;
	}
	public String getNonBlockedPacks() {
		return nonBlockedPacks;
	}
	public ServicePlansDB setNonBlockedPacks(String nonBlockedPacks) {
		this.nonBlockedPacks = nonBlockedPacks;
		return this;
	}
	public String getIsTest() {
		return isTest;
	}
	public ServicePlansDB setIsTest(String isTest) {
		this.isTest = isTest;
		return this;
	}
	
	@Override
		public String toString() {
		return "name : " + getName() + ";\n" +
				"startDate : " + getStartDate() + ";\n" +
				"endDate : " + getEndDate() + ";\n" +
				"status : " + getStatus() + ";\n" +
				"serviceProvider : " + getServiceProvider() + ";\n" +
				"currency : " + getCurrency() + ";\n" +
				"externalId : " + getExternalId() + ";\n" +
				"nonBlockedPacks : " + getNonBlockedPacks() + ";\n" +
				"isTest : " + getIsTest() + ";\n";
	}
	
}
