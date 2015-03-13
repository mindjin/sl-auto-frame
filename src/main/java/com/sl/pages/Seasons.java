package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.SeasonsDB;
import com.sl.popup.ContentContracts;

public class Seasons extends AnyForm {
	
	@FindBy(css = "[id='RowForm'] [id='row.name']")
	private WebElement textfield_name;
	
	@FindBy(css = "[id='RowForm'] [id='row.year']")
	private WebElement textfield_year;
	
	@FindBy(css = "[id='RowForm'] [id='row.actors']")
	private WebElement textfield_actors;
	
	@FindBy(css = "[id='RowForm'] [id='row.director']")
	private WebElement textfield_director;
	
	@FindBy(css = "[id='RowForm'] [id='s2id_row.bonusPriceCategory'] span")
	private WebElement combobox_bonusPriceCategory;
	
	@FindBy(css = "[id='RowForm'] [id='row.startDate'] input")
	private WebElement textfield_startDate;
	
	@FindBy(css = "[id='RowForm'] [id='row.endDate'] input")
	private WebElement textfield_endDate;
	
	@FindBy(css = "[id='RowForm'] [id='row.item']")
	private WebElement textfield_item;
	
	@FindBy(css = "[id='RowForm'] [id='row.newDays']")
	private WebElement textfield_newDays;

	@FindBy(css = "[id='RowForm'] [id='row.moviesCount']")
	private WebElement text_moviesCount;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.countries']")
	private WebElement list2list_countries;
	
	@FindBy(css = "[id='RowForm'] [id='row.reviewTitle']")
	private WebElement textfield_reviewTitle;

	@FindBy(css = "[id='RowForm'] [id='row.reviewDate'] input")
	private WebElement textfield_reviewDate;

	@FindBy(css = "[id='RowForm'] [id = 'row.review'] textarea")
	private WebElement textfield_review;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentBundleGenres']")
	private WebElement list2list_contentBundleGenres;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentBundlePackage']")
	private WebElement list2list_contentBundlePackage;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.EstContentBundlePackages']")
	private WebElement list2list_estContentBundlePackages;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.VideoMovies']")
	private WebElement list2list_videoMovies;
	
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

	@FindBy(css = "[id='RowForm'] [id='row.dontShowInSeries']")
	private WebElement checkbox_dontShowInSeries;

	@FindBy(css = "[id='RowForm'] [id='row.isPurchaseAllOnly']")
	private WebElement checkbox_isPurchaseAllOnly;
	
	@FindBy(css = "[id='RowForm'] [id='row.deleteEst']")
	private WebElement checkbox_deleteEst;
	
	
	public Seasons(PageManager pageManager) {
		super(pageManager);
	}
	
	public Seasons setName(String value) {
		type(textfield_name, value);
		return this;
	}
	
	public Seasons setItem(String value) {
		type(textfield_item, value);
		return this;
	}
	
	
	
