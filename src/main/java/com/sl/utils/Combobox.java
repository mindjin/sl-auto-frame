package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Combobox extends PageElements{
	
	
	@FindBy(css="[id='select2-drop'] input")
	protected WebElement input;
	
	public Combobox(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	
public boolean editCombobox(WebElement name, String value) {
		
		if(name != null){													
				name.click();
				input.sendKeys(value);
				By matchResult = By.xpath("//div/span[@class='select2-match'][normalize-space(text())='"+value+"']");
				boolean isAvailable = isElementPresent(matchResult);
			try{	
			if(isAvailable==true) {
				driver.findElement(By.xpath("//div/span[@class='select2-match'][normalize-space(text())='"+value+"']")).click();				
				return true;
			}else{
				throw new Exception();
			}
			}catch(Exception e)
			{
				System.out.println(value+" is not available");
			}
			}
		
			return false;	
	}


	
}
