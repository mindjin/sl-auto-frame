package com.sl.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sl.pages.Karaoke;
import com.sl.utils.FooterMenuPage;
import com.sl.utils.Table;

public class KaraokeMP extends MenuPage{
	

	public KaraokeMP(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	
	

	public Karaoke addNewCard(){
		
		footer.addNewCard();
		

		return new Karaoke(driver);

	}
	
	public Karaoke openName(String value) {
		
		filter.setText(row_name, value);
		table.getExistValue(value).click();
		
		return new Karaoke(driver);
	}
	
	public boolean findName(String value){
		filter.setText(row_name, value);
		boolean verifyTable = isElementPresent(By.cssSelector("[title='"+value+"'] a"));
		return verifyTable;
	}

}
