package com.sl.menu;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.pages.InterfaceMenuItem;

public class InterfaceMenuItemMP extends MenuPage{

	@FindBy(id="row.externalId")
	protected WebElement row_externalId;
	
	@FindBy(css="[ng-click='addRow()']")																	
	protected WebElement addCard;	
	
	@FindBy(css="[ng-click='refresh()']")																	
	protected WebElement refresh;	
	
	@FindBy(css="[ng-click='onCopyRow()']")																	
	protected WebElement copy;	
	
	@FindBy(css="[ng-click='switchBulkMode(!bulkMode)']")																	
	protected WebElement bulkMode;	
	public InterfaceMenuItemMP(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	private String externalId;
	
//	public Table getExternalId(){
//		
//		return new Table(externalId, row_externalId, driver);
//	}
	
	//Search element
	public void searchExternalId(String value) {
		
		this.externalId = value;
		type(row_externalId, value);
		actions.sendKeys(row_externalId, Keys.ENTER).perform();
		
	
		
		
	}

	public InterfaceMenuItem addNewCard() {
		addCard.click();
		return new InterfaceMenuItem(driver);
		
	}

	

	

}
