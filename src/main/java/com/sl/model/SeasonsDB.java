package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;

@DynamicUpdate
@Entity
@Table(name="seasons")
public class SeasonsDB extends BaseEntity{
	
	private static final long serialVersionUID = 3496275376943516718L;
	
	@Column
	private String name;
	@Column
	private String year;
	@Column
	private String actors;
	@Column
	private String director;
	@Column
	private String bonusPriceCategory;
	@Column
	private String startDate;
	@Column
	private String endDate;
	@Column
	private String newDays;
	@Column
	private String item;
	@Column
	private String moviesCount;
	@Column
	private String countries;
	@Column
	private String reviewTitle;
	@Column
	private String reviewDate;
	@Column
	private String review;
	@Column
	private String contentBundleGenres;
	@Column
	private String contentBundlePackage;
	@Column
	private String estContentBundlePackages;
	@Column
	private String videoMovies;
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
	private String dontShowInSeries;
	@Column
	private String isPurchaseAllOnly;
	@Column
	private String deleteEst;
	
	public String getName() {
		return name;
	}

	public SeasonsDB setName(String name) {
		this.name = name;
		return this;
	}

	public String getYear() {
		return year;
	}

	public SeasonsDB setYear(String year) {
		this.year = year;
		return this;
	}

	public String getActors() {
		return actors;
	}

	public SeasonsDB setActors(String actors) {
		this.actors = actors;
		return this;
	}

	public String getDirector() {
		return director;
	}

	public SeasonsDB setDirector(String director) {
		this.director = director;
		return this;
	}

	public String getBonusPriceCategory() {
		return bonusPriceCategory;
	}

	public SeasonsDB setBonusPriceCategory(String bonusPriceCategory) {
		this.bonusPriceCategory = bonusPriceCategory;
		return this;
	}

	public String getStartDate() {
		return startDate;
	}

