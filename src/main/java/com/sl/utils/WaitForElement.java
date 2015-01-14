package com.sl.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElement{

//	private JavaScripts js;
	protected WebDriver driver;
	
	
	
	@FindBy(css="span[ng-show='requestCount>0']")
	protected WebElement counter;

	public WaitForElement(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}



	//Ожидание пока элемент не станет доступный для клика
	public void waitElementsClickable(WebElement waitOfElement){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(waitOfElement));
		
	}
	
	public void waitElementsStalenessOf(WebElement waitOfElement){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.stalenessOf(waitOfElement));
		
	}
	
	public void waitElementsVisible(WebElement waitOfElement){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(waitOfElement));
		
	}
	
	public void waitCounter(){
//		(new WebDriverWait(driver, 10)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(counter)));
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span[request-count='0']")));
//		int c = 0;
//		while(counter.isDisplayed()){
//				try {
//					c++;
//					Thread.sleep(100);
//					System.out.println("Count is displayed -> "+c+"ms");
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			
		
	}
	
	public boolean waitForMainCard(){
		try{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("[additional-view]"))));
		waitCounter();
		return true;
		}catch(Exception e){
			System.out.println("Popup is not closed");
		return false;
		}
	}
	
	public boolean waitForPopup(int getPC){
		try{
			waitElementsVisible(driver.findElement(By.cssSelector("[additional-view='"+getPC+"']")));
			return true;
		}catch(Exception e){
			System.out.println("Popup "+getPC+" is not open");
			return false;
			
		}		
		
	}
	
	
	//Ожидание для list2list в котором список из-за ajax не сразу отображается
	public void waitList2List(WebElement waitOfElement){
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(waitOfElement));
	}
	
	
	
	
	//Это ожидание применяется к 2 разным List2List, к каждому листу применяется ожидание своего локатора
	public void waitFiltrLists(String cardElement){																			
	
		if(cardElement.equals("Услуги")|| cardElement.equals("Зависимые услуги")|| cardElement.equals("Зависит от услуг"))
	  	waitList2List(driver.findElement(By.cssSelector("[name='"+cardElement+"']"+" ul[class*='ng-scope']>li")));
	  		
	 																			
		else
		
	 	waitList2List(driver.findElement(By.cssSelector("[name='"+cardElement+"']"+" tbody[class*='ng-scope'] tr")));
 
}
	
	// Этот метод не используется в коде, но суть его в том, что если элемент под меню, тогда нужно промотать страницу выше или ниже в зависимости от верхнего или нижнего меню.
//	public void autoScrollToList2List(WebElement element){
//		
//		js = new JavaScripts(driver);
//		WebElement header = driver.findElement(By.cssSelector("header"));
//		WebElement footer = driver.findElement(By.cssSelector("footer [class='buttonbar-fixed ng-scope']"));
//		
//		int getSizeHeader = header.getSize().getHeight();
////		int getSizeFooter = footer.getSize().getHeight();
//		int getSizeElement = element.getSize().height;
//		
//		int getLocationHeaderTop = header.getLocation().getY();
//		int getLocationFooterTop = footer.getLocation().getY();
//		int getLocationElementTop = element.getLocation().getY();
//		
//		int getLocationHeaderBottom = getSizeHeader + getLocationHeaderTop;
//		int getLocationElementBottom = getSizeElement + getLocationElementTop;
//		
//		
//		if(getLocationElementBottom < getLocationHeaderBottom)
//		{
//			js.scroll(element, 0, -200);
//			}
//		if(getLocationElementTop > getLocationFooterTop)
//			{
//			js.scroll(element, 0, +200);
//			}
//		
//		
//	}
	
}
