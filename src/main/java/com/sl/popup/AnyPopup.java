package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public abstract class AnyPopup extends AnyForm {
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@ng-click='addRow(row)']")																
	private WebElement addPopup;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@name='btnCancel']")																
	private WebElement closePopup;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@ng-click='saveRow(row)']")																
	private WebElement savePopup;
	


	public AnyPopup(PageManager pageManager) {
		super(pageManager);
	}
	
	
	
	public void close() {
		closePopup();
	}
	@Override
	public AnyForm save() {
		savePopup();
		return this;
	}
	@Override
	public AnyForm create(){		
		addPopup();
		return this;
	}
	
	protected void addPopup(){		
		wfe.waitEnableButton(addPopup);
		addPopup.click();
		decPopup();
	}
	protected void closePopup(){
		wfe.waitEnableButton(closePopup);
		closePopup.click();
		decPopup();
	}
	protected void savePopup(){
		wfe.waitEnableButton(savePopup);
		savePopup.click();
		decPopup();
		
	}	
	
}
