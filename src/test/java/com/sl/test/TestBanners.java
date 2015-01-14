//package com.sl.test;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.junit.Test;
//import org.openqa.selenium.support.PageFactory;
//
//import com.sl.conf.ConfigDriver;
//import com.sl.conf.ConfigProperties;
//import com.sl.menu.BannersMP;
//import com.sl.menu.InterfaceIdMP;
//import com.sl.menu.InterfaceMenuItemMP;
//import com.sl.pages.Banners;
//import com.sl.pages.HomePage;
//import com.sl.pages.InterfaceId;
//import com.sl.pages.InterfaceMenuItem;
//import com.sl.pages.LoginPage;
//import com.sl.popup.Content;
//
//
//public class TestBanners extends ConfigDriver{
//
//	private LoginPage loginPage = PageFactory.initElements(open(), LoginPage.class);
//
//	@Test
//	public void testBanners() throws Exception{
//		
//		HashMap<String, String> nameAndInterfaceId = new HashMap<>();
//		
//		nameAndInterfaceId.put("VodStart", "VodStart");
//		nameAndInterfaceId.put("TvPopUp", "TvPopUp");
//		nameAndInterfaceId.put("AdultVodStart", "AdultVodStart");
//		nameAndInterfaceId.put("SubscriptionVodStart", "SubscriptionVodStart");
//		nameAndInterfaceId.put("SerialsStart", "SerialsStart");
//		nameAndInterfaceId.put("AdultVodStart", "AdultVodStart");
//		nameAndInterfaceId.put("PurchasedVodStart", "PurchasedVodStart");
//		nameAndInterfaceId.put("SubscriptionTOPBaner", "SubscriptionTOPBaner.Abon1.ALL_MOVIES");
//		nameAndInterfaceId.put("AdultTOPBaner", "AdultTOPBaner.FAMILY");
//		nameAndInterfaceId.put("SerialsTOPBaner", "SerialsTOPBaner.COMEDY");
//		nameAndInterfaceId.put("VideoTOPBaner", "VideoTOPBaner.Adventure");
//		
//		
//		
//		HomePage homepage = loginPage.loginAs(userData);
//		
//		InterfaceMenuItemMP interfaceMenuItemMP = homepage.openInterfaceMenuItem();
//		int sorting = 1;
//		String externalId = "Video?action=OpenCategory&vodCategoryEId=ALL_MOVIES";
//		interfaceMenuItemMP.searchExternalId(externalId);
////		if(interfaceMenuItemMP.getExternalId().isExistTable()==false){
////			InterfaceMenuItem interfaceMenuItem = interfaceMenuItemMP.addNewCard();
////			interfaceMenuItem.setSorting(sorting);
////			interfaceMenuItem.setName("inFilms");
////			interfaceMenuItem.setExternalId(externalId);
////			interfaceMenuItem.createCard();
////			
////		}
////		
////		InterfaceIdMP interfaceIdMP= homepage.openInterfaceId();
////		sorting = 0;
////		for(Map.Entry<String, String> a:nameAndInterfaceId.entrySet()){
////			sorting ++;		
////		interfaceIdMP.searchExternalId(a.getValue());
////		if(interfaceIdMP.getExternalId().isExistTable()==false){
////			interfaceIdMP.addNewCard();
////			InterfaceId interfaceId = new InterfaceId(driver);
////			interfaceId.setSorting(sorting);
////			interfaceId.setName(a.getKey());
////			interfaceId.setExternalId(a.getValue());
////			interfaceId.createCard();
////			
////		}
////		}
////		
////		
////		BannersMP bannersMP = homepage.openBanners();
////		sorting = 0;
////		for(Map.Entry<String, String> a:nameAndInterfaceId.entrySet()){
////			sorting++;
////		String image = Integer.toString(sorting);
////		if(bannersMP.searchName(a.getKey())==false){
////			Banners banners = bannersMP.addNewCard();
////			banners.setName(a.getKey());
////			banners.imageIPTV(image);
////			Content contentPopup= banners.createContent();
////			contentPopup.selectTypeContent(ConfigProperties.getProperty("typeContent"));
////			contentPopup.selectMRF(ConfigProperties.getProperty("mrf"));
////			contentPopup.selectContent();
////			contentPopup.addContent();
////			banners.createCard();
////			
////			
////		}
////		
////		}
//		
//		
////		PromoSheduleMP promoSheduleMP = homepage.openPromoShedule();
////		sorting = 0;
////		for(Map.Entry<String, String>a:nameAndInterfaceId.entrySet()){
////			sorting++;
////		if(promoSheduleMP.searchInterfaceId(a.getKey())==false){
////			PromoShedule promoShedule = promoSheduleMP.addNewCard();
////			promoShedule.setName(a.getKey());
////			promoShedule.setEndDate("28.10.2018");
////			promoShedule.setDuration("5");
////			promoShedule.selectInterfaseId(a.getKey());			
////			promoShedule.productOffers().addAll();
////			promoShedule.resourceSpecSTBs().addAll();
////			promoShedule.location().addAll();
////			Banners_Popup bannersPopup = promoShedule.createBannerPopup();
////			bannersPopup.selectIdObject(a.getKey());
////			bannersPopup.setDisplayFrequence("100");
////			bannersPopup.addAndClose();
////			promoShedule.createAndPublish();
////		}
////		
////		}
//	}
//	
//
//	
//}
