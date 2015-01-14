package com.sl.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.pages.Banners;
import com.sl.utils.FooterMenuPage;

public class BannersMP extends MenuPage{
	
	@FindBy(id="row.name")
	protected WebElement row_name;
	
	@FindBy(css="[ng-click='addRow()']")																	
	protected WebElement addCard;	
	
	@FindBy(css="[ng-click='refresh()']")																	
	protected WebElement refresh;	
	
	@FindBy(css="[ng-click='onCopyRow()']")																	
	protected WebElement copy;	
	
	@FindBy(css="[ng-click='switchBulkMode(!bulkMode)']")																	
	protected WebElement bulkMode;	

	public BannersMP(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	String name;
	FooterMenuPage footer = new FooterMenuPage(driver);


public boolean searchName(String value){
	name=value;
	type(row_name,value);
	actions.sendKeys(row_name, Keys.ENTER).perform();
	boolean i = isElementPresent(By.cssSelector("[value='row.name'][title='"+name+"']"));
	return i;
				
}

public Banners addNewCard(){
	
	footer.addNewCard();
	

	return new Banners(driver);

}
	
}
