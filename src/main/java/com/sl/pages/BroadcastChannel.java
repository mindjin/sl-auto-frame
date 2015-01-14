package com.sl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.menu.BroadcastChannelMP;
import com.sl.utils.List2Lists;

public class BroadcastChannel extends AnyForm{
	
	@FindBy(id = "row.number")
	WebElement row_number;

	@FindBy(id = "row.name")
	WebElement row_name;

	@FindBy(css = "[id='s2id_row.accessLevel'] span")
	WebElement row_accessLevel;

	@FindBy(id = "row.viewPVRChannelID")
	WebElement row_viewPVRChannelID;

	@FindBy(id = "row.isBarker")
	WebElement row_isBarker;

	@FindBy(id = "row.isErotic")
	WebElement row_isErotic;

	@FindBy(id = "row.url")
	WebElement row_url;

	@FindBy(id = "row.hqUrl")
	WebElement row_hqUrl;

	@FindBy(id = "row.backupUrl1")
	WebElement row_backupUrl1;

	@FindBy(id = "row.backupUrl2")
	WebElement row_backupUrl2;

	@FindBy(id = "row.plcUrl")
	WebElement row_plcUrl;

	@FindBy(id = "row.pipUrl")
	WebElement row_pipUrl;

	@FindBy(id = "row.raptorPort")
	WebElement row_raptorPort;

	@FindBy(id = "row.ottDvr")
	WebElement row_ottDvr;

	@FindBy(id = "row.ottURL")
	WebElement row_ottURL;

	@FindBy(id = "row.tstvOttURL")
	WebElement row_tstvOttURL;

	@FindBy(id = "row.plOttURL")
	WebElement row_plOttURL;

	@FindBy(id = "row.promoUrl")
	WebElement row_promoUrl;

	@FindBy(id = "row.smlOttURL")
	WebElement row_smlOttURL;

	@FindBy(css = "[id='s2id_row.videoServerProtocol'] span")
	WebElement row_videoServerProtocol;

//	@FindBy(id = "row.epgOffset")
//	WebElement row_epgOffset;

	@FindBy(id = "row.tstvDuration")
	WebElement row_tstvDuration;

	@FindBy(id = "row.segmentDuration")
	WebElement row_segmentDuration;

	@FindBy(id = "row.nPVRChannelID")
	WebElement row_nPVRChannelID;

	@FindBy(id = "row.tstvType")
	WebElement row_tstvType;

	@FindBy(id = "row.isNpvrEnabled")
	WebElement row_isNpvrEnabled;

	@FindBy(id = "row.isPauseLifeEnabled")
	WebElement row_isPauseLifeEnabled;

	@FindBy(id = "row.isQualityMonitoring")
	WebElement row_isQualityMonitoring;

	@FindBy(id = "row.isTestStreamQuality")
	WebElement row_isTestStreamQuality;

	@FindBy(css = "[id='s2id_row.type'] span")
	WebElement row_typeTV;

	@FindBy(css = "[id='s2id_row.page'] span")
	WebElement row_page;

	@FindBy(css = "[id='s2id_row.containerType'] span")
	WebElement row_containerTypeMPEG;

	@FindBy(id = "row.transcoding")
	WebElement row_transcoding;

	@FindBy(css = "[id='row.restrictTimeStart'] input")
	WebElement row_restrictTimeStart;

	@FindBy(css = "[id='row.restrictTimeEnd'] input")
	WebElement row_restrictTimeEnd;

	@FindBy(id = "row.soundVolume")
	WebElement row_soundVolume;

	@FindBy(id = "row.isCrypted")
	WebElement row_isCrypted;

	@FindBy(id = "row.isDvrCrypted")
	WebElement row_isDvrCrypted;

	@FindBy(id = "row.bitrate")
	WebElement row_bitrate;

	@FindBy(id = "row.externalId")
	WebElement row_externalId;

	@FindBy(id = "row.smExternalId")
	WebElement row_smExternalId;

	@FindBy(id = "row.dvbtChannelName")
	WebElement row_dvbtChannelName;

	@FindBy(id = "row.repChannelName")
	WebElement row_repChannelName;

	@FindBy(css="[name='row.description'] textarea")
	WebElement row_description;
		
	@FindBy(css = "section[name='row.__states.SmartRecorders']")
	WebElement states_smartRecorders;

	@FindBy(css = "section[name='row.__states.ChannelPackages']")
	WebElement states_channelPackages;

	@FindBy(css = "section[name='row.__states.ChannelSubjects']")
	WebElement states_channelSubjects;

	@FindBy(css = "section[name='row.__states.Locations']")
	WebElement states_Locations;

	@FindBy(css = "section[name='row.__states.ChannelRestrictLocations']")
	WebElement states_channelRestrictLocations;

	@FindBy(css = "section[name='row.__states.ChannelInStbFunction']")
	WebElement states_channelInStbFunction;

	@FindBy(css = "section[name='row.__states.ChannelInNetworkType']")
	WebElement states_channelInNetworkType;


	public BroadcastChannel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setName(String value) {
		type(row_name, value);
		name = value;
		
	}
	
	public void setNumber(String value){		
		type(row_number, value);
		
	}
	
	public void setLocations(String value) {
		insideTab(states_Locations);
		List2Lists list2list = new List2Lists(states_Locations, driver);
		list2list.addValue(value);
		
	}
	
	
	public BroadcastChannelMP saveAndClose(){
		
		footerForm.saveAndClose();
		return new BroadcastChannelMP(driver);
		
	}

	public BroadcastChannelMP addAndClose() {
	
	
	footerForm.createAndClose();

	return new BroadcastChannelMP(driver);
	
}

}
