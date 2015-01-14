package com.sl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.menu.InterfaceIdMP;
import com.sl.utils.FooterForm;

public class InterfaceId extends AnyForm{
	
	String value;
	
	public InterfaceId(WebDriver driver) {
		super(driver);
		
		
	}
	
	
	
	@FindBy(id = "row.name")
	private WebElement row_name;
	
	@FindBy(id="row.sortOrder")
	private WebElement row_sort;
	
	@FindBy(css="[id='row.description'] textarea")
	private WebElement row_description;
	
	@FindBy(id="row.externalId")
	private WebElement row_externalId;
	
	

	

	
	public void setName(String value) {
		type(row_name, value);
		this.value = value;
		
	}
	public void setSorting(int value) {
		this.value = Integer.toString(value);
		type(row_sort, this.value);
		
		
	}
	public void setDescription(String value) {
		type(row_description, value);
		this.value = value;
		
	}
	public void setExternalId(String value) {
		type(row_externalId, value);
		this.value = value;
		
	}

	
		
	
	
	public InterfaceIdMP createCard() {
		
		FooterForm button = new FooterForm(driver);
		
		button.createAndClose();
	
		return new InterfaceIdMP(driver);
	}


	
	
}
