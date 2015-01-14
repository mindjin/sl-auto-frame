package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sl.pages.Page;

public class List2Lists extends PageElements{
	
	
	
	
	protected WebElement element,leftFilter,rightFilter,listElement;
	
	protected Actions actions;
	public List2Lists(WebElement element, WebDriver driver) {
		super(driver);
		this.element = element;
		leftFilter = element.findElement(By.cssSelector("input[ng-change='updateLeftFilter()']"));
		rightFilter = element.findElement(By.cssSelector("input[ng-change='updateRightFilter()']"));
		actions = new Actions(driver);
	}
	
		

	public void addAll(){
		element.findElement(By.cssSelector("[ng-click='addAll()']")).click();
	}
		
	public void deleteAll(){
		element.findElement(By.cssSelector("[ng-click='deleteAll()']")).click();
	}
	
	public void addValue(String value){
		
		
		
		Page.type(leftFilter, value);
		listElement = element.findElement(By.xpath(".//td[normalize-space(.)='"+value+"']/input"));
//		System.out.println(listElement.getLocation().getX());
		if(!listElement.isSelected())
			listElement.click();
//		System.out.println("List2List");
	}
	
	public void deleteValue(String value){	
		
		Page.type(rightFilter, value);		
		listElement = element.findElement(By.xpath(".//table[@id='rightListTable']//td[normalize-space(.)='"+value+"']"));
		actions.moveToElement(listElement).doubleClick().perform();
		}


	public boolean getLeftFilter(String value) {
		try{
		Page.type(leftFilter, value);		
		listElement = element.findElement(By.xpath(".//td[normalize-space(.)='"+value+"']/input"));
		if(listElement.isSelected())
			return true;		
		}catch(Exception e){
			return false;
		}
			return false;
	}
	
	public boolean getRightFilter(String value) {
		try{
		Page.type(rightFilter, value);
		listElement = element.findElement(By.xpath(".//table[@id='rightListTable']//td[normalize-space(.)='"+value+"']"));
		if(listElement.getText().equals(value))
			return true;
		}catch(Exception e){
			return false;
		}
			return false;
	}
	
	
}
