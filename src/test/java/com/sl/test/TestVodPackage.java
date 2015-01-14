package com.sl.test;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.sl.conf.ConfigDriver;
import com.sl.data.Element;
import com.sl.menu.VodPackageMP;
import com.sl.pages.HomePage;
import com.sl.pages.LoginPage;
import com.sl.pages.VodPackage;

public class TestVodPackage extends ConfigDriver{
	
	private LoginPage loginPage = PageFactory.initElements(open(), LoginPage.class);


	@Before
	public void login(){
		if(loginPage.isLoggin()){
		loginPage.loginAs(userData);
		}
	}
	
	
	
		@Test
		public void createVodPackageWithFillForm() throws Exception{
			HomePage homepage = new HomePage(driver);
			VodPackageMP vodPackageMP = homepage.openVodPackage();
			VodPackage vodPackage = vodPackageMP.addNewCard();
			List<Element> expectedDataVodPackage = vodPackage.getRandomValues();
			vodPackage.fillForm(expectedDataVodPackage);
			vodPackage.addAndClose();
			vodPackageMP.openName(vodPackage.getName());
			vodPackage.verifyData(expectedDataVodPackage);
			vodPackage.deleteCard();
		}
		
		@Test
		public void changeVodPackageWithFillForm() throws Exception{
			HomePage homepage = new HomePage(driver);
			VodPackageMP vodPackageMP = homepage.openVodPackage();
			VodPackage vodPackage = vodPackageMP.addNewCard();
			vodPackage.setName("wp_VodPackage_"+String.valueOf(System.currentTimeMillis()));
			vodPackage.addAndClose();
			vodPackageMP.openName(vodPackage.getName());
			List<Element> expectedDataVodPackage = vodPackage.getRandomValues();
			vodPackage.fillForm(expectedDataVodPackage);
			vodPackage.saveAndClose();
			vodPackageMP.openName(vodPackage.getName());
			vodPackage.verifyData(expectedDataVodPackage);
			vodPackage.deleteCard();
			
		}

}
