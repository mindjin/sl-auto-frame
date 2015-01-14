package com.sl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.menu.KaraokeMP;
import com.sl.menu.VideomoviesMP;
import com.sl.utils.List2Lists;

public class Videomovies extends AnyForm{
	
	@FindBy(id = "row.name")
	WebElement row_name;

	@FindBy(id = "row.year")
	WebElement row_year;

	@FindBy(id = "row.director")
	WebElement row_director;

	@FindBy(id = "row.actors")
	WebElement row_actors;

	@FindBy(css = "[id='row.startDate'] input")
	WebElement row_startDate;

	@FindBy(css = "[id='row.endDate'] input")
	WebElement row_endDate;

	@FindBy(css = "[id = 'row.premiereStartDate'] input")
	WebElement row_premiereStartDate;

	@FindBy(css = "[id = 'row.premiereEndDate'] input")
	WebElement row_premiereEndDate;

	@FindBy(id = "row.newDays")
	WebElement row_newDays;

	@FindBy(css = "section[name='row.__states.countries']")
	WebElement states_countries;

	@FindBy(css = "section[name='row.__states.Billets']")
	WebElement states_billets;

	@FindBy(id = "row.reviewTitle")
	WebElement row_reviewTitle;

	@FindBy(css = "[id='row.reviewDate'] input")
	WebElement row_reviewDate;

	@FindBy(css = "[id = 'row.review'] textarea")
	WebElement row_review;

	@FindBy(css = "section[name='row.__states.Genres']")
	 WebElement states_Genres;

	@FindBy(css = "section[name='row.__states.VodPackages']")
	WebElement states_vodPackages;

	@FindBy(css = "section[name='row.__states.EstVodPackages']")
	WebElement states_estVodPackages;

	@FindBy(css = "section[name='row.__states.VodGroups']")
	WebElement states_vodGroups;

	@FindBy(css = "section[name='row.__states.Locations']")
	WebElement states_Locations;

	@FindBy(css = "section[name='row.__states.LicenseType2']")
	WebElement states_LicenseType2;

	@FindBy(css = "[id='s2id_row.categoryABCDE'] span")
	 WebElement row_categoryABCDE;

	@FindBy(id = "row.originalLang")	
	WebElement row_originalLang;

	@FindBy(id = "row.isDubbedNeeded")
	WebElement row_isDubbedNeeded;

	@FindBy(id = "row.dubbedInfo")
	WebElement row_dubbedInfo;

	@FindBy(css = "[id='s2id_row.contractProgramType'] span")
	WebElement row_contractProgramType;

	@FindBy(id = "row.licenseYear")
	WebElement row_licenseYear;

	@FindBy(css = "section[name='row.__states.ContentBundles']")
	WebElement states_ContentBundles;

	@FindBy(css="[id='row.restrictTimeStart'] input")
	WebElement row_restrictTimeStart;

	@FindBy(css="[id='row.restrictTimeEnd'] input")
	WebElement row_restrictTimeEnd;

	@FindBy(id = "row.originalName")
	WebElement row_originalName;

	@FindBy(css = "[id='s2id_row.accessLevel'] span")
	WebElement row_accessLevel;

	@FindBy(css = "[id='s2id_row.ageLevel'] span")
	WebElement row_ageLevel;

	@FindBy(css = "[id='s2id_row.genre'] span")
	WebElement row_genre;

	@FindBy(id = "row.rating")
	WebElement row_rating;

	@FindBy(id = "row.KinopoiskRating")
	WebElement row_KinopoiskRating;

	@FindBy(id = "row.kinopoiskId")
	WebElement row_kinopoiskId;

	@FindBy(id = "row.imdbRating")
	WebElement row_imdbRating;

	@FindBy(id="row.item")
	WebElement row_item;

	@FindBy(id = "row.appleId")
	WebElement row_appleId;

	@FindBy(id = "row.androidId")
	WebElement row_androidId;

	@FindBy(id = "row.smarttvId")
	WebElement row_smarttvId;

	@FindBy(css = "[id='s2id_row.type3d'] span")
	WebElement row_type3d;

	@FindBy(id = "row.adminDsc")
	WebElement row_adminDsc;

	@FindBy(css = "[id='s2id_row.showcase'] span")
	WebElement row_showcase;

	@FindBy(css = "[id='s2id_row.bonusPriceCategory'] span")
	WebElement row_bonusPriceCategory;

	@FindBy(id="row.distributionCertificate")
	WebElement row_distributionCertificate;

	@FindBy(css="[name='row.description'] textarea")
	WebElement row_description;
		
	@FindBy(id = "row.isCrypted")
	public WebElement row_isCrypted;

	@FindBy(id = "row.isRecommended")
	WebElement row_isRecommended;

	@FindBy(id = "row.ottRecomended")
	WebElement row_ottRecomended;

	@FindBy(id = "row.deleteOnEndDate")
	WebElement row_deleteOnEndDate;

	@FindBy(id = "row.notifySub")
	WebElement row_notifySub;

	@FindBy(id = "row.showAsVod")
	WebElement row_showAsVod;

	@FindBy(id = "row.isErotic")
	WebElement row_isErotic;

	@FindBy(id = "row.isNextEpisode")
	WebElement row_isNextEpisode;

	@FindBy(id = "row.deleteEst")
	WebElement row_deleteEst;

	public Videomovies(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void setName(String value) {
		type(row_name, value);
		name = value;
		
	}
	
	public void setLocations(String value) {
		insideTab(states_Locations);
		List2Lists list2list = new List2Lists(states_Locations, driver);
		list2list.addValue(value);
		
	}
	
	public void setSeason(String value) {
		insideTab(states_ContentBundles);
		List2Lists list2list = new List2Lists(states_ContentBundles, driver);
		list2list.addValue(value);
		
	}
	
public VideomoviesMP saveAndClose(){
		
		footerForm.saveAndClose();
		return new VideomoviesMP(driver);
		
	}

public VideomoviesMP addAndClose() {
	
	
	footerForm.createAndClose();

	return new VideomoviesMP(driver);
	
}
	
	

}
