package com.sl.conf;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.sl.applogic.ApplicationManager;
import com.sl.model.User;
import com.sl.pages.PageManager;

public class ConfigBase {
	protected ApplicationManager app;
	protected PageManager pageManager;
	private User user = new User().setLogin("admin").setPassword("admin");
	protected String rndNum = null;
	
	
	
	@BeforeClass
	public void init(){
		app = new ApplicationManager();
		pageManager = app.getPageManager();		
		if(app.getUserHelper().isLoggin()){
			app.getUserHelper().loginAs(user);
		}
	}	

	@AfterSuite
	public void stop(){
		app.stop();
	}
	
	public  WebDriver getDriver(){
		return app.getWebDriver();
	}


}
