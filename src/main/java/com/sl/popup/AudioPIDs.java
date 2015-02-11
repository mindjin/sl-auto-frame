package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.User;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class AudioPIDs extends AnyPopup {

	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.name']")																
	protected WebElement row_name;	
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.PID']")																
	protected WebElement row_PID;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.audioPIDType']//span")			
	protected WebElement row_audioPIDType;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.Locations']")																//*
	protected WebElement states_Locations;
	
	public AudioPIDs(PageManager pageManager) {
		super(pageManager);
	}
	
	@Override
	public AnyForm create(){		
		addPopup();
		return this;
	}
	public void close(){
		closePopup();		
	}
	public AnyForm save() {
		savePopup();	
		return this;
	}

	public AudioPIDs setName(String value) {
		type(row_name, value);
		User.setNameForm(value);
		return this;
	}	

	public AudioPIDs setPID(String value) {
		type(row_PID, value);
		return this;
	}
	
	public AudioPIDs setLocations(String value) {
		pageManager.getList2List(states_Locations).addValue(value);
		return this;
	}

}
