package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.VideomoviesDB;
import com.sl.popup.Assets;
import com.sl.popup.AssetsOTT;
import com.sl.popup.AudioPID;
import com.sl.popup.ContentContracts;
import com.sl.popup.ContentInPurchaseM;
import com.sl.popup.OttPreviewAssets;
import com.sl.popup.PreviewAssets;

public class Videomovies extends AnyForm{
	
	@FindBy(css = "[id='RowForm'] [id='row.name']")
	protected WebElement row_name;

	@FindBy(css = "[id='RowForm'] [id='row.year']")
	protected WebElement row_year;

	@FindBy(css = "[id='RowForm'] [id='row.director']")
	protected WebElement row_director;

	@FindBy(css = "[id='RowForm'] [id='row.actors']")
	protected WebElement row_actors;

	@FindBy(css = "[id='RowForm'] [id='row.startDate'] input")
	protected WebElement row_startDate;

	@FindBy(css = "[id='RowForm'] [id='row.endDate'] input")
	protected WebElement row_endDate;

	@FindBy(css = "[id='RowForm'] [id = 'row.premiereStartDate'] input")
	protected WebElement row_premiereStartDate;

	@FindBy(css = "[id='RowForm'] [id = 'row.premiereEndDate'] input")
	protected WebElement row_premiereEndDate;

	@FindBy(css = "[id='RowForm'] [id='row.newDays']")
	protected WebElement row_newDays;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.countries']")
	protected WebElement states_countries;	

	@FindBy(css = "[id='RowForm'] [id='row.reviewTitle']")
	protected WebElement row_reviewTitle;

	@FindBy(css = "[id='RowForm'] [id='row.reviewDate'] input")
	protected WebElement row_reviewDate;

	@FindBy(css = "[id='RowForm'] [id = 'row.review'] textarea")
	protected WebElement row_review;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentAssets']")
	protected WebElement states_ContentAssets;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.OttContentAssets']")
	protected WebElement states_OttContentAssets;	
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.PreviewAssets']")
	protected WebElement states_PreviewAssets;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.OttPreviewAssets']")
	protected WebElement states_OttPreviewAssets;
	
	@FindBy (css ="[id='RowForm'] section[name='row.__states.ContentAudioPIDs']")																
	protected WebElement states_ContentAudioPIDs;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.Genres']")
	protected WebElement states_Genres;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.VodPackages']")
	protected WebElement states_vodPackages;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.EstVodPackages']")
	protected WebElement states_estVodPackages;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.VodGroups']")
	protected WebElement states_vodGroups;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.Locations']")
	protected WebElement states_Locations;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentContracts']")
	protected WebElement states_ContentContracts;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.LicenseType2']")
	protected WebElement states_LicenseType2;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.categoryABCDE'] span")
	protected WebElement row_categoryABCDE;

	@FindBy(css = "[id='RowForm'] [id='row.originalLang']")	
	protected WebElement row_originalLang;

	@FindBy(css = "[id='RowForm'] [id='row.isDubbedNeeded']")
	protected WebElement row_isDubbedNeeded;

	@FindBy(css = "[id='RowForm'] [id='row.dubbedInfo']")
	protected WebElement row_dubbedInfo;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.contractProgramType'] span")
	protected WebElement row_contractProgramType;

	@FindBy(css = "[id='RowForm'] [id='row.licenseYear']")
	protected WebElement row_licenseYear;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentBundles']")
	protected WebElement states_ContentBundles;	
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentInPurchaseM']")
	protected WebElement states_ContentInPurchaseM;	
	
	@FindBy(css="[id='RowForm'] [id='row.restrictTimeStart'] input")
	protected WebElement row_restrictTimeStart;

	@FindBy(css="[id='RowForm'] [id='row.restrictTimeEnd'] input")
	protected WebElement row_restrictTimeEnd;

	@FindBy(css = "[id='RowForm'] [id='row.originalName']")
	protected WebElement row_originalName;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.accessLevel'] span")
	protected WebElement row_accessLevel;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.ageLevel'] span")
	protected WebElement row_ageLevel;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.genre'] span")
	protected WebElement row_genre;

