package com.sl.menu;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.pages.InterfaceId;
import com.sl.utils.Table;
public class InterfaceIdMP extends MenuPage{
	
	
	
	public InterfaceIdMP(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
		
		
		// TODO Auto-generated constructor stub
	}

	

	@FindBy(id="row.externalId")
	protected WebElement row_externalId;
	
	@FindBy(css="[ng-click='addRow()']")																	
	protected WebElement addCard;	
	
	@FindBy(css="[ng-click='refresh()']")																	
	protected WebElement refresh;	
	
	@FindBy(css="[ng-click='onCopyRow()']")																	
	protected WebElement copy;	
	
	@FindBy(css="[ng-click='switchBulkMode(!bulkMode)']")																	
	protected WebElement bulkMode;	

	
	private String externalId;

	


	
//	private void setExternalId(String value) {
//		type(row_externalId, value);
//		this.value = value;
//		
//	}
	
//	public Table getExternalId(){
//		
//		return new Table(externalId, row_externalId, driver);
//	}

	public void searchExternalId(String value){
		this.externalId = value;
		type(row_externalId, value);
	
		actions.sendKeys(row_externalId, Keys.ENTER).perform();
		
		
		
		
	}


	public InterfaceId addNewCard(){
		
		addCard.click();
		
	
		
		return new InterfaceId(driver);
	
	}

	public void refresh(){
		refresh.click();
	}

	public void copy(){
		copy.click();
	}

	public void bulkMode(){
		bulkMode.click();
	}

	public void importCard(){
	
	}
	
}
