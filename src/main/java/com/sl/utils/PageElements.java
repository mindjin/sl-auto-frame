package com.sl.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public abstract class PageElements {
	
	protected WebDriver driver;
	public PageElements(WebDriver driver){
		this.driver = driver;
	}
	
	protected boolean isElementPresent(By by) {	
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    try {
	    	driver.findElement(by);
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      return true;
	    } catch (NoSuchElementException e) {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      return false;
	    }
	 }

}
