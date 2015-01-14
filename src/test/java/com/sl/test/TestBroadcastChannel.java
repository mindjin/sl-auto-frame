package com.sl.test;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.sl.conf.ConfigDriver;
import com.sl.data.Element;
import com.sl.menu.BroadcastChannelMP;
import com.sl.pages.BroadcastChannel;
import com.sl.pages.HomePage;
import com.sl.pages.LoginPage;

public class TestBroadcastChannel extends ConfigDriver{
	
	private LoginPage loginPage = PageFactory.initElements(open(), LoginPage.class);
	
	@Before
	public void login(){
		if(loginPage.isLoggin()){
		loginPage.loginAs(userData);
		}
	}
	
	
	@Test
	public void createBroadcastChannelWithFillForm() throws Exception{
		HomePage homepage = new HomePage(driver);
		BroadcastChannelMP broadcastChannelMP =homepage.openBroadcastChannel();
		BroadcastChannel broadcastChannel = broadcastChannelMP.addNewCard();
		List<Element> expectedDataBroadcastChannel = broadcastChannel.getRandomValues();
		broadcastChannel.fillForm(expectedDataBroadcastChannel);
		broadcastChannel.addAndClose();
		broadcastChannelMP.openName(broadcastChannel.getName());
		broadcastChannel.verifyData(expectedDataBroadcastChannel);
		broadcastChannel.deleteCard();
				
	}
	
	@Test
	public void changeBroadcastChannelWithFillForm() throws Exception{
		HomePage homepage = new HomePage(driver);
		BroadcastChannelMP broadcastChannelMP =homepage.openBroadcastChannel();
		BroadcastChannel broadcastChannel = broadcastChannelMP.addNewCard();
		broadcastChannel.setNumber(String.valueOf(Random.class.newInstance().nextInt(9999)));
		broadcastChannel.setName("wp_BroadcastChannel_"+String.valueOf(System.currentTimeMillis()));
		broadcastChannel.setLocations("Все");
		broadcastChannel.addAndClose();
		broadcastChannelMP.openName(broadcastChannel.getName());		
		List<Element> expectedDataBroadcastChannel = broadcastChannel.getRandomValues();
		broadcastChannel.fillForm(expectedDataBroadcastChannel);
		broadcastChannel.saveAndClose();
		broadcastChannelMP.openName(broadcastChannel.getName());
		broadcastChannel.verifyData(expectedDataBroadcastChannel);
		broadcastChannel.deleteCard();
				
	}
	
	

}
