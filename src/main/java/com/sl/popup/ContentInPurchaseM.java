package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.ContentInPurchaseMDB;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class ContentInPurchaseM extends AnyPopup{
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.parentID']//span")																
	protected WebElement row_purchaseMethod;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.sort']")																
	protected WebElement row_sort;
	
	public ContentInPurchaseM (PageManager pageManager){
		super(pageManager);
	}
	
	public ContentInPurchaseM setPurchaseMethod(String value){
		pageManager.getCombobox(row_purchaseMethod).findValue(value);
		return this;
	}
	
	public ContentInPurchaseM setSort(String value){
		type(row_sort, value);
		return this;
	}
	
	public void close() {
		closePopup();
	}
	public AnyForm save() {
		savePopup();	
		return this;
	}
	@Override
	public AnyForm create(){		
		addPopup();
		return this;
	}
	
	public ContentInPurchaseM fillForm(ContentInPurchaseMDB contentInPurchase){
		setComboboxKeys(row_purchaseMethod, contentInPurchase.getPurchaseMethod());
		setTextfieldKeys(row_sort, contentInPurchase.getSort());
		
		return this;
	}
	
	public ContentInPurchaseMDB readForm(){
		ContentInPurchaseMDB contentInPurchase = new ContentInPurchaseMDB();
		contentInPurchase.setPurchaseMethod(insideTab(row_purchaseMethod).getText());
		contentInPurchase.setSort(insideTab(row_sort).getAttribute("value"));
		return contentInPurchase;
		
	}

}
