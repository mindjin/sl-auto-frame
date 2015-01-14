package com.sl.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sl.pages.Videomovies;

public class VideomoviesMP extends MenuPage{

	public VideomoviesMP(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
public Videomovies addNewCard(){
		
		footer.addNewCard();
		

		return new Videomovies(driver);

	}
	
	public Videomovies openName(String value) {
		
		filter.setText(row_name, value);
		table.getExistValue(value).click();
		
		return new Videomovies(driver);
	}
	
	public boolean findName(String value){
		filter.setText(row_name, value);
		boolean verifyTable = isElementPresent(By.cssSelector("[title='"+value+"'] a"));
		return verifyTable;
	}
	
	

}