	@FindBy(css = "[id='RowForm'] [id='row.rating']")
	protected WebElement row_rating;

	@FindBy(css = "[id='RowForm'] [id='row.KinopoiskRating']")
	protected WebElement row_KinopoiskRating;

	@FindBy(css = "[id='RowForm'] [id='row.kinopoiskId']")
	protected WebElement row_kinopoiskId;

	@FindBy(css = "[id='RowForm'] [id='row.imdbRating']")
	protected WebElement row_imdbRating;

	@FindBy(css ="[id='RowForm'] [id='row.item']")
	protected WebElement row_item;

	@FindBy(css = "[id='RowForm'] [id='row.appleId']")
	protected WebElement row_appleId;

	@FindBy(css = "[id='RowForm'] [id='row.androidId']")
	protected WebElement row_androidId;

	@FindBy(css = "[id='RowForm'] [id='row.smarttvId']")
	protected WebElement row_smarttvId;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.type3d'] span")
	protected WebElement row_type3d;

	@FindBy(css = "[id='RowForm'] [id='row.adminDsc']")
	protected WebElement row_adminDsc;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.showcase'] span")
	protected WebElement row_showcase;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.bonusPriceCategory'] span")
	protected WebElement row_bonusPriceCategory;

	@FindBy(css ="[id='RowForm'] [id='row.distributionCertificate']")
	protected WebElement row_distributionCertificate;
	
	@FindBy(css ="[id='RowForm'] [id='row.ownerId']")
	protected WebElement row_ownerId;

	@FindBy(css ="[id='RowForm'] [name='row.description'] textarea")
	protected WebElement row_description;
		
	@FindBy(css = "[id='RowForm'] [id='row.isCrypted']")
	protected WebElement row_isCrypted;

	@FindBy(css = "[id='RowForm'] [id='row.isRecommended']")
	protected WebElement row_isRecommended;

	@FindBy(css = "[id='RowForm'] [id='row.ottRecomended']")
	protected WebElement row_ottRecomended;

	@FindBy(css = "[id='RowForm'] [id='row.deleteOnEndDate']")
	protected WebElement row_deleteOnEndDate;

	@FindBy(css = "[id='RowForm'] [id='row.notifySub']")
	protected WebElement row_notifySub;

	@FindBy(css = "[id='RowForm'] [id='row.showAsVod']")
	protected WebElement row_showAsVod;

	@FindBy(css = "[id='RowForm'] [id='row.isErotic']")
	protected WebElement row_isErotic;

	@FindBy(css = "[id='RowForm'] [id='row.isNextEpisode']")
	protected WebElement row_isNextEpisode;

	@FindBy(css = "[id='RowForm'] [id='row.deleteEst']")
	protected WebElement row_deleteEst;
	
	@FindBy(css = "[id='RowForm'] [id='row.isLastEpisode']")
	protected WebElement row_isLastEpisode;
	
	
	public Videomovies(PageManager pageManager) {
		super(pageManager);
	}
	
	public Videomovies setName(String value) {
		type(row_name, value);
			return this;	
	}
	
	public Videomovies setLocations(String value) {
		pageManager.getList2List(states_Locations).addValue(value);
		return this;	
	}
	
	public Videomovies setStartDate(String value){
		type(row_startDate, value);
		return this;
	}
	
	public Videomovies setEndDate(String value){
		type(row_endDate, value);
		return this;
	}
	
	public Videomovies setSeason(String value) {
		pageManager.getList2List(states_ContentBundles).addValue(value);
		return this;	
	}
	
	public AssetsOTT addAssertsOTT(){
		pageManager.getLinkedList(states_OttContentAssets).add();
		return pageManager.assetsOTT;
	}


	public Assets addAssets(){		
		pageManager.getLinkedList(states_ContentAssets).add();
		return pageManager.assets;
	}
	
