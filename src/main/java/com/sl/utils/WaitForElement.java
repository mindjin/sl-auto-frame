package com.sl.utils;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sl.pages.Page;
import com.sl.pages.PageManager;

public class WaitForElement{


	private WebDriver driver;
	public WaitForElement(WebDriver driver) {
		this.driver = driver;
	}

	public void waitElementsClickable(WebElement waitOfElement){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(waitOfElement));
		
	}
	
	public void waitEnableButton(WebElement element){	
		
			for(int i = 0; i<10; i++){
				String atr = element.getAttribute("disabled");
				if(!(atr==null)){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else{
					break;
				}			
		}
	}
	
	public void waitElementsVisible(WebElement waitOfElement){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(waitOfElement));
		
	}
	
	public void waitHomePage(){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("ListFilters")));
	}
	
	public void waitForm(){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("RowForm")));
	}
	
	public void waitForAddPopup(int getPC){
	
			waitElementsVisible(driver.findElement(By.cssSelector("[additional-view='"+getPC+"']")));			
			
	}
	
	
	public void waitForClosePopup(int getPC){		
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.stalenessOf(driver.findElement((By.cssSelector("[additional-view='"+getPC+"']")))));	
		
	}
	
	

	
//	public void autoScrollToList2List(WebElement element){
//		
//		js = new JavaScripts(driver);
//		WebElement header = driver.findElement(By.cssSelector("header"));
//		WebElement footer = driver.findElement(By.cssSelector("footer [class='buttonbar-fixed ng-scope']"));
//		
//		int getSizeHeader = header.getSize().getHeight();
////		int getSizeFooter = footer.getSize().getHeight();
//		int getSizeElement = element.getSize().height;
//		
//		int getLocationHeaderTop = header.getLocation().getY();
//		int getLocationFooterTop = footer.getLocation().getY();
//		int getLocationElementTop = element.getLocation().getY();
//		
//		int getLocationHeaderBottom = getSizeHeader + getLocationHeaderTop;
//		int getLocationElementBottom = getSizeElement + getLocationElementTop;
//		
//		
//		if(getLocationElementBottom < getLocationHeaderBottom)
//		{
//			js.scroll(element, 0, -200);
//			}
//		if(getLocationElementTop > getLocationFooterTop)
//			{
//			js.scroll(element, 0, +200);
//			}
//		
//		
//	}
	
}