	public Seasons setLocations(String value) {
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
	
	public Seasons fillForm(SeasonsDB seasons){
		setTextfieldKeys(textfield_name, seasons.getName());
		setTextfieldKeys(textfield_year, seasons.getYear());
		setTextfieldKeys(textfield_actors, seasons.getActors());
		setTextfieldKeys(textfield_director, seasons.getDirector());
		setComboboxKeys(combobox_bonusPriceCategory, seasons.getBonusPriceCategory());
		setTextfieldKeys(textfield_startDate, seasons.getStartDate());
		setTextfieldKeys(textfield_endDate, seasons.getEndDate());
		setTextfieldKeys(textfield_item, seasons.getItem());
		setTextfieldKeys(textfield_newDays, seasons.getNewDays());
		setTextfieldKeys(text_moviesCount, seasons.getMoviesCount());
		setList2listKeys(list2list_countries, seasons.getCountries());
		setTextfieldKeys(textfield_reviewTitle, seasons.getReviewTitle());
		setTextfieldKeys(textfield_reviewDate, seasons.getReviewDate());
		setTextfieldKeys(textfield_review, seasons.getReview());
		setList2listKeys(list2list_contentBundleGenres, seasons.getContentBundleGenres());
		setList2listKeys(list2list_contentBundlePackage, seasons.getContentBundlePackage());
		setList2listKeys(list2list_estContentBundlePackages, seasons.getEstContentBundlePackages());
		setList2listKeys(list2list_videoMovies, seasons.getVideoMovies());
		setList2listKeys(list2list_locations, seasons.getLocations());
		setList2listKeys(list2list_licenseType2, seasons.getLicenseType2());
		setComboboxKeys(combobox_contractProgramType, seasons.getContractProgramType());
		setTextfieldKeys(textfield_restrictTimeStart, seasons.getRestrictTimeStart());
		setTextfieldKeys(textfield_restrictTimeEnd, seasons.getRestrictTimeEnd());
		setTextfieldKeys(textfield_originalName, seasons.getOriginalName());
		setComboboxKeys(combobox_accessLevel, seasons.getAccessLevel());
		setComboboxKeys(combobox_ageLevel, seasons.getAgeLevel());
		setTextfieldKeys(textfield_appleId, seasons.getAppleId());
		setTextfieldKeys(textfield_androidId, seasons.getAndroidId());
		setTextfieldKeys(textfield_smarttvId, seasons.getSmarttvId());
		setTextfieldKeys(textfield_kinopoiskRating, seasons.getKinopoiskRating());
		setTextfieldKeys(textfield_kinopoiskId, seasons.getKinopoiskId());
		setTextfieldKeys(textfield_imdbRating, seasons.getImdbRating());
		setTextfieldKeys(textfield_ownerId, seasons.getOwnerId());
		setTextfieldKeys(textfield_description, seasons.getDescription());
		setCheckboxKeys(checkbox_isRecommended, seasons.getIsRecommended());
		setCheckboxKeys(checkbox_dontShowInSeries, seasons.getDontShowInSeries());
		setCheckboxKeys(checkbox_isPurchaseAllOnly, seasons.getIsPurchaseAllOnly());
		setCheckboxKeys(checkbox_deleteEst, seasons.getDeleteEst());
		return this;
	}
	
		public SeasonsDB readForm(){
			SeasonsDB seasonsDB = new SeasonsDB();
			seasonsDB.setName(insideTab(textfield_name).getAttribute("value"));
			seasonsDB.setYear(insideTab(textfield_year).getAttribute("value"));
			seasonsDB.setActors(insideTab(textfield_actors).getAttribute("value"));
			seasonsDB.setDirector(insideTab(textfield_director).getAttribute("value"));
			seasonsDB.setBonusPriceCategory(insideTab(combobox_bonusPriceCategory).getText());
			seasonsDB.setStartDate(insideTab(textfield_startDate).getAttribute("value"));
			seasonsDB.setEndDate(insideTab(textfield_endDate).getAttribute("value"));
			seasonsDB.setItem(insideTab(textfield_item).getAttribute("value"));
			seasonsDB.setNewDays(insideTab(textfield_newDays).getAttribute("value"));
			seasonsDB.setMoviesCount(insideTab(text_moviesCount).getAttribute("value"));
			seasonsDB.setCountries(pageManager.getList2List(list2list_countries).getValue());
			seasonsDB.setReviewTitle(insideTab(textfield_reviewTitle).getAttribute("value"));
			seasonsDB.setReviewDate(insideTab(textfield_reviewDate).getAttribute("value"));
			seasonsDB.setReview(insideTab(textfield_review).getAttribute("value"));
			seasonsDB.setContentBundleGenres(pageManager.getList2List(list2list_contentBundleGenres).getValue());
			seasonsDB.setContentBundlePackage(pageManager.getList2List(list2list_contentBundlePackage).getValue());
			seasonsDB.setEstContentBundlePackages(pageManager.getList2List(list2list_estContentBundlePackages).getValue());
			seasonsDB.setVideoMovies(pageManager.getList2List(list2list_videoMovies).getValue());
			seasonsDB.setLocations(pageManager.getList2List(list2list_locations).getValue());
			seasonsDB.setLicenseType2(pageManager.getList2List(list2list_licenseType2).getValue());
			seasonsDB.setContractProgramType(insideTab(combobox_contractProgramType).getText());
			seasonsDB.setRestrictTimeStart(insideTab(textfield_restrictTimeStart).getAttribute("value"));
			seasonsDB.setRestrictTimeEnd(insideTab(textfield_restrictTimeEnd).getAttribute("value"));
			seasonsDB.setOriginalName(insideTab(textfield_originalName).getAttribute("value"));
			seasonsDB.setAccessLevel(insideTab(combobox_accessLevel).getText());
			seasonsDB.setAgeLevel(insideTab(combobox_ageLevel).getText());
			seasonsDB.setAppleId(insideTab(textfield_appleId).getAttribute("value"));
			seasonsDB.setAndroidId(insideTab(textfield_androidId).getAttribute("value"));
			seasonsDB.setSmarttvId(insideTab(textfield_smarttvId).getAttribute("value"));
			seasonsDB.setKinopoiskRating(insideTab(textfield_kinopoiskRating).getAttribute("value"));
			seasonsDB.setKinopoiskId(insideTab(textfield_kinopoiskId).getAttribute("value"));
			seasonsDB.setImdbRating(insideTab(textfield_imdbRating).getAttribute("value"));
			seasonsDB.setOwnerId(insideTab(textfield_ownerId).getAttribute("value"));
			seasonsDB.setDescription(insideTab(textfield_description).getAttribute("value"));
			seasonsDB.setIsRecommended(pageManager.getCheckbox(checkbox_isRecommended).getStatus());
			seasonsDB.setDontShowInSeries(pageManager.getCheckbox(checkbox_dontShowInSeries).getStatus());
			seasonsDB.setIsPurchaseAllOnly(pageManager.getCheckbox(checkbox_isPurchaseAllOnly).getStatus());
			seasonsDB.setDeleteEst(pageManager.getCheckbox(checkbox_deleteEst).getStatus());
			return seasonsDB;
		}

		

		
	
	

}
