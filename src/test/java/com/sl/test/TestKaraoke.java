package com.sl.test;

import static com.sl.utils.DataProviderUtils.GENERIC_DP;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sl.annotation.Entity;
import com.sl.conf.ConfigBase;
import com.sl.data.RandomValues;
import com.sl.model.AssetsDB;
import com.sl.model.AssetsOttDB;
import com.sl.model.AudioPidDB;
import com.sl.model.KaraokeDB;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.DataProviderUtils;
import com.sl.utils.ElementScreenshot;

@Listeners(ElementScreenshot.class)
public class TestKaraoke extends ConfigBase{	
	
	
	@Entity(entity=KaraokeDB.class, ids=1)
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void createKaraokeWithFillForm(KaraokeDB karaoke) throws Exception{	
		rndNum = RandomValues.rndNumb(999999);	
		karaoke.setName("UI_Test_Karaoke_"+rndNum);
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke.fillForm(karaoke).createAndClose();
			app.getHomePageHelper().openForm(karaoke.getName());
			KaraokeDB actualData = pageManager.karaoke.readForm();
			assertEquals(actualData.toString(), karaoke.toString());
			app.getFormHelper().deleteCard(Form.KARAOKE);

	}
	
	@Entity(entity=AssetsDB.class, ids=1)
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void createAssetsWithFillForm(AssetsDB assets) throws Exception{				
		rndNum =RandomValues.rndNumb(999999);	
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke
			.setName("UI_Test_Karaoke_"+rndNum)
			.setExternalId(rndNum)
			.setLocations("Московский")
			.addAssets().
			fillForm(assets).
			create();
			pageManager.karaoke.createAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			AssetsDB actualData = pageManager.karaoke.openAsset(assets.getName()).readForm();
			assertEquals( actualData.toString(), assets.toString());
			pageManager.assets.close();
			app.getFormHelper().deleteCard(Form.KARAOKE);
			
		}
		
	@Entity(entity=AudioPidDB.class, ids=1)
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void createAudioPIDWithFillForm(AudioPidDB audioPid) throws Exception{
		rndNum =RandomValues.rndNumb(999999);
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke
			.setName("UI_Test_Karaoke_"+rndNum)
			.setExternalId(rndNum)
			.setLocations("Московский")
			.addAssets()
			.setName(rndNum)
			.addAudioPID()
			.fillForm(audioPid)
			.create();
			pageManager.assets.create();
			pageManager.karaoke.createAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			pageManager.karaoke
			.openAsset(rndNum)
			.openAudioPID(audioPid.getName());
			AudioPidDB actualData = pageManager.audioPID.readForm();
			assertEquals( actualData.toString(), audioPid.toString());
			pageManager.audioPID.close();
			pageManager.assets.close();
			app.getFormHelper().deleteCard(Form.KARAOKE);			
		}
		
		@Entity(entity=AssetsOttDB.class, ids=1)
		@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void createAssetsOTTWithFillForm(AssetsOttDB assetsOtt) throws Exception{
		rndNum =RandomValues.rndNumb(999999);
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke
			.setName("UI_Test_Karaoke_"+rndNum)
			.setExternalId(rndNum)
			.setLocations("Московский");
			pageManager.karaoke.addAssertsOTT().fillForm(assetsOtt).create();
			pageManager.karaoke.createAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			AssetsOttDB actualData = pageManager.karaoke.openAssetOTT(assetsOtt.getName()).readform();;
			assertEquals(actualData.toString(), assetsOtt.toString());
			pageManager.assetsOTT.close();
			app.getFormHelper().deleteCard(Form.KARAOKE);			
		}
		
		@Entity(entity=AudioPidDB.class, ids=1)
		@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void createAudioPIDinAssetsOTTWithFillForm(AudioPidDB audioPid) throws Exception{
		rndNum = RandomValues.rndNumb(999999);
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke
			.setName("UI_Test_Karaoke_"+rndNum)
			.setExternalId(rndNum)
			.setLocations("Московский");
			pageManager.karaoke.addAssertsOTT()
			.setName(rndNum)
			.addAudioPID().fillForm(audioPid)
			.create();
			pageManager.assetsOTT.create();
			pageManager.karaoke.createAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			pageManager.karaoke
			.openAssetOTT(rndNum)
			.openAudioPID(audioPid.getName());
			AudioPidDB actualData = pageManager.audioPID.readForm();
			assertEquals( actualData.toString(), audioPid.toString());
			pageManager.audioPID.close();
			pageManager.assetsOTT.close();
			app.getFormHelper().deleteCard(Form.KARAOKE);			
		}
		
