package com.sl.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.pages.AnyForm;
import com.sl.utils.FooterPopup;

public class AudioPID extends AnyForm{

	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.name']")																
	WebElement row_name;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.PID']")																
	WebElement row_PID;
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='s2id_row.audioPIDType']//span")																
	WebElement row_audioPIDType;
	
	
	public AudioPID(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		addPopup();
	}

	public void addAudioPID(){
		footerPopup.add();		
		closePopup();
		wfe.waitCounter();
		
	}
	public void closeAudioPID(){
		footerPopup.close();
		closePopup();
	}
}
