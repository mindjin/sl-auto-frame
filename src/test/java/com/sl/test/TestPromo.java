package com.sl.test;

import static com.sl.utils.DataProviderUtils.GENERIC_DP;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sl.annotation.Entity;
import com.sl.conf.ConfigBase;
import com.sl.data.RandomValues;
import com.sl.model.PromoactionsDB;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.DataProviderUtils;
import com.sl.utils.ElementScreenshot;

@Listeners(ElementScreenshot.class)
public class TestPromo extends ConfigBase {
	
	WebElement driver;

	@Entity(entity=PromoactionsDB.class, ids=1)
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
	public void savePromoWithFillForm(PromoactionsDB promo) throws Exception{
		
//		rndNum =RandomValues.rndNumb(999999);
//		promo.setName("UI_Test_Promoactions_"+rndNum);
//		app.getNavigationHelper().openPage(Menu.PROMOACTIONS);
//		app.getHomePageHelper().addForm();
//		pageManager.promoActions
//		.setName(rndNum)
//		.setSorting(rndNum)
//		.createAndClose();
//		app.getHomePageHelper().openForm(rndNum);	
//		pageManager.promoActions.fillForm(promo).saveAndClose();
//		app.getHomePageHelper().openForm(promo.getName());
//		PromoactionsDB actualData = pageManager.promoActions.readForm();		
//		assertEquals(actualData.toString(), promo.toString());
//		app.getFormHelper().deleteCard(Form.PROMOACTIONS);		
//	}
//	
//	@Entity(entity=PromoactionsDB.class, ids=1)
//	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
//	public void createFillForm(PromoactionsDB promo) throws Exception{
//		rndNum =RandomValues.rndNumb(999999);
//		promo.setName("UI_Test_Promoactions_"+rndNum);
//		app.getNavigationHelper().openPage(Menu.PROMOACTIONS);
//		app.getHomePageHelper().addForm();
//		pageManager.promoActions.fillForm(promo).createAndClose();
//		app.getHomePageHelper().openForm(promo.getName());
//		PromoactionsDB actualData = pageManager.promoActions.readForm();		
//		assertEquals(actualData.toString(),promo.toString());
//		app.getFormHelper().deleteCard(Form.PROMOACTIONS);	
		
		rndNum =RandomValues.rndNumb(999999);
		promo.setName("UI_Test_Promoactions_"+rndNum);
		app.getNavigationHelper().openPage(Menu.PROMOACTIONS);
		app.getHomePageHelper().addForm();
		pageManager.promoActions
		.setName(rndNum)
		.setSorting(rndNum)
		.setEditServices("wp51")
		.createAndClose();
	

		
		;
		
		
	}
	
	
	
}
