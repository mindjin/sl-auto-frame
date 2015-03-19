package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;

@DynamicUpdate
@Entity
@Table(name="bundlepacks")
public class BundlePacksDB extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8626388735472528277L;
	@Column
	private String name;
	@Column
	private String forSubscribe;
	@Column
	private String externalId;
	@Column
	private String internalId;	
	@Column
	private String isAccessByLock;
	@Column
	private String unsubscribePeriod;
	@Column
	private String serviceProviders;
	@Column
	private String stbFunctions;
	@Column
	private String networkTypes;
	@Column
	private String subscribeCount;
	@Column
	private String type;
	@Column
	private String appleId;
	@Column
	private String androidId;
	@Column
	private String smarttvId;
	@Column
	private String portalExternalId;
	@Column
	private String repPkgName;
	@Column
	private String description;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getForSubscribe() {
		return forSubscribe;
	}
	public void setForSubscribe(String forSubscribe) {
		this.forSubscribe = forSubscribe;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getIsAccessByLock() {
		return isAccessByLock;
	}
	public void setIsAccessByLock(String isAccessByLock) {
		this.isAccessByLock = isAccessByLock;
	}
	public String getUnsubscribePeriod() {
		return unsubscribePeriod;
	}
	public void setUnsubscribePeriod(String unsubscribePeriod) {
		this.unsubscribePeriod = unsubscribePeriod;
	}
	public String getServiceProviders() {
		return serviceProviders;
	}
	public void setServiceProviders(String serviceProviders) {
		this.serviceProviders = serviceProviders;
	}
	public String getStbFunctions() {
		return stbFunctions;
	}
	public void setStbFunctions(String stbFunctions) {
		this.stbFunctions = stbFunctions;
	}
	public String getNetworkTypes() {
		return networkTypes;
	}
	public void setNetworkTypes(String networkTypes) {
		this.networkTypes = networkTypes;
	}
	public String getSubscribeCount() {
		return subscribeCount;
	}
	public void setSubscribeCount(String subscribeCount) {
		this.subscribeCount = subscribeCount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAppleId() {
		return appleId;
	}
	public void setAppleId(String appleId) {
		this.appleId = appleId;
	}
	public String getAndroidId() {
		return androidId;
	}
	public void setAndroidId(String androidId) {
		this.androidId = androidId;
	}
	public String getSmarttvId() {
		return smarttvId;
	}
	public void setSmarttvId(String smarttvId) {
		this.smarttvId = smarttvId;
	}
	public String getPortalExternalId() {
		return portalExternalId;
	}
	public void setPortalExternalId(String portalExternalId) {
		this.portalExternalId = portalExternalId;
	}
	public String getRepPkgName() {
		return repPkgName;
	}
	public void setRepPkgName(String repPkgName) {
		this.repPkgName = repPkgName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString () {
	return "[name : " + getName() + ";\n"+
			"forSubscribe : " + getForSubscribe() + ";\n"+
			"externalId : " + getExternalId() + ";\n"+
//			"internalId : " + getInternalId() + ";\n"+
			"isAccessByLock : " + getIsAccessByLock() + ";\n"+
			"unsubscribePeriod : " + getUnsubscribePeriod() + ";\n"+
			"serviceProviders : " + getServiceProviders() + ";\n"+
			"stbFunctions : " + getStbFunctions() + ";\n"+
			"networkTypes : " + getNetworkTypes() + ";\n"+
			"subscribeCount : " + getSubscribeCount() + ";\n"+
			"type : " + getType() + ";\n"+
			"appleId : " + getAppleId() + ";\n"+
			"androidId : " + getAndroidId() + ";\n"+
			"smarttvId : " + getSmarttvId() + ";\n"+
			"portalExternalId : " + getPortalExternalId() + ";\n"+
			"repPkgName : " + getRepPkgName() + ";\n"+
			"description : " + getDescription() + ";\n]";
		
		
	}

}
