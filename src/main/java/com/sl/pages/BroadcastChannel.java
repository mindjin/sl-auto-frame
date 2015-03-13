package com.sl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sl.model.BroadcastchannelDB;
import com.sl.model.User;
import com.sl.popup.AudioPIDs;
import com.sl.popup.DvbtURL;
import com.sl.popup.MulticastGroup;
import com.sl.popup.OttURL;
import com.sl.popup.Subtitles;
import com.sl.utils.Length;

public class BroadcastChannel extends AnyForm {

	@FindBy(css = "[id='RowForm'] [id='row.name']")
	protected WebElement row_name;

	@FindBy(css = "[id='RowForm'] [id='row.externalId']")
	protected WebElement row_externalId;

	@FindBy(css="[id='RowForm'] [name='row.description'] textarea")
	protected WebElement row_description;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.Locations']")
	protected WebElement states_Locations;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.AudioPIDs']")
	protected WebElement states_AudioPIDs;

	@FindBy(css = "[id='RowForm'] [id='row.smExternalId']")
	protected WebElement row_smExternalId;

	@FindBy(css = "[id='RowForm'] [id='row.isCrypted']")
	protected WebElement row_isCrypted;

	@FindBy(css = "[id='RowForm'] [id='row.restrictTimeStart'] input")
	protected WebElement row_restrictTimeStart;

	@FindBy(css = "[id='RowForm'] [id='row.restrictTimeEnd'] input")
	protected WebElement row_restrictTimeEnd;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.accessLevel'] span")
	protected WebElement row_accessLevel;

	@FindBy(css = "[id='RowForm'] [id='row.isErotic']")
	protected WebElement row_isErotic;

	@FindBy(css = "[id='RowForm'] [id='row.number']")
	protected WebElement row_number;

	@FindBy(css = "[id='RowForm'] [id='row.viewPVRChannelID']")
	protected WebElement row_viewPVRChannelID;

	@FindBy(css = "[id='RowForm'] [id='row.isBarker']")
	protected WebElement row_isBarker;

	@FindBy(css = "[id='RowForm'] [id='row.url']")
	protected WebElement row_url;

	@FindBy(css = "[id='RowForm'] [id='row.hqUrl']")
	protected WebElement row_hqUrl;

	@FindBy(css = "[id='RowForm'] [id='row.backupUrl1']")
	protected WebElement row_backupUrl1;

	@FindBy(css = "[id='RowForm'] [id='row.backupUrl2']")
	protected WebElement row_backupUrl2;

	@FindBy(css = "[id='RowForm'] [id='row.plcUrl']")
	protected WebElement row_plcUrl;

	@FindBy(css = "[id='RowForm'] [id='row.pipUrl']")
	protected WebElement row_pipUrl;

	@FindBy(css = "[id='RowForm'] [id='row.raptorPort']")
	protected WebElement row_raptorPort;

	@FindBy(css = "[id='RowForm'] [id='row.ottDvr']")
	protected WebElement row_ottDvr;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.ChannelOttUrlOverrides']")
	protected WebElement states_ChannelOttUrlOverrides;

	@FindBy(css = "[id='RowForm'] [id='row.tstvOttURL']")
	protected WebElement row_tstvOttURL;

	@FindBy(css = "[id='RowForm'] [id='row.plOttURL']")
	protected WebElement row_plOttURL;

	@FindBy(css = "[id='RowForm'] [id='row.promoUrl']")
	protected WebElement row_promoUrl;

	@FindBy(css = "[id='RowForm'] [id='row.smlOttURL']")
	protected WebElement row_smlOttURL;

	@FindBy(css = "[id='RowForm'] [id='s2id_row.videoServerProtocol'] span")
	protected WebElement row_videoServerProtocol;

	@Length(24)
	@FindBy(css = "[id='RowForm'] [id='row.epgOffset']")
	protected WebElement row_epgOffset;

	@FindBy(css = "[id='RowForm'] [id='row.tstvDuration']")
	protected WebElement row_tstvDuration;

	@FindBy(css = "[id='RowForm'] [id='row.segmentDuration']")
	protected WebElement row_segmentDuration;

	@FindBy(css = "[id='RowForm'] [id='row.isQualityMonitoring']")
	protected WebElement row_isQualityMonitoring;

	@FindBy(css = "[id='RowForm'] [id='row.isTestStreamQuality']")
	protected WebElement row_isTestStreamQuality;	

