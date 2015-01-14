package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.pages.AnyForm;

public class Finder extends AnyForm{
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.name']")																//*
	public WebElement row_name;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@class='btn pull-right']")																//*
	public WebElement btnCreate;
	
	@FindBy(xpath="//*[@additional-view][last()]//*[@class='slider container-fluid in']/button")
	protected WebElement openFilter;
	
	
	public Finder(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void add(WebElement element, String value){
		element.click();
		wfe.waitCounter();
		addPopup();		
		openFilter.click();
		type(row_name, value);
		driver.findElement(By.cssSelector("[value='row.name'][title='"+value+"']")).click();
		btnCreate.click();
		closePopup();
		
	}

	

}