	@Entity(entity=KaraokeDB.class, ids=1)
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void saveKaraokeWithFillForm(KaraokeDB karaoke) throws Exception{
		rndNum =RandomValues.rndNumb(999999);
		karaoke.setName("UI_Test_Karaoke_"+rndNum);
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke
			.setName(rndNum)
			.setExternalId(rndNum)
			.setLocations("Московский");			
			pageManager.karaoke.createAndClose();
			app.getHomePageHelper().openForm(rndNum);
			pageManager.karaoke.fillForm(karaoke).saveAndClose();
			app.getHomePageHelper().openForm(karaoke.getName());
			KaraokeDB actualData = pageManager.karaoke.readForm();
			assertEquals(actualData.toString(), karaoke.toString());	
			app.getFormHelper().deleteCard(Form.KARAOKE);
	}
		
	@Entity(entity=AssetsDB.class, ids=1)
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void saveAssetsWithFillForm(AssetsDB assets)  throws Exception{
		rndNum =RandomValues.rndNumb(999999);
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke
			.setName("UI_Test_Karaoke_"+rndNum)
			.setExternalId(rndNum)
			.setLocations("Московский");			
			pageManager.karaoke.addAssets().setName(rndNum);
			pageManager.assets.create();
			pageManager.karaoke.createAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			pageManager.karaoke
			.openAsset(rndNum).fillForm(assets).save();
			pageManager.karaoke.saveAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			AssetsDB actualData = pageManager.karaoke.openAsset(assets.getName()).readForm();
			assertEquals( actualData.toString(), assets.toString());
			pageManager.assets.close();
			app.getFormHelper().deleteCard(Form.KARAOKE);
		}
		
	@Entity(entity=AudioPidDB.class, ids=1)
	@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void saveAudioPIDofAssetsWithFillForm(AudioPidDB audioPid)  throws Exception{
			rndNum =RandomValues.rndNumb(999999);
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke
			.setName("UI_Test_Karaoke_"+rndNum)
			.setExternalId(rndNum)
			.setLocations("Московский");			
			pageManager.karaoke.addAssets().setName(rndNum).addAudioPID();
			pageManager.audioPID.setName(rndNum).setPID(rndNum).create();
			pageManager.assets.create();
			pageManager.karaoke.createAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			pageManager.karaoke
			.openAsset(rndNum)
			.openAudioPID(rndNum)
			.fillForm(audioPid)
			.save();			
			pageManager.assets.save();
			pageManager.karaoke.saveAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			pageManager.karaoke.openAsset(rndNum).openAudioPID(audioPid.getName());
			AudioPidDB actualData = pageManager.audioPID.readForm();
			assertEquals( actualData.toString(), audioPid.toString());
			pageManager.audioPID.close();
			pageManager.assets.close();
			app.getFormHelper().deleteCard(Form.KARAOKE);	
		}
		
		@Entity(entity=AssetsOttDB.class, ids=1)
		@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void saveAssetsOTTWithFillForm(AssetsOttDB assetsOtt) throws Exception{
			rndNum =RandomValues.rndNumb(999999);
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke
			.setName("UI_Test_Karaoke_"+rndNum)
			.setExternalId(rndNum)
			.setLocations("Московский")
			.addAssertsOTT()
			.setName(rndNum)
			.create();
			pageManager.karaoke.createAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			pageManager.karaoke.openAssetOTT(rndNum).fillForm(assetsOtt).save();
			pageManager.karaoke.saveAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			AssetsOttDB actualData = pageManager.karaoke.openAssetOTT(assetsOtt.getName()).readform();;
			assertEquals(actualData.toString(), assetsOtt.toString());
			pageManager.assetsOTT.close();
			app.getFormHelper().deleteCard(Form.KARAOKE);	
			
		}
		
		@Entity(entity=AudioPidDB.class, ids=1)
		@Test(dataProviderClass = DataProviderUtils.class, dataProvider = GENERIC_DP)
		public void saveAudioPIDofAssetsOTTWithFillForm(AudioPidDB audioPid) throws Exception{
			rndNum =RandomValues.rndNumb(999999);
			app.getNavigationHelper().openPage(Menu.KARAOKE);
			app.getHomePageHelper().addForm();	
			pageManager.karaoke
			.setName("UI_Test_Karaoke_"+rndNum)
			.setExternalId(rndNum)
			.setLocations("Московский");
			pageManager.karaoke
			.addAssertsOTT()
			.setName(rndNum)
			.addAudioPID()
			.setName(rndNum)
			.setPID(rndNum)
			.create();
			pageManager.assetsOTT.create();
			pageManager.karaoke.createAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			pageManager.karaoke
			.openAssetOTT(rndNum)
			.openAudioPID(rndNum)
			.fillForm(audioPid)
			.save();
			pageManager.assetsOTT.save();
			pageManager.karaoke.saveAndClose();
			app.getHomePageHelper().openForm("UI_Test_Karaoke_"+rndNum);
			AudioPidDB actualData = pageManager.karaoke
					.openAssetOTT(rndNum)
					.openAudioPID(audioPid.getName())
					.readForm();
			assertEquals(actualData.toString(), audioPid.toString());
			pageManager.audioPID.close();
			pageManager.assetsOTT.close();
			app.getFormHelper().deleteCard(Form.KARAOKE);	
			
		}
		
}
