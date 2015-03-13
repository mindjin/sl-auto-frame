package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="videomovies")
public class VideomoviesDB  extends BaseEntity{
	
	
	private static final long serialVersionUID = -454191058049268314L;
	
	@Column
	private String name;
	@Column
	private String year;
	@Column
	private String director;
	@Column
	private String actors;	
	@Column
	private String startDate;
	@Column
	private String endDate;
	@Column
	private String premiereStartDate;
	@Column
	private String premiereEndDate;
	@Column
	private String newDays;
	@Column
	private String countries;
	@Column
	private String reviewTitle;
	@Column
	private String reviewDate;
	@Column
	private String review;
	@Column
	private String genres;
	@Column
	private String vodPackages;
	@Column
	private String estVodPackages;
	@Column
	private String vodGroups;
	@Column
	private String locations;
	@Column
	private String licenseType2;
	@Column
	private String categoryABCDE;
	@Column
	private String originalLang;
	@Column
	private String isDubbedNeeded;
	@Column
	private String dubbedInfo;
	@Column
	private String contractProgramType;
	@Column
	private String licenseYear;
	@Column
	private String contentBundles;
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
	private String genre;
	@Column
	private String rating;
	@Column
	private String kinopoiskRating;
	@Column
	private String kinopoiskId;
	@Column
	private String imdbRating;
	@Column
	private String item;
	@Column
	private String appleId;
	@Column
	private String androidId;
	@Column
	private String smarttvId;
	@Column
	private String type3d;
	@Column
	private String adminDsc;
	@Column
	private String showcase;
	@Column
	private String bonusPriceCategory;
	@Column
	private String distributionCertificate;
	@Column
	private String isRecommended;
	@Column
	private String ottRecomended;
	@Column
	private String deleteOnEndDate;
	@Column
	private String notifySub;
	@Column
	private String showAsVod;
	@Column
	private String description;
	@Column
	private String isCrypted;
	@Column
	private String isErotic;
	@Column
	private String isNextEpisode;
	@Column
	private String deleteEst;
	@Column
	private String ownerId;
	@Column
	private String isLastEpisode;
	
