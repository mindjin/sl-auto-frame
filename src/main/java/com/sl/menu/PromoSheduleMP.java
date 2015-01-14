package com.sl.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.pages.PromoShedule;
import com.sl.utils.Combobox;
import com.sl.utils.Table;

public class PromoSheduleMP extends MenuPage{
	
	Combobox combobox;
	public PromoSheduleMP(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		combobox = new Combobox(driver);
		
	}

	
	@FindBy(css="[id='s2id_row.interfaceId'] input")
	protected WebElement row_interfaceId;
	
	@FindBy(css="[ng-click='addRow()']")																	
	protected WebElement addCard;	
	
	@FindBy(css="[ng-click='refresh()']")																	
	protected WebElement refresh;	
	
	@FindBy(css="[ng-click='onCopyRow()']")																	
	protected WebElement copy;	
	
	@FindBy(css="[ng-click='switchBulkMode(!bulkMode)']")																	
	protected WebElement bulkMode;
	
	@FindBy(css="[ng-click='clearFilters()']")																	
	protected WebElement clearFilters;
	
	



	private String interfaceId;
	
//	public Table getInterfaceId(){
//		
//		return new Table(interfaceId, row_interfaceId, driver);
//	}
	
	
	public boolean searchInterfaceId(String value){
		this.interfaceId = value;
		clearFilters.click();
		boolean Id = combobox.editCombobox(row_interfaceId, value);
		if(Id==true){
		driver.findElement(By.cssSelector("[value='row.interfaceId'] [ng-click='refresh()']")).click();
		boolean isTable = isElementPresent(By.cssSelector("[id='ListTableContainer'] tbody>tr>td[title]"));
		return isTable;
		}
		return true;
		
	}

		public boolean getExternalId(){
		
		boolean i = isElementPresent(By.cssSelector("[value='row.interfaceId'][title='"+interfaceId+"']"));
		
		return i;
	}
		
		public PromoShedule addNewCard(){
			
			addCard.click();
			
		
			
			return new PromoShedule(driver);
		
		}

		
	
}
