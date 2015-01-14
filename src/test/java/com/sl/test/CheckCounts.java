//package com.sl.test;
//import java.util.List;
//
//import org.junit.Test;
//import org.openqa.selenium.support.PageFactory;
//
//import com.sl.conf.ConfigDriver;
//import com.sl.data.Element;
//import com.sl.data.Factory;
//import com.sl.menu.KaraokeMP;
//import com.sl.menu.NextPage;
//import com.sl.menu.PromoActionsMP;
//import com.sl.pages.HomePage;
//import com.sl.pages.LoginPage;
//import com.sl.pages.PromoActions;
//
//public class CheckCounts extends ConfigDriver{
//	
//	private LoginPage loginPage = PageFactory.initElements(open(), LoginPage.class);
//
//	@Test
//	public void testPromo() throws Exception{
//		
//		HomePage homepage = loginPage.loginAs(userData);
//		homepage.openKaraoke();
//		NextPage nextPage = new NextPage(driver);
//		int b = 0;
//		for(int i = 1; i<86; i++){
//		boolean check = nextPage.checkCount();
//		
//		while(check){
//			
//			
//			b++;
//			Thread.sleep(100);
//			System.out.println(check+" -> "+b+"ms");
//			check = nextPage.checkCount();
//		}
//		System.out.println("Page"+i+check+" -> "+b+"ms");
//		nextPage.nextPage(String.valueOf(i));
//
//		}
//		
//	}
//
//}