	@FindBy(css = "[id='RowForm'] [id='row.soundVolume']")
	protected WebElement row_soundVolume;

	@FindBy(css = "[id='RowForm'] [id='row.isDvrCrypted']")
	protected WebElement row_isDvrCrypted;

	@FindBy(css = "[id='RowForm'] [id='row.dvbtChannelName']")
	protected WebElement row_dvbtChannelName;

	@FindBy(css = "[id='RowForm'] [id='row.repChannelName']")
	protected WebElement row_repChannelName;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.SmartRecorders']")
	protected WebElement states_smartRecorders;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.ChannelPackages']")
	protected WebElement states_channelPackages;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.ChannelSubjects']")
	protected WebElement states_channelSubjects;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.ChannelRestrictLocations']")
	protected WebElement states_channelRestrictLocations;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.ChannelInStbFunction']")
	protected WebElement states_channelInStbFunction;

	@FindBy(css = "[id='RowForm'] section[name='row.__states.ChannelInNetworkType']")
	protected WebElement states_channelInNetworkType;	
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.SubtitlePIDs']")
	protected WebElement states_SubtitlePIDs;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.ChannelUrlOverrides']")
	protected WebElement states_ChannelUrlOverrides;
	
	@FindBy(css = "[id='RowForm'] section[name='row.__states.DVBtUrls']")
	protected WebElement states_DVBtUrls;
	
	@FindBy(css = "[id='RowForm'] [id='row.nPVRChannelID']")
	protected WebElement row_nPVRChannelID;

	@FindBy(css = "[id='RowForm'] [id='row.tstvType']")
	protected WebElement row_tstvType;

	@FindBy(css = "[id='RowForm'] [id='row.isNpvrEnabled']")
	protected WebElement row_isNpvrEnabled;

	@FindBy(css = "[id='RowForm'] [id='row.isPauseLifeEnabled']")
	protected WebElement row_isPauseLifeEnabled;	

	@FindBy(css = "[id='RowForm'] [id='row.bitrate']")
	protected WebElement row_bitrate2;	
	
	public BroadcastChannel(PageManager pageManager) {
		super(pageManager);		
	}
	
	public BroadcastChannel setName(String value) {
		type(row_name, value);
		User.setNameForm(value);
		return this;		
	}
	
	public BroadcastChannel setNumber(String value){		
		type(row_number, value);
		return this;
		
	}
	
	public BroadcastChannel setLocations(String value) {
		pageManager.getList2List(states_Locations).addValue(value);
		return this;
	}		
	
	public AudioPIDs addAudioPID() {	
		pageManager.getLinkedList(states_AudioPIDs).add();
		return pageManager.audioPIDs;
	}

	public AudioPIDs openAudioPID(String value) {
		pageManager.getLinkedList(states_AudioPIDs).openValueLink(value);
		return pageManager.audioPIDs;
		
	}
	
	public Subtitles addSubtitles(){
		pageManager.getLinkedList(states_SubtitlePIDs).add();
		return pageManager.subtitles;
	}
	
	public Subtitles openSubtitles(String value){
		pageManager.getLinkedList(states_SubtitlePIDs).openValueLink(value);
		return pageManager.subtitles;
	}

	public MulticastGroup openMulticastGroup(String value) {
		pageManager.getLinkedList(states_ChannelUrlOverrides).openValueLink(value);
		return pageManager.multicastGroup;
		
	}

	public MulticastGroup addMulticastGroup() {
		pageManager.getLinkedList(states_ChannelUrlOverrides).add();
		return pageManager.multicastGroup;
		
	}
	
	public OttURL addOttURL(){
		pageManager.getLinkedList(states_ChannelOttUrlOverrides).add();
		return pageManager.ottUrl;
	}
	
	public OttURL openOttURL(String value){
		pageManager.getLinkedList(states_ChannelOttUrlOverrides).openValueLink(value);
		return pageManager.ottUrl;
	}
	
	public DvbtURL addDvbtURL(){
		pageManager.getLinkedList(states_DVBtUrls).add();
		return pageManager.dvbtUrl;
	}
	public DvbtURL openDvbtURL(String value){
		pageManager.getLinkedList(states_DVBtUrls).openValueLink(value);
		return pageManager.dvbtUrl;
	}
	
