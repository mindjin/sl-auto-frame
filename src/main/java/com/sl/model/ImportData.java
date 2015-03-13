package com.sl.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="import_data")
public class ImportData  extends BaseEntity{
	
	
	private static final long serialVersionUID = 924473333901516243L;
	
	@OneToOne
    @JoinColumn(name = "assets", insertable = false, updatable = false)
    private AssetsDB assets;
	@OneToOne
    @JoinColumn(name = "assetsott", insertable = false, updatable = false)
    private AssetsOttDB assetsott;
	@OneToOne
    @JoinColumn(name = "audiopid", insertable = false, updatable = false)
    private AudioPidDB audiopid;
	@OneToOne
    @JoinColumn(name = "audiopids", insertable = false, updatable = false)
    private AudioPIDsDB audiopids;
	@OneToOne
    @JoinColumn(name = "broadcastchannel", insertable = false, updatable = false)
    private BroadcastchannelDB broadcastchannel;
	@OneToOne
    @JoinColumn(name = "contentcontracts", insertable = false, updatable = false)
    private ContentContractsDB contentcontracts;
	@OneToOne
    @JoinColumn(name = "contentinpurchasem", insertable = false, updatable = false)
    private ContentInPurchaseMDB contentinpurchasem;
	@OneToOne
    @JoinColumn(name = "dvbturl", insertable = false, updatable = false)
    private DvbtUrlDB dvbturl;
	@OneToOne
    @JoinColumn(name = "karaoke", insertable = false, updatable = false)
    private KaraokeDB karaoke;
	@OneToOne
    @JoinColumn(name = "multicastgroup", insertable = false, updatable = false)
    private MulticastGroupDB multicastgroup;
	@OneToOne
    @JoinColumn(name = "ottpreviewassets", insertable = false, updatable = false)
    private OttPreviewAssetsDB ottpreviewassets;
	@OneToOne
    @JoinColumn(name = "otturl", insertable = false, updatable = false)
    private OttUrlDB otturl;
	@OneToOne
    @JoinColumn(name = "previewassets", insertable = false, updatable = false)
    private PreviewAssetsDB previewassets;
	@OneToOne
    @JoinColumn(name = "promoactions", insertable = false, updatable = false)
    private PromoactionsDB promoactions;
	@OneToOne
    @JoinColumn(name = "subtitles", insertable = false, updatable = false)
    private SubtitlesDB subtitles;
	@OneToOne
    @JoinColumn(name = "videomovies", insertable = false, updatable = false)
    private VideomoviesDB videomovies;
	@OneToOne
    @JoinColumn(name = "vodpackage", insertable = false, updatable = false)
    private VodPackageDB vodpackage;
	public AssetsDB getAssets() {
		return assets;
	}
	public void setAssets(AssetsDB assets) {
		this.assets = assets;
	}
	public AssetsOttDB getAssetsott() {
		return assetsott;
	}
	public void setAssetsott(AssetsOttDB assetsott) {
		this.assetsott = assetsott;
	}
	public AudioPidDB getAudiopid() {
		return audiopid;
	}
	public void setAudiopid(AudioPidDB audiopid) {
		this.audiopid = audiopid;
	}
	public AudioPIDsDB getAudiopids() {
		return audiopids;
	}
	public void setAudiopids(AudioPIDsDB audiopids) {
		this.audiopids = audiopids;
	}
	public BroadcastchannelDB getBroadcastchannel() {
		return broadcastchannel;
	}
	public void setBroadcastchannel(BroadcastchannelDB broadcastchannel) {
		this.broadcastchannel = broadcastchannel;
	}
	public ContentContractsDB getContentcontracts() {
		return contentcontracts;
	}
	public void setContentcontracts(ContentContractsDB contentcontracts) {
		this.contentcontracts = contentcontracts;
	}
	public ContentInPurchaseMDB getContentinpurchasem() {
		return contentinpurchasem;
	}
	public void setContentinpurchasem(ContentInPurchaseMDB contentinpurchasem) {
		this.contentinpurchasem = contentinpurchasem;
	}
	public DvbtUrlDB getDvbturl() {
		return dvbturl;
	}
	public void setDvbturl(DvbtUrlDB dvbturl) {
		this.dvbturl = dvbturl;
	}
	public KaraokeDB getKaraoke() {
		return karaoke;
	}
	public void setKaraoke(KaraokeDB karaoke) {
		this.karaoke = karaoke;
	}
	public MulticastGroupDB getMulticastgroup() {
		return multicastgroup;
	}
	public void setMulticastgroup(MulticastGroupDB multicastgroup) {
		this.multicastgroup = multicastgroup;
	}
	public OttPreviewAssetsDB getOttpreviewassets() {
		return ottpreviewassets;
	}
	public void setOttpreviewassets(OttPreviewAssetsDB ottpreviewassets) {
		this.ottpreviewassets = ottpreviewassets;
	}
	public OttUrlDB getOtturl() {
		return otturl;
	}
	public void setOtturl(OttUrlDB otturl) {
		this.otturl = otturl;
	}
	public PreviewAssetsDB getPreviewassets() {
		return previewassets;
	}
	public void setPreviewassets(PreviewAssetsDB previewassets) {
		this.previewassets = previewassets;
	}
	public PromoactionsDB getPromoactions() {
		return promoactions;
	}
	public void setPromoactions(PromoactionsDB promoactions) {
		this.promoactions = promoactions;
	}
	public SubtitlesDB getSubtitles() {
		return subtitles;
	}
	public void setSubtitles(SubtitlesDB subtitles) {
		this.subtitles = subtitles;
	}
	public VideomoviesDB getVideomovies() {
		return videomovies;
	}
	public void setVideomovies(VideomoviesDB videomovies) {
		this.videomovies = videomovies;
	}
	public VodPackageDB getVodpackage() {
		return vodpackage;
	}
	public void setVodpackage(VodPackageDB vodpackage) {
		this.vodpackage = vodpackage;
	}

	
	 @Override
	    public String toString() {
	        return "[assets : " + getAssets() + ";\n" + 
	        		"assetsott : " + getAssetsott() + ";\n" +
	        		"audiopid : " + getAudiopid() + ";\n" +
	        		"audiopids : " + getAudiopids() + ";\n" +
	        		"broadcastchannel : " + getBroadcastchannel() + ";\n" +
	        		"contentcontracts : " + getContentcontracts() + ";\n" +
	        		"contentinpurchasem : " + getContentinpurchasem() + ";\n" +
	        		"dvbturl : " + getDvbturl() + ";\n" +
	        		"karaoke : " + getKaraoke() + ";\n" +
	        		"multicastgroup : " + getMulticastgroup() + ";\n" +
	        		"ottpreviewassets : " + getOttpreviewassets() + ";\n" +
	        		"otturl : " + getOtturl() + ";\n" +
	        		"previewassets : " + getPreviewassets() + ";\n" +
	        		"promoactions : " + getPromoactions() + ";\n" +
	        		"subtitles : " + getSubtitles() + ";\n" +
	        		"videomovies : " + getVideomovies() + ";\n" +
	        		"vodpackage : " + getVodpackage() + ";\n]";
	        
	    }
	
}
