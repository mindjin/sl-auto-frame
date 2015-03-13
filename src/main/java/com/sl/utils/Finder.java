package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.sl.pages.Page;
import com.sl.pages.PageManager;

public class Finder extends Page {
	
	protected WebElement row_name;
	
	public Finder(PageManager pageManager, WebElement element) {
		super(pageManager);	
		element.click();
		incPopup();
		row_name = driver.findElement(By.xpath("//*[@additional-view][last()]//*[@id='row.name']"));
	}
	

	public Finder setName(String value){
		if(row_name.isDisplayed()){
			type(row_name, value);
			row_name.sendKeys(Keys.ENTER);}
		else{
			openFilter();
			wfe.waitElementsVisible(row_name);
			type(row_name, value);
			row_name.sendKeys(Keys.ENTER);
		}
		return this;
	}
	public void clickOk(){
		driver.findElement(By.xpath("//*[@additional-view][last()]//*[@name='btnOk']")).click();		
		decPopup();
	}
	private Finder openFilter(){
		driver.findElement(By.id("btnFilterBrowseList")).click();
		return this;
	}	
	public Finder selectExistValue(String value){
		driver.findElement(By.xpath("//*[@additional-view][last()]//*[@value='row.name'][@title='"+value+"']/a")).click();		
		return this;		
	}

}
