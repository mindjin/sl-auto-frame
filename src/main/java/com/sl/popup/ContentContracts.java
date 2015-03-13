package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.ContentContractsDB;
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
		pageManager.getFinder(row_contentContract).setName(value).selectExistValue(value).clickOk();
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
	
	public ContentContracts fillForm(ContentContractsDB contract){
		setTextfieldKeys(row_startDate, contract.getStartDate());
		setTextfieldKeys(row_endDate, contract.getEndDate());
		setTextfieldKeys(contractInfo_vatSumm, contract.getVatSumm());
		setTextfieldKeys(contractInfo_fixPaymentSumm, contract.getFixPaymentSumm());
		setTextfieldKeys(contractInfo_minGarantySumm, contract.getMinGarantySumm());
		setComboboxKeys(contractInfo_currency, contract.getCurrency());
		setTextfieldKeys(contractInfo_royalty, contract.getRoyalty());
		setComboboxKeys(contractInfo_contractor, contract.getContractor());
		setCheckboxKeys(contractInfo_isContractBlockRules, contract.getIsContractBlockRules());
		setCheckboxKeys(contractInfo_isLicenseExclusive, contract.getIsLicenseExclusive());
		return this;
	}
	
	public ContentContractsDB readForm(){
		ContentContractsDB contract = new ContentContractsDB();
		contract.setContentContract(insideTab(row_contentContract).getText());
		contract.setStartDate(insideTab(row_startDate).getAttribute("value"));
		contract.setEndDate(insideTab(row_endDate).getAttribute("value"));
		contract.setVatSumm(insideTab(contractInfo_vatSumm).getAttribute("value"));
		contract.setFixPaymentSumm(insideTab(contractInfo_fixPaymentSumm).getAttribute("value"));
		contract.setMinGarantySumm(insideTab(contractInfo_minGarantySumm).getAttribute("value"));
		contract.setCurrency(insideTab(contractInfo_currency).getText());
		contract.setRoyalty(insideTab(contractInfo_royalty).getAttribute("value"));
		contract.setContractor(insideTab(contractInfo_contractor).getText());
		contract.setIsContractBlockRules(pageManager.getCheckbox(contractInfo_isContractBlockRules).getStatus());
		contract.setIsLicenseExclusive(pageManager.getCheckbox(contractInfo_isLicenseExclusive).getStatus());
		return contract;
		
	}
	
	

}
