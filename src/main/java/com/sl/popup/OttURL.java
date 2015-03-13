package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.OttUrlDB;
import com.sl.model.User;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;
import com.sl.utils.Length;

public class OttURL extends AnyPopup {

	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.url']")																
	protected WebElement row_url;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.externalId']")																
	protected WebElement row_externalId;
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.location']//span")																
	protected WebElement row_location;
	@Length(24)
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.epgOffset']")																
	protected WebElement row_epgOffset;
	
	
	public OttURL(PageManager pageManager) {
		super(pageManager);		
	}
	
	public OttURL setURL(String value){
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

	public OttURL fillForm(OttUrlDB ottUrlDB) {
		setTextfieldKeys(row_url, ottUrlDB.getUrl());
		setTextfieldKeys(row_externalId, ottUrlDB.getExternalId());
		setComboboxKeys(row_location, ottUrlDB.getLocation());
		setTextfieldKeys(row_epgOffset, ottUrlDB.getEpgOffset());
		return this;
	}

	public OttUrlDB readForm() {
		OttUrlDB ottUrlDB = new OttUrlDB();
		ottUrlDB.setUrl(insideTab(row_url).getAttribute("value"));
		ottUrlDB.setExternalId(insideTab(row_externalId).getAttribute("value"));
		ottUrlDB.setLocation(insideTab(row_location).getText());
		ottUrlDB.setEpgOffset(insideTab(row_epgOffset).getAttribute("value"));
		return ottUrlDB;
		
		
	}
}
