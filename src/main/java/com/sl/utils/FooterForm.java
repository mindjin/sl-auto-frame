package com.sl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterForm {
	WebDriver driver;
	WaitForElement wfe;
	public FooterForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wfe = new WaitForElement(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy(css="[ng-click='onAddClick()']")															
	 private WebElement create;																				

	@FindBy(css="[ng-click='onAddAndCloseClick()']")													
	private WebElement createAndClose;																		

	@FindBy(css="[ng-click='onCreateAndPublishClick()']")											
	private WebElement publish;																			

	@FindBy(css="[ng-click='onSaveClick()']")																
	private WebElement save;																				

	@FindBy(css="[ng-click='onSaveAndCloseClick()']")														
	private WebElement saveAndClose;																		

	@FindBy(css="[ng-click='onDeleteClick()']")															
	private WebElement delete;
	
	@FindBy(css="[additional-view='0'] [class='btn btn-danger']")															
	private WebElement yes;
	
	@FindBy(id="ListFilters")
	protected WebElement MP;

	@FindBy(id="RowForm")
	protected WebElement card;

	
	public void create() {
		create.click();
		wfe.waitCounter();
				
	}
	
	public void createAndClose() {
		
		
		wfe.waitElementsClickable(createAndClose);
		createAndClose.click();
		wfe.waitCounter();
		
				
	}
	
	public void save() {
		save.click();
		wfe.waitCounter();
	}
	
	public void saveAndClose() {
		wfe.waitElementsClickable(saveAndClose);
		saveAndClose.click();
		wfe.waitCounter();
		
				
	}
	
	public void delete(){
		delete.click();
		yes.click();
		wfe.waitCounter();
	}

}
