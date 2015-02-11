package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.sl.pages.Page;
import com.sl.pages.PageManager;

public class Finder extends Page {
	
	WebElement element;
	
	public Finder(PageManager pageManager) {
		super(pageManager);		
		incPopup();
		element = driver.findElement(By.xpath("//*[@additional-view][last()]//*[@id='row.name']"));
	}
	
	public Finder setName(String value){
		if(element.isDisplayed()){
			type(element, value);
			element.sendKeys(Keys.ENTER);}
		else{
			System.out.println("");
			openFilter();
			type(element, value);
			element.sendKeys(Keys.ENTER);
		}
		return this;
	}
	public void clickOk(){
		driver.findElement(By.xpath("//*[@additional-view][last()]//*[@class='btn pull-right'][1]")).click();		
		decPopup();
	}
	private Finder openFilter(){
		driver.findElement(By.cssSelector("[class='slider container-fluid in'] button")).click();
		return this;
	}	
	public Finder selectExistValue(String value){
		driver.findElement(By.cssSelector("[value='row.name'][title='"+value+"'] a")).click();		
		return this;		
	}

}
