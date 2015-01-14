package com.sl.pages;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sl.data.Element;
import com.sl.utils.Checkbox;
import com.sl.utils.Combobox;
import com.sl.utils.Finder;
import com.sl.utils.FooterForm;
import com.sl.utils.FooterPopup;
import com.sl.utils.List2Lists;
import com.sl.utils.Table;

public class AnyForm extends Page{
	protected FooterForm footerForm;
	protected FooterPopup footerPopup;
	protected Table table;
	protected Actions actions;
public AnyForm(WebDriver driver) {
		super(driver);
		footerForm = new FooterForm(driver);
		footerPopup = new FooterPopup(driver);
		table = new Table(driver);
		actions = new Actions(driver);
		wfe.waitCounter();
		// TODO Auto-generated constructor stub
	}

public void fillForm(List<Element> getElement) throws IllegalArgumentException, IllegalAccessException, IOException{	
		
		WebElement element = null;
		Field[] fs = this.getClass().getDeclaredFields();
		try{
		for (Element column : getElement){
			
			String type = column.getType();
			
			for(Field fswe : fs)
			{
				fswe.setAccessible(true);
				if(fswe.getType().equals(WebElement.class)){
					
					if(fswe.getName().equals(column.getNameVariable())) {
//						System.out.println(fswe.getName()+"====="+column.getValue());
						
						element = (WebElement)fswe.get(this);
						if(fswe.getName().equals("row_name"))
							name=column.getValue();
						
						insideTab(element);
						
						
						switch(type){
						case "textfield":
							type(element, column.getValue());
							break;
						case "checkbox":
							Checkbox checkbox = new Checkbox(driver);
							checkbox.editCheckbox(element, column.getValue());
							break;
						case "integer":
							type(element, column.getValue());
							break;
//						case "double":
//							type(element, column.getValue());
//							break;
						case "date":
							type(element, column.getValue());
							break;
						case "combobox":
							Combobox combobox = new Combobox(driver);
							combobox.editCombobox(element, column.getValue());
							break;
						case "list2list":
							List2Lists list2list = new List2Lists(element, driver);
							list2list.addValue(column.getValue());
							break;
						case "finder":
							Finder finder = new Finder(driver);
							finder.add(element, column.getValue());				
							break;
						case "time":
							type(element, column.getValue());
							break;
							default:
								break;
						
						}
					}
				}
			}
			
			
			
			
		}}catch(NullPointerException e){
			System.out.println("Not all elements of table exist in array ");
			
			
		}
		
		
		
		
	}
	
	public void verifyData(List<Element> expectedData)  throws IllegalArgumentException, IllegalAccessException, IOException{
		
WebElement element = null;
		
		
		Field[] fs = this.getClass().getDeclaredFields();
		
		try{
		for (Element column : expectedData){
			
			String type = column.getType();
			
			for(Field fswe : fs)
			{
				if(fswe.getType().equals(WebElement.class)){
					fswe.setAccessible(true);
//					System.out.println(fswe.getName()+"===verify=="+column.getNameVariable());
					if(fswe.getName().equals(column.getNameVariable())) {
//						System.out.println(fswe.getName()+"===verify=="+column.getValue());
						element = (WebElement)fswe.get(this);
						insideTab(element);
						if(column.getName().equals("Сортировка"))
							break;
						
						switch(type){
						case "textfield":
//							System.out.println(element.getAttribute("value"));
							assertTrue(column.getName()+" not equal "+column.getValue(),element.getAttribute("value").equals(column.getValue()));
							break;
						case "integer":
//							System.out.println(element.getAttribute("value"));
							assertTrue(column.getName()+" not equal "+column.getValue(),element.getAttribute("value").equals(column.getValue()));
							break;
//						case "double":
//							assertTrue(column.getName()+" not equal "+column.getValue(),element.getAttribute("value").equals(column.getValue()));
//							break;
						case "checkbox":
							if(column.getValue().equals("1"))
								assertTrue("Checkbox "+column.getName()+" is not selected",element.isSelected());
							if(column.getValue().equals("0"))
								assertTrue("Checkbox "+column.getName()+" is selected",!element.isSelected());
							break;
						case "date":
							assertTrue(column.getName()+" not equal "+column.getValue(),element.getAttribute("value").equals(column.getValue()));
							break;
						case "time":
							assertTrue(column.getName()+" not equal "+column.getValue(),element.getAttribute("value").equals(column.getValue()));
							break;
						case "combobox":
							assertTrue(column.getName()+" not equal "+column.getValue(),element
									.getText()
									.equals(column
											.getValue()));
							break;
						case "list2list":
							List2Lists list2list = new List2Lists(element, driver);
							assertTrue(column.getName()+" not equal "+column.getValue(),list2list.getRightFilter(column.getValue()));
							assertTrue(column.getName()+" not equal "+column.getValue(),list2list.getLeftFilter(column.getValue()));
//							list2list.addValue(column.getValue());
							break;
						case "finder":
							 WebElement getFinderText = element.findElement(By.cssSelector("li>div"));
							 assertTrue(column.getName()+" not equal "+column.getValue(),getFinderText.getText().equals(column.getValue()));
										
							break;
							default:
								break;
						
						}
						
					}
				}
			}
			
			
			
			
		}}
		catch(Exception e){
			
			
			
		}
		
		
	}
	
protected void insideTab(WebElement element){
		
		try{
			if(!element.isDisplayed()){
				List<WebElement> tabs = driver.findElements(By.cssSelector("ul[class='nav nav-tabs']>li"));
				for(WebElement tab : tabs){
					if(tab.isDisplayed())
					tab.click();
					if(element.isDisplayed())
						break;
				}
			 }
			
		}catch(Exception e) {
			
		}		
		
	}

private void clearningTabs(){
	
	try{
		
			List<WebElement> tabs = driver.findElements(By.cssSelector("ul[class='nav nav-tabs']>li"));
			for(WebElement tab : tabs){
				if(tab.isDisplayed()){
					tab.click();
				js.cleaningTabs(tab);
				}
							
		 }
		
	}catch(NoSuchElementException e) {
		
	}
	
}

public void deleteCard(){
	
	clearningTabs();
	footerForm.delete();
}

}
