package com.sl.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.pages.AnyForm;
import com.sl.utils.List2Lists;

public class Assets extends AnyForm{
	

	

	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.internalFileName']")																
	WebElement row_name;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.smExternalId']")																
	WebElement row_smExternalId;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.assetType']//span")																
	WebElement row_assetType;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.bitrate']")																
	WebElement row_bitrate;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.containerType']")																
	WebElement row_containerType;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.duration']//input")																
	WebElement row_durationTime;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.status']//span")																
	WebElement row_status;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.priority']//span")																
	WebElement row_priority;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.isCrypted']")																
	WebElement row_isCrypted;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.isDeleted']")																
	WebElement row_isDeleted;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.transport']//span")																
	WebElement row_transport;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.AvalabiltyOnVideoServers']")																//*
	WebElement states_AvalabiltyOnVideoServers;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.ContentAudioPIDs']")																//*
	WebElement states_ContentAudioPIDs;
	
	public Assets(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		addPopup();
		
	}

	

	public void createAndClose(){
		
		
		
	}



	public AudioPID createAudioPID() {
		insideTab(states_ContentAudioPIDs);
		states_ContentAudioPIDs.findElement(By.cssSelector("[ng-click='onAddRow()']")).click();
		return new AudioPID(driver);
	}
	
	public void addAssets(){
		footerPopup.add();
		closePopup();
		wfe.waitCounter();
		
	}



	public AudioPID openAudioPID(String title) {
		insideTab(states_ContentAudioPIDs);
		table.getExistValue(states_ContentAudioPIDs, title).click();
		return new AudioPID(driver);
		
	}



	public void closeAssets() {
	 footerPopup.close();
	 closePopup();
		
	}
	
	

}
