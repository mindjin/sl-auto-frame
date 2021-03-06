package com.sl.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.popup.Delete;

public abstract class AnyForm  extends Page{
	
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
	
	public AnyForm(PageManager pageManager) {
		super(pageManager);		
	}
public AnyForm clearningTabs(){
	
	try{
		
			List<WebElement> tabs = driver.findElements(By.cssSelector("ul[class='nav nav-tabs']>li"));
			for(WebElement tab : tabs){
				if(tab.isDisplayed()){
					tab.click();
				js.cleaningTabs(tab);
				}
							
		 }
		
	}catch(NoSuchElementException e) {
		
	}
	return this;
	
}
public Delete delete(){
	wfe.waitEnableButton(delete);
	delete.click();
	return pageManager.delete;
}
public AnyForm save(){
	save.click();
	return this;
}
public HomePage saveAndClose(){
	wfe.waitEnableButton(saveAndClose);
	saveAndClose.click();
	return pageManager.homePage.ensurePageLoaded();
}
public AnyForm create(){
	wfe.waitEnableButton(create);
	create.click();
	return this;
}
public HomePage createAndClose(){
	wfe.waitEnableButton(createAndClose);
	createAndClose.click();
	return pageManager.homePage.ensurePageLoaded();
}

public AnyForm ensurePageLoaded() { 
    wfe.waitForm();
    return this;
  }





//public void deleteCard(){
//	
//	clearningTabs();
//	footerForm.delete();
//}

}
