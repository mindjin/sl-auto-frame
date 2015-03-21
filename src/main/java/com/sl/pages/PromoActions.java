package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.allure.annotations.Step;

import com.sl.model.PromoactionsDB;
import com.sl.model.User;

public class PromoActions extends AnyForm {	
	
	@FindBy(css="[id='RowForm'] [id='row.name']")
	 protected WebElement row_name;	
	
	@FindBy(css="[id='RowForm'] [id='row.sortOrder']")
	 protected WebElement row_sortOrder;
	
	@FindBy(css="[id='RowForm'] [id='row.overloadServiceSpecParams']")
	 protected WebElement row_overloadServiceSpecParams;
	
	@FindBy(css ="[id='RowForm'] [id='row.externalId']")
	 protected WebElement row_externalId;
	
	@FindBy(css = "[id='RowForm'] [name='row.startDate'] input")
	 protected WebElement row_startDate;
	
	@FindBy(css = "[id='RowForm'] [name='row.endDate'] input")
	 protected WebElement row_endDate;
	
	@FindBy(css ="[id='RowForm'] [id='row.duration']")
	 protected WebElement row_duration;
	
	@FindBy(css = "[id='RowForm'] [id='s2id_row.durationType'] span")
	 protected WebElement row_durationType;
	
	@FindBy(css = "[id='RowForm'] [id='row.startMessage'] ul")
	 protected WebElement row_startMessage;
	
	@FindBy(css = "[id='RowForm'] [id='row.notifyThreshold']")
	 protected WebElement row_notifyThreshold;
	
	@FindBy(css ="[id='RowForm'] [id='row.notifyTimeout']")
	 protected WebElement row_notifyTimeout;
	
	@FindBy(css ="[id='RowForm'] [id='row.isCheckUserInFilter']")
	 protected WebElement row_isCheckUserInFilter;
	
	@FindBy(css = "[id='RowForm'] [id='row.description'] textarea")
	 protected WebElement row_description;
	
	@FindBy(css = "[id='RowForm'] [id='row.notifyStartText'] textarea")
	 protected WebElement row_notifyStartText;
	
	@FindBy(css = "[id='RowForm'] [id='row.notifyText'] textarea")
	 protected WebElement row_notifyText;
	
//	@FindBy(css="[id='RowForm'] section[name='row.__states.ServiceSpecs']")
//	 protected WebElement row_serviceSpecs;
	
	@FindBy(css="[id='RowForm'] section[name='row.__states.MessageFilters']")
	 protected WebElement states_messageFilters;
	

	public PromoActions(PageManager pageManager) {
		super(pageManager);	
	}
	
	public PromoActions setName(String value) {
		type(row_name, value);
		User.setNameForm(value);
		return this;
	}	

	public PromoActions setSorting(String value) {
		type(row_sortOrder, value);	
		return this;
		
	}
	
	public PromoActions setMessegeFilters(String value){
		pageManager.getList2List(states_messageFilters).addValue(value);
		return this;
	}
	
	
	
	
	
	@Step
	public PromoActions fillForm(PromoactionsDB promo){
		setTextfieldKeys(row_name, promo.getName());
		setTextfieldKeys(row_sortOrder, promo.getSortOrder());
		setCheckboxKeys(row_overloadServiceSpecParams, promo.getOverloadServiceSpecParams());
		setTextfieldKeys(row_externalId, promo.getExternalId());
		setTextfieldKeys(row_startDate, promo.getStartDate());
		setTextfieldKeys(row_endDate, promo.getEndDate());
		setTextfieldKeys(row_duration, promo.getDuration());
		setComboboxKeys(row_durationType, promo.getDurationType());
		setFinderKeys(row_startMessage, promo.getStartMessage());
		setTextfieldKeys(row_notifyThreshold, promo.getNotifyThreshold());
		setTextfieldKeys(row_notifyTimeout, promo.getNotifyTimeout());
		setList2listKeys(states_messageFilters, promo.getMessageFilters());
		setCheckboxKeys(row_isCheckUserInFilter, promo.getIsCheckUserInFilter());
		setTextfieldKeys(row_description, promo.getDescription());
		setTextfieldKeys(row_notifyStartText, promo.getNotifyStartText());
		setTextfieldKeys(row_notifyText, promo.getNotifyText());
		return this;
	}
	
	@Step
	public PromoactionsDB readForm(){
		PromoactionsDB promo = new PromoactionsDB();
		promo.setName(insideTab(row_name).getAttribute("value"));
		promo.setSortOrder(insideTab(row_sortOrder).getAttribute("value"));
		promo.setOverloadServiceSpecParams(pageManager.getCheckbox(row_overloadServiceSpecParams).getStatus());
		promo.setExternalId(insideTab(row_externalId).getAttribute("value"));
		promo.setStartDate(insideTab(row_startDate).getAttribute("value"));
		promo.setEndDate(insideTab(row_endDate).getAttribute("value"));
		promo.setDuration(insideTab(row_duration).getAttribute("value"));
		promo.setDurationType(insideTab(row_durationType).getText());
		promo.setStartMessage(insideTab(row_startMessage).getText());
		promo.setNotifyThreshold(insideTab(row_notifyThreshold).getAttribute("value"));
		promo.setNotifyTimeout(insideTab(row_notifyTimeout).getAttribute("value"));
		promo.setMessageFilters(pageManager.getList2List(states_messageFilters).getValue());
		promo.setIsCheckUserInFilter(pageManager.getCheckbox(row_isCheckUserInFilter).getStatus());
		promo.setDescription(insideTab(row_description).getAttribute("value"));
		promo.setNotifyStartText(insideTab(row_notifyStartText).getAttribute("value"));
		promo.setNotifyText(insideTab(row_notifyText).getAttribute("value"));
		return promo;
	}
	
}
