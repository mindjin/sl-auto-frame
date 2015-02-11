package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.popup.Assets;
import com.sl.popup.AssetsOTT;
import com.sl.popup.AudioPID;
import com.sl.popup.ContentContracts;
import com.sl.popup.ContentInPurchaseM;
import com.sl.popup.OttPreviewAssets;
import com.sl.popup.PreviewAssets;

public class Videomovies extends AnyForm{
	
	@FindBy(css = "[id='RowForm'] [id='row.name']")
	WebElement row_name;

	@FindBy(css = "[id='RowForm'] [id='row.year']")
	WebElement row_year;

	@FindBy(css = "[id='RowForm'] [id='row.director']")
	WebElement row_director;

	@FindBy(css = "[id='RowForm'] [id='row.actors']")
	WebElement row_actors;

	@FindBy(css = "[id='RowForm'] [id='row.startDate'] input")
	WebElement row_startDate;

	@FindBy(css = "[id='RowForm'] [id='row.endDate'] input")
	WebElement row_endDate;

	@FindBy(css = "[id='RowForm'] [id = 'row.premiereStartDate'] input")
	WebElement row_premiereStartDate;

	@FindBy(css = "[id='RowForm'] [id = 'row.premiereEndDate'] input")
	WebElement row_premiereEndDate;

	@FindBy(css = "[id='RowForm'] [id='row.newDays']")
	WebElement row_newDays;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.countries']")
	WebElement states_countries;	

	@FindBy(css = "[id='RowForm'] [id='row.reviewTitle']")
	WebElement row_reviewTitle;

	@FindBy(css = "[id='RowForm'] [id='row.reviewDate'] input")
	WebElement row_reviewDate;

	@FindBy(css = "[id='RowForm'] [id = 'row.review'] textarea")
	WebElement row_review;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentAssets']")
	protected  WebElement states_ContentAssets;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.OttContentAssets']")
	protected  WebElement states_OttContentAssets;	
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.PreviewAssets']")
	protected  WebElement states_PreviewAssets;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.OttPreviewAssets']")
	protected  WebElement states_OttPreviewAssets;
	
	@FindBy (css ="[id='RowForm'] section[name='row.__states.ContentAudioPIDs']")																//*
	protected WebElement states_ContentAudioPIDs;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.Genres']")
	 WebElement states_Genres;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.VodPackages']")
	WebElement states_vodPackages;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.EstVodPackages']")
	WebElement states_estVodPackages;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.VodGroups']")
	WebElement states_vodGroups;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.Locations']")
	WebElement states_Locations;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentContracts']")
	protected WebElement states_ContentContracts;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.LicenseType2']")
	WebElement states_LicenseType2;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.categoryABCDE'] span")
	 WebElement row_categoryABCDE;

	@FindBy(css = "[id='RowForm'] [id='row.originalLang']")	
	WebElement row_originalLang;

	@FindBy(css = "[id='RowForm'] [id='row.isDubbedNeeded']")
	WebElement row_isDubbedNeeded;

	@FindBy(css = "[id='RowForm'] [id='row.dubbedInfo']")
	WebElement row_dubbedInfo;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.contractProgramType'] span")
	WebElement row_contractProgramType;

	@FindBy(css = "[id='RowForm'] [id='row.licenseYear']")
	WebElement row_licenseYear;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentBundles']")
	WebElement states_ContentBundles;	
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentInPurchaseM']")
	protected WebElement states_ContentInPurchaseM;	
	

	@FindBy(css="[id='RowForm'] [id='row.restrictTimeStart'] input")
	WebElement row_restrictTimeStart;

	@FindBy(css="[id='RowForm'] [id='row.restrictTimeEnd'] input")
	WebElement row_restrictTimeEnd;

	@FindBy(css = "[id='RowForm'] [id='row.originalName']")
	WebElement row_originalName;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.accessLevel'] span")
	WebElement row_accessLevel;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.ageLevel'] span")
	WebElement row_ageLevel;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.genre'] span")
	WebElement row_genre;

//	@FindBy(css = "[id='RowForm'] [id='row.rating']")
//	WebElement row_rating;

	@FindBy(css = "[id='RowForm'] [id='row.KinopoiskRating']")
	WebElement row_KinopoiskRating;

	@FindBy(css = "[id='RowForm'] [id='row.kinopoiskId']")
	WebElement row_kinopoiskId;

	@FindBy(css = "[id='RowForm'] [id='row.imdbRating']")
	WebElement row_imdbRating;

	@FindBy(css ="[id='RowForm'] [id='row.item']")
	WebElement row_item;

	@FindBy(css = "[id='RowForm'] [id='row.appleId']")
	WebElement row_appleId;

	@FindBy(css = "[id='RowForm'] [id='row.androidId']")
	WebElement row_androidId;

	@FindBy(css = "[id='RowForm'] [id='row.smarttvId']")
	WebElement row_smarttvId;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.type3d'] span")
	WebElement row_type3d;

	@FindBy(css = "[id='RowForm'] [id='row.adminDsc']")
	WebElement row_adminDsc;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.showcase'] span")
	WebElement row_showcase;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.bonusPriceCategory'] span")
	WebElement row_bonusPriceCategory;

	@FindBy(css ="[id='RowForm'] [id='row.distributionCertificate']")
	WebElement row_distributionCertificate;
	
	@FindBy(css ="[id='RowForm'] [id='row.ownerId']")
	WebElement row_ownerId;

	@FindBy(css ="[id='RowForm'] [name='row.description'] textarea")
	WebElement row_description;
		
	@FindBy(css = "[id='RowForm'] [id='row.isCrypted']")
	public WebElement row_isCrypted;

	@FindBy(css = "[id='RowForm'] [id='row.isRecommended']")
	WebElement row_isRecommended;

	@FindBy(css = "[id='RowForm'] [id='row.ottRecomended']")
	WebElement row_ottRecomended;

	@FindBy(css = "[id='RowForm'] [id='row.deleteOnEndDate']")
	WebElement row_deleteOnEndDate;

	@FindBy(css = "[id='RowForm'] [id='row.notifySub']")
	WebElement row_notifySub;

	@FindBy(css = "[id='RowForm'] [id='row.showAsVod']")
	WebElement row_showAsVod;

	@FindBy(css = "[id='RowForm'] [id='row.isErotic']")
	WebElement row_isErotic;

	@FindBy(css = "[id='RowForm'] [id='row.isNextEpisode']")
	WebElement row_isNextEpisode;

	@FindBy(css = "[id='RowForm'] [id='row.deleteEst']")
	WebElement row_deleteEst;
	
	@FindBy(css = "[id='RowForm'] [id='row.isLastEpisode']")
	WebElement row_isLastEpisode;
	
	
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
		insideTab(states_ContentAssets);
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

}
