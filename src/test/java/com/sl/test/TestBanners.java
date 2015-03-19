package com.sl.test;

import static com.sl.utils.DataProviderUtils.GENERIC_DP;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.sl.annotation.Entity;
import com.sl.conf.ConfigBase;
import com.sl.data.RandomValues;
import com.sl.model.BannersDB;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.DataProviderUtils;

public class TestBanners extends ConfigBase{

	@Entity(entity=BannersDB.class, ids=1)
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void saveBannersWithFillForm(BannersDB banner) throws Exception{
		rndNum =RandomValues.rndNumb(999999);
		banner.setName("UI_Test_Banner_"+rndNum);
		app.getNavigationHelper().openPage(Menu.BANNERS);
		app.getHomePageHelper().addForm();
		pageManager.banners.fillForm(banner)
		.createAndClose();
		app.getHomePageHelper().openForm(banner.getName());
		BannersDB a = pageManager.banners.readForm();
		assertEquals(banner.toString(), a.toString());
		app.getFormHelper().deleteCard(Form.ASSETS);
	}
}
