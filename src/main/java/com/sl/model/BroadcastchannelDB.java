package com.sl.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;

@DynamicUpdate
@Entity
@Table(name="broadcastchannel")
public class BroadcastchannelDB extends BaseEntity{
	
	
	private static final long serialVersionUID = 6959960215900218332L;
	@Column
	private String number;
	@Column
	private String name;
	@Column
	private String accessLevel;
	@Column
	private String isErotic;
	@Column
	private String isCrypted;
	@Column
	private String externalId;
	@Column
	private String smExternalId;
	@Column
	private String description;
	@Column
	private String locations;
	@Column
	private String viewPVRChannelID;
	@Column
	private String isBarker;
	@Column
	private String url;
	@Column
	private String hqUrl;
	@Column
	private String backupUrl1;
	@Column
	private String backupUrl2;
	@Column
	private String plcUrl;
	@Column
	private String pipUrl;
	@Column
	private String raptorPort;
	@Column
	private String ottDvr;
	@Column
	private String tstvOttURL;
	@Column
	private String plOttURL;
	@Column
	private String promoUrl;
	@Column
	private String smlOttURL;
	@Column
	private String videoServerProtocol;
	@Column
	private String epgOffset;
	@Column
	private String tstvDuration;
	@Column
	private String segmentDuration;
	@Column
	private String isQualityMonitoring;
	@Column
	private String isTestStreamQuality;
	@Column
	private String soundVolume;
	@Column
	private String isDvrCrypted;
	@Column
	private String dvbtChannelName;
	@Column
	private String repChannelName;
	@Column
	private String smartRecorders;
	@Column
	private String channelRestrictLocations;
	@Column
	private String channelInStbFunction;
	@Column
	private String channelInNetworkType;
	@Column
	private String restrictTimeStart;
	@Column
	private String restrictTimeEnd;
	@Column
	private String channelPackages;
	@Column
	private String channelSubjects;
	@Column
	private String bitrate2;
	@Column
	private String nPVRChannelID;
	@Column
	private String tstvType;
	@Column
	private String isNpvrEnabled;
	@Column
	private String isPauseLifeEnabled;
	public String getNumber() {
		return number;
	}
	public BroadcastchannelDB setNumber(String number) {
		this.number = number;
		return this;
	}
	public String getName() {
		return name;
	}
	public BroadcastchannelDB setName(String name) {
		this.name = name;
		return this;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public BroadcastchannelDB setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
		return this;
	}
	public String getIsErotic() {
		return isErotic;
	}
	public BroadcastchannelDB setIsErotic(String isErotic) {
		this.isErotic = isErotic;
		return this;
	}
	public String getIsCrypted() {
		return isCrypted;
	}
	public BroadcastchannelDB setIsCrypted(String isCrypted) {
		this.isCrypted = isCrypted;
		return this;
	}
	public String getExternalId() {
		return externalId;
	}
	public BroadcastchannelDB setExternalId(String externalId) {
		this.externalId = externalId;
		return this;
	}
	public String getSmExternalId() {
		return smExternalId;
	}
	public BroadcastchannelDB setSmExternalId(String smExternalId) {
		this.smExternalId = smExternalId;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public BroadcastchannelDB setDescription(String description) {
		this.description = description;
		return this;
	}
	public String getLocations() {
		return locations;
	}
	public BroadcastchannelDB setLocations(String locations) {
		this.locations = locations;
		return this;
	}
	public String getViewPVRChannelID() {
		return viewPVRChannelID;
	}
	public BroadcastchannelDB setViewPVRChannelID(String viewPVRChannelID) {
		this.viewPVRChannelID = viewPVRChannelID;
		return this;
	}
	public String getIsBarker() {
		return isBarker;
	}
	public BroadcastchannelDB setIsBarker(String isBarker) {
		this.isBarker = isBarker;
		return this;
	}
	public String getUrl() {
		return url;
	}
	public BroadcastchannelDB setUrl(String url) {
		this.url = url;
		return this;
	}
	public String getHqUrl() {
		return hqUrl;
	}
	public BroadcastchannelDB setHqUrl(String hqUrl) {
		this.hqUrl = hqUrl;
		return this;
	}
	public String getBackupUrl1() {
		return backupUrl1;
	}
	public BroadcastchannelDB setBackupUrl1(String backupUrl1) {
		this.backupUrl1 = backupUrl1;
		return this;
	}
	public String getBackupUrl2() {
		return backupUrl2;
	}
	public BroadcastchannelDB setBackupUrl2(String backupUrl2) {
		this.backupUrl2 = backupUrl2;
		return this;
	}
	public String getPlcUrl() {
		return plcUrl;
	}
	public BroadcastchannelDB setPlcUrl(String plcUrl) {
		this.plcUrl = plcUrl;
		return this;
	}
	public String getPipUrl() {
		return pipUrl;
	}
	public BroadcastchannelDB setPipUrl(String pipUrl) {
		this.pipUrl = pipUrl;
		return this;
	}
	public String getRaptorPort() {
		return raptorPort;
	}
	public BroadcastchannelDB setRaptorPort(String raptorPort) {
		this.raptorPort = raptorPort;
		return this;
	}
	public String getOttDvr() {
		return ottDvr;
	}
	public BroadcastchannelDB setOttDvr(String ottDvr) {
		this.ottDvr = ottDvr;
		return this;
	}
	public String getTstvOttURL() {
		return tstvOttURL;
	}
	public BroadcastchannelDB setTstvOttURL(String tstvOttURL) {
		this.tstvOttURL = tstvOttURL;
		return this;
	}
	public String getPlOttURL() {
		return plOttURL;
	}
	public BroadcastchannelDB setPlOttURL(String plOttURL) {
		this.plOttURL = plOttURL;
		return this;
	}
	public String getPromoUrl() {
		return promoUrl;
	}
	public BroadcastchannelDB setPromoUrl(String promoUrl) {
		this.promoUrl = promoUrl;
		return this;
	}
	public String getSmlOttURL() {
		return smlOttURL;
	}
	public BroadcastchannelDB setSmlOttURL(String smlOttURL) {
		this.smlOttURL = smlOttURL;
		return this;
	}
	public String getVideoServerProtocol() {
		return videoServerProtocol;
	}
	public BroadcastchannelDB setVideoServerProtocol(String videoServerProtocol) {
		this.videoServerProtocol = videoServerProtocol;
		return this;
	}
	public String getEpgOffset() {
		return epgOffset;
	}
	public BroadcastchannelDB setEpgOffset(String epgOffset) {
		this.epgOffset = epgOffset;
		return this;
	}
	public String getTstvDuration() {
		return tstvDuration;
	}
	public BroadcastchannelDB setTstvDuration(String tstvDuration) {
		this.tstvDuration = tstvDuration;
		return this;
	}
	public String getSegmentDuration() {
		return segmentDuration;
	}
	public BroadcastchannelDB setSegmentDuration(String segmentDuration) {
		this.segmentDuration = segmentDuration;
		return this;
	}
	public String getIsQualityMonitoring() {
		return isQualityMonitoring;
	}
	public BroadcastchannelDB setIsQualityMonitoring(String isQualityMonitoring) {
		this.isQualityMonitoring = isQualityMonitoring;
		return this;
	}
	public String getIsTestStreamQuality() {
		return isTestStreamQuality;
	}
	public BroadcastchannelDB setIsTestStreamQuality(String isTestStreamQuality) {
		this.isTestStreamQuality = isTestStreamQuality;
		return this;
	}
	public String getSoundVolume() {
		return soundVolume;
	}
	public BroadcastchannelDB setSoundVolume(String soundVolume) {
		this.soundVolume = soundVolume;
		return this;
	}
	public String getIsDvrCrypted() {
		return isDvrCrypted;
	}
	public BroadcastchannelDB setIsDvrCrypted(String isDvrCrypted) {
		this.isDvrCrypted = isDvrCrypted;
		return this;
	}
	public String getDvbtChannelName() {
		return dvbtChannelName;
	}
	public BroadcastchannelDB setDvbtChannelName(String dvbtChannelName) {
		this.dvbtChannelName = dvbtChannelName;
		return this;
	}
	public String getRepChannelName() {
		return repChannelName;
	}
	public BroadcastchannelDB setRepChannelName(String repChannelName) {
		this.repChannelName = repChannelName;
		return this;
	}
	public String getSmartRecorders() {
		return smartRecorders;
	}
	public BroadcastchannelDB setSmartRecorders(String smartRecorders) {
		this.smartRecorders = smartRecorders;
		return this;
	}
	public String getChannelRestrictLocations() {
		return channelRestrictLocations;
	}
	public BroadcastchannelDB setChannelRestrictLocations(String channelRestrictLocations) {
		this.channelRestrictLocations = channelRestrictLocations;
		return this;
	}
	public String getChannelInStbFunction() {
		return channelInStbFunction;
	}
	public BroadcastchannelDB setChannelInStbFunction(String channelInStbFunction) {
		this.channelInStbFunction = channelInStbFunction;
		return this;
	}
	public String getChannelInNetworkType() {
		return channelInNetworkType;
	}
	public BroadcastchannelDB setChannelInNetworkType(String channelInNetworkType) {
		this.channelInNetworkType = channelInNetworkType;
		return this;
	}
	public String getRestrictTimeStart() {
		return restrictTimeStart;
	}
	public BroadcastchannelDB setRestrictTimeStart(String restrictTimeStart) {
		this.restrictTimeStart = restrictTimeStart;
		return this;
	}
	public String getRestrictTimeEnd() {
		return restrictTimeEnd;
	}
	public BroadcastchannelDB setRestrictTimeEnd(String restrictTimeEnd) {
		this.restrictTimeEnd = restrictTimeEnd;
		return this;
	}
	public String getChannelPackages() {
		return channelPackages;
	}
	public BroadcastchannelDB setChannelPackages(String channelPackages) {
		this.channelPackages = channelPackages;
		return this;
	}
	public String getChannelSubjects() {
		return channelSubjects;
	}
	public BroadcastchannelDB setChannelSubjects(String channelSubjects) {
		this.channelSubjects = channelSubjects;
		return this;
	}
	public String getBitrate2() {
		return bitrate2;
	}
	public BroadcastchannelDB setBitrate2(String bitrate2) {
		this.bitrate2 = bitrate2;
		return this;
	}
	public String getNPVRChannelID() {
		return nPVRChannelID;
	}
	public BroadcastchannelDB setNPVRChannelID(String nPVRChannelID) {
		this.nPVRChannelID = nPVRChannelID;
		return this;
	}
	public String getTstvType() {
		return tstvType;
	}
	public BroadcastchannelDB setTstvType(String tstvType) {
		this.tstvType = tstvType;
		return this;
	}
	public String getIsNpvrEnabled() {
		return isNpvrEnabled;
	}
	public BroadcastchannelDB setIsNpvrEnabled(String isNpvrEnabled) {
		this.isNpvrEnabled = isNpvrEnabled;
		return this;
	}
	public String getIsPauseLifeEnabled() {
		return isPauseLifeEnabled;
	}
	public BroadcastchannelDB setIsPauseLifeEnabled(String isPauseLifeEnabled) {
		this.isPauseLifeEnabled = isPauseLifeEnabled;
		return this;
	}
	
	@Override
    public String toString() {
        return "number : " + getNumber() + ";\n" +
        		"name : " + getName() + ";\n" +
        		"accessLevel : " + getAccessLevel() + ";\n" +
        		"isErotic : " + getIsErotic() + ";\n" +
        		"isCrypted : " + getIsCrypted() + ";\n" +
        		"externalId : " + getExternalId() + ";\n" +
        		"smExternalId : " + getSmExternalId() + ";\n" +
        		"description : " + getDescription() + ";\n" +
        		"Locations : " + getLocations() + ";\n" +
        		"viewPVRChannelID : " + getViewPVRChannelID() + ";\n" +
        		"isBarker : " + getIsBarker() + ";\n" +
        		"url : " + getUrl() + ";\n" +
        		"hqUrl : " + getHqUrl() + ";\n" +
        		"backupUrl1 : " + getBackupUrl1() + ";\n" +
        		"backupUrl2 : " + getBackupUrl2() + ";\n" +
        		"plcUrl : " + getPlcUrl() + ";\n" +
        		"pipUrl : " + getPipUrl() + ";\n" +
        		"raptorPort : " + getRaptorPort() + ";\n" +
        		"ottDvr : " + getOttDvr() + ";\n" +
        		"tstvOttURL : " + getTstvOttURL() + ";\n" +
        		"plOttURL : " + getPlOttURL() + ";\n" +
        		"promoUrl : " + getPromoUrl() + ";\n" +
        		"smlOttURL : " + getSmlOttURL() + ";\n" +
        		"videoServerProtocol : " + getVideoServerProtocol() + ";\n" +
        		"epgOffset : " + getEpgOffset() + ";\n" +
        		"tstvDuration : " + getTstvDuration() + ";\n" +
        		"segmentDuration : " + getSegmentDuration() + ";\n" +
        		"isQualityMonitoring : " + getIsQualityMonitoring() + ";\n" +
        		"isTestStreamQuality : " + getIsTestStreamQuality() + ";\n" +
        		"soundVolume : " + getSoundVolume() + ";\n" +
        		"isDvrCrypted : " + getIsDvrCrypted() + ";\n" +
        		"dvbtChannelName : " + getDvbtChannelName() + ";\n" +
        		"repChannelName : " + getRepChannelName() + ";\n" +
        		"smartRecorders : " + getSmartRecorders() + ";\n" +
        		"channelRestrictLocations : " + getChannelRestrictLocations() + ";\n" +
        		"channelInStbFunction : " + getChannelInStbFunction() + ";\n" +
        		"channelInNetworkType : " + getChannelInNetworkType() + ";\n" +
//        		"restrictTimeStart : " + getRestrictTimeStart() + ";\n" +
//        		"restrictTimeEnd : " + getRestrictTimeEnd() + ";\n" +
        		"channelPackages : " + getChannelPackages() + ";\n" +
        		"channelSubjects : " + getChannelSubjects() + ";\n" +
        		"bitrate2 : " + getBitrate2() + ";\n" +
        		"nPVRChannelID : " + getNPVRChannelID() + ";\n" +
        		"tstvType : " + getTstvType() + ";\n" +
        		"isNpvrEnabled : " + getIsNpvrEnabled() + ";\n" +
        		"isPauseLifeEnabled : " + getIsPauseLifeEnabled() + ";\n]";


    }
	
}
