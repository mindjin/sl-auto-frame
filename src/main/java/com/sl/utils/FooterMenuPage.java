package com.sl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterMenuPage {
	
	WebDriver driver;
	
	public FooterMenuPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}


	
	@FindBy(css="[ng-click='addRow()']")																	
	protected WebElement addCard;	
	
	@FindBy(css="[ng-click='refresh()']")																	
	protected WebElement refresh;	
	
	@FindBy(css="[ng-click='onCopyRow()']")																	
	protected WebElement copy;	
	
	@FindBy(css="[ng-click='switchBulkMode(!bulkMode)']")																	
	protected WebElement bulkMode;	



	public void addNewCard(){
		
		addCard.click();
		 
	
	}

	public void refresh(){
		refresh.click();
	}

	public void copy(){
		copy.click();
	}

	public void bulkMode(){
		bulkMode.click();
	}

	public void importCard(){
	
	}

}
