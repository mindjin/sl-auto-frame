package com.sl.applogic;

import ru.yandex.qatools.allure.annotations.Step;

import com.sl.pages.HomePage;

public class HomePageHelper extends DriverBasedHelper {

	public HomePageHelper(ApplicationManager applicationManager) {
		super(applicationManager.getWebDriver());
		
	}
	@Step("Open form")
	public void openForm(String value){
		pageManager.homePage.setName(value)
		.refresh()
		.openExistValue(value);		
	}
	
	@Step("Copy form")
	public void copyForm(String value){
		pageManager.homePage.setName(value)
		.refresh();	
		pageManager.homePage.selectExistValue(value)
		.clickCopy();
		pageManager.paramCopy.clickCopyWithNewParam();
				
	}

	@Step("Create new form")
	public void addForm() {
	HomePage homePage = pageManager.homePage;
	homePage.addForm();	
	}

}
