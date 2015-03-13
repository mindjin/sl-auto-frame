package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.SerialsDB;
import com.sl.popup.ContentContracts;

public class Serials extends AnyForm {

	@FindBy(css = "[id='RowForm'] [id='row.name']")
	private WebElement textfield_name;
	
	@FindBy(css = "[id='RowForm'] [id='row.year']")
	private WebElement textfield_year;
	
	@FindBy(css = "[id='RowForm'] [id='row.actors']")
	private WebElement textfield_actors;
	
	@FindBy(css = "[id='RowForm'] [id='row.director']")
	private WebElement textfield_director;
	
	@FindBy(css = "[id='RowForm'] [id='row.startDate'] input")
	private WebElement textfield_startDate;
	
	@FindBy(css = "[id='RowForm'] [id='row.endDate'] input")
	private WebElement textfield_endDate;
	
	@FindBy(css = "[id='RowForm'] [id='row.newDays']")
	private WebElement textfield_newDays;	
	
	@FindBy(css = "[id='RowForm'] [id='row.dontShowInSeries']")
	private WebElement checkbox_dontShowInSeries;
	
	@FindBy(css = "[id='RowForm'] [id='row.isPurchaseAllOnly']")
	private WebElement checkbox_isPurchaseAllOnly;
	
	@FindBy(css = "[id='RowForm'] [id='row.reviewTitle']")
	private WebElement textfield_reviewTitle;

	@FindBy(css = "[id='RowForm'] [id='row.reviewDate'] input")
	private WebElement textfield_reviewDate;

	@FindBy(css = "[id='RowForm'] [id = 'row.review'] textarea")
	private WebElement textfield_review;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.countries']")
	private WebElement list2list_countries;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentBundles']")
	private WebElement list2list_contentBundles;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.SeriesPackages']")
	private WebElement list2list_seriesPackages;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentBundleGroups']")
	private WebElement list2list_contentBundleGroups;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentBundleGenres']")
	private WebElement list2list_contentBundleGenres;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.Locations']")
	private WebElement list2list_locations;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentContracts']")
	private WebElement linkedList_contentContracts;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.LicenseType2']")
	private WebElement list2list_licenseType2;
	
	@FindBy(css = "[id='RowForm'] [id='s2id_row.contractProgramType'] span")
	private WebElement combobox_contractProgramType;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentInDeviceTypes']")
	private WebElement linkedList_contentInDeviceTypes;
	
	@FindBy(css="[id='RowForm'] [id='row.restrictTimeStart'] input")
	private WebElement textfield_restrictTimeStart;

	@FindBy(css="[id='RowForm'] [id='row.restrictTimeEnd'] input")
	private WebElement textfield_restrictTimeEnd;
	
	@FindBy(css = "[id='RowForm'] [id='row.originalName']")
	private WebElement textfield_originalName;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.accessLevel'] span")
	private WebElement combobox_accessLevel;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.ageLevel'] span")
	private WebElement combobox_ageLevel;
	
	@FindBy(css = "[id='RowForm'] [id='row.appleId']")
	private WebElement textfield_appleId;

	@FindBy(css = "[id='RowForm'] [id='row.androidId']")
	private WebElement textfield_androidId;

	@FindBy(css = "[id='RowForm'] [id='row.smarttvId']")
	private WebElement textfield_smarttvId;
	
	@FindBy(css = "[id='RowForm'] [id='row.KinopoiskRating']")
	private WebElement textfield_kinopoiskRating;

	@FindBy(css = "[id='RowForm'] [id='row.kinopoiskId']")
	private WebElement textfield_kinopoiskId;

	@FindBy(css = "[id='RowForm'] [id='row.imdbRating']")
	private WebElement textfield_imdbRating;
	
	@FindBy(css ="[id='RowForm'] [id='row.ownerId']")
	private WebElement textfield_ownerId;
	
	@FindBy(css ="[id='RowForm'] [name='row.description'] textarea")
	private WebElement textfield_description;
	
	@FindBy(css = "[id='RowForm'] [id='row.isRecommended']")
	private WebElement checkbox_isRecommended;
	
	@FindBy(css = "[id='RowForm'] [id='row.isPopular']")
	private WebElement checkbox_isPopular;
	
	
	public Serials(PageManager pageManager) {
		super(pageManager);
	}
	
	public Serials setName(String value) {
		type(textfield_name, value);
		return this;
	}
	
	public Serials setLocations(String value) {
		pageManager.getList2List(list2list_locations).addValue(value);
		return this;	
	}
	
	public ContentContracts addContentContracts(){
		pageManager.getLinkedList(linkedList_contentContracts).add();
		return pageManager.contentContracts;
	}
	
	
	public RentalWindows addRentalWindows(){
		pageManager.getLinkedList(linkedList_contentInDeviceTypes).add();
		return pageManager.rentalWindows;
	}
	
	public ContentContracts openContentContracts(String contentContract) {
		pageManager.getLinkedList(linkedList_contentContracts).openValueSpan(contentContract);
		return pageManager.contentContracts;
	}
	
	public RentalWindows openRentalWindows(String rentalWindows) {
		pageManager.getLinkedList(linkedList_contentInDeviceTypes).openValueLink(rentalWindows);
		
		return pageManager.rentalWindows;
	}
	
