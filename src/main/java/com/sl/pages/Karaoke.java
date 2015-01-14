package com.sl.pages;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.data.Element;
import com.sl.data.RandomValues;
import com.sl.menu.KaraokeMP;
import com.sl.popup.Assets;
import com.sl.utils.FooterForm;
import com.sl.utils.List2Lists;
import com.sl.utils.Table;



public class Karaoke extends AnyForm{
	
	
	
	@FindBy(id = "row.name")
	 WebElement row_name;
	
	@FindBy(css = "section[name='row.__states.Locations']")
	  WebElement states_Locations;
	
//	@FindBy(css = "section[name='row.__states.Genres']")
//	  WebElement states_Genres;
	
	@FindBy(css = "section[name='row.__states.KaraokePackages']")
	  WebElement states_KaraokePackages;
	
	@FindBy(css = "section[name='row.__states.ContentAssets']")
	  WebElement states_ContentAssets;

	@FindBy(css = "[id='s2id_row.performer'] span")
	 WebElement row_performer;

	@FindBy(css = "[name='row.startDate'] input")
	 WebElement row_startDate;
	
	@FindBy(css = "[name='row.endDate'] input")
	 WebElement row_endDate;

 	@FindBy(css = "[id='row.description'] textarea")
 	 WebElement row_descriptionOrInstruction;

 	@FindBy(css = "[id='s2id_row.contractor'] span")
 	 WebElement row_contractor;


 	
 	@FindBy(css = "[id='row.externalId']")
 	WebElement row_externalId;
	
	
 	
 	
 	
	public Karaoke( WebDriver driver) {
		
		super(driver);
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	private String performer;
	


	public void setName(String value) {
		type(row_name, value);
		name = value;
		
	}

	public void setExternalId(String value){
		type(row_externalId, value);
	}

	public void setPerformer(String value){
		
//		editCombobox(row_performer, value);
		performer = value;
		
	}
	
	public String getPerformer(){
		
		return performer;
		
	}
	
	
	public void listGenres() {
//	this.element = states_Genres;
//	tab = new Tabs<Karaoke>( driver);
//	return tab.genres();
//		
	}

	
	public KaraokeMP addAndClose() {
		
		
		footerForm.createAndClose();

		return new KaraokeMP(driver);
		
	}
	
	


	public Assets addAssets(){
		
		insideTab(states_ContentAssets);
		states_ContentAssets.findElement(By.cssSelector("[ng-click='onAddRow()']")).click();
		
		return new Assets(driver);
	}
	
	public KaraokeMP saveAndClose(){
		
		footerForm.saveAndClose();
		return new KaraokeMP(driver);
		
	}
	
	public Assets openAsset(String title){
		insideTab(states_ContentAssets);
		table.getExistValue(states_ContentAssets, title).click();
		return new Assets(driver);
		
	}

	public void setLocations(String value) {
		insideTab(states_Locations);
		List2Lists list2list = new List2Lists(states_Locations, driver);
		list2list.addValue(value);
		
	}
	
}
