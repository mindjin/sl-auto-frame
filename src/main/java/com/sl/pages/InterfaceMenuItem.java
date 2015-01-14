package com.sl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.menu.InterfaceMenuItemMP;
import com.sl.utils.FooterForm;

public class InterfaceMenuItem extends AnyForm{

	
	public InterfaceMenuItem(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "row.name")
	private WebElement row_name;
	
	@FindBy(id="row.sortOrder")
	private WebElement row_sort;
	
	@FindBy(css="[id='row.description'] textarea")
	private WebElement row_description;
	
	@FindBy(id="row.externalId")
	private WebElement row_externalId;
	


	public void setSorting(int sorting) {
		String sort = Integer.toString(sorting);
		type(row_sort, sort);
		
	}

	public void setName(String value) {
		type(row_name, value);
		// TODO Auto-generated method stub
		
	}

	public void setExternalId(String value) {
		type(row_externalId, value);
		// TODO Auto-generated method stub
		
	}

	public InterfaceMenuItemMP createCard() {
		FooterForm button = new FooterForm(driver);
		button.createAndClose();
		return new InterfaceMenuItemMP(driver);
	}

	



}
