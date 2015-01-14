package com.sl.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.pages.AnyForm;
import com.sl.utils.Combobox;

public class Content extends AnyForm{
	Combobox combobox;
	public Content(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		combobox = new Combobox(driver);
	}
	
	@FindBy(css="[additional-view='0'] [id='s2id_row.__'] span")
	protected WebElement typeContent;
	
	@FindBy(css="[additional-view='0'] [id='s2id_row.__mrf_multiple'] input")
	protected WebElement mrf;
	
	@FindBy(css="[additional-view='0'] [id='row.childId'] ul")
	protected WebElement content;
	
	@FindBy(css="[additional-view='1'] [class='btn pull-right']")
	protected WebElement addLinked;
	
	@FindBy(css="[additional-view='0'] [ng-click='addRow(row)']")
	protected WebElement addContent;
	
	@FindBy(css="[id='select2-drop'] input")
	protected WebElement contentInput;
	
	
	
	
	
	
	public void selectTypeContent(String value){
		typeContent.click();
		combobox.editCombobox(contentInput, value);
	}
	
	public void selectMRF(String value){
		
		combobox.editCombobox(mrf, value);
	}
	
	public BrowseList selectContent(){
		
		content.click();
		driver.findElement(By.cssSelector("[additional-view='1'] tr:first-child>td[class='column-bool']")).click();
		
		wfe.waitElementsClickable(addLinked);
		addLinked.click();
		return new BrowseList(driver);
		
	}
	
	public void addContent(){
		addContent.click();
	}
	

}
