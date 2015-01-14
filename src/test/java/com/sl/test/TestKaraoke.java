package com.sl.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.sl.conf.ConfigDriver;
import com.sl.data.Element;
import com.sl.menu.KaraokeMP;
import com.sl.pages.HomePage;
import com.sl.pages.Karaoke;
import com.sl.pages.LoginPage;
import com.sl.popup.Assets;
import com.sl.popup.AudioPID;



public class TestKaraoke extends ConfigDriver{
	
	private LoginPage loginPage = PageFactory.initElements(open(), LoginPage.class);



@Before
public void login(){
	if(loginPage.isLoggin()){
	loginPage.loginAs(userData);
	}
	

}
//@Test
//public void checkKaraoke1() throws Exception{
//	HomePage homepage = new HomePage(driver);
//	KaraokeMP karaokeMP = homepage.openKaraoke();
//	assertTrue("Not found karaoke wp_51234",karaokeMP.findName("wp_51234"));
//
//
//}
//
//@Test
//public void checkKaraoke2() throws Exception{
//	HomePage homepage = new HomePage(driver);
//	KaraokeMP karaokeMP = homepage.openKaraoke();
//	Karaoke karaoke = karaokeMP.openName("wp_karaoke");
//	List<Element> expectedDataKaraoke = karaoke.getRandomValues();
//	karaoke.verifyData(expectedDataKaraoke);
//	
//	
//}


@Test
public void createKaraokeWithFillForm() throws Exception{
	
	HomePage homepage = new HomePage(driver);

	KaraokeMP karaokeMP = homepage.openKaraoke();
	Karaoke karaoke = karaokeMP.addNewCard();	
	List<Element> expectedDataKaraoke = karaoke.getRandomValues();
	karaoke.fillForm(expectedDataKaraoke);
	
	
	Assets assets = karaoke.addAssets();
	List<Element> expectedDataAssets = assets.getDefaultValues();
	assets.fillForm(expectedDataAssets);
	
	
	AudioPID audioPID = assets.createAudioPID();
	List<Element> expectedDataAudioPID = audioPID.getDefaultValues();
	audioPID.fillForm(expectedDataAudioPID);
	
	
	audioPID.addAudioPID();
	assets.addAssets();	
	karaoke.addAndClose();
	
	
	karaokeMP.openName(karaoke.getName());
	karaoke.verifyData(expectedDataKaraoke);
	karaoke.openAsset(assets.getName());	
	assets.verifyData(expectedDataAssets);
	
	assets.openAudioPID(audioPID.getName());	
	audioPID.verifyData(expectedDataAudioPID);
	
	audioPID.closeAudioPID();
	assets.closeAssets();
	karaoke.deleteCard();	
	

	

}

@Test
public void saveKaraokeWithFillForm() throws Exception{
	HomePage homepage = new HomePage(driver);

	KaraokeMP karaokeMP = homepage.openKaraoke();
	Karaoke karaoke = karaokeMP.addNewCard();
	karaoke.setName("wp_autoTest_"+String.valueOf(System.currentTimeMillis()));
	karaoke.setExternalId(String.valueOf(System.currentTimeMillis()));
	karaoke.setLocations("Все");
	karaoke.addAndClose();
	karaokeMP.openName(karaoke.getName());
	
	List<Element> expectedDataKaraoke = karaoke.getRandomValues();
	karaoke.fillForm(expectedDataKaraoke);
	
	
	Assets assets = karaoke.addAssets();
	List<Element> expectedDataAssets = assets.getDefaultValues();
	assets.fillForm(expectedDataAssets);
	
	
	AudioPID audioPID = assets.createAudioPID();
	List<Element> expectedDataAudioPID = audioPID.getDefaultValues();
	audioPID.fillForm(expectedDataAudioPID);
	
	
	audioPID.addAudioPID();
	assets.addAssets();	
	karaoke.saveAndClose();
	
	
	karaokeMP.openName(karaoke.getName());
	karaoke.verifyData(expectedDataKaraoke);
	karaoke.openAsset(assets.getName());	
	assets.verifyData(expectedDataAssets);
	
	assets.openAudioPID(audioPID.getName());	
	audioPID.verifyData(expectedDataAudioPID);
	audioPID.closeAudioPID();
	assets.closeAssets();
	karaoke.deleteCard();	
	
}






}
