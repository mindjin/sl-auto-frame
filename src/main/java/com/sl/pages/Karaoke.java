package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.KaraokeDB;
import com.sl.popup.Assets;
import com.sl.popup.AssetsOTT;



public class Karaoke extends AnyForm{
	
	@FindBy(css = "[id='RowForm'] [id='row.name']")
	protected WebElement row_name;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.Locations']")
	protected  WebElement states_Locations;
	
	@FindBy(css = "section[name='row.__states.Genres']")
	protected   WebElement states_Genres;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.KaraokePackages']")
	protected  WebElement states_KaraokePackages;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ContentAssets']")
	protected  WebElement states_ContentAssets;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.OttContentAssets']")
	protected  WebElement states_OttContentAssets;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.performer'] span")
	protected WebElement row_performer;

	@FindBy(css = "[id='RowForm'] [name='row.startDate'] input")
	protected WebElement row_startDate;
	
	@FindBy(css = "[id='RowForm'] [name='row.endDate'] input")
	protected WebElement row_endDate;

 	@FindBy(css = "[id='RowForm'] [id='row.description'] textarea")
 	protected WebElement row_descriptionOrInstruction;

 	@FindBy(css = "[id='RowForm'] [id='s2id_row.contractor'] span")
 	protected WebElement row_contractor;
 	
 	@FindBy(css = "[id='RowForm'] [id='row.ownerId']")
 	protected WebElement row_ownerId;
 	 	 	
 	@FindBy(css = "[id='RowForm'] [id='row.externalId']")
 	protected WebElement row_externalId;
 	
	public Karaoke(PageManager pageManager) {
		super(pageManager);		
	}
	
	public Karaoke setName(String value) {
		type(row_name, value);
		return this;
	}

	public Karaoke setExternalId(String value){
		type(row_externalId, value);
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

	public Karaoke setLocations(String value) {
		pageManager.getList2List(states_Locations).addValue(value);
		return this;
	}
	
	public Karaoke fillForm(KaraokeDB karaoke){
		setTextfieldKeys(row_name, karaoke.getName());
		setTextfieldKeys(row_externalId, karaoke.getExternalId());
		setTextfieldKeys(row_startDate, karaoke.getStartDate());
		setTextfieldKeys(row_endDate, karaoke.getEndDate());
		setTextfieldKeys(row_descriptionOrInstruction, karaoke.getDescriptionOrInstruction());
		setComboboxKeys(row_performer, karaoke.getPerformer());
		setComboboxKeys(row_contractor, karaoke.getContractor());
		setList2listKeys(states_Locations, karaoke.getLocations());
		setList2listKeys(states_Genres, karaoke.getGenres());
		setList2listKeys(states_KaraokePackages, karaoke.getKaraokePackages());
		setTextfieldKeys(row_ownerId, karaoke.getOwnerId());
		return this;
	}
	
	public KaraokeDB readForm(){
		KaraokeDB karaoke = new KaraokeDB();
		karaoke.setName(insideTab(row_name).getAttribute("value"));
		karaoke.setDescriptionOrInstruction(insideTab(row_descriptionOrInstruction).getAttribute("value"));
		karaoke.setExternalId(insideTab(row_externalId).getAttribute("value"));
		karaoke.setStartDate(insideTab(row_startDate).getAttribute("value"));
		karaoke.setEndDate(insideTab(row_endDate).getAttribute("value"));
		karaoke.setPerformer(insideTab(row_performer).getText());
		karaoke.setContractor(insideTab(row_contractor).getText());
		karaoke.setOwnerId(insideTab(row_ownerId).getAttribute("value"));
		karaoke.setLocations(pageManager.getList2List(states_Locations).getValue());
		karaoke.setGenres(pageManager.getList2List(states_Genres).getValue());
		karaoke.setKaraokePackages(pageManager.getList2List(states_KaraokePackages).getValue());		
		return karaoke;
	}
	
	
	
}
