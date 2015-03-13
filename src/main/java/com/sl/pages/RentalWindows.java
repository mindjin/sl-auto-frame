package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.RentalWindowsDB;
import com.sl.popup.AnyPopup;
import com.sl.popup.LinkedId;

public class RentalWindows extends AnyPopup {
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.parentID']//span")																
	protected WebElement combobox_parentID;	
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.package']//ul")																
	protected WebElement linkedId_package;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.startDate']/input")																
	protected WebElement textfield_startDate;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.stopDate']/input")																
	protected WebElement textfield_endDate;

	public RentalWindows(PageManager pageManager) {
		super(pageManager);	
	}
	
	@Override
	public AnyForm create(){		
		addPopup();
		return this;
	}
	
	public void close(){
		closePopup();
	}
	@Override
	public AnyForm save() {
		savePopup();
		return this;
	}
	
	public LinkedId setPackage(String type){
		return pageManager.getLinkeId(linkedId_package).setID(type);		
	}
	
	public RentalWindows setDeviceType(String value){
		pageManager.getCombobox(combobox_parentID).findValue(value);
		return this;		
	}
	
	public RentalWindows setStartDate(String value){
		type(textfield_startDate, value);
		return this;
	}
	
	public RentalWindows setEndDate(String value){
		type(textfield_endDate, value);
		return this;
	}
	
	public RentalWindows fillForm(RentalWindowsDB rentalWindows){
		setComboboxKeys(combobox_parentID, rentalWindows.getParentID());
		setTextfieldKeys(textfield_startDate, rentalWindows.getStartDate());
		setTextfieldKeys(textfield_endDate, rentalWindows.getEndDate());	
		return this;		
	}
	
	public RentalWindowsDB readForm(){
		RentalWindowsDB rentalWindows = new RentalWindowsDB();
		rentalWindows.setParentID(combobox_parentID.getText());
		rentalWindows.setStartDate(textfield_startDate.getAttribute("value"));
		rentalWindows.setEndDate(textfield_endDate.getAttribute("value"));
		return rentalWindows;
	}

}