	public String getName() {
		return name;
	}
	public VideomoviesDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getYear() {
		return year;
	}
	public VideomoviesDB setYear(String year) {
		this.year = year;
		return this;
	}
	public String getDirector() {
		return director;
	}
	public VideomoviesDB setDirector(String director) {
		this.director = director;
		return this;
	}
	public String getActors() {
		return actors;
	}
	public VideomoviesDB setActors(String actors) {
		this.actors = actors;
		return this;
	}
	public String getStartDate() {
		return startDate;
	}
	public VideomoviesDB setStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}
	public String getEndDate() {
		return endDate;
	}
	public VideomoviesDB setEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}
	public String getPremiereStartDate() {
		return premiereStartDate;
	}
	public VideomoviesDB setPremiereStartDate(String premiereStartDate) {
		this.premiereStartDate = premiereStartDate;
		return this;
	}
	public String getPremiereEndDate() {
		return premiereEndDate;
	}
	public VideomoviesDB setPremiereEndDate(String premiereEndDate) {
		this.premiereEndDate = premiereEndDate;
		return this;
	}
	public String getNewDays() {
		return newDays;
	}
	public VideomoviesDB setNewDays(String newDays) {
		this.newDays = newDays;
		return this;
	}
	public String getCountries() {
		return countries;
	}
	public VideomoviesDB setCountries(String countries) {
		this.countries = countries;
		return this;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public VideomoviesDB setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
		return this;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public VideomoviesDB setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
		return this;
	}
	public String getReview() {
		return review;
	}
	public VideomoviesDB setReview(String review) {
		this.review = review;
		return this;
	}
	public String getGenres() {
		return genres;
	}
	public VideomoviesDB setGenres(String genres) {
		this.genres = genres;
		return this;
	}
	public String getVodPackages() {
		return vodPackages;
	}
	public VideomoviesDB setVodPackages(String vodPackages) {
		this.vodPackages = vodPackages;
		return this;
	}
	public String getEstVodPackages() {
		return estVodPackages;
	}
	public VideomoviesDB setEstVodPackages(String estVodPackages) {
		this.estVodPackages = estVodPackages;
		return this;
	}
	public String getVodGroups() {
		return vodGroups;
	}
	public VideomoviesDB setVodGroups(String vodGroups) {
		this.vodGroups = vodGroups;
		return this;
	}
	public String getLocations() {
		return locations;
	}
	public VideomoviesDB setLocations(String locations) {
		this.locations = locations;
		return this;
	}
	public String getLicenseType2() {
		return licenseType2;
	}
	public VideomoviesDB setLicenseType2(String licenseType2) {
		this.licenseType2 = licenseType2;
		return this;
	}
	public String getCategoryABCDE() {
		return categoryABCDE;
	}
	public VideomoviesDB setCategoryABCDE(String categoryABCDE) {
		this.categoryABCDE = categoryABCDE;
		return this;
	}
	public String getOriginalLang() {
		return originalLang;
	}
	public VideomoviesDB setOriginalLang(String originalLang) {
		this.originalLang = originalLang;
		return this;
	}
	public String getIsDubbedNeeded() {
		return isDubbedNeeded;
	}
	public VideomoviesDB setIsDubbedNeeded(String isDubbedNeeded) {
		this.isDubbedNeeded = isDubbedNeeded;
		return this;
	}
	public String getDubbedInfo() {
		return dubbedInfo;
	}
	public VideomoviesDB setDubbedInfo(String dubbedInfo) {
		this.dubbedInfo = dubbedInfo;
		return this;
	}
	public String getContractProgramType() {
		return contractProgramType;
	}
	public VideomoviesDB setContractProgramType(String contractProgramType) {
		this.contractProgramType = contractProgramType;
		return this;
	}
	public String getLicenseYear() {
		return licenseYear;
	}
	public VideomoviesDB setLicenseYear(String licenseYear) {
		this.licenseYear = licenseYear;
		return this;
	}
	public String getContentBundles() {
		return contentBundles;
	}
	public VideomoviesDB setContentBundles(String contentBundles) {
		this.contentBundles = contentBundles;
		return this;
	}
	public String getRestrictTimeStart() {
		return restrictTimeStart;
	}
	public VideomoviesDB setRestrictTimeStart(String restrictTimeStart) {
		this.restrictTimeStart = restrictTimeStart;
		return this;
	}
	public String getRestrictTimeEnd() {
		return restrictTimeEnd;
	}
	public VideomoviesDB setRestrictTimeEnd(String restrictTimeEnd) {
		this.restrictTimeEnd = restrictTimeEnd;
		return this;
	}
	public String getOriginalName() {
		return originalName;
	}
	public VideomoviesDB setOriginalName(String originalName) {
		this.originalName = originalName;
		return this;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public VideomoviesDB setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
		return this;
	}
	public String getAgeLevel() {
		return ageLevel;
	}
	public VideomoviesDB setAgeLevel(String ageLevel) {
		this.ageLevel = ageLevel;
		return this;
	}
	public String getGenre() {
		return genre;
	}
	public VideomoviesDB setGenre(String genre) {
		this.genre = genre;
		return this;
	}
	public String getRating() {
		return rating;
	}
	public VideomoviesDB setRating(String rating) {
		this.rating = rating;
		return this;
	}
	public String getKinopoiskRating() {
		return kinopoiskRating;
	}
	public VideomoviesDB setKinopoiskRating(String kinopoiskRating) {
		this.kinopoiskRating = kinopoiskRating;
		return this;
	}
	public String getKinopoiskId() {
		return kinopoiskId;
	}
	public VideomoviesDB setKinopoiskId(String kinopoiskId) {
		this.kinopoiskId = kinopoiskId;
		return this;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public VideomoviesDB setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
		return this;
	}
	public String getItem() {
		return item;
	}
	public VideomoviesDB setItem(String item) {
		this.item = item;
		return this;
	}
	public String getAppleId() {
		return appleId;
	}
	public VideomoviesDB setAppleId(String appleId) {
		this.appleId = appleId;
		return this;
	}
	public String getAndroidId() {
		return androidId;
	}
	public VideomoviesDB setAndroidId(String androidId) {
		this.androidId = androidId;
		return this;
	}
	public String getSmarttvId() {
		return smarttvId;
	}
	public VideomoviesDB setSmarttvId(String smarttvId) {
		this.smarttvId = smarttvId;
		return this;
	}
	public String getType3d() {
		return type3d;
	}
	public VideomoviesDB setType3d(String type3d) {
		this.type3d = type3d;
		return this;
	}
	public String getAdminDsc() {
		return adminDsc;
	}
	public VideomoviesDB setAdminDsc(String adminDsc) {
		this.adminDsc = adminDsc;
		return this;
	}
	public String getShowcase() {
		return showcase;
	}
	public VideomoviesDB setShowcase(String showcase) {
		this.showcase = showcase;
		return this;
	}
	public String getBonusPriceCategory() {
		return bonusPriceCategory;
	}
	public VideomoviesDB setBonusPriceCategory(String bonusPriceCategory) {
		this.bonusPriceCategory = bonusPriceCategory;
		return this;
	}
	public String getDistributionCertificate() {
		return distributionCertificate;
	}
	public VideomoviesDB setDistributionCertificate(String distributionCertificate) {
		this.distributionCertificate = distributionCertificate;
		return this;
	}
	public String getIsRecommended() {
		return isRecommended;
	}
	public VideomoviesDB setIsRecommended(String isRecommended) {
		this.isRecommended = isRecommended;
		return this;
	}
	public String getOttRecomended() {
		return ottRecomended;
	}
	public VideomoviesDB setOttRecomended(String ottRecomended) {
		this.ottRecomended = ottRecomended;
		return this;
	}
	public String getDeleteOnEndDate() {
		return deleteOnEndDate;
	}
	public VideomoviesDB setDeleteOnEndDate(String deleteOnEndDate) {
		this.deleteOnEndDate = deleteOnEndDate;
		return this;
	}
	public String getNotifySub() {
		return notifySub;
	}
	public VideomoviesDB setNotifySub(String notifySub) {
		this.notifySub = notifySub;
		return this;
	}
	public String getShowAsVod() {
		return showAsVod;
	}
	public VideomoviesDB setShowAsVod(String showAsVod) {
		this.showAsVod = showAsVod;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public VideomoviesDB setDescription(String description) {
		this.description = description;
		return this;
	}
	public String getIsCrypted() {
		return isCrypted;
	}
	public VideomoviesDB setIsCrypted(String isCrypted) {
		this.isCrypted = isCrypted;
		return this;
	}
	public String getIsErotic() {
		return isErotic;
	}
	public VideomoviesDB setIsErotic(String isErotic) {
		this.isErotic = isErotic;
		return this;
	}
	public String getIsNextEpisode() {
		return isNextEpisode;
	}
	public VideomoviesDB setIsNextEpisode(String isNextEpisode) {
		this.isNextEpisode = isNextEpisode;
		return this;
	}
	public String getDeleteEst() {
		return deleteEst;
	}
	public VideomoviesDB setDeleteEst(String deleteEst) {
		this.deleteEst = deleteEst;
		return this;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public VideomoviesDB setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}
	public String getIsLastEpisode() {
		return isLastEpisode;
	}
	public VideomoviesDB setIsLastEpisode(String isLastEpisode) {
		this.isLastEpisode = isLastEpisode;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "[name : " + getName() + ";\n" + 
"year : " + getYear() + ";\n" + 
"director : " + getDirector() + ";\n" + 
"actors : " + getActors() + ";\n" + 
//"startDate : " + getStartDate() + ";\n" + 
//"endDate : " + getEndDate() + ";\n" + 
//"premiereStartDate : " + getPremiereStartDate() + ";\n" + 
//"premiereEndDate : " + getPremiereEndDate() + ";\n" + 
"newDays : " + getNewDays() + ";\n" + 
"countries : " + getCountries() + ";\n" + 
"reviewTitle : " + getReviewTitle() + ";\n" + 
//"reviewDate : " + getReviewDate() + ";\n" + 
"review : " + getReview() + ";\n" + 
"genres : " + getGenres() + ";\n" + 
"vodPackages : " + getVodPackages() + ";\n" + 
"estVodPackages : " + getEstVodPackages() + ";\n" + 
"vodGroups : " + getVodGroups() + ";\n" + 
"locations : " + getLocations() + ";\n" + 
"licenseType2 : " + getLicenseType2() + ";\n" + 
"categoryABCDE : " + getCategoryABCDE() + ";\n" + 
"originalLang : " + getOriginalLang() + ";\n" + 
"isDubbedNeeded : " + getIsDubbedNeeded() + ";\n" + 
"dubbedInfo : " + getDubbedInfo() + ";\n" + 
"contractProgramType : " + getContractProgramType() + ";\n" + 
"licenseYear : " + getLicenseYear() + ";\n" + 
"contentBundles : " + getContentBundles() + ";\n" + 
//"restrictTimeStart : " + getRestrictTimeStart() + ";\n" + 
//"restrictTimeEnd : " + getRestrictTimeEnd() + ";\n" + 
"originalName : " + getOriginalName() + ";\n" + 
"accessLevel : " + getAccessLevel() + ";\n" + 
"ageLevel : " + getAgeLevel() + ";\n" + 
"genre : " + getGenre() + ";\n" + 
"rating : " + getRating() + ";\n" + 
"KinopoiskRating : " + getKinopoiskRating() + ";\n" + 
"kinopoiskId : " + getKinopoiskId() + ";\n" + 
"imdbRating : " + getImdbRating() + ";\n" + 
"item : " + getItem() + ";\n" + 
"appleId : " + getAppleId() + ";\n" + 
"androidId : " + getAndroidId() + ";\n" + 
"smarttvId : " + getSmarttvId() + ";\n" + 
"type3d : " + getType3d() + ";\n" + 
"adminDsc : " + getAdminDsc() + ";\n" + 
"showcase : " + getShowcase() + ";\n" + 
"bonusPriceCategory : " + getBonusPriceCategory() + ";\n" + 
"distributionCertificate : " + getDistributionCertificate() + ";\n" + 
"isRecommended : " + getIsRecommended() + ";\n" + 
"ottRecomended : " + getOttRecomended() + ";\n" + 
"deleteOnEndDate : " + getDeleteOnEndDate() + ";\n" + 
"notifySub : " + getNotifySub() + ";\n" + 
"showAsVod : " + getShowAsVod() + ";\n" + 
"description : " + getDescription() + ";\n" + 
"isCrypted : " + getIsCrypted() + ";\n" + 
"isErotic : " + getIsErotic() + ";\n" + 
"isNextEpisode : " + getIsNextEpisode() + ";\n" + 
"deleteEst : " + getDeleteEst() + ";\n" + 
"ownerId : " + getOwnerId() + ";\n" + 
"isLastEpisode : " + getIsLastEpisode() + ";\n]";
	    }

}
