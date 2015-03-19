package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.BundlePacksDB;

public class BundlePacks extends AnyForm{
	
	@FindBy(css = "[id='RowForm'] [id='row.name']")
	protected WebElement text_name;
	
	@FindBy(css = "[id='RowForm'] [id='row.forSubscribe']")
	protected WebElement checkbox_forSubscribe;
	
	@FindBy(css = "[id='RowForm'] [id='row.externalId']")
	protected WebElement text_externalId;
	
	@FindBy(css = "[id='RowForm'] [id='row.internalId']")
	protected WebElement text_internalId;	
	
	@FindBy(css = "[id='RowForm'] [id='row.isAccessByLock']")
	protected WebElement checkbox_isAccessByLock;
	
	@FindBy(css = "[id='RowForm'] [id='row.unsubscribePeriod']")
	protected WebElement text_unsubscribePeriod;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ServiceProviders']")
	protected WebElement list2list_serviceProviders;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.StbFunctions']")
	protected WebElement list2list_stbFunctions;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.NetworkTypes']")
	protected WebElement list2list_networkTypes;
		
	@FindBy(css = "[id='RowForm'] [id='row.subscribeCount']")
	protected WebElement text_subscribeCount;
	
	@FindBy(css = "[id='RowForm'] [id='s2id_row.type'] span")
	protected WebElement combobox_type;
	
	@FindBy(css = "[id='RowForm'] [id='row.appleId']")
	protected WebElement text_appleId;
	
	@FindBy(css = "[id='RowForm'] [id='row.androidId']")
	protected WebElement text_androidId;
	
	@FindBy(css = "[id='RowForm'] [id='row.smarttvId']")
	protected WebElement text_smarttvId;
	
	@FindBy(css = "[id='RowForm'] [id='row.portalExternalId']")
	protected WebElement text_portalExternalId;
	
	@FindBy(css = "[id='RowForm'] [id='row.repPkgName']")
	protected WebElement text_repPkgName;
	
	@FindBy(css = "[id='RowForm'] [id='row.description'] textarea")
	protected WebElement text_description;
	
	public BundlePacks(PageManager pageManager) {
		super(pageManager);
	}
	
	public BundlePacks fillForm(BundlePacksDB bundlePacks){
		setTextfieldKeys(text_name, bundlePacks.getName());
		setCheckboxKeys(checkbox_forSubscribe, bundlePacks.getForSubscribe());
		setTextfieldKeys(text_externalId, bundlePacks.getExternalId());
//		setTextfieldKeys(text_internalId, bundlePacks.getInternalId());
		setCheckboxKeys(checkbox_isAccessByLock, bundlePacks.getIsAccessByLock());
		setTextfieldKeys(text_unsubscribePeriod, bundlePacks.getUnsubscribePeriod());
		setList2listKeys(list2list_serviceProviders, bundlePacks.getServiceProviders());
		setList2listKeys(list2list_stbFunctions, bundlePacks.getStbFunctions());
		setList2listKeys(list2list_networkTypes, bundlePacks.getNetworkTypes());
		setTextfieldKeys(text_subscribeCount, bundlePacks.getSubscribeCount());
		setComboboxKeys(combobox_type, bundlePacks.getType());
		setTextfieldKeys(text_appleId, bundlePacks.getAppleId());
		setTextfieldKeys(text_androidId, bundlePacks.getAndroidId());
		setTextfieldKeys(text_smarttvId, bundlePacks.getSmarttvId());
		setTextfieldKeys(text_portalExternalId, bundlePacks.getPortalExternalId());
		setTextfieldKeys(text_repPkgName, bundlePacks.getRepPkgName());
		setTextfieldKeys(text_description, bundlePacks.getDescription());
		return this;		
	}
	
	public BundlePacksDB readForm(){
		BundlePacksDB bundlePacks = new BundlePacksDB();
		bundlePacks.setName(insideTab(text_name).getAttribute("value"));
		bundlePacks.setForSubscribe(pageManager.getCheckbox(checkbox_forSubscribe).getStatus());
		bundlePacks.setExternalId(insideTab(text_externalId).getAttribute("value"));
//		bundlePacks.setInternalId(insideTab(text_internalId).getAttribute("value"));
		bundlePacks.setIsAccessByLock(pageManager.getCheckbox(checkbox_isAccessByLock).getStatus());
		bundlePacks.setUnsubscribePeriod(insideTab(text_unsubscribePeriod).getAttribute("value"));
		bundlePacks.setServiceProviders(pageManager.getList2List(list2list_serviceProviders).getValue());
		bundlePacks.setStbFunctions(pageManager.getList2List(list2list_stbFunctions).getValue());
		bundlePacks.setNetworkTypes(pageManager.getList2List(list2list_networkTypes).getValue());
		bundlePacks.setSubscribeCount(insideTab(text_subscribeCount).getAttribute("value"));
		bundlePacks.setType(insideTab(combobox_type).getText());
		bundlePacks.setAppleId(insideTab(text_appleId).getAttribute("value"));
		bundlePacks.setAndroidId(insideTab(text_androidId).getAttribute("value"));
		bundlePacks.setSmarttvId(insideTab(text_smarttvId).getAttribute("value"));
		bundlePacks.setPortalExternalId(insideTab(text_portalExternalId).getAttribute("value"));
		bundlePacks.setRepPkgName(insideTab(text_repPkgName).getAttribute("value"));
		bundlePacks.setDescription(insideTab(text_description).getAttribute("value"));
		return bundlePacks;
		
	}
	
	

}
