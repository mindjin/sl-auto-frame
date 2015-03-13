package com.sl.test;

import static com.sl.utils.DataProviderUtils.GENERIC_DP;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sl.annotation.Entity;
import com.sl.conf.ConfigBase;
import com.sl.data.RandomValues;
import com.sl.model.ContentContractsDB;
import com.sl.model.RentalWindowsDB;
import com.sl.model.SeasonsDB;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.DataProviderUtils;
import com.sl.utils.ElementScreenshot;

@Listeners(ElementScreenshot.class)
public class TestSeason  extends ConfigBase{
	
	@Entity(entity=SeasonsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createNewSeason(SeasonsDB seasons){
		rndNum =RandomValues.rndNumb(999999);	
		seasons.setName("UI_Test_Karaoke"+rndNum);
		app.getNavigationHelper().openPage(Menu.SEASONS);
		app.getHomePageHelper().addForm();
		pageManager.seasons.fillForm(seasons).createAndClose();
		app.getHomePageHelper().openForm(seasons.getName());
		SeasonsDB actualData = pageManager.seasons.readForm();
		assertEquals(actualData.toString(),seasons.toString());
		app.getFormHelper().deleteCard(Form.SEASONS);	
	}
	
	@Entity(entity=SeasonsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void verifySaveAndClose(SeasonsDB seasons){
		rndNum =RandomValues.rndNumb(999999);
		seasons.setName("UI_Test_Karaoke"+rndNum);
		app.getNavigationHelper().openPage(Menu.SEASONS);
		app.getHomePageHelper().addForm();
		pageManager.seasons.setName(rndNum).setLocations("Московский").setItem("50").createAndClose();
		app.getHomePageHelper().openForm(rndNum);
		pageManager.seasons.fillForm(seasons).saveAndClose();
		app.getHomePageHelper().openForm(seasons.getName());
		SeasonsDB actualData = pageManager.seasons.readForm();
		assertEquals(actualData.toString(),seasons.toString());
		app.getFormHelper().deleteCard(Form.SEASONS);	
	}
	
	@Entity(entity=ContentContractsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createContentContracts(ContentContractsDB contentContracts) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.SEASONS);
		app.getHomePageHelper().addForm();	
		pageManager.seasons
		.setName("UI_Test_Seasons_"+rndNum)
		.setItem("50")
		.setLocations("Московский").addContentContracts().setContentContract("wp_Delete")
		.fillForm(contentContracts).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Seasons_"+rndNum);
		ContentContractsDB actualData = pageManager.seasons
		.openContentContracts("wp_Delete").readForm();
		assertEquals( actualData.toString(),contentContracts.toString());
		pageManager.contentContracts.close();
		app.getFormHelper().deleteCard(Form.SEASONS);			
	}
	
	@Entity(entity=ContentContractsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void saveContentContracts(ContentContractsDB contract) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.SEASONS);
		app.getHomePageHelper().addForm();	
		pageManager.seasons
		.setName("UI_Test_Seasons_"+rndNum).setItem(rndNum)
		.setLocations("Московский")
		.addContentContracts()
		.setContentContract("wp_Delete")
		.create();
		pageManager.seasons.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Seasons_"+rndNum);
		pageManager.seasons
		.openContentContracts("wp_Delete")
		.fillForm(contract)
		.save()
		.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Seasons_"+rndNum);
		ContentContractsDB actualData = pageManager.seasons
		.openContentContracts("wp_Delete").readForm();
		assertEquals( actualData.toString(),contract.toString());
		pageManager.contentContracts.close();
		app.getFormHelper().deleteCard(Form.SEASONS);			
	}
	
	@Entity(entity=RentalWindowsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createRetalWindow(RentalWindowsDB rentalWindows){
		rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.SEASONS);
		app.getHomePageHelper().addForm();	
		pageManager.seasons
		.setName("UI_Test_Seasons_"+rndNum).setItem(rndNum)
		.setLocations("Московский")
		.addRentalWindows()
		.fillForm(rentalWindows).create();
		pageManager.seasons.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Seasons_"+rndNum);
		RentalWindowsDB actualData = pageManager.seasons.openRentalWindows(rentalWindows.getParentID()).readForm();
		assertEquals( actualData.toString(),rentalWindows.toString());
		pageManager.rentalWindows.close();
		app.getFormHelper().deleteCard(Form.SEASONS);			
	}
	
	@Entity(entity=RentalWindowsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void saveRentalWindow(RentalWindowsDB rentalWindows){
		rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.SEASONS);
		app.getHomePageHelper().addForm();
		pageManager.seasons
		.setName("UI_Test_Seasons_"+rndNum).setItem(rndNum)
		.setLocations("Московский")
		.addRentalWindows().setDeviceType("WEB").create();
		pageManager.seasons.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Seasons_"+rndNum);
		pageManager.seasons.openRentalWindows("WEB").fillForm(rentalWindows).save();
		pageManager.seasons.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Seasons_"+rndNum);
		RentalWindowsDB actualData = pageManager.seasons.openRentalWindows(rentalWindows.getParentID()).readForm();
		assertEquals( actualData.toString(),rentalWindows.toString());
		pageManager.rentalWindows.close();
		app.getFormHelper().deleteCard(Form.SEASONS);
	}
	
}
