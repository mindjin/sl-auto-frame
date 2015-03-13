package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.AssetsOttDB;
import com.sl.model.User;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class AssetsOTT extends AnyPopup {

	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.internalFileName']")																
	protected WebElement row_name;	
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.assetType']//span")																
	protected WebElement row_assetType;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.bitrate']")																
	protected WebElement row_bitrate;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.containerType']")																
	protected WebElement row_containerType;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.duration']//input")																
	protected WebElement row_durationTime;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.status']//span")																
	protected WebElement row_status;
		
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.isCrypted']")																
	protected WebElement row_isCrypted;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.isDeleted']")																
	protected WebElement row_isDeleted;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.transport']//span")																
	protected WebElement row_transport;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.Locations']")																//*
	protected WebElement states_Locations;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.ContentAudioPIDs']")																//*
	protected WebElement states_ContentAudioPIDs;
	
	public AssetsOTT(PageManager pageManager) {
		super(pageManager);
	}
	
	public AssetsOTT setName(String value) {
		type(row_name, value);
		User.setNameForm(value);
		return this;
	}
	
	
	public AudioPID addAudioPID() {
		pageManager.getLinkedList(states_ContentAudioPIDs).add();
		return pageManager.audioPID;
	}	
	
	public AudioPID openAudioPID(String value) {
		pageManager.getLinkedList(states_ContentAudioPIDs).openValueLink(value);
		return pageManager.audioPID;
	}
	public void close() {
		closePopup();
	}
	
	public AnyForm save() {
		savePopup();	
		return this;
	}
	
	@Override
	public AnyForm create(){		
		addPopup();
		return this;
	}

	public AssetsOTT fillForm(AssetsOttDB assetsOtt) {
		setTextfieldKeys(row_name, assetsOtt.getName());
		setComboboxKeys(row_assetType, assetsOtt.getAssetType());
		setTextfieldKeys(row_bitrate, assetsOtt.getBitrate());
		setTextfieldKeys(row_containerType, assetsOtt.getContainerType());
		setTextfieldKeys(row_durationTime, assetsOtt.getDurationTime());		
		setComboboxKeys(row_status, assetsOtt.getStatus());
		setCheckboxKeys(row_isCrypted, assetsOtt.getIsCrypted());
		setCheckboxKeys(row_isDeleted, assetsOtt.getIsDeleted());
		setComboboxKeys(row_transport, assetsOtt.getTransport());
		setList2listKeys(states_Locations, assetsOtt.getLocations());	
		return this;
	}

	public AssetsOttDB readform() {
		AssetsOttDB assetsOtt = new AssetsOttDB();
		assetsOtt.setName(insideTab(row_name).getAttribute("value"));
		assetsOtt.setAssetType(insideTab(row_assetType).getText());
		assetsOtt.setBitrate(insideTab(row_bitrate).getAttribute("value"));
		assetsOtt.setContainerType(insideTab(row_containerType).getAttribute("value"));
		assetsOtt.setDurationTime(insideTab(row_durationTime).getAttribute("value"));
		assetsOtt.setStatus(insideTab(row_status).getText());
		assetsOtt.setIsCrypted(pageManager.getCheckbox(row_isCrypted).getStatus());
		assetsOtt.setIsDeleted(pageManager.getCheckbox(row_isDeleted).getStatus());
		assetsOtt.setTransport(insideTab(row_transport).getText());
		assetsOtt.setLocations(pageManager.getList2List(states_Locations).getValue());	
		return assetsOtt;
	}

}
