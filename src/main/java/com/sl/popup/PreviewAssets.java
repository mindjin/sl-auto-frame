package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.PreviewAssetsDB;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class PreviewAssets extends AnyPopup {
	
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
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.priority']//span")																
	protected WebElement row_priority;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.isCrypted']")																
	protected WebElement row_isCrypted;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.transport']//span")																
	protected WebElement row_transport;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.ContentAudioPIDs']")															
	protected WebElement states_ContentAudioPIDs;	

	public PreviewAssets(PageManager pageManager) {
		super(pageManager);
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

	public PreviewAssets setName(String value) {
		type(row_name, value);
		return this;
	}
	
	public PreviewAssets fillForm(PreviewAssetsDB previewAssets) {
		setTextfieldKeys(row_name, previewAssets.getName());
		setTextfieldKeys(row_containerType, previewAssets.getContainerType());
		setTextfieldKeys(row_bitrate, previewAssets.getBitrate());
		setTextfieldKeys(row_durationTime, previewAssets.getDurationTime());
		setComboboxKeys(row_status, previewAssets.getStatus());
		setComboboxKeys(row_priority, previewAssets.getPriority());
		setCheckboxKeys(row_isCrypted, previewAssets.getIsCrypted());
		setComboboxKeys(row_transport, previewAssets.getTransport());	
		return this;		
	}
	
	public PreviewAssetsDB readForm() {
		PreviewAssetsDB previewAssets = new PreviewAssetsDB();
		previewAssets.setName(insideTab(row_name).getAttribute("value"));
		previewAssets.setContainerType(insideTab(row_containerType).getAttribute("value"));
		previewAssets.setBitrate(insideTab(row_bitrate).getAttribute("value"));
		previewAssets.setDurationTime(insideTab(row_durationTime).getAttribute("value"));
		previewAssets.setStatus(insideTab(row_status).getText());
		previewAssets.setPriority(insideTab(row_priority).getText());
		previewAssets.setIsCrypted(pageManager.getCheckbox(row_isCrypted).getStatus());
		previewAssets.setTransport(insideTab(row_transport).getText());		
		return previewAssets;		
	}
	
}
