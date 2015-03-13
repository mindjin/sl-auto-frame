package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;

@DynamicUpdate
@Entity
@Table(name="serials")
public class SerialsDB extends BaseEntity{
	
	private static final long serialVersionUID = 157157305253900424L;
	
	@Column
	private String name;
	@Column
	private String year;
	@Column
	private String actors;
	@Column
	private String director;
	@Column
	private String startDate;
	@Column
	private String endDate;
	@Column
	private String newDays;
	@Column
	private String dontShowInSeries;
	@Column
	private String isPurchaseAllOnly;
	@Column
	private String reviewTitle;
	@Column
	private String reviewDate;
	@Column
	private String review;
	@Column
	private String countries;
	@Column
	private String contentBundles;
	@Column
	private String seriesPackages;
	@Column
	private String contentBundleGroups;
	@Column
	private String contentBundleGenres;
	@Column
	private String locations;
	@Column
	private String licenseType2;
	@Column
	private String contractProgramType;
	@Column
	private String restrictTimeStart;
	@Column
	private String restrictTimeEnd;
	@Column
	private String originalName;
	@Column
	private String accessLevel;
	@Column
	private String ageLevel;
	@Column
	private String appleId;
	@Column
	private String androidId;
	@Column
	private String smarttvId;
	@Column
	private String kinopoiskRating;
	@Column
	private String kinopoiskId;
	@Column
	private String imdbRating;
	@Column
	private String ownerId;
	@Column
	private String description;
	@Column
	private String isRecommended;
	@Column
	private String isPopular;
	public String getName() {
		return name;
	}
	public SerialsDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getYear() {
		return year;
	}
	public SerialsDB setYear(String year) {
		this.year = year;
		return this;
	}
	public String getActors() {
		return actors;
	}
	public SerialsDB setActors(String actors) {
		this.actors = actors;
		return this;
	}
	public String getDirector() {
		return director;
	}
	public SerialsDB setDirector(String director) {
		this.director = director;
		return this;
	}
	public String getStartDate() {
		return startDate;
	}
	public SerialsDB setStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}
	public String getEndDate() {
		return endDate;
	}
	public SerialsDB setEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}	
	
	public String getNewDays() {
		return newDays;
	}
	public SerialsDB setNewDays(String newDays) {
		this.newDays = newDays;
		return this;
	}
	public String getDontShowInSeries() {
		return dontShowInSeries;
	}
	public SerialsDB setDontShowInSeries(String dontShowInSeries) {
		this.dontShowInSeries = dontShowInSeries;
		return this;
	}
	public String getIsPurchaseAllOnly() {
		return isPurchaseAllOnly;
	}
	public SerialsDB setIsPurchaseAllOnly(String isPurchaseAllOnly) {
		this.isPurchaseAllOnly = isPurchaseAllOnly;
		return this;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public SerialsDB setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
		return this;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public SerialsDB setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
		return this;
	}
	public String getReview() {
		return review;
	}
	public SerialsDB setReview(String review) {
		this.review = review;
		return this;
	}
	public String getCountries() {
		return countries;
	}
	public SerialsDB setCountries(String countries) {
		this.countries = countries;
		return this;
	}
	public String getContentBundles() {
		return contentBundles;
	}
	public SerialsDB setContentBundles(String contentBundles) {
		this.contentBundles = contentBundles;
		return this;
	}
	public String getSeriesPackages() {
		return seriesPackages;
	}
	public SerialsDB setSeriesPackages(String seriesPackages) {
		this.seriesPackages = seriesPackages;
		return this;
	}
	public String getContentBundleGroups() {
		return contentBundleGroups;
	}
	public SerialsDB setContentBundleGroups(String contentBundleGroups) {
		this.contentBundleGroups = contentBundleGroups;
		return this;
	}
	public String getContentBundleGenres() {
		return contentBundleGenres;
	}
	public SerialsDB setContentBundleGenres(String contentBundleGenres) {
		this.contentBundleGenres = contentBundleGenres;
		return this;
	}
	public String getLocations() {
		return locations;
	}
	public SerialsDB setLocations(String locations) {
		this.locations = locations;
		return this;
	}
	public String getLicenseType2() {
		return licenseType2;
	}
	public SerialsDB setLicenseType2(String licenseType2) {
		this.licenseType2 = licenseType2;
		return this;
	}
	public String getContractProgramType() {
		return contractProgramType;
	}
	public SerialsDB setContractProgramType(String contractProgramType) {
		this.contractProgramType = contractProgramType;
		return this;
	}
	public String getRestrictTimeStart() {
		return restrictTimeStart;
	}
	public SerialsDB setRestrictTimeStart(String restrictTimeStart) {
		this.restrictTimeStart = restrictTimeStart;
		return this;
	}
	public String getRestrictTimeEnd() {
		return restrictTimeEnd;
	}
	public SerialsDB setRestrictTimeEnd(String restrictTimeEnd) {
		this.restrictTimeEnd = restrictTimeEnd;
		return this;
	}
	public String getOriginalName() {
		return originalName;
	}
	public SerialsDB setOriginalName(String originalName) {
		this.originalName = originalName;
		return this;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public SerialsDB setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
		return this;
	}
	public String getAgeLevel() {
		return ageLevel;
	}
	public SerialsDB setAgeLevel(String ageLevel) {
		this.ageLevel = ageLevel;
		return this;
	}
	public String getAppleId() {
		return appleId;
	}
	public SerialsDB setAppleId(String appleId) {
		this.appleId = appleId;
		return this;
	}
	public String getAndroidId() {
		return androidId;
	}
	public SerialsDB setAndroidId(String androidId) {
		this.androidId = androidId;
		return this;
	}
	public String getSmarttvId() {
		return smarttvId;
	}
	public SerialsDB setSmarttvId(String smarttvId) {
		this.smarttvId = smarttvId;
		return this;
	}
	public String getKinopoiskRating() {
		return kinopoiskRating;
	}
	public SerialsDB setKinopoiskRating(String kinopoiskRating) {
		this.kinopoiskRating = kinopoiskRating;
		return this;
	}
	public String getKinopoiskId() {
		return kinopoiskId;
	}
	public SerialsDB setKinopoiskId(String kinopoiskId) {
		this.kinopoiskId = kinopoiskId;
		return this;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public SerialsDB setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
		return this;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public SerialsDB setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public SerialsDB setDescription(String description) {
		this.description = description;
		return this;
	}
	public String getIsRecommended() {
		return isRecommended;
	}
	public SerialsDB setIsRecommended(String isRecommended) {
		this.isRecommended = isRecommended;
		return this;
	}
	public String getIsPopular() {
		return isPopular;
	}
	public SerialsDB setIsPopular(String isPopular) {
		this.isPopular = isPopular;
		return this;
	}	
	
	@Override
	public String toString(){
		return "[name : " + getName() + ";\n" +
				"year : " + getYear() + ";\n" +
				"actors : " + getActors() + ";\n" +
				"director : " + getDirector() + ";\n" +
//				"startDate : " + getStartDate() + ";\n" +
//				"endDate : " + getEndDate() + ";\n" +
				"newDays : " + getNewDays() + ";\n" +
				"dontShowInSeries : " + getDontShowInSeries() + ";\n" +
				"isPurchaseAllOnly : " + getIsPurchaseAllOnly() + ";\n" +
				"reviewTitle : " + getReviewTitle() + ";\n" +
//				"reviewDate : " + getReviewDate() + ";\n" +
				"review : " + getReview() + ";\n" +
				"countries : " + getCountries() + ";\n" +
				"contentBundles : " + getContentBundles() + ";\n" +
				"seriesPackages : " + getSeriesPackages() + ";\n" +
				"contentBundleGroups : " + getContentBundleGroups() + ";\n" +
				"contentBundleGenres : " + getContentBundleGenres() + ";\n" +
				"locations : " + getLocations() + ";\n" +
				"licenseType2 : " + getLicenseType2() + ";\n" +
				"contractProgramType : " + getContractProgramType() + ";\n" +
//				"restrictTimeStart : " + getRestrictTimeStart() + ";\n" +
//				"restrictTimeEnd : " + getRestrictTimeEnd() + ";\n" +
				"originalName : " + getOriginalName() + ";\n" +
				"accessLevel : " + getAccessLevel() + ";\n" +
				"ageLevel : " + getAgeLevel() + ";\n" +
				"appleId : " + getAppleId() + ";\n" +
				"androidId : " + getAndroidId() + ";\n" +
				"smarttvId : " + getSmarttvId() + ";\n" +
				"kinopoiskRating : " + getKinopoiskRating() + ";\n" +
				"kinopoiskId : " + getKinopoiskId() + ";\n" +
				"imdbRating : " + getImdbRating() + ";\n" +
				"ownerId : " + getOwnerId() + ";\n" +
				"description : " + getDescription() + ";\n" +
				"isRecommended : " + getIsRecommended() + ";\n" +
				"isPopular : " + getIsPopular() + ";\n]";
	}
}
