package com.sl.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.sl.conf.ConfigDriver;
import com.sl.data.Element;
import com.sl.menu.VideomoviesMP;
import com.sl.pages.HomePage;
import com.sl.pages.LoginPage;
import com.sl.pages.Videomovies;

public class TestVideomovies extends ConfigDriver{
	
	private LoginPage loginPage = PageFactory.initElements(open(), LoginPage.class);
	
	@Before
	public void login(){
		if(loginPage.isLoggin()){
		loginPage.loginAs(userData);
		}
	}
	
	
	@Test
	public void createVideomoviesWithFillForm() throws Exception{
		HomePage homepage = new HomePage(driver);
		VideomoviesMP videomoviesMP = homepage.openVideoMovie();
		Videomovies videomovies = videomoviesMP.addNewCard();
		List<Element> expectedDataVideomovies = videomovies.getRandomValues();
		videomovies.fillForm(expectedDataVideomovies);
		videomovies.addAndClose();
		videomoviesMP.openName(videomovies.getName());
		videomovies.verifyData(expectedDataVideomovies);
		videomovies.deleteCard();
	}
		
	@Test
	public void changeVideomoviesWithFillForm() throws Exception{
		HomePage homepage = new HomePage(driver);
		VideomoviesMP videomoviesMP = homepage.openVideoMovie();
		Videomovies videomovies = videomoviesMP.addNewCard();
		videomovies.setName("wp_Videomovies_"+String.valueOf(System.currentTimeMillis()));
		videomovies.setLocations("Все");
		videomovies.addAndClose();
		videomoviesMP.openName(videomovies.getName());
		List<Element> expectedDataVideomovies = videomovies.getRandomValues();
		videomovies.fillForm(expectedDataVideomovies);
		videomovies.saveAndClose();
		videomoviesMP.openName(videomovies.getName());
		videomovies.verifyData(expectedDataVideomovies);
		videomovies.deleteCard();
		
	}

}