	public BroadcastChannel fillForm(BroadcastchannelDB broadDB){
		
		setTextfieldKeys(row_name, broadDB.getName()); 
		setTextfieldKeys(row_externalId, broadDB.getExternalId()); 
		setTextfieldKeys(row_description, broadDB.getDescription()); 
		setList2listKeys(states_Locations, broadDB.getLocations());
		setTextfieldKeys(row_smExternalId, broadDB.getSmExternalId()); 
		setCheckboxKeys(row_isCrypted, broadDB.getIsCrypted()); 
		setTextfieldKeys(row_restrictTimeStart, broadDB.getRestrictTimeStart()); 
		setTextfieldKeys(row_restrictTimeEnd, broadDB.getRestrictTimeEnd()); 
		setComboboxKeys(row_accessLevel, broadDB.getAccessLevel()); 
		setCheckboxKeys(row_isErotic, broadDB.getIsErotic()); 
		setTextfieldKeys(row_number, broadDB.getNumber()); 
		setTextfieldKeys(row_viewPVRChannelID, broadDB.getViewPVRChannelID()); 
		setCheckboxKeys(row_isBarker, broadDB.getIsBarker()); 
		setTextfieldKeys(row_url, broadDB.getUrl()); 
		setTextfieldKeys(row_hqUrl, broadDB.getHqUrl()); 
		setTextfieldKeys(row_backupUrl1, broadDB.getBackupUrl1()); 
		setTextfieldKeys(row_backupUrl2, broadDB.getBackupUrl2()); 
		setTextfieldKeys(row_plcUrl, broadDB.getPlcUrl()); 
		setTextfieldKeys(row_pipUrl, broadDB.getPipUrl()); 
		setTextfieldKeys(row_raptorPort, broadDB.getRaptorPort()); 
		setCheckboxKeys(row_ottDvr, broadDB.getOttDvr());
		setTextfieldKeys(row_tstvOttURL, broadDB.getTstvOttURL()); 
		setTextfieldKeys(row_plOttURL, broadDB.getPlOttURL()); 
		setTextfieldKeys(row_promoUrl, broadDB.getPromoUrl()); 
		setTextfieldKeys(row_smlOttURL, broadDB.getSmlOttURL()); 
		setComboboxKeys(row_videoServerProtocol, broadDB.getVideoServerProtocol()); 
		setTextfieldKeys(row_epgOffset, broadDB.getEpgOffset()); 
		setTextfieldKeys(row_tstvDuration, broadDB.getTstvDuration()); 
		setTextfieldKeys(row_segmentDuration, broadDB.getSegmentDuration()); 
		setCheckboxKeys(row_isQualityMonitoring, broadDB.getIsQualityMonitoring()); 
		setCheckboxKeys(row_isTestStreamQuality, broadDB.getIsTestStreamQuality()); 	
		setTextfieldKeys(row_soundVolume, broadDB.getSoundVolume()); 
		setCheckboxKeys(row_isDvrCrypted, broadDB.getIsDvrCrypted()); 
		setTextfieldKeys(row_dvbtChannelName, broadDB.getDvbtChannelName()); 
		setTextfieldKeys(row_repChannelName, broadDB.getRepChannelName()); 
		setList2listKeys(states_smartRecorders, broadDB.getSmartRecorders()); 
		setList2listKeys(states_channelPackages, broadDB.getChannelPackages()); 
		setList2listKeys(states_channelSubjects, broadDB.getChannelSubjects()); 
		setList2listKeys(states_channelRestrictLocations, broadDB.getChannelRestrictLocations()); 
		setList2listKeys(states_channelInStbFunction, broadDB.getChannelInStbFunction()); 
		setList2listKeys(states_channelInNetworkType, broadDB.getChannelInNetworkType()); 	
		setTextfieldKeys(row_nPVRChannelID, broadDB.getNPVRChannelID()); 
		setCheckboxKeys(row_tstvType, broadDB.getTstvType()); 
		setCheckboxKeys(row_isNpvrEnabled, broadDB.getIsNpvrEnabled()); 
		setCheckboxKeys(row_isPauseLifeEnabled, broadDB.getIsPauseLifeEnabled()); 	
		setTextfieldKeys(row_bitrate2, broadDB.getBitrate2()); 	
		return this;
	}
	
