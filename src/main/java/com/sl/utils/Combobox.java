package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sl.pages.Page;
import com.sl.pages.PageManager;

public class Combobox extends Page{	
	
	
	private WebElement element;
	public Combobox(PageManager pageManager, WebElement element){
		super(pageManager);
		this.element = element;
		insideTab(element);
	}
	
	public void findValue(String value) {													
		element.click();
		driver.findElement(By.cssSelector("[id='select2-drop'] input")).sendKeys(value);										
		driver.findElement(By.xpath("//div/span[@class='select2-match'][normalize-space(text())='"+value+"']")).click();		
	}
	
//public boolean editCombobox(WebElement name, String value) {
//		
//		if(name != null){													
//				name.click();
//				input.sendKeys(value);
//				By matchResult = By.xpath("//div/span[@class='select2-match'][normalize-space(text())='"+value+"']");
//				boolean isAvailable = isElementPresent(matchResult);
//			try{	
//			if(isAvailable==true) {
//				driver.findElement(By.xpath("//div/span[@class='select2-match'][normalize-space(text())='"+value+"']")).click();				
//				return true;
//			}else{
//				throw new Exception();
//			}
//			}catch(Exception e)
//			{
//				System.out.println(value+" is not available");
//			}
//			}
//		
//			return false;	
//	}
}
