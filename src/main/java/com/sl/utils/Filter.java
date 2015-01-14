package com.sl.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Filter {
	WebDriver driver;
	Actions actions;
	public Filter(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		// TODO Auto-generated constructor stub
	}

	public void setText(WebElement element, String name) {
		element.clear();
		element.sendKeys(name);
		actions.sendKeys(element, Keys.ENTER).click().perform();
		
	}
	
	
	

}