	public Assets openAsset(String value){
		pageManager.getLinkedList(states_ContentAssets).openValueLink(value);
		return pageManager.assets;
		
	}
	
	public AssetsOTT openAssetOTT(String value){
		pageManager.getLinkedList(states_OttContentAssets).openValueLink(value);
		return pageManager.assetsOTT;		
	}
	
	public PreviewAssets openPreviewAssets(String value){
		pageManager.getLinkedList(states_PreviewAssets).openValueLink(value);
		return pageManager.previewAssets;
	}
	
	public OttPreviewAssets openOttPreviewAssets(String value){
		pageManager.getLinkedList(states_OttPreviewAssets).openValueLink(value);
		return pageManager.ottPreviewAssets;
	}
	
	public AudioPID openAudioPID(String value){
		pageManager.getLinkedList(states_ContentAudioPIDs).openValueLink(value);
		return pageManager.audioPID;
	}
	
	public ContentContracts openContentContracts(String value){
		pageManager.getLinkedList(states_ContentContracts).openValueSpan(value);
		return pageManager.contentContracts;
	}
	
	public ContentInPurchaseM openContentInPurchaseM(String value){
		pageManager.getLinkedList(states_ContentInPurchaseM).openValueLink(value);
		return pageManager.contentInPurchaseM;
	}
	
	public PreviewAssets addPreviewAssets(){		
		pageManager.getLinkedList(states_PreviewAssets).add();
		return pageManager.previewAssets;
	}
	
	public OttPreviewAssets addOttPreviewAssets(){
		pageManager.getLinkedList(states_OttPreviewAssets).add();
		return pageManager.ottPreviewAssets;
	}
	
	public AudioPID addAudioPID(){		
		pageManager.getLinkedList(states_ContentAudioPIDs).add();
		return pageManager.audioPID;
	}
	
	public ContentContracts addContentContracts(){
		pageManager.getLinkedList(states_ContentContracts).add();
		return pageManager.contentContracts;
	}
	
	public ContentInPurchaseM addContentInPurchaseM(){
		pageManager.getLinkedList(states_ContentInPurchaseM).add();
		return pageManager.contentInPurchaseM;
	}
	
