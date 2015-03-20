package com.sl.test;

import static com.sl.utils.DataProviderUtils.GENERIC_DP;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.sl.annotation.Entity;
import com.sl.conf.ConfigBase;
import com.sl.data.RandomValues;
import com.sl.model.ServicePlansDB;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.DataProviderUtils;

import static com.sl.utils.DataProviderUtils.GENERIC_DP;

public class TestServicePlans extends ConfigBase{
	
@Entity(entity=ServicePlansDB.class, ids=1)	
@Test(dataProviderClass = DataProviderUtils.class, dataProvider=GENERIC_DP)
public void saveServiceFillForm(ServicePlansDB servicePlans) throws Exception{
	rndNum =RandomValues.rndNumb(999999);
	servicePlans.setName("UI_Test_ServicePlan_"+rndNum);
	app.getNavigationHelper().openPage(Menu.SERVICEPLANS);
	app.getHomePageHelper().addForm();
	pageManager.servicePlans.fillForm(servicePlans)
	.createAndClose();
	app.getHomePageHelper().openForm(servicePlans.getName());
	ServicePlansDB a = pageManager.servicePlans.readForm();
	assertEquals(servicePlans.toString(), a.toString());
	app.getFormHelper().deleteCard(Form.SERVICEPLANS);
}

@Entity(entity=ServicePlansDB.class, ids=1)	
@Test(dataProviderClass = DataProviderUtils.class, dataProvider=GENERIC_DP)
public void verifySaveAndClose(ServicePlansDB servicePlans) throws Exception{
	rndNum =RandomValues.rndNumb(999999);
	servicePlans.setName("UI_Test_ServicePlan_"+rndNum);
	app.getNavigationHelper().openPage(Menu.SERVICEPLANS);
	app.getHomePageHelper().addForm();
	pageManager.servicePlans.setName("kjasdhfkasjdh"+rndNum).setNonBlockedPacks("12125113").createAndClose();
	app.getHomePageHelper().openForm("kjasdhfkasjdh"+rndNum);
	pageManager.servicePlans.fillForm(servicePlans).saveAndClose();
	app.getHomePageHelper().openForm(servicePlans.getName());
	ServicePlansDB actualData = pageManager.servicePlans.readForm();
	assertEquals(servicePlans.toString(), actualData.toString());
	app.getFormHelper().deleteCard(Form.SERVICEPLANS);
}
}
