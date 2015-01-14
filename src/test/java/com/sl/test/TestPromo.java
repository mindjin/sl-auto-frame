package com.sl.test;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.sl.conf.ConfigDriver;
import com.sl.data.Element;
import com.sl.menu.PromoActionsMP;
import com.sl.pages.HomePage;
import com.sl.pages.LoginPage;
import com.sl.pages.PromoActions;

public class TestPromo extends ConfigDriver{
	
	private LoginPage loginPage = PageFactory.initElements(open(), LoginPage.class);

	@Before
	public void login(){
		if(loginPage.isLoggin()){
		loginPage.loginAs(userData);
		}
	}
	
//	@Test
//	public void openPromo(){
//		HomePage homepage = new HomePage(driver);
//		PromoActionsMP promoActionsMP = homepage.openPromoActions();
//		assertTrue("Not found promoActions wp_51234",promoActionsMP.findName("wp_51234"));
//	}
	
	@Test
	public void createPromoWithFillForm() throws Exception{
		HomePage homepage = new HomePage(driver);
		PromoActionsMP promoActionsMP = homepage.openPromoActions();
		PromoActions promoActions = promoActionsMP.addNewCard();
		List<Element> expectedDataPromoActions = promoActions.getRandomValues();
		promoActions.fillForm(expectedDataPromoActions);
		promoActions.addAndClose();
		promoActionsMP.openName(promoActions.getName());
		promoActions.verifyData(expectedDataPromoActions);
		promoActions.deleteCard();		
		
	}
	
	@Test
	public void changePromoWithFillForm() throws Exception{
		HomePage homepage = new HomePage(driver);
		PromoActionsMP promoActionsMP = homepage.openPromoActions();
		PromoActions promoActions = promoActionsMP.addNewCard();
		promoActions.setName("wp_PromoActions_"+String.valueOf(System.currentTimeMillis()));
		promoActions.setSorting(String.valueOf(Random.class.newInstance().nextInt(9999)));
		promoActions.addAndClose();
		promoActionsMP.openName(promoActions.getName());
		List<Element> expectedDataPromoActions = promoActions.getRandomValues();
		promoActions.fillForm(expectedDataPromoActions);
		promoActions.saveAndClose();
		promoActionsMP.openName(promoActions.getName());
		promoActions.verifyData(expectedDataPromoActions);
		promoActions.deleteCard();
	}

}
