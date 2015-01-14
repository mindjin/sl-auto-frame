package com.sl.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sl.pages.VodPackage;


public class VodPackageMP extends MenuPage{

	public VodPackageMP(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

public VodPackage addNewCard(){
		
		footer.addNewCard();
		

		return new VodPackage(driver);

	}
	
	public VodPackage openName(String value) {
		
		filter.setText(row_name, value);
		table.getExistValue(value).click();
		
		return new VodPackage(driver);
	}
	
	public boolean findName(String value){
		filter.setText(row_name, value);
		boolean verifyTable = isElementPresent(By.cssSelector("[title='"+value+"'] a"));
		return verifyTable;
	}
	
}
