package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.BannersDB;
import com.sl.model.User;

public class Banners extends AnyForm {	

	@FindBy(css="[id='RowForm'] [id='row.name']")
	protected WebElement row_name;	
	
	@FindBy(css = "[id='RowForm'] [id='row.description'] textarea")
	protected WebElement row_description;
	
	
	public Banners(PageManager pageManager) {
		super(pageManager);	
	}
	
	public Banners setName(String value) {
		type(row_name, value);
		User.setNameForm(value);
		return this;
	}		
	
	public Banners setDescription(String value) {
		type(row_description, value);
		User.setNameForm(value);
		return this;
	}		
		
	public Banners fillForm(BannersDB banners){
		setTextfieldKeys(row_name, banners.getName());
		setTextfieldKeys(row_description, banners.getDescription());
		return this;
	}
		
	public BannersDB readForm(){
		BannersDB banners = new BannersDB();
		banners.setName(insideTab(row_name).getAttribute("value"));
		banners.setDescription(insideTab(row_description).getAttribute("value"));
		return banners;
		
		
	}
}