package com.sl.pages;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sl.data.Element;
import com.sl.data.Factory;
import com.sl.data.RandomValues;
import com.sl.utils.JavaScripts;
import com.sl.utils.WaitForElement;
import com.sl.utils.WindowsStatus;
import static org.junit.Assert.assertTrue;

public abstract class Page{
	protected WebDriver driver;
	protected static String name;
	protected JavaScripts js;
	protected WaitForElement wfe;
	public WindowsStatus ws = WindowsStatus.getInstance();
	public Page(WebDriver driver){
		
		
		this.driver = driver;
		wfe = new WaitForElement(driver);
		js = new JavaScripts(driver);
		
		

	}
	
	
	public static void type(WebElement webElement, String text){
		
		webElement.clear();
		webElement.sendKeys(text);
	}
	
/*
 * check element inner page for enabled
 */
	protected boolean isElementPresent(By by) {	
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    try {
	    	driver.findElement(by).isEnabled();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      return true;
	    } catch (NoSuchElementException e) {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      return false;
	    }
	 }
	
	/*
	 * auto check elements for inside Tabs
	 */
	public String getName(){
		return name;
	}
	
	protected void onCard(){
			ws.defPC();
			wfe.waitForMainCard();
//			System.out.println(ws.getPC()+"    onCard");
	}
	
	protected void addPopup(){
		ws.incPC();
		wfe.waitForPopup(ws.getPC());
//		System.out.println(ws.getPC()+"      addPopup");
	}
	
	protected void closePopup(){
		ws.decPC();
//		System.out.println(ws.getPC()+"     closePopup");
	}
	
public List<Element> getRandomValues() throws SQLException, ParseException {
		
		List<Element> fields = RandomValues.getValues(this);
		return fields;
	}

public List<Element> getDefaultValues() throws SQLException, ParseException {
		String nameClass = this.getClass().getSimpleName();
		List<Element> fields = Factory.getInstance().getElementDAO().getAllField(nameClass);
		return fields;
}
}