	public BroadcastchannelDB readForm(){
		BroadcastchannelDB broadDB = new BroadcastchannelDB();
		broadDB.setName(insideTab(row_name).getAttribute("value")); 
		broadDB.setExternalId(insideTab(row_externalId).getAttribute("value")); 
		broadDB.setDescription(insideTab(row_description).getAttribute("value")); 
		broadDB.setLocations(pageManager.getList2List(states_Locations).getValue());
		broadDB.setSmExternalId(insideTab(row_smExternalId).getAttribute("value")); 
		broadDB.setIsCrypted(pageManager.getCheckbox(row_isCrypted).getStatus()); 
		broadDB.setRestrictTimeStart(insideTab(row_restrictTimeStart).getAttribute("value")); 
		broadDB.setRestrictTimeEnd(insideTab(row_restrictTimeEnd).getAttribute("value")); 
		broadDB.setAccessLevel(insideTab(row_accessLevel).getText()); 
		broadDB.setIsErotic(pageManager.getCheckbox(row_isErotic).getStatus()); 
		broadDB.setNumber(insideTab(row_number).getAttribute("value")); 
		broadDB.setViewPVRChannelID(insideTab(row_viewPVRChannelID).getAttribute("value")); 
		broadDB.setIsBarker(pageManager.getCheckbox(row_isBarker).getStatus()); 
		broadDB.setUrl(insideTab(row_url).getAttribute("value")); 
		broadDB.setHqUrl(insideTab(row_hqUrl).getAttribute("value")); 
		broadDB.setBackupUrl1(insideTab(row_backupUrl1).getAttribute("value")); 
		broadDB.setBackupUrl2(insideTab(row_backupUrl2).getAttribute("value")); 
		broadDB.setPlcUrl(insideTab(row_plcUrl).getAttribute("value")); 
		broadDB.setPipUrl(insideTab(row_pipUrl).getAttribute("value")); 
		broadDB.setRaptorPort(insideTab(row_raptorPort).getAttribute("value")); 
		broadDB.setOttDvr(pageManager.getCheckbox(row_ottDvr).getStatus());
		broadDB.setTstvOttURL(insideTab(row_tstvOttURL).getAttribute("value")); 
		broadDB.setPlOttURL(insideTab(row_plOttURL).getAttribute("value")); 
		broadDB.setPromoUrl(insideTab(row_promoUrl).getAttribute("value")); 
		broadDB.setSmlOttURL(insideTab(row_smlOttURL).getAttribute("value")); 
		broadDB.setVideoServerProtocol(insideTab(row_videoServerProtocol).getText()); 
		broadDB.setEpgOffset(insideTab(row_epgOffset).getAttribute("value")); 
		broadDB.setTstvDuration(insideTab(row_tstvDuration).getAttribute("value")); 
		broadDB.setSegmentDuration(insideTab(row_segmentDuration).getAttribute("value")); 
		broadDB.setIsQualityMonitoring(pageManager.getCheckbox(row_isQualityMonitoring).getStatus()); 
		broadDB.setIsTestStreamQuality(pageManager.getCheckbox(row_isTestStreamQuality).getStatus()); 	
		broadDB.setSoundVolume(insideTab(row_soundVolume).getAttribute("value")); 
		broadDB.setIsDvrCrypted(pageManager.getCheckbox(row_isDvrCrypted).getStatus()); 
		broadDB.setDvbtChannelName(insideTab(row_dvbtChannelName).getAttribute("value")); 
		broadDB.setRepChannelName(insideTab(row_repChannelName).getAttribute("value")); 
		broadDB.setSmartRecorders(pageManager.getList2List(states_smartRecorders).getValue()); 
		broadDB.setChannelPackages(pageManager.getList2List(states_channelPackages).getValue()); 
		broadDB.setChannelSubjects(pageManager.getList2List(states_channelSubjects).getValue()); 
		broadDB.setChannelRestrictLocations(pageManager.getList2List(states_channelRestrictLocations).getValue()); 
		broadDB.setChannelInStbFunction(pageManager.getList2List(states_channelInStbFunction).getValue()); 
		broadDB.setChannelInNetworkType(pageManager.getList2List(states_channelInNetworkType).getValue()); 	
		broadDB.setNPVRChannelID(insideTab(row_nPVRChannelID).getAttribute("value")); 
		broadDB.setTstvType(pageManager.getCheckbox(row_tstvType).getStatus()); 
		broadDB.setIsNpvrEnabled(pageManager.getCheckbox(row_isNpvrEnabled).getStatus()); 
		broadDB.setIsPauseLifeEnabled(pageManager.getCheckbox(row_isPauseLifeEnabled).getStatus()); 	
		broadDB.setBitrate2(insideTab(row_bitrate2).getAttribute("value")); 	
		return broadDB;
	}

}
