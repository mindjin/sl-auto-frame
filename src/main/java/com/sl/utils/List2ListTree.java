package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sl.pages.PageManager;

public class List2ListTree extends List2List {

	public List2ListTree(PageManager pageManager, WebElement element) {
		super(pageManager, element);
	}
	
	@Override
	public List2List addValue(String value){		
		int beforeSize = getListSize(List.LEFT);
		type(leftFilter, value);
		waitLeftList(beforeSize, List.LEFT);		
		listElement = element.findElement(By.xpath(".//label[normalize-space(.)='"+value+"']/input"));
		if(!listElement.isSelected())
			listElement.click();
		return this;
	}
	

}