	public Serials fillForm(SerialsDB serials){
		setTextfieldKeys(textfield_name, serials.getName());
		setTextfieldKeys(textfield_year, serials.getYear());
		setTextfieldKeys(textfield_actors, serials.getActors());
		setTextfieldKeys(textfield_director, serials.getDirector());
		setTextfieldKeys(textfield_startDate, serials.getStartDate());
		setTextfieldKeys(textfield_endDate, serials.getEndDate());
		setTextfieldKeys(textfield_newDays, serials.getNewDays());		
		setCheckboxKeys(checkbox_dontShowInSeries, serials.getDontShowInSeries());
		setCheckboxKeys(checkbox_isPurchaseAllOnly, serials.getIsPurchaseAllOnly());
		setTextfieldKeys(textfield_reviewTitle, serials.getReviewTitle());
		setTextfieldKeys(textfield_reviewDate, serials.getReviewDate());
		setTextfieldKeys(textfield_review, serials.getReview());
		setList2listKeys(list2list_countries, serials.getCountries());
		setList2listKeys(list2list_contentBundles, serials.getContentBundles());
		setList2listKeys(list2list_seriesPackages, serials.getSeriesPackages());
		setList2listKeys(list2list_contentBundleGroups, serials.getContentBundleGroups());
		setList2listKeys(list2list_contentBundleGenres, serials.getContentBundleGenres());
		setList2listKeys(list2list_locations, serials.getLocations());
		setList2listKeys(list2list_licenseType2, serials.getLicenseType2());
		setComboboxKeys(combobox_contractProgramType, serials.getContractProgramType());
		setTextfieldKeys(textfield_restrictTimeStart, serials.getRestrictTimeStart());
		setTextfieldKeys(textfield_restrictTimeEnd, serials.getRestrictTimeEnd());
		setTextfieldKeys(textfield_originalName, serials.getOriginalName());
		setComboboxKeys(combobox_accessLevel, serials.getAccessLevel());
		setComboboxKeys(combobox_ageLevel, serials.getAgeLevel());
		setTextfieldKeys(textfield_appleId, serials.getAppleId());
		setTextfieldKeys(textfield_androidId, serials.getAndroidId());
		setTextfieldKeys(textfield_smarttvId, serials.getSmarttvId());
		setTextfieldKeys(textfield_kinopoiskRating, serials.getKinopoiskRating());
		setTextfieldKeys(textfield_kinopoiskId, serials.getKinopoiskId());
		setTextfieldKeys(textfield_imdbRating, serials.getImdbRating());
		setTextfieldKeys(textfield_ownerId, serials.getOwnerId());
		setTextfieldKeys(textfield_description, serials.getDescription());
		setCheckboxKeys(checkbox_isRecommended, serials.getIsRecommended());
		setCheckboxKeys(checkbox_isPopular, serials.getIsPopular());
		return this;
	}
	
		public SerialsDB readForm(){
			SerialsDB serials = new SerialsDB();
			serials.setName(insideTab(textfield_name).getAttribute("value")); 
			serials.setYear(insideTab(textfield_year).getAttribute("value")); 
			serials.setActors(insideTab(textfield_actors).getAttribute("value")); 
			serials.setDirector(insideTab(textfield_director).getAttribute("value")); 
			serials.setStartDate(insideTab(textfield_startDate).getAttribute("value")); 
			serials.setEndDate(insideTab(textfield_endDate).getAttribute("value")); 
			serials.setNewDays(insideTab(textfield_newDays).getAttribute("value"));
			serials.setDontShowInSeries(pageManager.getCheckbox(checkbox_dontShowInSeries).getStatus()); 
			serials.setIsPurchaseAllOnly(pageManager.getCheckbox(checkbox_isPurchaseAllOnly).getStatus()); 
			serials.setReviewTitle(insideTab(textfield_reviewTitle).getAttribute("value")); 
			serials.setReviewDate(insideTab(textfield_reviewDate).getAttribute("value")); 
			serials.setReview(insideTab(textfield_review).getAttribute("value")); 
			serials.setCountries(pageManager.getList2List(list2list_countries).getValue()); 
			serials.setContentBundles(pageManager.getList2List(list2list_contentBundles).getValue()); 
			serials.setSeriesPackages(pageManager.getList2List(list2list_seriesPackages).getValue()); 
			serials.setContentBundleGroups(pageManager.getList2List(list2list_contentBundleGroups).getValue()); 
			serials.setContentBundleGenres(pageManager.getList2List(list2list_contentBundleGenres).getValue()); 
			serials.setLocations(pageManager.getList2List(list2list_locations).getValue()); 
			serials.setLicenseType2(pageManager.getList2List(list2list_licenseType2).getValue()); 
			serials.setContractProgramType(insideTab(combobox_contractProgramType).getText()); 
			serials.setRestrictTimeStart(insideTab(textfield_restrictTimeStart).getAttribute("value")); 
			serials.setRestrictTimeEnd(insideTab(textfield_restrictTimeEnd).getAttribute("value")); 
			serials.setOriginalName(insideTab(textfield_originalName).getAttribute("value")); 
			serials.setAccessLevel(insideTab(combobox_accessLevel).getText()); 
			serials.setAgeLevel(insideTab(combobox_ageLevel).getText()); 
			serials.setAppleId(insideTab(textfield_appleId).getAttribute("value")); 
			serials.setAndroidId(insideTab(textfield_androidId).getAttribute("value")); 
			serials.setSmarttvId(insideTab(textfield_smarttvId).getAttribute("value")); 
			serials.setKinopoiskRating(insideTab(textfield_kinopoiskRating).getAttribute("value")); 
			serials.setKinopoiskId(insideTab(textfield_kinopoiskId).getAttribute("value")); 
			serials.setImdbRating(insideTab(textfield_imdbRating).getAttribute("value")); 
			serials.setOwnerId(insideTab(textfield_ownerId).getAttribute("value")); 
			serials.setDescription(insideTab(textfield_description).getAttribute("value")); 
			serials.setIsRecommended(pageManager.getCheckbox(checkbox_isRecommended).getStatus()); 
			serials.setIsPopular(pageManager.getCheckbox(checkbox_isPopular).getStatus()); 
			return serials;
		}

}
