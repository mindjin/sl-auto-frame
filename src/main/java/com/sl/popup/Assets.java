package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.AssetsDB;
import com.sl.model.User;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class Assets extends AnyPopup{

	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.internalFileName']")																
	protected WebElement row_name;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.smExternalId']")																
	protected WebElement row_smExternalId;
	
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
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.priority']//span")																
	protected WebElement row_priority;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.isCrypted']")																
	protected WebElement row_isCrypted;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.isDeleted']")																
	protected WebElement row_isDeleted;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.transport']//span")																
	protected WebElement row_transport;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.AvalabiltyOnVideoServers']")																
	protected WebElement states_AvalabiltyOnVideoServers;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.ContentAudioPIDs']")																
	protected WebElement states_ContentAudioPIDs;
	
	public Assets(PageManager pageManager) {
		super(pageManager);		
	}
	
	public Assets setName(String value) {
		type(row_name, value);
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
	@Override
	public AnyForm save() {
		savePopup();
		return this;
	}
	@Override
	public AnyForm create(){		
		addPopup();
		return this;
	}

	public Assets fillForm(AssetsDB assets) {
		setTextfieldKeys(row_name, assets.getName());
		setTextfieldKeys(row_smExternalId, assets.getSmExternalId());
		setComboboxKeys(row_assetType, assets.getAssetType());
		setTextfieldKeys(row_bitrate, assets.getBitrate());
		setTextfieldKeys(row_containerType, assets.getContainerType());
		setTextfieldKeys(row_durationTime, assets.getDurationTime());
		setComboboxKeys(row_status, assets.getStatus());
		setComboboxKeys(row_priority, assets.getPriority());
		setCheckboxKeys(row_isCrypted, assets.getIsCrypted());
		setCheckboxKeys(row_isDeleted, assets.getIsDeleted());
		setComboboxKeys(row_transport, assets.getTransport());
		setList2listKeys(states_AvalabiltyOnVideoServers, assets.getAvalabiltyOnVideoServers());		
		return this;		
	}
	
	public AssetsDB readForm() {
		AssetsDB assets = new AssetsDB();
		assets.setName(insideTab(row_name).getAttribute("value"));
		assets.setSmExternalId(insideTab(row_smExternalId).getAttribute("value"));
		assets.setAssetType(insideTab(row_assetType).getText());
		assets.setBitrate(insideTab(row_bitrate).getAttribute("value"));
		assets.setContainerType(insideTab(row_containerType).getAttribute("value"));
		assets.setDurationTime(insideTab(row_durationTime).getAttribute("value"));
		assets.setStatus(insideTab(row_status).getText());
		assets.setPriority(insideTab(row_priority).getText());
		assets.setIsCrypted(pageManager.getCheckbox(row_isCrypted).getStatus());
		assets.setIsDeleted(pageManager.getCheckbox(row_isDeleted).getStatus());
		assets.setTransport(insideTab(row_transport).getText());
		assets.setAvalabiltyOnVideoServers(pageManager.getList2List(states_AvalabiltyOnVideoServers).getValue());		
		return assets;		
	}

}
































