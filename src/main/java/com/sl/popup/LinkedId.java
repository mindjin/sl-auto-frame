package com.sl.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sl.pages.PageManager;
import com.sl.utils.Finder;

public class LinkedId extends Finder {	
	private WebElement findId;
	public LinkedId(PageManager pageManager, WebElement element) {
		super(pageManager, element);	
		findId = driver.findElement(By.xpath("//*[@additional-view][last()]//*[@id='s2id_comboboxRow.linkedDiscriminator'] span"));
	}
	
	public LinkedId setID(String id){
		pageManager.getCombobox(findId).findValue(id);
		return this;
	}

}
