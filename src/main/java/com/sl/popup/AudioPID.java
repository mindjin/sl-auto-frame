package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.AudioPidDB;
import com.sl.model.User;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class AudioPID extends AnyPopup {
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.name']")																
	protected WebElement row_name;	
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.PID']")																
	protected WebElement row_PID;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.audioPIDType']//span")			
	protected WebElement row_audioPIDType;
	
	public AudioPID(PageManager pageManager) {
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
	@Override
	public AnyForm save() {
		savePopup();
		return this;
	}
	
	public AudioPID setName(String value) {
		type(row_name, value);
		User.setNameForm(value);
		return this;
	}

	public AudioPID setPID(String value) {
		type(row_PID, value);
		return this;
	}

	public AudioPID fillForm(AudioPidDB audioPid) {
		setTextfieldKeys(row_name, audioPid.getName());
		setTextfieldKeys(row_PID, audioPid.getPID());
		setComboboxKeys(row_audioPIDType, audioPid.getAudioPIDType());
		return this;
	}

	public AudioPidDB readForm() {
		AudioPidDB audioPidDB = new AudioPidDB();
		audioPidDB.setName(insideTab(row_name).getAttribute("value"));
		audioPidDB.setPID(insideTab(row_PID).getAttribute("value"));
		audioPidDB.setAudioPIDType(insideTab(row_audioPIDType).getText());
		return audioPidDB;
		
		
	}

}
