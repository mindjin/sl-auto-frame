package com.sl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.menu.BannersMP;
import com.sl.menu.BroadcastChannelMP;
import com.sl.menu.InterfaceIdMP;
import com.sl.menu.InterfaceMenuItemMP;
import com.sl.menu.KaraokeMP;
import com.sl.menu.PromoActionsMP;
import com.sl.menu.PromoSheduleMP;
import com.sl.menu.VideomoviesMP;
import com.sl.menu.VodPackageMP;

public class HomePage extends Page{
	
	@FindBy(css="[href='PromoContent/list']")
	protected WebElement promoContent;
	@FindBy(css="[href='PromoSchedule/list']")
	protected WebElement promoSchedule;
	@FindBy(css="[href='PromoInterfaceId/list']")
	protected WebElement promoInterfaceId;
	@FindBy(css="[href='InterfaceMenuItem/list']")
	protected WebElement interfaceMenuItem;
	@FindBy(css="[href='PromoAction/list']")
	protected WebElement promoAction;
	@FindBy(css="[href='Karaoke/list']")
	protected WebElement karaoke;
	@FindBy(css="[href='BroadcastChannel/list']")
	protected WebElement broadcastChannel;
	@FindBy(css="[href='VideoMovie/list']")
	protected WebElement videoMovie;
	@FindBy(css="[href='VodPackage/list']")
	protected WebElement vodPackage;
	
	public HomePage(WebDriver driver) {		
		super(driver);
		PageFactory.initElements(driver, this);
		
	}

	public BannersMP openBanners(){
		
		js.clickOnInvisibleElement(promoContent);
	
		return new BannersMP(driver);
			}
	
	public PromoSheduleMP openPromoShedule(){
		
		js.clickOnInvisibleElement(promoSchedule);
	
		return new PromoSheduleMP(driver);
			}
	
	public InterfaceIdMP openInterfaceId(){
		
		js.clickOnInvisibleElement(promoInterfaceId);
	
		return new InterfaceIdMP(driver);
			}
	
	public InterfaceMenuItemMP openInterfaceMenuItem(){
		
		js.clickOnInvisibleElement(interfaceMenuItem);
	
		return new InterfaceMenuItemMP(driver);
			}
	
	public PromoActionsMP openPromoActions(){
		
		js.clickOnInvisibleElement(promoAction);
	
		return new PromoActionsMP(driver);
			}
	
public KaraokeMP openKaraoke(){
		
		js.clickOnInvisibleElement(karaoke);
	
		return new KaraokeMP(driver);
			}

public VideomoviesMP openVideoMovie(){
	
	js.clickOnInvisibleElement(videoMovie);

	return new VideomoviesMP(driver);
		}

public BroadcastChannelMP openBroadcastChannel(){
	
	js.clickOnInvisibleElement(broadcastChannel);

	return new BroadcastChannelMP(driver);
		}

public VodPackageMP openVodPackage(){
	
	js.clickOnInvisibleElement(vodPackage);

	return new VodPackageMP(driver);
		}

	

	
	public LoginPage loggedOut (){
		
		return new LoginPage(driver);
		
	}

	

	
	




	
}
