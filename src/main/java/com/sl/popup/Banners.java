package com.sl.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.pages.AnyForm;
import com.sl.utils.Combobox;

public class Banners extends AnyForm{
	Combobox combobox;
	public Banners(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		combobox = new Combobox(driver);
	}
	
	@FindBy(css="[id='s2id_row.childID'] span")
	protected WebElement row_childID;
		
	@FindBy(css="[id='row.displayFrequence']")
	protected WebElement row_displayFrequence;
	
	@FindBy(css="[name='btnCreate']")
	protected WebElement btnCreate;
	
	@FindBy(css="[id='select2-drop'] input")
	protected WebElement contentInput;

	

	public void selectIdObject(String value) {
		row_childID.click();
		combobox.editCombobox(contentInput, value);
		// TODO Auto-generated method stub
		
	}

	public void setDisplayFrequence(String value) {
		type(row_displayFrequence, value);
		
		// TODO Auto-generated method stub
		
	}

	public void addAndClose() {
		
		wfe.waitElementsClickable(btnCreate);
		btnCreate.click();
		
		// TODO Auto-generated method stub
		
	}

}