	public SeasonsDB setStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}

	public String getEndDate() {
		return endDate;
	}

	public SeasonsDB setEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}

	public String getNewDays() {
		return newDays;
	}

	public String getItem() {
		return item;
	}

	public SeasonsDB setItem(String item) {
		this.item = item;
		return this;
	}

	public SeasonsDB setNewDays(String newDays) {
		this.newDays = newDays;
		return this;
	}

	public String getMoviesCount() {
		return moviesCount;
	}

	public SeasonsDB setMoviesCount(String moviesCount) {
		this.moviesCount = moviesCount;
		return this;
	}

	public String getCountries() {
		return countries;
	}

	public SeasonsDB setCountries(String countries) {
		this.countries = countries;
		return this;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public SeasonsDB setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
		return this;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public SeasonsDB setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
		return this;
	}

	public String getReview() {
		return review;
	}

	public SeasonsDB setReview(String review) {
		this.review = review;
		return this;
	}

	public String getContentBundleGenres() {
		return contentBundleGenres;
	}

	public SeasonsDB setContentBundleGenres(String contentBundleGenres) {
		this.contentBundleGenres = contentBundleGenres;
		return this;
	}

	public String getContentBundlePackage() {
		return contentBundlePackage;
	}

	public SeasonsDB setContentBundlePackage(String contentBundlePackage) {
		this.contentBundlePackage = contentBundlePackage;
		return this;
	}

	public String getEstContentBundlePackages() {
		return estContentBundlePackages;
	}

	public SeasonsDB setEstContentBundlePackages(String estContentBundlePackages) {
		this.estContentBundlePackages = estContentBundlePackages;
		return this;
	}

	public String getVideoMovies() {
		return videoMovies;
	}

	public SeasonsDB setVideoMovies(String videoMovies) {
		this.videoMovies = videoMovies;
		return this;
	}

	public String getLocations() {
		return locations;
	}

	public SeasonsDB setLocations(String locations) {
		this.locations = locations;
		return this;
	}
	

	public String getLicenseType2() {
		return licenseType2;
	}

	public SeasonsDB setLicenseType2(String licenseType2) {
		this.licenseType2 = licenseType2;
		return this;
	}

	public String getContractProgramType() {
		return contractProgramType;
	}

	public SeasonsDB setContractProgramType(String contractProgramType) {
		this.contractProgramType = contractProgramType;
		return this;
	}

	
	public String getRestrictTimeStart() {
		return restrictTimeStart;
	}

	public SeasonsDB setRestrictTimeStart(String restrictTimeStart) {
		this.restrictTimeStart = restrictTimeStart;
		return this;
	}

	public String getRestrictTimeEnd() {
		return restrictTimeEnd;
	}

	public SeasonsDB setRestrictTimeEnd(String restrictTimeEnd) {
		this.restrictTimeEnd = restrictTimeEnd;
		return this;
	}

	public String getOriginalName() {
		return originalName;
	}

	public SeasonsDB setOriginalName(String originalName) {
		this.originalName = originalName;
		return this;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public SeasonsDB setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
		return this;
	}

	public String getAgeLevel() {
		return ageLevel;
	}

	public SeasonsDB setAgeLevel(String ageLevel) {
		this.ageLevel = ageLevel;
		return this;
	}

	public String getAppleId() {
		return appleId;
	}

	public SeasonsDB setAppleId(String appleId) {
		this.appleId = appleId;
		return this;
	}

	public String getAndroidId() {
		return androidId;
	}

	public SeasonsDB setAndroidId(String androidId) {
		this.androidId = androidId;
		return this;
	}

	public String getSmarttvId() {
		return smarttvId;
	}

	public SeasonsDB setSmarttvId(String smarttvId) {
		this.smarttvId = smarttvId;
		return this;
	}

	public String getKinopoiskRating() {
		return kinopoiskRating;
	}

	public SeasonsDB setKinopoiskRating(String kinopoiskRating) {
		this.kinopoiskRating = kinopoiskRating;
		return this;
	}

	public String getKinopoiskId() {
		return kinopoiskId;
	}

	public SeasonsDB setKinopoiskId(String kinopoiskId) {
		this.kinopoiskId = kinopoiskId;
		return this;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public SeasonsDB setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
		return this;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public SeasonsDB setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public SeasonsDB setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getIsRecommended() {
		return isRecommended;
	}

	public SeasonsDB setIsRecommended(String isRecommended) {
		this.isRecommended = isRecommended;
		return this;
	}

	public String getDontShowInSeries() {
		return dontShowInSeries;
	}

	public SeasonsDB setDontShowInSeries(String dontShowInSeries) {
		this.dontShowInSeries = dontShowInSeries;
		return this;
	}

	public String getIsPurchaseAllOnly() {
		return isPurchaseAllOnly;
	}

	public SeasonsDB setIsPurchaseAllOnly(String isPurchaseAllOnly) {
		this.isPurchaseAllOnly = isPurchaseAllOnly;
		return this;
	}

	public String getDeleteEst() {
		return deleteEst;
	}

	public SeasonsDB setDeleteEst(String deleteEst) {
		this.deleteEst = deleteEst;
		return this;
	}

	@Override
	public String toString(){
		return "[name : " + getName()+ ";\n" +
				"year : " + getYear()+ ";\n" +
				"actors : " + getActors()+ ";\n" +
				"director : " + getDirector()+ ";\n" +
				"bonusPriceCategory : " + getBonusPriceCategory()+ ";\n" +
//				"startDate : " + getStartDate()+ ";\n" +
//				"endDate : " + getEndDate()+ ";\n" +
				"newDays : " + getNewDays()+ ";\n" +
				"Number season in serials : " + getItem()+ ";\n" +
				"moviesCount : " + getMoviesCount()+ ";\n" +
				"countries : " + getCountries()+ ";\n" +
				"reviewTitle : " + getReviewTitle()+ ";\n" +
//				"reviewDate : " + getReviewDate()+ ";\n" +
				"review : " + getReview()+ ";\n" +
				"contentBundleGenres : " + getContentBundleGenres()+ ";\n" +
				"contentBundlePackage : " + getContentBundlePackage()+ ";\n" +
				"estContentBundlePackages : " + getEstContentBundlePackages()+ ";\n" +
				"videoMovies : " + getVideoMovies()+ ";\n" +
				"locations : " + getLocations()+ ";\n" +
				"licenseType2 : " + getLicenseType2()+ ";\n" +
				"contractProgramType : " + getContractProgramType()+ ";\n" +
//				"restrictTimeStart : " + getRestrictTimeStart()+ ";\n" +
//				"restrictTimeEnd : " + getRestrictTimeEnd()+ ";\n" +
				"originalName : " + getOriginalName()+ ";\n" +
				"accessLevel : " + getAccessLevel()+ ";\n" +
				"ageLevel : " + getAgeLevel()+ ";\n" +
				"appleId : " + getAppleId()+ ";\n" +
				"androidId : " + getAndroidId()+ ";\n" +
				"smarttvId : " + getSmarttvId()+ ";\n" +
				"kinopoiskRating : " + getKinopoiskRating()+ ";\n" +
				"kinopoiskId : " + getKinopoiskId()+ ";\n" +
				"imdbRating : " + getImdbRating()+ ";\n" +
				"ownerId : " + getOwnerId()+ ";\n" +
				"description : " + getDescription()+ ";\n" +
				"isRecommended : " + getIsRecommended()+ ";\n" +
				"dontShowInSeries : " + getDontShowInSeries()+ ";\n" +
				"isPurchaseAllOnly : " + getIsPurchaseAllOnly()+ ";\n" +
				"deleteEst : " + getDeleteEst()+ ";\n]";
	}
	
	
}
