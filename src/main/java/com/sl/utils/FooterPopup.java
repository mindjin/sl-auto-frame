package com.sl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FooterPopup {
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@ng-click='addRow(row)']")																
	WebElement addPopup;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@ng-click='closePopUp()']")																
	WebElement closePopup;
	
	
	WebDriver driver;
	
	public FooterPopup(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void add(){
		addPopup.click();
		
		
	}
	
	public void close(){
		closePopup.click();
		
	}

}
