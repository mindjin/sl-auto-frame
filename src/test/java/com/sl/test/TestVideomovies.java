package com.sl.test;

import static com.sl.pages.PageManager.Form.VIDEOMOVIE;
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
import com.sl.model.ContentContractsDB;
import com.sl.model.ContentInPurchaseMDB;
import com.sl.model.OttPreviewAssetsDB;
import com.sl.model.PreviewAssetsDB;
import com.sl.model.VideomoviesDB;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.DataProviderUtils;
import com.sl.utils.ElementScreenshot;


@Listeners(ElementScreenshot.class)
public class TestVideomovies extends ConfigBase {
	
	@Entity(entity=VideomoviesDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void fillMoviesForm(VideomoviesDB movies){
		rndNum = RandomValues.rndNumb(999999);	
		movies.setName("UI_Test_Videomovies_"+rndNum);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);		
		app.getHomePageHelper().addForm();
		pageManager.videomovies.fillForm(movies).createAndClose();
		app.getHomePageHelper().openForm(movies.getName());
		VideomoviesDB actualData = pageManager.videomovies.readForm();
		assertEquals( actualData.toString(), movies.toString());
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Entity(entity=AssetsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAssetsWithFillForm(AssetsDB assets) throws Exception{
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addAssets().fillForm(assets).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AssetsDB actualData = pageManager.videomovies.openAsset(assets.getName()).readForm();
		assertEquals( actualData.toString(), assets.toString());
		pageManager.assets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
		
	}
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDinAssetsWithFillForm(AudioPidDB audioPid) throws Exception{
		rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addAssets().setName(rndNum)
		.addAudioPID().fillForm(audioPid).create();
		pageManager.assets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openAsset(rndNum)
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		pageManager.assets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Entity(entity=PreviewAssetsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createPreviewAssetsWithFillForm(PreviewAssetsDB previewAssets) throws Exception{	
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addPreviewAssets().fillForm(previewAssets).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		PreviewAssetsDB actualData = pageManager.videomovies.openPreviewAssets(previewAssets.getName()).readForm();
		assertEquals( actualData.toString(), previewAssets.toString());
		pageManager.previewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDinPreviewAssetsWithFillForm(AudioPidDB audioPid) throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addPreviewAssets().setName(rndNum)
		.addAudioPID().fillForm(audioPid).create();
		pageManager.assets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openPreviewAssets(rndNum)
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		pageManager.previewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Entity(entity=AssetsOttDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAssetsOTTWithFillForm(AssetsOttDB assetsOtt) throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addAssertsOTT().fillForm(assetsOtt).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AssetsOttDB actualData = pageManager.videomovies.openAssetOTT(assetsOtt.getName()).readform();
		assertEquals( actualData.toString(), assetsOtt.toString());
		pageManager.assetsOTT.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDinAssetsOTTWithFillForm(AudioPidDB audioPid) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addAssertsOTT()
		.setName(rndNum)
		.addAudioPID().fillForm(audioPid).create();
		pageManager.assetsOTT.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openAssetOTT(rndNum)
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		pageManager.assetsOTT.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	@Entity(entity=OttPreviewAssetsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createPreviewAssetsOTTWithFillForm(OttPreviewAssetsDB ottPreviewAssets) throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addOttPreviewAssets().fillForm(ottPreviewAssets).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		OttPreviewAssetsDB actualData = pageManager.videomovies.openOttPreviewAssets(ottPreviewAssets.getName()).readForm();
		assertEquals( actualData.toString(), ottPreviewAssets.toString());
		pageManager.ottPreviewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDinPreviewAssetsOTTWithFillForm(AudioPidDB audioPid) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addOttPreviewAssets()
		.setName(rndNum)
		.addAudioPID().fillForm(audioPid).create();
		pageManager.ottPreviewAssets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openOttPreviewAssets(rndNum)
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		pageManager.assetsOTT.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDWithFillForm(AudioPidDB audioPid) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addAudioPID().fillForm(audioPid).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	@Entity(entity=ContentContractsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createContentContractsWithFillForm(ContentContractsDB contentContracts) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addContentContracts().setContentContract("wp_Delete").fillForm(contentContracts).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		ContentContractsDB actualData = pageManager.videomovies
		.openContentContracts("wp_Delete").readForm();
		assertEquals( actualData.toString(), contentContracts.toString());
		pageManager.contentContracts.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	
	@Entity(entity=ContentInPurchaseMDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createContentContractsPurchaseWithFillForm(ContentInPurchaseMDB contentInPurchase) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addContentInPurchaseM().fillForm(contentInPurchase).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		ContentInPurchaseMDB actualData = pageManager.videomovies
		.openContentInPurchaseM(contentInPurchase.getPurchaseMethod()).readForm();
		assertEquals( actualData.toString(), contentInPurchase.toString());
		pageManager.contentInPurchaseM.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	@Entity(entity=VideomoviesDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void fillMoviesFormAndSave(VideomoviesDB movies){		
		rndNum = RandomValues.rndNumb(999999);
		movies.setName("UI_Test_Videomovies_"+rndNum);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);		
		app.getHomePageHelper().addForm();
		pageManager.videomovies
		.setName(rndNum)
		.setLocations("Московский").createAndClose();
		app.getHomePageHelper().openForm(rndNum);		;	
		pageManager.videomovies.fillForm(movies).saveAndClose();
		app.getHomePageHelper().openForm(movies.getName());
		VideomoviesDB actualData = pageManager.videomovies.readForm();
		assertEquals( actualData.toString(), movies.toString());
		app.getFormHelper().deleteCard(VIDEOMOVIE);		
	}
	
	@Entity(entity=AssetsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAssetsWithFillFormAndSave(AssetsDB assets) throws Exception{	
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addAssets().setName(rndNum).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openAsset(rndNum).fillForm(assets).save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AssetsDB actualData = pageManager.videomovies.openAsset(assets.getName()).readForm();
		assertEquals( actualData.toString(), assets.toString());
		pageManager.assets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDinAssetsWithFillFormAndSave(AudioPidDB audioPid) throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский")
		.addAssets()
		.setName(rndNum)
		.addAudioPID()
		.setName(rndNum)
		.setPID(rndNum)
		.create();
		pageManager.assets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openAsset(rndNum).openAudioPID(rndNum).fillForm(audioPid)
		.save();
		pageManager.assets.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openAsset(rndNum)
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		pageManager.assets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Entity(entity=PreviewAssetsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createPreviewAssetsWithFillFormAndSave(PreviewAssetsDB previewAssets) throws Exception{	
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский").addPreviewAssets().setName(rndNum).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openPreviewAssets(rndNum).fillForm(previewAssets).save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		PreviewAssetsDB actualData = pageManager.videomovies.openPreviewAssets(previewAssets.getName()).readForm();
		assertEquals( actualData.toString(), previewAssets.toString());
		pageManager.previewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDinPreviewAssetsWithFillFormAndSave(AudioPidDB audioPid) throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский")
		.addPreviewAssets()
		.setName(rndNum)
		.addAudioPID()
		.setName(rndNum)
		.setPID(rndNum)
		.create();
		pageManager.previewAssets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openPreviewAssets(rndNum).openAudioPID(rndNum).fillForm(audioPid).save();
		pageManager.previewAssets.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openPreviewAssets(rndNum)
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		pageManager.previewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	
	
	@Entity(entity=AssetsOttDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAssetsOTTWithFillFormAndSave(AssetsOttDB assetsOtt) throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addAssertsOTT().setName(rndNum).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openAssetOTT(rndNum).fillForm(assetsOtt).save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AssetsOttDB actualData = pageManager.videomovies.openAssetOTT(assetsOtt.getName()).readform();
		assertEquals( actualData.toString(), assetsOtt.toString());
		pageManager.assetsOTT.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDinAssetsOTTWithFillFormAndSave(AudioPidDB audioPid) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addAssertsOTT()
		.setName(rndNum)
		.addAudioPID().setName(rndNum).setPID(rndNum).create();
		pageManager.assetsOTT.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openAssetOTT(rndNum)
		.openAudioPID(rndNum).fillForm(audioPid).save();
		pageManager.assetsOTT.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openAssetOTT(rndNum)
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		pageManager.assetsOTT.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	
	@Entity(entity=OttPreviewAssetsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createOttPreviewAssetsWithFillFormandSave(OttPreviewAssetsDB ottPreviewAssets) throws Exception{	
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский").addOttPreviewAssets().setName(rndNum).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openOttPreviewAssets(rndNum).fillForm(ottPreviewAssets).save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		OttPreviewAssetsDB actualData = pageManager.videomovies.openOttPreviewAssets(ottPreviewAssets.getName()).readForm();
		assertEquals( actualData.toString(), ottPreviewAssets.toString());
		pageManager.ottPreviewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDinOttPreviewAssetsWithFillFormandSave(AudioPidDB audioPid) throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский")
		.addOttPreviewAssets()
		.setName(rndNum)
		.addAudioPID()
		.setName(rndNum)
		.setPID(rndNum)
		.create();
		pageManager.ottPreviewAssets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openOttPreviewAssets(rndNum).openAudioPID(rndNum).fillForm(audioPid).save();
		pageManager.ottPreviewAssets.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openOttPreviewAssets(rndNum)
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		pageManager.ottPreviewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Entity(entity=AudioPidDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createAudioPIDWithFillFormAndSave(AudioPidDB audioPid) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addAudioPID().setName(rndNum).setPID(rndNum).create().createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openAudioPID(rndNum).fillForm(audioPid).save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		AudioPidDB actualData = pageManager.videomovies
		.openAudioPID(audioPid.getName()).readForm();
		assertEquals( actualData.toString(), audioPid.toString());
		pageManager.audioPID.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	@Entity(entity=ContentContractsDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createContentContractsWithFillFormAndSave(ContentContractsDB contract) throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский").addContentContracts().setContentContract("wp_Delete").create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openContentContracts("wp_Delete").fillForm(contract)
		.save()
		.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		ContentContractsDB actualData = pageManager.videomovies
		.openContentContracts("wp_Delete").readForm();
		assertEquals( actualData.toString(), contract.toString());
		pageManager.contentContracts.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	@Entity(entity=ContentInPurchaseMDB.class, ids = 1)
	@Test(dataProviderClass=DataProviderUtils.class, dataProvider=GENERIC_DP)
	public void createContentContractsPurchaseWithFillFormAndSave(ContentInPurchaseMDB contentInPurchase) throws Exception{
		rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addContentInPurchaseM().setPurchaseMethod("Покупка EST").setSort(rndNum).create().createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openContentInPurchaseM("Покупка EST").fillForm(contentInPurchase).save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		ContentInPurchaseMDB actualData = pageManager.videomovies
		.openContentInPurchaseM(contentInPurchase.getPurchaseMethod()).readForm();
		assertEquals( actualData.toString(), contentInPurchase.toString());
		pageManager.contentInPurchaseM.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);	
	
	}
}
