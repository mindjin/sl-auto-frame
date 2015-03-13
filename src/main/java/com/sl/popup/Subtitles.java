package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.SubtitlesDB;
import com.sl.model.User;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class Subtitles extends AnyPopup {

	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.name']")																
	protected WebElement row_name;	
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.PID']")																
	protected WebElement row_PID;
	
	@FindBy (xpath="//*[@additional-view][last()]//input[@id='row.teletextPage']")																
	protected WebElement row_teletextPage;
	
	@FindBy (xpath="//*[@additional-view][last()]//section[@name='row.__states.Locations']")																//*
	protected WebElement states_Locations;
	
	public Subtitles(PageManager pageManager) {
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

	public Subtitles setName(String value) {
		type(row_name, value);
		User.setNameForm(value);
		return this;
	}

	public AnyForm save() {
		savePopup();	
		return this;
	}

	public Subtitles setPID(String value) {
		type(row_PID, value);
		return this;
	}
	
	public Subtitles setTeletext(String value){
		type(row_teletextPage, value);
		return this;
	}
	
	public Subtitles setLocations(String value) {
		pageManager.getList2List(states_Locations).addValue(value);
		return this;
	}
	
	public Subtitles fillForm(SubtitlesDB subtitlesDB) {
		setTextfieldKeys(row_name, subtitlesDB.getName());
		setTextfieldKeys(row_PID, subtitlesDB.getPID());
		setTextfieldKeys(row_teletextPage, subtitlesDB.getTeletextPage());
		setList2listKeys(states_Locations, subtitlesDB.getLocations());
		return this;
	}

	public SubtitlesDB readForm() {
		SubtitlesDB subtitlesDB = new SubtitlesDB();
		subtitlesDB.setName(insideTab(row_name).getAttribute("value"));
		subtitlesDB.setPID(insideTab(row_PID).getAttribute("value"));
		subtitlesDB.setTeletextPage(insideTab(row_teletextPage).getAttribute("value"));
		subtitlesDB.setLocations(pageManager.getList2List(states_Locations).getValue());	
		return subtitlesDB;
	}

}
