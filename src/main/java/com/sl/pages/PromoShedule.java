package com.sl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.menu.PromoSheduleMP;
import com.sl.utils.Combobox;
import com.sl.utils.FooterForm;
import com.sl.utils.List2Lists;

public class PromoShedule extends AnyForm{

	Combobox combobox;

	public PromoShedule(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		combobox = new Combobox(driver);
	}
	
	@FindBy(id = "row.name")
	protected WebElement row_name;
	
	@FindBy(css="[name='row.endDate'] input")
	protected WebElement row_endDate;
	
	@FindBy(id="row.duration")
	protected WebElement row_duration;		
			
	@FindBy(css="[id='s2id_row.interfaceId'] span")
	protected WebElement row_interfaceId;	
	
	@FindBy(css="[name='row.__states.PromoInPromoSchs_bookmark']")
	protected WebElement row_PromoInPromoSchs_bookmark;
			
	@FindBy(css="[name='row.__states.PromoInPromoSchs'] [ng-click='onAddRow()']")
	protected WebElement row_PromoInPromoSchs_create;
	
	@FindBy(css="[name='row.__states.ProductOffers_bookmark']")
	protected WebElement row_ProductOffers_bookmark;
			
	@FindBy(css="[name='row.__states.ProductOffers']")
	private WebElement row_ProductOffers;		
	
	@FindBy(css="[name='row.__states.ResourceSpecSTBs_bookmark']")
	protected WebElement row_ResourceSpecSTBs_bookmark;	
			
	@FindBy(css="[name='row.__states.ResourceSpecSTBs']")
	protected WebElement row_ResourceSpecSTBs;	
	
	@FindBy(css="[name='row.__states.Locations_bookmark']")
	protected WebElement row_Locations_bookmark;	
	
	@FindBy(css="[name='row.__states.Locations']")
	protected WebElement row_Locations;	
				
	@FindBy(css="[id='select2-drop'] input")
	protected WebElement contentInput;
	
	@FindBy(css="[ng-click='onCreateAndPublishClick()']")
	protected WebElement onCreateAndPublishClick;
					
	
									
							

	public void setName(String name) {
		type(row_name, name);
		
	}

	public void setEndDate(String endDate) {
		type(row_endDate, endDate);
		
	}

	public void setDuration(String value) {
		
		type(row_duration, value);
		
	}

	public void selectInterfaseId(String value) {
		row_interfaceId.click();
		combobox.editCombobox(contentInput, value);
		
	}

	public List2Lists productOffers() {
		row_ProductOffers_bookmark.click();
		
		return new List2Lists(row_ProductOffers, driver);
		
	}

	public List2Lists resourceSpecSTBs() {
		row_ResourceSpecSTBs_bookmark.click();
		return new List2Lists(row_ResourceSpecSTBs, driver);
	}

	public List2Lists location() {
		row_Locations_bookmark.click();
		return new List2Lists(row_Locations, driver);
	}

	public Banners createBannerPopup() {
		row_PromoInPromoSchs_bookmark.click();
		row_PromoInPromoSchs_create.click();
		return new Banners(driver);
	}
	
public InterfaceId createCard() {
		
		FooterForm button = new FooterForm(driver);
		
		button.createAndClose();
	
		return new InterfaceId(driver);
	}


	

	public PromoSheduleMP createAndPublish() {
		wfe.waitElementsClickable(onCreateAndPublishClick);
		onCreateAndPublishClick.click();
		return new PromoSheduleMP(driver);
		
	}

	

}
