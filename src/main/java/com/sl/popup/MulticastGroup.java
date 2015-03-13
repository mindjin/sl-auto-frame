package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.MulticastGroupDB;
import com.sl.model.User;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class MulticastGroup extends AnyPopup {
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.url']")																
	protected WebElement row_url;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.hqUrl']")																
	protected WebElement row_hqUrl;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.backupUrl1']")																
	protected WebElement row_backupUrl1;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.backupUrl2']")																
	protected WebElement row_backupUrl2;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.plcUrl']")																
	protected WebElement row_plcUrl;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.pipUrl']")																
	protected WebElement row_pipUrl;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.bitrate']")																
	protected WebElement row_bitrate;
	@FindBy (xpath="//*[@additional-view][last()]//input[@id='row.nPVRChannelID']")																
	protected WebElement row_nPVRChannelID;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.externalId']")																
	protected WebElement row_externalId;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.location']//span")																
	protected WebElement row_location;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.viewPVRChannelID']")																
	protected WebElement row_viewPVRChannelID;
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.SmartRecorders']")																//*
	protected WebElement states_smartRecorders;
	
	public MulticastGroup(PageManager pageManager) {
		super(pageManager);		
	}
	
	public MulticastGroup setURL(String value){
		type(row_url, value);
		User.setNameForm(value);
		return this;
	}
	
	public void close(){
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
	
	public MulticastGroup fillForm(MulticastGroupDB multicastDB){
		setTextfieldKeys(row_url, multicastDB.getUrl()); 
		setTextfieldKeys(row_hqUrl, multicastDB.getHqUrl()); 
		setTextfieldKeys(row_backupUrl1, multicastDB.getBackupUrl1()); 
		setTextfieldKeys(row_backupUrl2, multicastDB.getBackupUrl2()); 
		setTextfieldKeys(row_plcUrl, multicastDB.getPlcUrl()); 
		setTextfieldKeys(row_pipUrl, multicastDB.getPipUrl()); 
		setTextfieldKeys(row_bitrate, multicastDB.getBitrate()); 
		setTextfieldKeys(row_nPVRChannelID, multicastDB.getNPVRChannelID()); 
		setTextfieldKeys(row_externalId, multicastDB.getExternalId()); 
		setComboboxKeys(row_location, multicastDB.getLocation()); 
		setTextfieldKeys(row_viewPVRChannelID, multicastDB.getViewPVRChannelID()); 
		setList2listKeys(states_smartRecorders, multicastDB.getSmartRecorders()); 
		return this;
	}
	
	public MulticastGroupDB readForm(){
		MulticastGroupDB multicastDB = new MulticastGroupDB();
		multicastDB.setUrl(insideTab(row_url).getAttribute("value")); 
		multicastDB.setHqUrl(insideTab(row_hqUrl).getAttribute("value")); 
		multicastDB.setBackupUrl1(insideTab(row_backupUrl1).getAttribute("value")); 
		multicastDB.setBackupUrl2(insideTab(row_backupUrl2).getAttribute("value")); 
		multicastDB.setPlcUrl(insideTab(row_plcUrl).getAttribute("value")); 
		multicastDB.setPipUrl(insideTab(row_pipUrl).getAttribute("value")); 
		multicastDB.setBitrate(insideTab(row_bitrate).getAttribute("value")); 
		multicastDB.setNPVRChannelID(insideTab(row_nPVRChannelID).getAttribute("value")); 
		multicastDB.setExternalId(insideTab(row_externalId).getAttribute("value")); 
		multicastDB.setLocation(insideTab(row_location).getText()); 
		multicastDB.setViewPVRChannelID(insideTab(row_viewPVRChannelID).getAttribute("value")); 
		multicastDB.setSmartRecorders(pageManager.getList2List(states_smartRecorders).getValue());
		return multicastDB;
	}
	

}
