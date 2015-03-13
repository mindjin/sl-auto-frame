package com.sl.pages;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Lists;
import com.sl.utils.JavaScripts;
import com.sl.utils.WaitForElement;
import com.sl.utils.WindowsStatus;

public abstract class Page {
	
	protected WebDriver driver;
	protected PageManager pageManager;
	protected JavaScripts js;
	protected WaitForElement wfe;
	
	public WindowsStatus ws;
	
	
	public Page(PageManager pageManager){
		
		this.pageManager = pageManager;
		driver = pageManager.getWebDriver();
		wfe = new WaitForElement(driver);
		js = new JavaScripts(driver);
		ws = WindowsStatus.getInstance();
		
	}
	
	public void type(WebElement webElement, String text){		
		webElement.clear();
		webElement.sendKeys(text);
	}
	
	
	public WebDriver getWebDriver(){
		return driver;
	}	
	

	public Page incPopup(){
		ws.incPC();
		wfe.waitForAddPopup(ws.getPC());
		return this;
	}

	public Page decPopup(){
		int countPopup = ws.getPC();
		By by = By.cssSelector("[additional-view='"+countPopup+"']");		
		if(isElementPresent(by))
			wfe.waitForClosePopup(countPopup);
			ws.decPC();
		return this;
	
	}
	
	public WebElement insideTab(WebElement element){
		
		try{
			if(!element.isDisplayed()){				
				List<WebElement> tabs = driver.findElements(By.cssSelector("ul[class='nav nav-tabs']>li"));
				 List<WebElement> allTabs = Lists.reverse(tabs);
				for(WebElement tab : allTabs){
					System.out.println("Element not visible. Get next TAB for search:");
					if(tab.isDisplayed())
					tab.click();
					if(element.isDisplayed())
						break;
				}
			 }
			
		}catch(Exception e) {
			
		}	
		return element;
		
	}
	
	protected boolean isElementPresent(By by) {	
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    try {	    	
    	driver.findElement(by);    	 
      return true;
    } catch(NoSuchElementException e) {
      return false;
    }finally{
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
 }
	
	protected <T> void setTextfieldKeys(WebElement element, T t){
		if(t!=null){
			insideTab(element);
			type(element, (String) t);
		}
	}
	
	protected <T> void setComboboxKeys(WebElement element, T t){
		if(t!=null)
			pageManager.getCombobox(element).findValue((String) t);
	}
	
	protected <T> void setList2listKeys(WebElement element, T t){
		if(t!=null){
			pageManager.getList2List(element).deleteAll().addValue((String) t);
		}
	}
	
	protected <T> void setCheckboxKeys(WebElement element, T t){
		if(t!=null)
			pageManager.getCheckbox(element).editCheckbox((String) t);		
		
	}
	
	protected <T> void setFinderKeys(WebElement element, T t){
		if(t!=null)
			pageManager.getFinder(element).setName((String) t).selectExistValue((String) t).clickOk();
		
	}
	
	
	

	
}
