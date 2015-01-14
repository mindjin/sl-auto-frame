package com.sl.pages;

//import org.hibernate.sql.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sl.data.UserData;

public class LoginPage extends Page{

	@FindBy(id = "row.login") 																			
	  WebElement login; 
	
	@FindBy(id = "row.password")																			
	  WebElement password;	
	
	@FindBy(id="btnSignIn")												
	  WebElement buttonAutorization;
	
	@FindBy(css = "[value='row.language']")
	  WebElement row_language;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}


	private String text;
	
	
	public HomePage loginAs(UserData userData){
		text = userData.login;
		System.out.println(login.getText());
		type(login, text);
		type(password, userData.pass);
		buttonAutorization.click();
		return new HomePage(driver);
	}


	public void fillLogin(String text) {
		type(login, text);
		this.text = text;
		
	}

	public String getLogin(){
		return text;
	}

	public void Language(String value){
//		WebElement.class.newInstance().
		Select select = new Select(row_language);
		select.selectByValue("English");
		System.out.println("");
//		(row_language, value);
	}


	public boolean isLoggin() {
		
		boolean checkLoggin = isElementPresent(By.id("btnSignIn"));
		return checkLoggin;
	}
	

	




	


	
}
