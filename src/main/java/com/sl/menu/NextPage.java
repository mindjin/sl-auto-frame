package com.sl.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextPage extends MenuPage{
	
	@FindBy(css="span[ng-show='requestCount>0']")
	protected WebElement count;
	//span[ng-show='requestCount>0'] счетчик
	public NextPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void nextPage(String page){
		
		driver.findElement(By.xpath("//footer//li/a[normalize-space(.)='"+page+"']")).click();
	}
	
	public boolean checkCount(){
		
		if(count.isDisplayed())
			return true;
		else		
		return false;
		
		
	}

}
