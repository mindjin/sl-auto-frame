package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.pages.AnyForm;
import com.sl.pages.PageManager;

public class ContentContracts extends AnyPopup {
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.parentID']//ul")																
	protected WebElement row_contentContract;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.startDate']/input")																
	protected WebElement row_startDate;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.stopDate']/input")																
	protected WebElement row_endDate;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.contractInfo_vatSumm']")																
	protected WebElement contractInfo_vatSumm;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.contractInfo_fixPaymentSumm']")																
	protected WebElement contractInfo_fixPaymentSumm;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.contractInfo_minGarantySumm']")																
	protected WebElement contractInfo_minGarantySumm;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.contractInfo_currency']//span")																
	protected WebElement contractInfo_currency;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.contractInfo_royalty']")																
	protected WebElement contractInfo_royalty;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.contractInfo_contractor']//span")																
	protected WebElement contractInfo_contractor;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.contractInfo_isContractBlockRules']")																
	protected WebElement contractInfo_isContractBlockRules;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.contractInfo_isLicenseExclusive']")																
	protected WebElement contractInfo_isLicenseExclusive;

	public ContentContracts(PageManager pageManager) {
		super(pageManager);
	}
	
	public ContentContracts setContentContract(String value){
		row_contentContract.click();
		pageManager.getFinder().setName(value).selectExistValue(value).clickOk();
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
	
	

}