	public Videomovies fillForm(VideomoviesDB movieDB){
		setTextfieldKeys(row_name, movieDB.getName());
		setTextfieldKeys(row_year, movieDB.getYear());
		setTextfieldKeys(row_director, movieDB.getDirector());
		setTextfieldKeys(row_actors, movieDB.getActors());
		setTextfieldKeys(row_startDate, movieDB.getStartDate());
		setTextfieldKeys(row_endDate, movieDB.getEndDate());
		setTextfieldKeys(row_premiereStartDate, movieDB.getPremiereStartDate());
		setTextfieldKeys(row_premiereEndDate, movieDB.getPremiereEndDate());
		setTextfieldKeys(row_newDays, movieDB.getNewDays());
		setList2listKeys(states_countries, movieDB.getCountries());	
		setTextfieldKeys(row_reviewTitle, movieDB.getReviewTitle());
		setTextfieldKeys(row_reviewDate, movieDB.getReviewDate());
		setTextfieldKeys(row_review, movieDB.getReview());
		setList2listKeys(states_Genres, movieDB.getGenres());
		setList2listKeys(states_vodPackages, movieDB.getVodPackages());
		setList2listKeys(states_estVodPackages, movieDB.getEstVodPackages());
		setList2listKeys(states_vodGroups, movieDB.getVodGroups());
		setList2listKeys(states_Locations, movieDB.getLocations());
		setList2listKeys(states_LicenseType2, movieDB.getLicenseType2());
		setComboboxKeys(row_categoryABCDE, movieDB.getCategoryABCDE());
		setTextfieldKeys(row_originalLang, movieDB.getOriginalLang());
		setCheckboxKeys(row_isDubbedNeeded, movieDB.getIsDubbedNeeded());
		setTextfieldKeys(row_dubbedInfo, movieDB.getDubbedInfo());
		setComboboxKeys(row_contractProgramType, movieDB.getContractProgramType());
		setTextfieldKeys(row_licenseYear, movieDB.getLicenseYear());
		setList2listKeys(states_ContentBundles, movieDB.getContentBundles());
		setTextfieldKeys(row_restrictTimeStart, movieDB.getRestrictTimeStart());
		setTextfieldKeys(row_restrictTimeEnd, movieDB.getRestrictTimeEnd());
		setTextfieldKeys(row_originalName, movieDB.getOriginalName());
		setComboboxKeys(row_accessLevel, movieDB.getAccessLevel());
		setComboboxKeys(row_ageLevel, movieDB.getAgeLevel());
		setComboboxKeys(row_genre, movieDB.getGenre());
		setTextfieldKeys(row_rating, movieDB.getRating());
		setTextfieldKeys(row_KinopoiskRating, movieDB.getKinopoiskRating());
		setTextfieldKeys(row_kinopoiskId, movieDB.getKinopoiskId());
		setTextfieldKeys(row_imdbRating, movieDB.getImdbRating());
		setTextfieldKeys(row_item, movieDB.getItem());
		setTextfieldKeys(row_appleId, movieDB.getAppleId());
		setTextfieldKeys(row_androidId, movieDB.getAndroidId());
		setTextfieldKeys(row_smarttvId, movieDB.getSmarttvId());
		setComboboxKeys(row_type3d, movieDB.getType3d());
		setTextfieldKeys(row_adminDsc, movieDB.getAdminDsc());
		setComboboxKeys(row_showcase, movieDB.getShowcase());
		setComboboxKeys(row_bonusPriceCategory, movieDB.getBonusPriceCategory());
		setTextfieldKeys(row_distributionCertificate, movieDB.getDistributionCertificate());
		setTextfieldKeys(row_ownerId, movieDB.getOwnerId());
		setTextfieldKeys(row_description, movieDB.getDescription());
		setCheckboxKeys(row_isCrypted, movieDB.getIsCrypted());
		setCheckboxKeys(row_isRecommended, movieDB.getIsRecommended());
		setCheckboxKeys(row_ottRecomended, movieDB.getOttRecomended());
		setCheckboxKeys(row_deleteOnEndDate, movieDB.getDeleteOnEndDate());
		setCheckboxKeys(row_notifySub, movieDB.getNotifySub());
		setCheckboxKeys(row_showAsVod, movieDB.getShowAsVod());
		setCheckboxKeys(row_isErotic, movieDB.getIsErotic());
		setCheckboxKeys(row_isNextEpisode, movieDB.getIsNextEpisode());
		setCheckboxKeys(row_deleteEst, movieDB.getDeleteEst());
		setCheckboxKeys(row_isLastEpisode, movieDB.getIsLastEpisode());
		return this;
	}
	
