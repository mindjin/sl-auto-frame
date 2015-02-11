package com.sl.test;

import static com.sl.pages.PageManager.Form.*;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sl.applogic.DataHelper.ElementsForm;
import com.sl.conf.ConfigBase;
import com.sl.data.Element;
import com.sl.data.RandomValues;
import com.sl.pages.HomePage.Menu;
import com.sl.pages.PageManager.Form;
import com.sl.utils.ElementScreenshot;


@Listeners(ElementScreenshot.class)
public class TestVideomovies extends ConfigBase {
	
	@Test
	public void fillMoviesForm(){
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);		
		app.getHomePageHelper().addForm();
		List<Element> randomVM = app.getDataHelper().getRandomValues(VIDEOMOVIE);
		app.getFormHelper().fillForm(randomVM, VIDEOMOVIE);		
		pageManager.promoActions.createAndClose();
		app.getHomePageHelper().openForm(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(randomVM, VIDEOMOVIE);
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Test
	public void createAssetsWithFillForm() throws Exception{	
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addAssets();
		List<Element> defaultValuesAssets = app.getDataHelper().getRandomValues(ASSETS);
		app.getFormHelper().fillForm(defaultValuesAssets,ASSETS);
		pageManager.assets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openAsset(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAssets,ASSETS);
		pageManager.assets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Test
	public void createAudioPIDinAssetsWithFillForm() throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addAssets().setName(rndNum)
		.addAudioPID();
		List<Element> defaultValuesAudioPID = app.getDataHelper().getRandomValues(AUDIOPID);
		app.getFormHelper().fillForm(defaultValuesAudioPID, AUDIOPID);
		pageManager.audioPID.create();
		pageManager.assets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openAsset(rndNum)
		.openAudioPID(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAudioPID,AUDIOPID);
		pageManager.audioPID.close();
		pageManager.assets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Test
	public void createPreviewAssetsWithFillForm() throws Exception{	
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addPreviewAssets();
		List<Element> defaultValuesAssets = app.getDataHelper().getRandomValues(PREVIEWASSETS);
		app.getFormHelper().fillForm(defaultValuesAssets, PREVIEWASSETS);
		pageManager.previewAssets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openPreviewAssets(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAssets, PREVIEWASSETS);
		pageManager.previewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Test
	public void createAudioPIDinPreviewAssetsWithFillForm() throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addPreviewAssets().setName(rndNum)
		.addAudioPID();
		List<Element> defaultValuesAudioPID = app.getDataHelper().getRandomValues(AUDIOPID);
		app.getFormHelper().fillForm(defaultValuesAudioPID, AUDIOPID);
		pageManager.audioPID.create();
		pageManager.assets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openPreviewAssets(rndNum)
		.openAudioPID(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAudioPID,AUDIOPID);
		pageManager.audioPID.close();
		pageManager.previewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Test
	public void createAssetsOTTWithFillForm() throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addAssertsOTT();
		List<Element> defaultValuesAssetsOTT = app.getDataHelper().getRandomValues(ASSETSOTT);
		app.getFormHelper().fillForm(defaultValuesAssetsOTT,ASSETSOTT);
		pageManager.assetsOTT.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openAssetOTT(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAssetsOTT,ASSETSOTT);
		pageManager.assetsOTT.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Test
	public void createAudioPIDinAssetsOTTWithFillForm() throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addAssertsOTT()
		.setName(rndNum)
		.addAudioPID();
		List<Element> defaultValuesAssetsOTT = app.getDataHelper().getRandomValues(Form.AUDIOPID);
		app.getFormHelper().fillForm(defaultValuesAssetsOTT, Form.AUDIOPID);
		pageManager.audioPID.create();
		pageManager.assetsOTT.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openAssetOTT(rndNum)
		.openAudioPID(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAssetsOTT, Form.AUDIOPID);
		pageManager.audioPID.close();
		pageManager.assetsOTT.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	@Test
	public void createPreviewAssetsOTTWithFillForm() throws Exception{
	rndNum =RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addOttPreviewAssets();
		List<Element> defaultPreviewAssets = app.getDataHelper().getRandomValues(OTTPREVIEWASSETS);
		app.getFormHelper().fillForm(defaultPreviewAssets,OTTPREVIEWASSETS);
		pageManager.ottPreviewAssets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openOttPreviewAssets(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultPreviewAssets,OTTPREVIEWASSETS);
		pageManager.ottPreviewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	
	@Test
	public void createAudioPIDinPreviewAssetsOTTWithFillForm() throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.addOttPreviewAssets()
		.setName(rndNum)
		.addAudioPID();
		List<Element> defaultAudioPID = app.getDataHelper().getRandomValues(Form.AUDIOPID);
		app.getFormHelper().fillForm(defaultAudioPID, Form.AUDIOPID);
		pageManager.audioPID.create();
		pageManager.ottPreviewAssets.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openOttPreviewAssets(rndNum)
		.openAudioPID(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultAudioPID, Form.AUDIOPID);
		pageManager.audioPID.close();
		pageManager.assetsOTT.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	
	@Test
	public void createAudioPIDWithFillForm() throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addAudioPID();
		List<Element> defaultAudioPID = app.getDataHelper().getRandomValues(Form.AUDIOPID);
		app.getFormHelper().fillForm(defaultAudioPID, Form.AUDIOPID);
		pageManager.audioPID.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openAudioPID(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultAudioPID, Form.AUDIOPID);
		pageManager.audioPID.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	@Test
	public void createContentContractsWithFillForm() throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addContentContracts();
		List<Element> defaultContentContracts = app.getDataHelper().getRandomValues(Form.CONTENTCONTRACTS);
		app.getFormHelper().fillForm(defaultContentContracts, Form.CONTENTCONTRACTS);
		pageManager.contentContracts.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openContentContracts(ElementsForm.CONTENTCONTRACT.getValue());
		app.getFormHelper().verifyForm(defaultContentContracts, Form.CONTENTCONTRACTS);
		pageManager.contentContracts.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	@Test
	public void createContentContractsPurchaseWithFillForm() throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addContentInPurchaseM();
		List<Element> defaultContentInPurchaseM = app.getDataHelper().getRandomValues(Form.CONTENTINPURCHASEM);
		app.getFormHelper().fillForm(defaultContentInPurchaseM, Form.CONTENTINPURCHASEM);
		pageManager.contentInPurchaseM.create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openContentInPurchaseM(ElementsForm.CONTENTINPURCHASEM.getValue());
		app.getFormHelper().verifyForm(defaultContentInPurchaseM, Form.CONTENTINPURCHASEM);
		pageManager.contentInPurchaseM.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	@Test
	public void fillMoviesFormAndSave(){		
		rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);		
		app.getHomePageHelper().addForm();
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский").createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		List<Element> randomVM = app.getDataHelper().getRandomValues(VIDEOMOVIE);
		app.getFormHelper().fillForm(randomVM, VIDEOMOVIE);		
		pageManager.promoActions.saveAndClose();
		app.getHomePageHelper().openForm(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(randomVM, VIDEOMOVIE);
		app.getFormHelper().deleteCard(VIDEOMOVIE);		
	}
	
	@Test
	public void createAssetsWithFillFormandSave() throws Exception{	
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");			
		pageManager.videomovies.addAssets().setName(rndNum).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openAsset(rndNum);
		List<Element> defaultValuesAssets = app.getDataHelper().getRandomValues(ASSETS);
		app.getFormHelper().fillForm(defaultValuesAssets,ASSETS);
		pageManager.assets.save();
		pageManager.videomovies.saveAndClose();;
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openAsset(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAssets,ASSETS);
		pageManager.assets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Test
	public void createAudioPIDinAssetsWithFillFormAndSave() throws Exception{
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
		pageManager.videomovies.openAsset(rndNum).openAudioPID(rndNum);
		List<Element> defaultValuesAudioPID = app.getDataHelper().getRandomValues(AUDIOPID);
		app.getFormHelper().fillForm(defaultValuesAudioPID, AUDIOPID);
		pageManager.audioPID.save();
		pageManager.assets.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openAsset(rndNum)
		.openAudioPID(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAudioPID,AUDIOPID);
		pageManager.audioPID.close();
		pageManager.assets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	@Test
	public void createPreviewAssetsWithFillFormandSave() throws Exception{	
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский").addPreviewAssets().setName(rndNum).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openPreviewAssets(rndNum);
		List<Element> defaultValuesPreviewAssets = app.getDataHelper().getRandomValues(PREVIEWASSETS);
		app.getFormHelper().fillForm(defaultValuesPreviewAssets,PREVIEWASSETS);
		pageManager.previewAssets.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openPreviewAssets(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesPreviewAssets,PREVIEWASSETS);
		pageManager.previewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Test
	public void createAudioPIDinPreviewAssetsWithFillFormandSave() throws Exception{
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
		pageManager.videomovies.openPreviewAssets(rndNum).openAudioPID(rndNum);
		List<Element> defaultValuesAudioPID = app.getDataHelper().getRandomValues(AUDIOPID);
		app.getFormHelper().fillForm(defaultValuesAudioPID, AUDIOPID);
		pageManager.audioPID.save();
		pageManager.previewAssets.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openPreviewAssets(rndNum)
		.openAudioPID(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAudioPID,AUDIOPID);
		pageManager.audioPID.close();
		pageManager.previewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	@Test
	public void createOttPreviewAssetsWithFillFormandSave() throws Exception{	
	rndNum = RandomValues.rndNumb(999999);	
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский").addOttPreviewAssets().setName(rndNum).create();
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openOttPreviewAssets(rndNum);
		List<Element> defaultValuesOttPreviewAssets = app.getDataHelper().getRandomValues(OTTPREVIEWASSETS);
		app.getFormHelper().fillForm(defaultValuesOttPreviewAssets,OTTPREVIEWASSETS);
		pageManager.ottPreviewAssets.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openOttPreviewAssets(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesOttPreviewAssets,OTTPREVIEWASSETS);
		pageManager.ottPreviewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);
	}
	
	@Test
	public void createAudioPIDinOttPreviewAssetsWithFillFormandSave() throws Exception{
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
		pageManager.videomovies.openOttPreviewAssets(rndNum).openAudioPID(rndNum);
		List<Element> defaultValuesAudioPID = app.getDataHelper().getRandomValues(AUDIOPID);
		app.getFormHelper().fillForm(defaultValuesAudioPID, AUDIOPID);
		pageManager.audioPID.save();
		pageManager.ottPreviewAssets.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openOttPreviewAssets(rndNum)
		.openAudioPID(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultValuesAudioPID,AUDIOPID);
		pageManager.audioPID.close();
		pageManager.ottPreviewAssets.close();
		app.getFormHelper().deleteCard(VIDEOMOVIE);			
	}
	@Test
	public void createAudioPIDWithFillFormAndSave() throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addAudioPID().setName(rndNum).setPID(rndNum).create().createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openAudioPID(rndNum);
		List<Element> defaultAudioPID = app.getDataHelper().getRandomValues(Form.AUDIOPID);
		app.getFormHelper().fillForm(defaultAudioPID, Form.AUDIOPID);
		pageManager.audioPID.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openAudioPID(ElementsForm.NAME.getValue());
		app.getFormHelper().verifyForm(defaultAudioPID, Form.AUDIOPID);
		pageManager.audioPID.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	
	@Test
	public void createContentContractsWithFillFormAndSave() throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies.createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.addContentContracts();
		List<Element> defaultContentContracts = app.getDataHelper().getRandomValues(Form.CONTENTCONTRACTS);
		app.getFormHelper().fillForm(defaultContentContracts, Form.CONTENTCONTRACTS);
		pageManager.contentContracts
		.create()
		.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openContentContracts(ElementsForm.CONTENTCONTRACT.getValue());
		app.getFormHelper().verifyForm(defaultContentContracts, Form.CONTENTCONTRACTS);
		pageManager.contentContracts.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);			
	}
	@Test
	public void createContentContractsPurchaseWithFillFormAndSave() throws Exception{
	rndNum = RandomValues.rndNumb(999999);
		app.getNavigationHelper().openPage(Menu.VIDEOMOVIE);
		app.getHomePageHelper().addForm();	
		pageManager.videomovies
		.setName("UI_Test_Videomovies_"+rndNum)
		.setLocations("Московский");
		pageManager.videomovies
		.addContentInPurchaseM().setPurchaseMethod("Покупка EST").setSort(rndNum).create().createAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies.openContentInPurchaseM("Покупка EST");
		List<Element> defaultContentInPurchaseM = app.getDataHelper().getRandomValues(Form.CONTENTINPURCHASEM);
		app.getFormHelper().fillForm(defaultContentInPurchaseM, Form.CONTENTINPURCHASEM);
		pageManager.contentInPurchaseM.save();
		pageManager.videomovies.saveAndClose();
		app.getHomePageHelper().openForm("UI_Test_Videomovies_"+rndNum);
		pageManager.videomovies
		.openContentInPurchaseM(ElementsForm.CONTENTINPURCHASEM.getValue());
		app.getFormHelper().verifyForm(defaultContentInPurchaseM, Form.CONTENTINPURCHASEM);
		pageManager.contentInPurchaseM.close();
		app.getFormHelper().deleteCard(Form.VIDEOMOVIE);	
	
	}
}
