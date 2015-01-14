package com.sl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sl.pages.Page;

public abstract class ActionsElements <T> extends Page{
	
	T instantiate;
	
	protected ActionsElements(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	
	
	protected void editCheckbox(WebElement name, String value){
		
		if(name != null){
			
			if(value.equals("on"))
			{
				if(!name.isSelected()){
				
					name.click();
			}

			}
			if(value.equals("off"))
				if(name.isSelected())
				
					name.click();
		}
	}
	
	
	
	
	
	

}
