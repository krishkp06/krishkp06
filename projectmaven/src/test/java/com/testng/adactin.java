package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projectmaven.BaseClass;

public class adactin extends BaseClass {
	@BeforeClass
	private void beforeclass() {
		webdriver();
		loadurl("http://adactinhotelapp.com/");
		max();

	}

	@AfterClass
	private void quit() {
		closeallwindow();

	}

	@Parameters({ "username", "password", "location", "room_nos", "roomtypes", "datepick_in", "datepick_out",
			"adult_room", "child_room" })
	@Test
	private void test1(String name, String pass, String maldiv, String three, String superdel, String picdate,
			String picoutdate, String audltsroomss, String chaildroomss) {
		finelementbyid("username").sendKeys(name);
		finelementbyid("password").sendKeys(pass);
		click(finelementbyid("login"));
		finelementbyid("location").sendKeys(maldiv);
		finelementbyid("room_nos").sendKeys(three);
		finelementbyid("room_type").sendKeys(superdel);
		finelementbyid("datepick_in").sendKeys(picdate);
		finelementbyid("datepick_out").sendKeys(picoutdate);
		finelementbyid("adult_room").sendKeys(audltsroomss);
		finelementbyid("child_room").sendKeys(chaildroomss);
		click(finelementbyid("Submit"));

	}

	@Test
	private void test2() {
		click(findbyxpath("//input[@value='2']"));
		click(finelementbyid("continue"));

	}

	@Parameters({ "first_name", "last_name", "address", "cc_num", "cc_type", "cc_exp_month", "cc_exp_year", "cc_cvv" })
	@Test
	private void test3(String firstname, String lastname, String add, String ccnum, String cctype, String expmonth,
			String expyear, String cvvno) {
		finelementbyid("first_name").sendKeys(firstname);
		finelementbyid("last_name").sendKeys(lastname);
		finelementbyid("address").sendKeys(add);
		finelementbyid("cc_num").sendKeys(ccnum);
		finelementbyid("cc_type").sendKeys(cctype);
		finelementbyid("cc_exp_month").sendKeys(expmonth);
		finelementbyid("cc_exp_year").sendKeys(expyear);
		finelementbyid("cc_cvv").sendKeys(cvvno);
		click(finelementbyid("book_now"));

	}

	@Test
	private void test4() throws InterruptedException {
		
		Thread.sleep(6000);
		String attribute = finelementbyid("order_no").getAttribute("value");
		
		click(findbyxpath("//a[contains(text(),'Booked')]"));
		finelementbyid("order_id_text").sendKeys(attribute);
		click(finelementbyid("search_hotel_id"));
		click(findbyxpath("//input[contains(@id,'btn_id_')]"));
		clickokalert();
		System.out.println(findbyxpath("//label[contains(text(),'The')]").getText());
		

	}
}


