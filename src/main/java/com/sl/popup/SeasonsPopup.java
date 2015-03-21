package com.sl.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.pages.PageManager;

public class SeasonsPopup extends AnyPopup {
	
	@FindBy (xpath="//*[@additional-view][last()]//*[@id='row.childID']//ul")																
	protected WebElement finder_season;

	

	public SeasonsPopup(PageManager pageManager) {
		super(pageManager);
	}
	
	
	public SeasonsPopup setSeasons(String value){
		setFinderKeys(finder_season, value);
		return this;		
	}
	
	
	
	

}
