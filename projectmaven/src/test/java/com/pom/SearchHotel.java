package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projectmaven.BaseClass;

public class SearchHotel extends BaseClass {
	public SearchHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement sLnlocation;

	@FindBy(id = "room_nos")
	private WebElement snorooms;

	@FindBy(id = "room_type")
	private WebElement sroomtype;

	@FindBy(id = "datepick_in")
	private WebElement slpick;

	@FindBy(id = "datepick_out")
	private WebElement slpickout;

	@FindBy(id = "adult_room")
	private WebElement adultroomss;

	@FindBy(id = "child_room")
	private WebElement childroomsf;

	@FindBy(id = "Submit")
	private WebElement subbmited;

	public WebElement getsLnlocation() {
		return sLnlocation;
	}

	public WebElement getSnorooms() {
		return snorooms;
	}

	public WebElement getSroomtype() {
		return sroomtype;
	}

	public WebElement getSlpick() {
		return slpick;
	}

	public WebElement getSlpickout() {
		return slpickout;
	}

	public WebElement getAdultroomss() {
		return adultroomss;
	}

	public WebElement getChildroomsf() {
		return childroomsf;
	}

	public WebElement getSubbmited() {
		return subbmited;
	}

	public void login(String Lnlocationss, String sroomtypess, String snoroomss, String slpickss, String slpickouts,
			String adultroomsss, String childroomsff) {
		selectbytext(getsLnlocation(), Lnlocationss);
		selectbytext(getSroomtype(), sroomtypess);
		selectbytext(getSnorooms(), snoroomss);
		getSlpick().clear();
		sendkeys(getSlpick(), slpickss);
		getSlpickout().clear();
		sendkeys(getSlpickout(), slpickouts);
		selectbytext(getAdultroomss(), adultroomsss);
		selectbytext(getChildroomsf(), childroomsff);
		click(getSubbmited());

	}

}