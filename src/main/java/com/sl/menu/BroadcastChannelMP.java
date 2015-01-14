package com.sl.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sl.pages.BroadcastChannel;

public class BroadcastChannelMP extends MenuPage{
	
public BroadcastChannelMP(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

public BroadcastChannel addNewCard(){
		
		footer.addNewCard();		

		return new BroadcastChannel(driver);

	}
	
	public BroadcastChannel openName(String value) {
		
		filter.setText(row_name, value);
		table.getExistValue(value).click();
		
		return new BroadcastChannel(driver);
	}
	
	public boolean findName(String value){
		filter.setText(row_name, value);
		boolean verifyTable = isElementPresent(By.cssSelector("[title='"+value+"'] a"));
		return verifyTable;
	}

}
