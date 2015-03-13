package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.DvbtUrlDB;
import com.sl.model.User;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class DvbtURL extends AnyPopup {

	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.url']")																
	protected WebElement row_url;
	
	public DvbtURL(PageManager pageManager) {
		super(pageManager);
		// TODO Auto-generated constructor stub
	}
	
	public DvbtURL setURL(String value){
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
	
	public DvbtURL fillForm(DvbtUrlDB dvbtUrlDB) {
		setTextfieldKeys(row_url, dvbtUrlDB.getUrl());		
		return this;
	}

	public DvbtUrlDB readForm() {
		DvbtUrlDB dvbtUrlDB = new DvbtUrlDB();
		dvbtUrlDB.setUrl(insideTab(row_url).getAttribute("value"));		
		return dvbtUrlDB;
	}

}
