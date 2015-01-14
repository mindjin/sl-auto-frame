package com.sl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.menu.VodPackageMP;

public class VodPackage extends AnyForm{
	
	@FindBy(id = "row.name")
	WebElement row_name;

	@FindBy(css = "[id='s2id_row.resourceFunc'] span")
	WebElement row_resourceFunc;

	@FindBy(id = "row.externalId")
	WebElement row_externalId;

	@FindBy(id = "row.bundledGrp")
	WebElement row_bundledGrp;

	@FindBy(id = "row.internalId")
	WebElement row_internalId;

	@FindBy(id = "row.repPkgName")
	WebElement row_repPkgName;

	@FindBy(id = "row.forSubscribe")
	WebElement row_forSubscribe;

	@FindBy(id = "row.isAccessByLock")
	WebElement row_isAccessByLock;

	@FindBy(css = "section[name='row.__states.VideoMovies']")
	WebElement states_videoMovies;

	@FindBy(css = "section[name='row.__states.BundlePackages']")
	WebElement states_bundlePackages;

	@FindBy(css = "section[name='row.__states.ServiceProviders']")
	WebElement states_serviceProviders;

	@FindBy(css = "section[name='row.__states.StbFunctions']")
	WebElement states_stbFunctions;

	@FindBy(css = "section[name='row.__states.NetworkTypes']")
	WebElement states_NetworkTypes;

	@FindBy(css = "[id='s2id_row.type'] span")
	WebElement row_type;

	@FindBy(id = "row.appleId")
	WebElement row_appleId;

	@FindBy(id = "row.androidId")
	WebElement row_androidId;

	@FindBy(id = "row.smarttvId")
	WebElement row_smarttvId;

	@FindBy(css="[name='row.description'] textarea")
	WebElement description;



	public VodPackage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setName(String value) {
		type(row_name, value);
		name = value;
		
	}
	
	public VodPackageMP addAndClose() {
		
		
		footerForm.createAndClose();

		return new VodPackageMP(driver);
		
	}
	
public VodPackageMP saveAndClose(){
		
		footerForm.saveAndClose();
		return new VodPackageMP(driver);
		
	}

}
