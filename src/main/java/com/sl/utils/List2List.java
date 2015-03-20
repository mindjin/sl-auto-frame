package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sl.pages.Page;
import com.sl.pages.PageManager;

public class List2List extends Page{
	
	protected WebElement element,leftFilter,rightFilter,listElement;	
	private Actions actions;
	
	protected enum List{
		LEFT("left"),
		RIGHT("right");
		private String value;
		List(String value){
			this.value = value;			
		}
		public String getValue(){
			return value;
		}
	}

	public List2List(PageManager pageManager, WebElement element) {
		super(pageManager);
		this.element = element;
		insideTab(element);
		leftFilter = element.findElement(By.cssSelector("input[ng-change='updateLeftFilter()']"));
		rightFilter = element.findElement(By.cssSelector("input[ng-change='updateRightFilter()']"));
		actions = new Actions(pageManager.getWebDriver());
	}	
		

	public List2List addAll(){
		element.findElement(By.cssSelector("[ng-click='addAll()']")).click();
		return this;
	}
		
	public List2List deleteAll(){
		element.findElement(By.cssSelector("[ng-click='removeAll()']")).click();
		return this;
	}
	
	public List2List addValue(String value){
		
		int beforeSize = getListSize(List.LEFT);
		type(leftFilter, value);
		waitLeftList(beforeSize, List.LEFT);		
		listElement = element.findElement(By.xpath(".//td[normalize-space(.)='"+value+"']/input"));
		if(!listElement.isSelected())
			listElement.click();
		return this;
	}


	
	
	public void deleteValue(String value){	
		
		type(rightFilter, value);		
		listElement = element.findElement(By.xpath(".//table[@id='rightListTable']//td[normalize-space(.)='"+value+"']"));
		actions.moveToElement(listElement).doubleClick().perform();
		}


	public boolean getLeftFilter(String value) {
		try{
		type(leftFilter, value);		
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
		type(rightFilter, value);
		listElement = element.findElement(By.xpath(".//table[@id='rightListTable']//td[normalize-space(.)='"+value+"']"));
		if(listElement.getText().equals(value))
			return true;
		}catch(Exception e){
			return false;
		}
			return false;
	}	
	
	
	protected int getListSize(List list){
		String size;
		if(list.getValue().equals("left"));
		size = element.findElement(By.cssSelector("[ng-click='addAll()']")).getText();
		if(list.getValue().equals("right"))
		size = element.findElement(By.cssSelector("[ng-click='addAll()']")).getText();
		char[] c = size.toCharArray();
		int value = 0;
		String i = "";
		for(Character b:c){
			
				if(Character.isDigit(b)){	
					i = i.concat(b.toString());
				value = Integer.parseInt(i);	
				}		
		}
		return value;
	}
	
public void waitLeftList(int before, List list) {
	int afterSize = 0;
		for(int i = 0; i<10; i++){
			if(list.getValue().equals("left"))
			afterSize = getListSize(List.LEFT);
			if(list.getValue().equals("right"))
			afterSize = getListSize(List.RIGHT);
			if(before==afterSize){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			else{
				break;
			}			
	}
		
	}


public String getValue() {
	listElement = element.findElement(By.xpath(".//table[@id='rightListTable']//td"));
	return listElement.getText();
	
}
}
