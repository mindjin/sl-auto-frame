package com.sl.test;

import static com.sl.utils.DataProviderUtils.GENERIC_DP;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.sl.annotation.Entity;
import com.sl.conf.ConfigBase;
import com.sl.data.RandomValues;
import com.sl.model.BundlePacksDB;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.DataProviderUtils;

public class TestBundlePacks extends ConfigBase{
	
	@Entity(entity=BundlePacksDB.class, ids=1)
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void fillBundlePack(BundlePacksDB bundlePack) throws Exception{
		rndNum =RandomValues.rndNumb(999999);
		bundlePack.setName("UI_Test_BundlePack_"+rndNum);
		//\\\\
		
		app.getNavigationHelper().openPage(Menu.BUNDLEPACKS);
		app.getHomePageHelper().addForm();
		pageManager.bundlePacks.fillForm(bundlePack)
		.createAndClose();
		app.getHomePageHelper().openForm(bundlePack.getName());
		BundlePacksDB a = pageManager.bundlePacks.readForm();
		assertEquals(bundlePack.toString(), a.toString());
		app.getFormHelper().deleteCard(Form.BUNDLEPACKS);
	}
}


