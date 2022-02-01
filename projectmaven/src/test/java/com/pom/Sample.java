package com.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import projectmaven.BaseClass;

public class Sample extends BaseClass {
	

	@BeforeClass
	public static void openurl() {
		webdriver();
		loadurl("https://adactinhotelapp.com/");
		max();

	}

	@AfterClass
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		closeallwindow();

	}

	@Test
	public void loginOperation() throws IOException, InterruptedException {
		WebElement finelementbyid = finelementbyid("username");
		String txtusername = getdata("sheet", 1, 0);
		sendkeys(finelementbyid, txtusername);
		WebElement elementpass = finelementbyid("password");
		String getdata = getdata("sheet", 1, 1);
		sendkeys(elementpass, getdata);
		WebElement findlogin = finelementbyid("login");
		click(findlogin);

		WebElement findbyxpath = findbyxpath("//td[contains(text(),'Search Hotel')]");
		String text = findbyxpath.getText();
		boolean contains = text.contains("Search Hotel");
		System.out.println(contains);
		WebElement locationid = finelementbyid("location");
		String getdata2 = getdata("sheet", 1, 2);
		selectbytext(locationid, getdata2);
		WebElement hotel = finelementbyid("hotels");
		WebElement roomno = finelementbyid("room_nos");
		WebElement datein = finelementbyid("datepick_in");
		WebElement dateout = finelementbyid("datepick_out");
		WebElement adultroom = finelementbyid("adult_room");
		WebElement childroom = finelementbyid("child_room");
		WebElement btnsubmit = finelementbyid("Submit");
		String hoteldata = getdata("sheet", 1, 3);
		selectbytext(hotel, hoteldata);

		String roomnos = getdata("sheet", 1, 5);
		selectbytext(roomno, roomnos);
		String indate = getdata("sheet", 1, 6);
		sendkeys(datein, indate);
		String outdate = getdata("sheet", 1, 7);
		sendkeys(dateout, outdate);
		String adultroomss = getdata("sheet", 1, 8);
		sendkeys(adultroom, adultroomss);
		String childrooms = getdata("sheet", 1, 9);
		sendkeys(childroom, childrooms);
		click(btnsubmit);
		WebElement findbyxpath2 = findbyxpath("//td[@class='login_title']");
		String text2 = findbyxpath2.getText();
	
		WebElement radiobtn = findbyxpath("//input[@value='2']");
		Thread.sleep(2000);
		click(radiobtn);
		WebElement btncontinue = finelementbyid("continue");
		click(btncontinue);
		WebElement findbyxpath3 = findbyxpath("//td[contains(text(),'Book')]");
		String text3 = findbyxpath3.getText();
		
		WebElement firstname = finelementbyid("first_name");
		String getdata3 = getdata("sheet", 1, 10);
		sendkeys(firstname, getdata3);
		WebElement lastname = finelementbyid("last_name");
		String getdata4 = getdata("sheet", 1, 11);
		sendkeys(lastname, getdata4);
		WebElement address = finelementbyid("address");
		String getdata5 = getdata("sheet", 1, 12);
		sendkeys(address, getdata5);
		WebElement ccnum = finelementbyid("cc_num");
		String getdata6 = getdata("sheet", 1, 13);
		sendkeys(ccnum, getdata6);
		WebElement cctype = finelementbyid("cc_type");
		String getdata7 = getdata("sheet", 1, 14);
		selectbytext(cctype, getdata7);
		WebElement finelementbyid2 = finelementbyid("cc_exp_month");
		String getdata8 = getdata("sheet", 1, 15);
		selectbytext(finelementbyid2, getdata8);
		WebElement finelementbyid3 = finelementbyid("cc_exp_year");
		String getdata9 = getdata("sheet", 1, 16);
		selectbytext(finelementbyid3, getdata9);
		WebElement finelementbyid4 = finelementbyid("cc_cvv");
		String getdata10 = getdata("sheet", 1, 17);
		sendkeys(finelementbyid4, getdata10);
		WebElement finelementbyid5 = finelementbyid("book_now");
		click(finelementbyid5);
		Thread.sleep(6000);
		WebElement finelementbyid6 = finelementbyid("order_no");
		String getenteredtext = getenteredtext(finelementbyid6);
		System.out.println(getenteredtext);
		writedata("sheet", 1, 18, getenteredtext);
		WebElement findbyxpath4 = findbyxpath("//a[contains(text(),'Booked')]");
		findbyxpath4.click();
		WebElement finelementbyid7 = finelementbyid("order_id_text");
		String getdata11 = getdata("sheet", 1, 18);
		sendkeys(finelementbyid7, getdata11);
		WebElement findbyxpath5 = findbyxpath("//td[contains(text(),'Booked')]");
		String text4 = findbyxpath5.getText();
				WebElement finelementbyid8 = finelementbyid("search_hotel_id");
		click(finelementbyid8);

		WebElement findbyname = findbyname("ids[]");
		findbyname.click();
		WebElement findbyname2 = findbyname("cancelall");
		findbyname2.click();
		clickokalert();

	}

}



