package com.sl.pages;

import java.lang.reflect.Field;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.sl.popup.Assets;
import com.sl.popup.AssetsOTT;
import com.sl.popup.AudioPID;
import com.sl.popup.AudioPIDs;
import com.sl.popup.ContentContracts;
import com.sl.popup.ContentInPurchaseM;
import com.sl.popup.Delete;
import com.sl.popup.DvbtURL;
import com.sl.popup.LinkedId;
import com.sl.popup.MulticastGroup;
import com.sl.popup.OttPreviewAssets;
import com.sl.popup.OttURL;
import com.sl.popup.ParamCopy;
import com.sl.popup.PreviewAssets;
import com.sl.popup.SeasonsPopup;
import com.sl.popup.Subtitles;
import com.sl.utils.Checkbox;
import com.sl.utils.Combobox;
import com.sl.utils.Finder;
import com.sl.utils.LinkedList;
import com.sl.utils.List2List;

public class PageManager {
	
public enum Form{
	KARAOKE("karaoke"),
	PROMOACTIONS("promoActions"),
	PROMOCONTENT("promoContent"),
	PROMOSHEDULE("promoSchedule"),
	PROMOINTERFACEID("promoInterfaceId"),
	INTERFACEMENUITEM("interfaceMenuItem"),
	BROADCASTCHANNEL("broadcastChannel"),
	VIDEOMOVIE("videomovies"),
	VODPACKAGE("vodPackage"),
	ASSETS("assets"),
	AUDIOPID("audioPID"),
	AUDIOPIDs("audioPIDs"),
	ASSETSOTT("assetsOTT"),
	SUBTITLES("subtitles"),
	MULTICASTGROUP("multicastGroup"),
	OTTURL("ottUrl"),
	DVBTURL("dvbtUrl"),
	PREVIEWASSETS("previewAssets"),
	OTTPREVIEWASSETS("ottPreviewAssets"),
	CONTENTINPURCHASEM("contentInPurchaseM"),
	CONTENTCONTRACTS("contentContracts"),
	SEASONS("seasons"),
	SERIALS("serials"),
	SEASONSPOPUP("seasonsPopup");
		Form(String text){
			this.text = text;
		}
		public String text;
		
	}

private WebDriver driver;
public Karaoke karaoke;
public LoginPage loginPage;
public Assets assets;
public AudioPID audioPID;
public AudioPIDs audioPIDs;
public BroadcastChannel broadcastChannel;
public Videomovies videomovies;
public PromoActions promoActions;
public VodPackage vodPackage;
public AnyForm anyForm;
public AssetsOTT assetsOTT;
public Subtitles subtitles;
public MulticastGroup multicastGroup;
public OttURL ottUrl;
public DvbtURL dvbtUrl;
public PreviewAssets previewAssets;
public OttPreviewAssets ottPreviewAssets;
public ContentInPurchaseM contentInPurchaseM;
public ContentContracts contentContracts;
public Seasons seasons;
public RentalWindows rentalWindows;
public Serials serials;
public SeasonsPopup seasonsPopup;

public HomePage homePage;
public ParamCopy paramCopy;
public Finder finder;
public Delete delete;

private List2List list2List;
private Combobox combobox;
private Checkbox checkbox;
private LinkedList linkedList;
private LinkedId linkedId;






	
	public PageManager(WebDriver driver){
		this.driver = driver;			
		karaoke = initElements(new Karaoke (this));
		assets = initElements(new Assets (this));
		audioPID = initElements(new AudioPID (this));
		audioPIDs = initElements(new AudioPIDs (this));
		broadcastChannel = initElements(new BroadcastChannel(this));
		promoActions = initElements(new PromoActions(this));
		assetsOTT = initElements(new AssetsOTT (this));
		loginPage = initElements(new LoginPage(this));
		homePage = initElements(new HomePage(this));	
		paramCopy = initElements(new ParamCopy(this));
		delete = initElements(new Delete(this));
		vodPackage =  initElements(new VodPackage(this));
		subtitles = initElements(new Subtitles(this));
		multicastGroup = initElements(new MulticastGroup(this));
		ottUrl = initElements(new OttURL(this));
		dvbtUrl = initElements(new DvbtURL(this));
		videomovies = initElements(new Videomovies(this));
		previewAssets = initElements(new PreviewAssets(this));
		ottPreviewAssets = initElements(new OttPreviewAssets(this));
		contentInPurchaseM = initElements(new ContentInPurchaseM(this));
		contentContracts = initElements(new ContentContracts(this));
		seasons = initElements(new Seasons(this));
		rentalWindows = initElements(new RentalWindows(this));
		serials = initElements(new Serials(this));
		seasonsPopup = initElements(new SeasonsPopup(this));
	}
	
	
	 	private <T extends Page> T initElements(T page) {
		    PageFactory.initElements(driver, page);		   
		    return page;
		  }
		  
		  public WebDriver getWebDriver() {
		    return driver;
		  }
		  public PageManager init(){
			  return new PageManager(getWebDriver());
		  }
		  
		  public List2List getList2List(WebElement element){				 
				  list2List = new List2List(this, element);
			  return list2List;
			 
		  }
		  
		  public Combobox getCombobox(WebElement element){
			  combobox = new Combobox(this, element);
			  return combobox;
		  }
		  
		  public Checkbox getCheckbox(WebElement element){
			  checkbox = new Checkbox(this, element);
			  return checkbox;
		  }
		  public LinkedList getLinkedList(WebElement element){
			  linkedList = new LinkedList(this, element);
			  return linkedList;
		  }
		  
		  public Finder getFinder(WebElement element){
			  finder = new Finder(this, element);
			  return finder;
		  }
		  
		  public LinkedId getLinkeId(WebElement element){
			  linkedId = new LinkedId(this, element);
			  return linkedId;
		  }
		  
		  
		  
		 public AnyForm getPage(Form form){
			Field[] allFields = this.getClass().getDeclaredFields();			
			for(Field field : allFields){			
				 
				 if(field.getName().equals(form.text)){
					 try {
						return (AnyForm) field.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						
						e.printStackTrace();
					}					 
				 }			 	
			} 
			return  null;
		}
}
