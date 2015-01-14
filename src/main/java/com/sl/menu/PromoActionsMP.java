package com.sl.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sl.pages.PromoActions;
import com.sl.utils.FooterMenuPage;

public class PromoActionsMP extends MenuPage {
	
	
	public PromoActionsMP(WebDriver driver) {
		super(driver);
				
	}
	
	
	
	FooterMenuPage footer = new FooterMenuPage(driver);

	public PromoActions addNewCard(){
		
		footer.addNewCard();
		

		return new PromoActions(driver);

	}

	public PromoActions openName(String value) {
		filter.setText(row_name, value);
		table.getExistValue(value).click();
		
		return new PromoActions(driver);
		
	}

	public boolean findName(String value){
		filter.setText(row_name, value);
		boolean verifyTable = isElementPresent(By.cssSelector("[title='"+value+"'] a"));
		return verifyTable;
	}
}
