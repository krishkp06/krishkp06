package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.Login;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import projectmaven.BaseClass;

public class StepDef extends BaseClass {
	public WebDriver driver;
	Login login;
	SearchHotel search;
	SelectHotel select;

	@Given("^user is on adactin home page$")
	public void user_is_on_adactin_home_page() throws Exception {

		webdriver();
		max();
		loadurl("https://adactinhotelapp.com/SearchHotel.php");

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Exception {
		login = new Login();
		sendkeys(login.getFndusername(), arg1);
		sendkeys(login.getFndpasswrod(), arg2);

	}

	@When("^clcks login$")
	public void clcks_login() throws Exception {
		click(login.getLogin());

	}

	@When("^user searchs hotels$")
	public void user_searchs_hotels() throws Exception {

		search = new SearchHotel();
		selectbytext(search.getsLnlocation(), "Melbourne");
		selectbytext(search.getSroomtype(), "Double");
		selectbytext(search.getSnorooms(), "3 - Three");
		search.getSlpick().clear();
		sendkeys(search.getSlpick(), "14/02/2022");
		search.getSlpickout().clear();
		sendkeys(search.getSlpickout(), "15/02/2022");
		selectbytext(search.getAdultroomss(), "2 - Two");
		selectbytext(search.getChildroomsf(), "3 - Three");

	}

	@When("^click search hotel$")
	public void click_search_hotel() throws Exception {
		click(search.getSubbmited());
	}

	@When("^user select hotel$")
	public void user_select_hotel() throws Exception {
		select = new SelectHotel();
		click(select.getSelectbtn());

	}

	@When("^click select hotel$")
	public void click_select_hotel() throws Exception {
		click(select.getCtn());

	}

	 @When("^user makes payment$")
	 public void user_makes_payment() throws Exception {
		 
		 sendkeys(element, data);
	

	 }
	//
	//
	// @Then("^orderid id generated$")
	// public void orderid_id_generated() throws Exception {
	// Thread.sleep(6000);
	// WebElement finelementbyid6 = base.finelementbyid("order_no");
	// String getenteredtext = base.getenteredtext(finelementbyid6);
	// System.out.println(getenteredtext);
	// base.takescreenshot("C:\\Users\\krishna\\Desktop\\New
	// folder\\ihgh"+base.timeStamp()+".jpeg");
	//
	// BaseClass.closeallwindow();
	//
	// }
	//
}
