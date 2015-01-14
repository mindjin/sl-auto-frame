package com.sl.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.menu.BannersMP;
import com.sl.popup.Content;
import com.sl.utils.FooterForm;

public class Banners extends AnyForm {
	@FindBy(id="row.name")
	protected WebElement row_name;
	
	
	@FindBy(css="[name='row.logo6'] input")
	protected WebElement row_logo6;
	
	
	@FindBy(css="[name='undefined_bookmark']")
	protected WebElement images_boockmark;
	
	@FindBy(css="[name='row.__states.Contents_bookmark']")
	protected WebElement contents_boockmark;
	
	@FindBy(css="[name='row.__states.Contents'] [ng-click='onAddRow()']")
	protected WebElement addContentPopup;
	
	@FindBy(css="[id='row.description'] textarea")
	protected WebElement row_description;
	
	

	
	
	String value;
	
	
	public Banners(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void setName(String value) {
		type(row_name, value);
		this.value = value;
		
	}
	
	public void imageIPTV(String value){
		images_boockmark.click();
		File file = new File("src/main/resources/images/"+value+".jpg");
		row_logo6.sendKeys(file.getAbsolutePath());
		
		
	}
	
	public Content createContent(){
		contents_boockmark.click();
		addContentPopup.click();
		
		return new Content(driver);
	}

public BannersMP createCard() {
		
		FooterForm button = new FooterForm(driver);
		
		button.createAndClose();
	
		return new BannersMP(driver);
	}


	

	

}
