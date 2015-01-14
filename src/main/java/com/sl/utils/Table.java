package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table  {
	
	
	
	
	WebDriver driver;
	
	
	
	public Table(WebDriver driver) {
		this.driver = driver;
		
		
	}

	public WebElement getExistValue(String value){
		WebElement elementInTable = driver.findElement(By.cssSelector("[title='"+value+"'] a"));
		return elementInTable;
	}
	
	public WebElement getExistValue(WebElement element, String value){
		WebElement elementInTable = element.findElement(By.cssSelector("[title='"+value+"'] a"));
		return elementInTable;
	}

	
	
	
	
	

}
