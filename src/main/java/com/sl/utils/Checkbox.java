package com.sl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {
	
	WebDriver driver;
	public Checkbox(WebDriver driver){
		this.driver = driver;
	}
	
public void editCheckbox(WebElement name, String value){
		
		if(name != null){
			
			if(value.equals("1"))
			{
				if(!name.isSelected()){
				
					name.click();
			}

			}
			if(value.equals("0"))
				if(name.isSelected())
				
					name.click();
		}
}

}
