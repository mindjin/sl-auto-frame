package com.sl.menu;

import java.sql.SQLException;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.data.Element;
import com.sl.data.Factory;
import com.sl.pages.Page;
import com.sl.utils.Filter;
import com.sl.utils.FooterMenuPage;
import com.sl.utils.Table;

public abstract class MenuPage extends Page{
	@FindBy(id="row.name")
	 WebElement row_name;
	protected Actions actions;
	Filter filter;
	Table table;
	FooterMenuPage footer;

	//span[ng-show='requestCount>0'] счетчик
	
	
	public MenuPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		filter = new Filter(driver);
		table = new Table(driver);
		footer = new FooterMenuPage(driver);
		wfe.waitCounter();
		
		// TODO Auto-generated constructor stub
	}

	
	public Element getSearchElement(String nameField) throws SQLException, ParseException {
			Element element = Factory.getInstance().getElementDAO().getSearchItem(nameField);
		return element;
}
	
	

	

	


}