	public VideomoviesDB readForm(){
		VideomoviesDB movieDB = new VideomoviesDB();
		movieDB.setName(insideTab(row_name).getAttribute("value"));
		movieDB.setYear(insideTab(row_year).getAttribute("value"));
		movieDB.setDirector(insideTab(row_director).getAttribute("value"));
		movieDB.setActors(insideTab(row_actors).getAttribute("value"));
		movieDB.setStartDate(insideTab(row_startDate).getAttribute("value"));
		movieDB.setEndDate(insideTab(row_endDate).getAttribute("value"));
		movieDB.setPremiereStartDate(insideTab(row_premiereStartDate).getAttribute("value"));
		movieDB.setPremiereEndDate(insideTab(row_premiereEndDate).getAttribute("value"));
		movieDB.setNewDays(insideTab(row_newDays).getAttribute("value"));
		movieDB.setCountries(pageManager.getList2List(states_countries).getValue());	
		movieDB.setReviewTitle(insideTab(row_reviewTitle).getAttribute("value"));
		movieDB.setReviewDate(insideTab(row_reviewDate).getAttribute("value"));
		movieDB.setReview(insideTab(row_review).getAttribute("value"));
		movieDB.setGenres(pageManager.getList2List(states_Genres).getValue());
		movieDB.setVodPackages(pageManager.getList2List(states_vodPackages).getValue());
		movieDB.setEstVodPackages(pageManager.getList2List(states_estVodPackages).getValue());
		movieDB.setVodGroups(pageManager.getList2List(states_vodGroups).getValue());
		movieDB.setLocations(pageManager.getList2List(states_Locations).getValue());
		movieDB.setLicenseType2(pageManager.getList2List(states_LicenseType2).getValue());
		movieDB.setCategoryABCDE(insideTab(row_categoryABCDE).getText());
		movieDB.setOriginalLang(insideTab(row_originalLang).getAttribute("value"));
		movieDB.setIsDubbedNeeded(pageManager.getCheckbox(row_isDubbedNeeded).getStatus());
		movieDB.setDubbedInfo(insideTab(row_dubbedInfo).getAttribute("value"));
		movieDB.setContractProgramType(insideTab(row_contractProgramType).getText());
		movieDB.setLicenseYear(insideTab(row_licenseYear).getAttribute("value"));
		movieDB.setContentBundles(pageManager.getList2List(states_ContentBundles).getValue());
		movieDB.setRestrictTimeStart(insideTab(row_restrictTimeStart).getAttribute("value"));
		movieDB.setRestrictTimeEnd(insideTab(row_restrictTimeEnd).getAttribute("value"));
		movieDB.setOriginalName(insideTab(row_originalName).getAttribute("value"));
		movieDB.setAccessLevel(insideTab(row_accessLevel).getText());
		movieDB.setAgeLevel(insideTab(row_ageLevel).getText());
		movieDB.setGenre(insideTab(row_genre).getText());
		movieDB.setRating(insideTab(row_rating).getAttribute("value"));
		movieDB.setKinopoiskRating(insideTab(row_KinopoiskRating).getAttribute("value"));
		movieDB.setKinopoiskId(insideTab(row_kinopoiskId).getAttribute("value"));
		movieDB.setImdbRating(insideTab(row_imdbRating).getAttribute("value"));
		movieDB.setItem(insideTab(row_item).getAttribute("value"));
		movieDB.setAppleId(insideTab(row_appleId).getAttribute("value"));
		movieDB.setAndroidId(insideTab(row_androidId).getAttribute("value"));
		movieDB.setSmarttvId(insideTab(row_smarttvId).getAttribute("value"));
		movieDB.setType3d(insideTab(row_type3d).getText());
		movieDB.setAdminDsc(insideTab(row_adminDsc).getAttribute("value"));
		movieDB.setShowcase(insideTab(row_showcase).getText());
		movieDB.setBonusPriceCategory(insideTab(row_bonusPriceCategory).getText());
		movieDB.setDistributionCertificate(insideTab(row_distributionCertificate).getAttribute("value"));
		movieDB.setOwnerId(insideTab(row_ownerId).getAttribute("value"));
		movieDB.setDescription(insideTab(row_description).getAttribute("value"));
		movieDB.setIsCrypted(pageManager.getCheckbox(row_isCrypted).getStatus());
		movieDB.setIsRecommended(pageManager.getCheckbox(row_isRecommended).getStatus());
		movieDB.setOttRecomended(pageManager.getCheckbox(row_ottRecomended).getStatus());
		movieDB.setDeleteOnEndDate(pageManager.getCheckbox(row_deleteOnEndDate).getStatus());
		movieDB.setNotifySub(pageManager.getCheckbox(row_notifySub).getStatus());
		movieDB.setShowAsVod(pageManager.getCheckbox(row_showAsVod).getStatus());
		movieDB.setIsErotic(pageManager.getCheckbox(row_isErotic).getStatus());
		movieDB.setIsNextEpisode(pageManager.getCheckbox(row_isNextEpisode).getStatus());
		movieDB.setDeleteEst(pageManager.getCheckbox(row_deleteEst).getStatus());
		movieDB.setIsLastEpisode(pageManager.getCheckbox(row_isLastEpisode).getStatus());
		return movieDB;
		
	}

}
