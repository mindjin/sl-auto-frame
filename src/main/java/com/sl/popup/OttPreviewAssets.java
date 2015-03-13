package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.OttPreviewAssetsDB;
import com.sl.model.User;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class OttPreviewAssets extends AnyPopup {
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.internalFileName']")																
	protected WebElement row_name;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.containerType']")																
	protected WebElement row_containerType;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.bitrate']")																
	protected WebElement row_bitrate;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.duration']//input")																
	protected WebElement row_durationTime;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.status']//span")																
	protected WebElement row_status;
		
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.isCrypted']")																
	protected WebElement row_isCrypted;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.transport']//span")																
	protected WebElement row_transport;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.ContentAudioPIDs']")															
	protected WebElement states_ContentAudioPIDs;	

	public OttPreviewAssets(PageManager pageManager) {
		super(pageManager);
		// TODO Auto-generated constructor stub
	}
	
	public AudioPID addAudioPID() {
		pageManager.getLinkedList(states_ContentAudioPIDs).add();
		return pageManager.audioPID;
	}
		
	public AudioPID openAudioPID(String value) {
		pageManager.getLinkedList(states_ContentAudioPIDs).openValueLink(value);
		return pageManager.audioPID;
	}
	
	public OttPreviewAssets setName(String value) {
		type(row_name, value);
		User.setNameForm(value);
		return this;
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
	
	public OttPreviewAssets fillForm(OttPreviewAssetsDB ottPreviewAssets) {
		setTextfieldKeys(row_name, ottPreviewAssets.getName());
		setTextfieldKeys(row_containerType, ottPreviewAssets.getContainerType());
		setTextfieldKeys(row_bitrate, ottPreviewAssets.getBitrate());
		setTextfieldKeys(row_containerType, ottPreviewAssets.getContainerType());
		setTextfieldKeys(row_durationTime, ottPreviewAssets.getDurationTime());
		setComboboxKeys(row_status, ottPreviewAssets.getStatus());
		setCheckboxKeys(row_isCrypted, ottPreviewAssets.getIsCrypted());
		setComboboxKeys(row_transport, ottPreviewAssets.getTransport());	
		return this;		
	}
	
	public OttPreviewAssetsDB readForm() {
		OttPreviewAssetsDB ottPreviewAssets = new OttPreviewAssetsDB();
		ottPreviewAssets.setName(insideTab(row_name).getAttribute("value"));
		ottPreviewAssets.setContainerType(insideTab(row_containerType).getAttribute("value"));
		ottPreviewAssets.setBitrate(insideTab(row_bitrate).getAttribute("value"));
		ottPreviewAssets.setContainerType(insideTab(row_containerType).getAttribute("value"));
		ottPreviewAssets.setDurationTime(insideTab(row_durationTime).getAttribute("value"));
		ottPreviewAssets.setStatus(insideTab(row_status).getText());
		ottPreviewAssets.setIsCrypted(pageManager.getCheckbox(row_isCrypted).getStatus());
		ottPreviewAssets.setTransport(insideTab(row_transport).getText());		
		return ottPreviewAssets;		
	}

}
