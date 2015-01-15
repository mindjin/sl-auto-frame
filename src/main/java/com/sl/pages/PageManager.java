package com.sl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sl.popup.*;
import com.sl.menu.*;
import com.sl.utils.*;
public class PageManager {
	
	
	private WebDriver driver;
	
	public Banners banners;
	public BroadcastChannel broadcastChannel;
	public Videomovies videomovies;
	public Karaoke karaoke;
	public LoginPage loginPage;
	public VodPackage vodPackage;
	public PromoShedule promoShedule;
	public HomePage homePage;
	public PromoActions promoActions;
	public InterfaceId interfaceId;
	public InterfaceMenuItem interfaceMenuItem;
	public BannersMP bannersMP;
	public BroadcastChannelMP broadcastChannelMP;
	public VideomoviesMP videomoviesMP;
	public KaraokeMP karaokeMP;
	public VodPackageMP vodPackageMP;
	public PromoSheduleMP promoSheduleMP;
	public PromoActionsMP promoActionsMP;
	public InterfaceIdMP interfaceIdMP;
	public InterfaceMenuItemMP interfaceMenuItemMP;
	public Assets assets;
	public AssetsOTT assetsOTT;
	public AudioPID audioPID;
	public CopySettings copySettings;
	public Finder finder;
	
	public PageManager(WebDriver driver){
		this.driver = driver;
		
		
		
		
	}
	
	 private <T extends Page> T initElements(T page) {
		    PageFactory.initElements(driver, page);
		    //PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), page);
//		    PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 10), page);
		    return page;
		  }
		  
		  public WebDriver getWebDriver() {
		    return driver;
		  }
	

}
