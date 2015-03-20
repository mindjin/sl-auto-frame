package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.allure.annotations.Step;

import com.sl.model.ServicePlansDB;

public class ServicePlans extends AnyForm{

	public ServicePlans(PageManager pageManager) {
		super(pageManager);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css = "[id='RowForm'] [id='row.name']")
	protected WebElement text_name;
	
	@FindBy(css = "[id='RowForm'] [name='row.startDate'] input")
	protected WebElement text_startDate;
	
	@FindBy(css = "[id='RowForm'] [name='row.endDate'] input")
	protected WebElement text_endDate;
	
	@FindBy(css = "[id='RowForm'] [id='s2id_row.status'] span")
	protected WebElement combobox_status;
	
	@FindBy(css = "[id='RowForm'] [id='s2id_row.serviceProvider'] span")
	protected WebElement combobox_serviceProvider;
	
	@FindBy(css = "[id='RowForm'] [id='s2id_row.currency'] span")
	protected WebElement combobox_currency;
	
 	@FindBy(css = "[id='RowForm'] [id='row.externalId']")
 	protected WebElement text_externalId;
	
  	@FindBy(css = "[id='RowForm'] [id='row.nonBlockedPacksInBundle']")
 	protected WebElement text_nonBlockedPacks;
  	
  	@FindBy(css = "[id='RowForm'] [id='row.isTest']")
	protected WebElement isTest;
  	
  	
  	@Step
	public ServicePlans fillForm(ServicePlansDB serviceplans){
  		setTextfieldKeys(text_name, serviceplans.getName());
  		setTextfieldKeys(text_startDate, serviceplans.getStartDate());
  		setTextfieldKeys(text_endDate, serviceplans.getEndDate());
  		setComboboxKeys(combobox_status, serviceplans.getStatus());
  		setComboboxKeys(combobox_serviceProvider, serviceplans.getServiceProvider());
  		setComboboxKeys(combobox_currency, serviceplans.getCurrency());
  		setTextfieldKeys(text_externalId, serviceplans.getExternalId());
  		setTextfieldKeys(text_nonBlockedPacks, serviceplans.getNonBlockedPacks());
  		setCheckboxKeys(isTest, serviceplans.getIsTest());
		return this;
  	}

  	@Step
	public ServicePlansDB readForm(){
		ServicePlansDB serviceplans = new ServicePlansDB();
		serviceplans.setName(insideTab(text_name).getAttribute("value"));
  		serviceplans.setStartDate(insideTab(text_startDate).getAttribute("value"));
  		serviceplans.setEndDate(insideTab(text_endDate).getAttribute("value"));
  		serviceplans.setStatus(insideTab(combobox_status).getText());
  		serviceplans.setServiceProvider(insideTab(combobox_serviceProvider).getText());
  		serviceplans.setCurrency(insideTab(combobox_currency).getText());
  		serviceplans.setExternalId(insideTab(text_externalId).getAttribute("value"));
  		serviceplans.setNonBlockedPacks(insideTab(text_nonBlockedPacks).getAttribute("value"));
  		serviceplans.setIsTest(pageManager.getCheckbox(isTest).getStatus());
		return serviceplans;
	}

	public ServicePlans setName(String value) {
		type(text_name, value);		
		return this;
	}
	
	public ServicePlans setNonBlockedPacks(String value) {
		type(text_nonBlockedPacks, value);
		return this;
	}
	
  

}
