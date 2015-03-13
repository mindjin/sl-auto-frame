package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="vodpackage")
public class VodPackageDB extends BaseEntity{
	
	private static final long serialVersionUID = 5577908251608913816L;
	
	@Column
	private String name;
	@Column
	private String externalId;
	@Column
	private String appleId;
	@Column
	private String androidId;
	@Column
	private String smarttvId;
	@Column
	private String description;
	@Column
	private String resourceFunc;
	@Column
	private String bundledGrp;
	@Column
	private String repPkgName;
	@Column
	private String forSubscribe;
	@Column
	private String isAccessByLock;
	@Column
	private String videoMovies;
	@Column
	private String bundlePackages;
	@Column
	private String serviceProviders;
	@Column
	private String stbFunctions;
	@Column
	private String networkTypes;
	@Column
	private String type;
	public String getName() {
		return name;
	}
	public VodPackageDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getExternalId() {
		return externalId;
	}
	public VodPackageDB setExternalId(String externalId) {
		this.externalId = externalId;
		return this;
	}
	public String getAppleId() {
		return appleId;
	}
	public VodPackageDB setAppleId(String appleId) {
		this.appleId = appleId;
		return this;
	}
	public String getAndroidId() {
		return androidId;
	}
	public VodPackageDB setAndroidId(String androidId) {
		this.androidId = androidId;
		return this;
	}
	public String getSmarttvId() {
		return smarttvId;
	}
	public VodPackageDB setSmarttvId(String smarttvId) {
		this.smarttvId = smarttvId;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public VodPackageDB setDescription(String description) {
		this.description = description;
		return this;
	}
	public String getResourceFunc() {
		return resourceFunc;
	}
	public VodPackageDB setResourceFunc(String resourceFunc) {
		this.resourceFunc = resourceFunc;
		return this;
	}
	public String getBundledGrp() {
		return bundledGrp;
	}
	public VodPackageDB setBundledGrp(String bundledGrp) {
		this.bundledGrp = bundledGrp;
		return this;
	}
	public String getRepPkgName() {
		return repPkgName;
	}
	public VodPackageDB setRepPkgName(String repPkgName) {
		this.repPkgName = repPkgName;
		return this;
	}
	public String getForSubscribe() {
		return forSubscribe;
	}
	public VodPackageDB setForSubscribe(String forSubscribe) {
		this.forSubscribe = forSubscribe;
		return this;
	}
	public String getIsAccessByLock() {
		return isAccessByLock;
	}
	public VodPackageDB setIsAccessByLock(String isAccessByLock) {
		this.isAccessByLock = isAccessByLock;
		return this;
	}
	public String getVideoMovies() {
		return videoMovies;
	}
	public VodPackageDB setVideoMovies(String videoMovies) {
		this.videoMovies = videoMovies;
		return this;
	}
	public String getBundlePackages() {
		return bundlePackages;
	}
	public VodPackageDB setBundlePackages(String bundlePackages) {
		this.bundlePackages = bundlePackages;
		return this;
	}
	public String getServiceProviders() {
		return serviceProviders;
	}
	public VodPackageDB setServiceProviders(String serviceProviders) {
		this.serviceProviders = serviceProviders;
		return this;
	}
	public String getStbFunctions() {
		return stbFunctions;
	}
	public VodPackageDB setStbFunctions(String stbFunctions) {
		this.stbFunctions = stbFunctions;
		return this;
	}
	public String getNetworkTypes() {
		return networkTypes;
	}
	public VodPackageDB setNetworkTypes(String networkTypes) {
		this.networkTypes = networkTypes;
		return this;
	}
	public String getType() {
		return type;
	}
	public VodPackageDB setType(String type) {
		this.type = type;
		return this;
	}
	
	@Override
    public String toString() {
        return "[name : " + getName() + ";\n" + 
        		"externalId : " + getExternalId() + ";\n" + 
        		"appleId : " + getAppleId() + ";\n" + 
        		"androidId : " + getAndroidId() + ";\n" + 
        		"smarttvId : " + getSmarttvId() + ";\n" + 
        		"description : " + getDescription() + ";\n" + 
        		"resourceFunc : " + getResourceFunc() + ";\n" + 
        		"bundledGrp : " + getBundledGrp() + ";\n" + 
        		"repPkgName : " + getRepPkgName() + ";\n" + 
        		"forSubscribe : " + getForSubscribe() + ";\n" + 
        		"isAccessByLock : " + getIsAccessByLock() + ";\n" + 
        		"videoMovies : " + getVideoMovies() + ";\n" + 
        		"bundlePackages : " + getBundlePackages() + ";\n" + 
        		"serviceProviders : " + getServiceProviders() + ";\n" + 
        		"stbFunctions : " + getStbFunctions() + ";\n" + 
        		"networkTypes : " + getNetworkTypes() + ";\n" + 
        		"type : " + getType() + ";\n]";
    }
	
	

}
