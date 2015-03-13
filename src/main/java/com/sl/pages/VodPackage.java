package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.User;
import com.sl.model.VodPackageDB;

public class VodPackage extends AnyForm{

	@FindBy(css = "[id='RowForm'] [id='row.name']")
	protected WebElement row_name;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.resourceFunc'] span")
	protected WebElement row_resourceFunc;

	@FindBy(css = "[id='RowForm'] [id='row.externalId']")
	protected WebElement row_externalId;

	@FindBy(css = "[id='RowForm'] [id='row.bundledGrp']")
	protected WebElement row_bundledGrp;

	@FindBy(css = "[id='RowForm'] [id='row.internalId']")
	protected WebElement row_internalId;

	@FindBy(css = "[id='RowForm'] [id='row.repPkgName']")
	protected WebElement row_repPkgName;

	@FindBy(css = "[id='RowForm'] [id='row.forSubscribe']")
	protected WebElement row_forSubscribe;

	@FindBy(css = "[id='RowForm'] [id='row.isAccessByLock']")
	protected WebElement row_isAccessByLock;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.VideoMovies']")
	protected WebElement states_videoMovies;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.BundlePackages']")
	protected WebElement states_bundlePackages;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.ServiceProviders']")
	protected WebElement states_serviceProviders;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.StbFunctions']")
	protected WebElement states_stbFunctions;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.NetworkTypes']")
	protected WebElement states_NetworkTypes;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.type'] span")
	protected WebElement row_type;

	@FindBy(css = "[id='RowForm'] [id='row.appleId']")
	protected WebElement row_appleId;

	@FindBy(css = "[id='RowForm'] [id='row.androidId']")
	protected WebElement row_androidId;

	@FindBy(css = "[id='RowForm'] [id='row.smarttvId']")
	protected WebElement row_smarttvId;

	@FindBy(css="[id='RowForm'] [name='row.description'] textarea")
	protected WebElement row_description;

	public VodPackage(PageManager pageManager) {
		super(pageManager);	
	}
	
	public VodPackage setName(String value) {
		type(row_name, value);
		User.setNameForm(value);
		return this;		
	}
	
	public VodPackage fillForm(VodPackageDB vodPackageDB){
		setTextfieldKeys(row_name, vodPackageDB.getName());
		setComboboxKeys(row_resourceFunc, vodPackageDB.getResourceFunc());
		setTextfieldKeys(row_externalId, vodPackageDB.getExternalId());
		setTextfieldKeys(row_bundledGrp, vodPackageDB.getBundledGrp());
		setTextfieldKeys(row_repPkgName, vodPackageDB.getRepPkgName());
		setCheckboxKeys(row_forSubscribe, vodPackageDB.getForSubscribe());
		setCheckboxKeys(row_isAccessByLock, vodPackageDB.getIsAccessByLock());
		setList2listKeys(states_videoMovies, vodPackageDB.getVideoMovies());
		setList2listKeys(states_bundlePackages, vodPackageDB.getBundlePackages());
		setList2listKeys(states_serviceProviders, vodPackageDB.getServiceProviders());
		setList2listKeys(states_stbFunctions, vodPackageDB.getStbFunctions());
		setList2listKeys(states_NetworkTypes, vodPackageDB.getNetworkTypes());
		setComboboxKeys(row_type, vodPackageDB.getType());
		setTextfieldKeys(row_appleId, vodPackageDB.getAppleId());
		setTextfieldKeys(row_androidId, vodPackageDB.getAndroidId());
		setTextfieldKeys(row_smarttvId, vodPackageDB.getSmarttvId());
		setTextfieldKeys(row_description, vodPackageDB.getDescription());
		return this;
	}
	
	public VodPackageDB readForm() {
		VodPackageDB vodPackageDB = new VodPackageDB();
		vodPackageDB.setName(insideTab(row_name).getAttribute("value"));
		vodPackageDB.setResourceFunc(insideTab(row_resourceFunc).getText());
		vodPackageDB.setExternalId(insideTab(row_externalId).getAttribute("value"));
		vodPackageDB.setBundledGrp(insideTab(row_bundledGrp).getAttribute("value"));
		vodPackageDB.setRepPkgName(insideTab(row_repPkgName).getAttribute("value"));
		vodPackageDB.setForSubscribe(pageManager.getCheckbox(row_forSubscribe).getStatus());
		vodPackageDB.setIsAccessByLock(pageManager.getCheckbox(row_isAccessByLock).getStatus());
		vodPackageDB.setVideoMovies(pageManager.getList2List(states_videoMovies).getValue());
		vodPackageDB.setBundlePackages(pageManager.getList2List(states_bundlePackages).getValue());
		vodPackageDB.setServiceProviders(pageManager.getList2List(states_serviceProviders).getValue());
		vodPackageDB.setStbFunctions(pageManager.getList2List(states_stbFunctions).getValue());
		vodPackageDB.setNetworkTypes(pageManager.getList2List(states_NetworkTypes).getValue());
		vodPackageDB.setType(insideTab(row_type).getText());
		vodPackageDB.setAppleId(insideTab(row_appleId).getAttribute("value"));
		vodPackageDB.setAndroidId(insideTab(row_androidId).getAttribute("value"));
		vodPackageDB.setSmarttvId(insideTab(row_smarttvId).getAttribute("value"));
		vodPackageDB.setDescription(insideTab(row_description).getAttribute("value"));	
		return vodPackageDB;
	}
	
	

}
