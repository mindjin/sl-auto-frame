package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sl.pages.Page;
import com.sl.pages.PageManager;

public class LinkedList extends Page{

	
	WebElement element;
	public LinkedList(PageManager pageManager, WebElement element) {
		super(pageManager);
		this.element = element;
		insideTab(element);
	}
	
	public void openValueLink(String value){
		element.findElement(By.cssSelector("[title='"+value+"'] a")).click();
		incPopup();
	}
	
	public void openValueSpan(String value){
		element.findElement(By.cssSelector("[title='"+value+"'] span")).click();
		incPopup();
	}
	
	public void add(){		
		element.findElement(By.cssSelector("[ng-click='onAddRow()']")).click();
		incPopup();
	}

}
