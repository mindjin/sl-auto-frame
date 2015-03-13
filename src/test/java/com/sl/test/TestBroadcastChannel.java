package com.sl.test;

import static com.sl.pages.PageManager.Form.BROADCASTCHANNEL;
import static com.sl.utils.DataProviderUtils.GENERIC_DP;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sl.annotation.Entity;
import com.sl.conf.ConfigBase;
import com.sl.data.RandomValues;
import com.sl.model.AudioPIDsDB;
import com.sl.model.AudioPidDB;
import com.sl.model.BroadcastchannelDB;
import com.sl.model.DvbtUrlDB;
import com.sl.model.MulticastGroupDB;
import com.sl.model.OttUrlDB;
import com.sl.model.SubtitlesDB;
import com.sl.pages.HomePage.Menu;
import com.sl.utils.DataProviderUtils;
import com.sl.utils.ElementScreenshot;


@Listeners(ElementScreenshot.class)
public class TestBroadcastChannel extends ConfigBase {

	
	
	
//	@Entity(entity=BroadcastchannelDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void createBCwithFillForm(BroadcastchannelDB broadDB){
//		rndNum =RandomValues.rndNumb(999999);
//		broadDB.setName("UI_Test_BroadcastChannel_"+rndNum).setDvbtChannelName(rndNum).setNPVRChannelID(rndNum);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);		
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel.setName("123");
//		pageManager.broadcastChannel.fillForm(broadDB).createAndClose();
//		app.getHomePageHelper().openForm(broadDB.getName());
//		BroadcastchannelDB actualData = pageManager.broadcastChannel.readForm();
//		assertEquals(actualData.toString(),broadDB.toString());
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);
//	}
//	
//	@Entity(entity=AudioPIDsDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void createAudioPIDinBCwithFillForm(AudioPIDsDB audioPids){
//		rndNum =RandomValues.rndNumb(999999);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName("UI_Test_BroadcastChannel_"+rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum)
//		.addAudioPID().fillForm(audioPids).create();
//		pageManager.broadcastChannel.createAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		AudioPIDsDB actualData = pageManager.broadcastChannel.openAudioPID(audioPids.getName()).readForm();
//		assertEquals( actualData.toString(),audioPids.toString());
//		pageManager.audioPIDs.close();
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);		
//		
//	}
//	
//	@Entity(entity=SubtitlesDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void createSubtitlesInBCWithFillForm(SubtitlesDB subtitles){
//		rndNum =RandomValues.rndNumb(999999);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName("UI_Test_BroadcastChannel_"+rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum)
//		.addSubtitles().fillForm(subtitles).create();
//		pageManager.broadcastChannel.createAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		SubtitlesDB actualData = pageManager.broadcastChannel.openSubtitles(subtitles.getName()).readForm();
//		assertEquals( actualData.toString(),subtitles.toString());
//		pageManager.subtitles.close();
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);		
//	}
//	
//	@Entity(entity=MulticastGroupDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void createMulticastGroupinBCWithFillForm(MulticastGroupDB multicast){
//		rndNum =RandomValues.rndNumb(999999);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		multicast.setNPVRChannelID(rndNum);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName("UI_Test_BroadcastChannel_"+rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum)
//		.addMulticastGroup().fillForm(multicast).create();
//		pageManager.broadcastChannel.createAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		MulticastGroupDB actualData = pageManager.broadcastChannel.openMulticastGroup(multicast.getUrl()).readForm();
//		assertEquals( actualData.toString(),multicast.toString());
//		pageManager.multicastGroup.close();
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);		
//		
//	}
//	
//	@Entity(entity=OttUrlDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void createOttURl(OttUrlDB ottUrl){
//		rndNum = RandomValues.rndNumb(999999);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName("UI_Test_BroadcastChannel_"+rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum)
//		.addOttURL().fillForm(ottUrl).create();
//		pageManager.broadcastChannel.createAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		OttUrlDB actualData = pageManager.broadcastChannel.openOttURL(ottUrl.getUrl()).readForm();
//		assertEquals( actualData.toString(),ottUrl.toString());
//		pageManager.ottUrl.close();
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);	
//	}
//	
//	@Entity(entity=DvbtUrlDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void createDvbtURL(DvbtUrlDB dvbtUrl){
//		rndNum =RandomValues.rndNumb(999999);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName("UI_Test_BroadcastChannel_"+rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum)
//		.addDvbtURL().fillForm(dvbtUrl).create();
//		pageManager.broadcastChannel.createAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		DvbtUrlDB actualData = pageManager.broadcastChannel.openDvbtURL(dvbtUrl.getUrl()).readForm();
//		assertEquals( actualData.toString(),dvbtUrl.toString());
//		pageManager.dvbtUrl.close();
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);	
//	}
//
//	@Entity(entity=BroadcastchannelDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void saveTV(BroadcastchannelDB broadcastchannel){
//		rndNum =RandomValues.rndNumb(999999);
//		broadcastchannel.setName("UI_Test_BroadcastChannel"+rndNum).setDvbtChannelName(rndNum).setNPVRChannelID(rndNum);;
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName(rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum).createAndClose();
//		app.getHomePageHelper().openForm(rndNum);					
//		pageManager.broadcastChannel.fillForm(broadcastchannel).saveAndClose();
//		app.getHomePageHelper().openForm(broadcastchannel.getName());
//		BroadcastchannelDB actualData = pageManager.broadcastChannel.readForm();
//		assertEquals( actualData.toString(),broadcastchannel.toString());
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);
//	}
//	
//	@Entity(entity=AudioPIDsDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void saveAudioPID(AudioPIDsDB audioPids){
//		rndNum =RandomValues.rndNumb(999999);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName("UI_Test_BroadcastChannel_"+rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum)
//		.addAudioPID().setName(rndNum).setPID(rndNum).setLocations("Все").create();
//		pageManager.broadcastChannel.createAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		pageManager.broadcastChannel.openAudioPID(rndNum).fillForm(audioPids).save();
//		pageManager.broadcastChannel.saveAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		AudioPIDsDB actualData = pageManager.broadcastChannel.openAudioPID(audioPids.getName()).readForm();
//		assertEquals(actualData.toString(),audioPids.toString());
//		pageManager.audioPIDs.close();
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);		
//		
//	}
	
	@Entity(entity=SubtitlesDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void saveSubtitle(SubtitlesDB subtitles){
		rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
		app.getHomePageHelper().addForm();
		pageManager.broadcastChannel
		.setName("UI_Test_BroadcastChannel_"+rndNum)
		.setLocations("Московский")
		.setNumber(rndNum)
		.addSubtitles().setName(rndNum).setPID(rndNum).setLocations("Все").create();
		pageManager.broadcastChannel.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
		pageManager.broadcastChannel.openSubtitles(rndNum)
		.fillForm(subtitles).save();
		pageManager.broadcastChannel.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
		SubtitlesDB actualData = pageManager.broadcastChannel.openSubtitles(subtitles.getName()).readForm();
		assertEquals( actualData.toString(),subtitles.toString());
		pageManager.subtitles.close();
		app.getFormHelper().deleteCard(BROADCASTCHANNEL);		
		
	}
//	
//	@Entity(entity=MulticastGroupDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void saveMulticastGroup(MulticastGroupDB multicast){
//		rndNum =RandomValues.rndNumb(999999);
//		multicast.setNPVRChannelID(rndNum);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName("UI_Test_BroadcastChannel_"+rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum)
//		.addMulticastGroup().setURL(rndNum).create();
//		pageManager.broadcastChannel.createAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		pageManager.broadcastChannel.openMulticastGroup(rndNum).fillForm(multicast).save();
//		pageManager.broadcastChannel.saveAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		MulticastGroupDB actualData = pageManager.broadcastChannel.openMulticastGroup(multicast.getUrl()).readForm();
//		assertEquals( actualData.toString(),multicast.toString());
//		pageManager.multicastGroup.close();
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);		
//		
//	}
//	
//	@Entity(entity=OttUrlDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void saveOttURL(OttUrlDB ottUrl){
//		rndNum =RandomValues.rndNumb(999999);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName("UI_Test_BroadcastChannel_"+rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum)
//		.addOttURL().setURL(rndNum).create();
//		pageManager.broadcastChannel.createAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		pageManager.broadcastChannel.openOttURL(rndNum).fillForm(ottUrl).save();
//		pageManager.broadcastChannel.saveAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		OttUrlDB actualData = pageManager.broadcastChannel.openOttURL(ottUrl.getUrl()).readForm();
//		assertEquals( actualData.toString(),ottUrl.toString());
//		pageManager.ottUrl.close();
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);		
//		
//	}
//	
//	@Entity(entity=DvbtUrlDB.class, ids = 1)
//	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
//	public void saveDvbtURL(DvbtUrlDB dvbtUrl){
//		rndNum =RandomValues.rndNumb(999999);
//		app.getNavigationHelper().openPage(Menu.BROADCASTCHANNEL);
//		app.getHomePageHelper().addForm();
//		pageManager.broadcastChannel
//		.setName("UI_Test_BroadcastChannel_"+rndNum)
//		.setLocations("Московский")
//		.setNumber(rndNum)
//		.addDvbtURL().setURL(rndNum).create();
//		pageManager.broadcastChannel.createAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		pageManager.broadcastChannel.openDvbtURL(rndNum).fillForm(dvbtUrl).save();
//		pageManager.broadcastChannel.saveAndClose();
//		app.getHomePageHelper().openForm("UI_Test_BroadcastChannel_"+rndNum);
//		DvbtUrlDB actualData = pageManager.broadcastChannel.openDvbtURL(dvbtUrl.getUrl()).readForm();
//		assertEquals( actualData.toString(),dvbtUrl.toString());
//		pageManager.dvbtUrl.close();
//		app.getFormHelper().deleteCard(BROADCASTCHANNEL);		
//		
//	}

}
