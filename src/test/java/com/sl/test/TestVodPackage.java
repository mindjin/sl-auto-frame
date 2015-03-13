package com.sl.test;

import static com.sl.utils.DataProviderUtils.GENERIC_DP;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sl.annotation.Entity;
import com.sl.conf.ConfigBase;
import com.sl.data.RandomValues;
import com.sl.model.VodPackageDB;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.DataProviderUtils;
import com.sl.utils.ElementScreenshot;

@Listeners(ElementScreenshot.class)
public class TestVodPackage extends ConfigBase {
	
	@Entity(entity=VodPackageDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createVoDPackageWithFillForm(VodPackageDB vodPackage){
		rndNum =RandomValues.rndNumb(999999);
		vodPackage.setName("UI_Test_VodPackage"+rndNum);
		app.getNavigationHelper().openPage(Menu.VODPACKAGE);
		app.getHomePageHelper().addForm();
		pageManager.vodPackage.fillForm(vodPackage).createAndClose();
		app.getHomePageHelper().openForm(vodPackage.getName());
		VodPackageDB actualData = pageManager.vodPackage.readForm();
		assertEquals(actualData.toString(), vodPackage.toString());
		app.getFormHelper().deleteCard(Form.VODPACKAGE);		
	}
	
	@Entity(entity=VodPackageDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void saveVoDPackageWithFillForm(VodPackageDB vodPackage){
		rndNum =RandomValues.rndNumb(999999);
		vodPackage.setName("UI_Test_VodPackage"+rndNum);
		app.getNavigationHelper().openPage(Menu.VODPACKAGE);
		app.getHomePageHelper().addForm();
		pageManager.vodPackage
		.setName(rndNum)		
		.createAndClose();
		app.getHomePageHelper().openForm(rndNum);
		pageManager.vodPackage.fillForm(vodPackage).saveAndClose();
		app.getHomePageHelper().openForm(vodPackage.getName());
		VodPackageDB actualData = pageManager.vodPackage.readForm();
		assertEquals(actualData.toString(), vodPackage.toString());
		app.getFormHelper().deleteCard(Form.VODPACKAGE);		
	}

}
