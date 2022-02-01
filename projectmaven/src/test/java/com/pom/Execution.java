package com.pom;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import projectmaven.BaseClass;

public class Execution extends BaseClass {
	static WebDriver driver;

	@BeforeClass
	public static void beforeclass() {
		webdriver();
		loadurl("https://adactinhotelapp.com/SearchHotel.php");
		max();

	}

	@AfterClass
	public static void afterclass() {
		// closeallwindow();

	}

	@Test
	public void test() throws InterruptedException {
		Login login = new Login();
		login.login("krishnaprasath783", "648476");
		Thread.sleep(2000);
		SearchHotel search = new SearchHotel();
		search.login("Adelaide", "Super Deluxe", "5 - Five", "14/02/2022", "15/02/2022", "2 - Two", "0 - None");
		SelectHotel select = new SelectHotel();
		select.page3();
//		BookHotel book = new BookHotel();
//		book.bkhotel("krishna", "r", "zdasdasd", "1234456778911234", "VISA", "July", "2022", "456");
		Cancel cancel = new Cancel();
		cancel.cancelhotel();
	}

}