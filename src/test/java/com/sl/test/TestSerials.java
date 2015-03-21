package com.sl.test;

import static com.sl.utils.DataProviderUtils.GENERIC_DP;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sl.annotation.Entity;
import com.sl.conf.ConfigBase;
import com.sl.data.RandomValues;
import com.sl.model.ContentContractsDB;
import com.sl.model.RentalWindowsDB;
import com.sl.model.SerialsDB;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.DataProviderUtils;
import com.sl.utils.ElementScreenshot;

@Listeners(ElementScreenshot.class)
public class TestSerials extends ConfigBase{
	
	@Test
	public void checkSeason(){
		rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.SERIALS);
		pageManager.homePage.addForm();	
		pageManager.serials
		.setName("UI_Test_Serials_"+rndNum)		
		.setLocations("Московский").addSeason().setSeasons("wp_Serials").create().createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Serials_"+rndNum);		
		assertTrue(pageManager.serials.getSeason().equals("wp_Serials"));
		
	}
	
	@Entity(entity=SerialsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createNewSeason(SerialsDB serials){
		rndNum =RandomValues.rndNumb(999999);
		serials.setName("UI_Test_Serials"+rndNum);
		app.getNavigationHelper().openPage(Menu.SERIALS);
		app.getHomePageHelper().addForm();
		pageManager.serials.fillForm(serials).createAndClose();
		app.getHomePageHelper().openForm(serials.getName());
		SerialsDB actualData = pageManager.serials.readForm();
		assertEquals(actualData.toString(), serials.toString());
		app.getFormHelper().deleteCard(Form.SERIALS);	
	}
	
	@Entity(entity=SerialsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void verifySaveAndClose(SerialsDB serials){
		rndNum =RandomValues.rndNumb(999999);	
		serials.setName("UI_Test_Serials"+rndNum);
		app.getNavigationHelper().openPage(Menu.SERIALS);
		app.getHomePageHelper().addForm();
		pageManager.serials.setName(rndNum).setLocations("Московский").createAndClose();
		app.getHomePageHelper().openForm(rndNum);
		pageManager.serials.fillForm(serials).saveAndClose();
		app.getHomePageHelper().openForm(serials.getName());
		SerialsDB actualData = pageManager.serials.readForm();
		assertEquals(actualData.toString(),serials.toString());
		app.getFormHelper().deleteCard(Form.SERIALS);	
	}
	
	@Entity(entity=ContentContractsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createContentContracts(ContentContractsDB contentContracts) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.SERIALS);
		app.getHomePageHelper().addForm();	
		pageManager.serials
		.setName("UI_Test_Serials_"+rndNum)		
		.setLocations("Московский").addContentContracts().setContentContract("wp_Delete")
		.fillForm(contentContracts).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Serials_"+rndNum);
		ContentContractsDB actualData = pageManager.serials
		.openContentContracts("wp_Delete").readForm();
		assertEquals(actualData.toString(),contentContracts.toString());
		pageManager.contentContracts.close();
		app.getFormHelper().deleteCard(Form.SERIALS);			
	}
	
	@Entity(entity=ContentContractsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void saveContentContracts(ContentContractsDB contract) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.SERIALS);
		app.getHomePageHelper().addForm();	
		pageManager.serials
		.setName("UI_Test_Serials_"+rndNum)
		.setLocations("Московский").addContentContracts().setContentContract("wp_Delete").create();
		pageManager.serials.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Serials_"+rndNum);
		pageManager.serials
		.openContentContracts("wp_Delete")
		.fillForm(contract)
		.save()
		.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Serials_"+rndNum);
		ContentContractsDB actualData = pageManager.serials
		.openContentContracts("wp_Delete").readForm();
		assertEquals(actualData.toString(),contract.toString());
		pageManager.contentContracts.close();
		app.getFormHelper().deleteCard(Form.SERIALS);			
	}
	
	@Entity(entity=RentalWindowsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createRetalWindow(RentalWindowsDB rentalWindows){
		rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.SERIALS);
		app.getHomePageHelper().addForm();	
		pageManager.serials
		.setName("UI_Test_Serials_"+rndNum)
		.setLocations("Московский")
		.addRentalWindows()
		.fillForm(rentalWindows).create();
		pageManager.serials.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Serials_"+rndNum);
		RentalWindowsDB actualData = pageManager.serials.openRentalWindows(rentalWindows.getParentID()).readForm();
		assertEquals(actualData.toString(),rentalWindows.toString());
		pageManager.rentalWindows.close();
		app.getFormHelper().deleteCard(Form.SERIALS);			
	}
	
	@Entity(entity=RentalWindowsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void saveRentalWindow(RentalWindowsDB rentalWindows){
		rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.SERIALS);
		app.getHomePageHelper().addForm();
		pageManager.serials
		.setName("UI_Test_Serials_"+rndNum)
		.setLocations("Московский")
		.addRentalWindows().setDeviceType("WEB").create();
		pageManager.serials.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Serials_"+rndNum);
		pageManager.serials.openRentalWindows("WEB").fillForm(rentalWindows).save();
		pageManager.serials.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Serials_"+rndNum);
		RentalWindowsDB actualData = pageManager.serials.openRentalWindows(rentalWindows.getParentID()).readForm();
		assertEquals(actualData.toString(), rentalWindows.toString());
		pageManager.rentalWindows.close();
		app.getFormHelper().deleteCard(Form.SERIALS);
	}

}
