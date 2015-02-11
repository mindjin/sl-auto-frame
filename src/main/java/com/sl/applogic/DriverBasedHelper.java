package com.sl.applogic;

import org.openqa.selenium.WebDriver;

import com.sl.pages.PageManager;
import com.sl.utils.JavaScripts;

public class DriverBasedHelper {
	
	WebDriver driver;
	PageManager pageManager;
	JavaScripts js;
	
	public DriverBasedHelper(WebDriver driver){
		this.driver = driver;
		pageManager = new PageManager(driver);
		js = new JavaScripts(driver);		
	}
	
	
	
//	protected boolean isElementPresent(By by) {	
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//	    try {	    	
//	    	driver.findElement(by);
//	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	      return true;
//	    } catch (NoSuchElementException e) {
//	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	      return false;
//	    }
//	 }
	
//	public PageManager getPageManager(){
//		return pageManager;
//	}
}
