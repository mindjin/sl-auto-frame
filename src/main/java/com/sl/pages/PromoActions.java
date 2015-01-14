package com.sl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.menu.KaraokeMP;
import com.sl.menu.PromoActionsMP;
import com.sl.utils.FooterForm;

public class PromoActions extends AnyForm{
	
	@FindBy(css="[id='RowForm'] [id='row.name']")
	 WebElement row_name;	
	
	@FindBy(css="[id='row.sortOrder']")
	 WebElement row_sortOrder;
	
	@FindBy(css="[id='row.overloadServiceSpecParams']")
	 WebElement row_overloadServiceSpecParams;
	
	@FindBy(id="row.externalId")
	 WebElement row_externalId;
	
	@FindBy(css = "[name='row.startDate'] input")
	 WebElement row_startDate;
	
	@FindBy(css = "[name='row.endDate'] input")
	 WebElement row_endDate;
	
	@FindBy(id="row.duration")
	 WebElement row_duration;
	
	@FindBy(css = "[id='s2id_row.durationType'] span")
	 WebElement row_durationType;
	
	@FindBy(css = "[id='row.startMessage'] ul")
	 WebElement row_startMessage;
	
	@FindBy(css = "[id='row.notifyThreshold']")
	 WebElement row_notifyThreshold;
	
	@FindBy(id="row.notifyTimeout")
	 WebElement row_notifyTimeout;
	
	@FindBy(id="row.isCheckUserInFilter")
	 WebElement row_isCheckUserInFilter;
	
	@FindBy(css = "[id='row.description'] textarea")
	 WebElement row_description;
	
	@FindBy(css = "[id='row.notifyStartText'] textarea")
	 WebElement row_notifyStartText;
	
	@FindBy(css = "[id='row.notifyText'] textarea")
	 WebElement row_notifyText;
	
//	@FindBy(css="section[name='row.__states.ServiceSpecs']")
//	 WebElement row_serviceSpecs;
	
	@FindBy(css="section[name='row.__states.MessageFilters']")
	 WebElement states_messageFilters;
	


	
//	HashMap<Integer, WebElement> allElements = new HashMap<>();
	
	
	private String sorting;

	public PromoActions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	

	public void setName(String value) {
		type(row_name, value);
		name = value;
	}

	public void setSorting(String value) {
		type(row_sortOrder, value);
		
		sorting = value;
	}
	
	
	
	public String getSorting(){
		return sorting;
	}
	
	/*
	 * Take values from Table and verify every one with array variables
	 */

	


public PromoActionsMP addAndClose() {
	FooterForm button = new FooterForm(driver);
	
	button.createAndClose();

	return new PromoActionsMP(driver);
	
}





public PromoActionsMP saveAndClose(){
	
	footerForm.saveAndClose();
	return new PromoActionsMP(driver);
	
}







}
