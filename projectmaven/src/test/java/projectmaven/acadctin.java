package projectmaven;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class acadctin {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass base = new BaseClass();
		base.webdriver();
		base.max();
		base.loadurl("https://adactinhotelapp.com/SearchHotel.php");
		WebElement finelementbyid = base.finelementbyid("username");
		String txtusername = base.getdata("sheet", 1, 0);
		base.sendkeys(finelementbyid, txtusername);
		WebElement elementpass = base.finelementbyid("password");
		String getdata = base.getdata("sheet", 1, 1);
		base.sendkeys(elementpass, getdata);
		WebElement findlogin = base.finelementbyid("login");
		base.click(findlogin);
		WebElement locationid = base.finelementbyid("location");
		String getdata2 = base.getdata("sheet", 1, 2);
		base.selectbytext(locationid, getdata2);
		WebElement hotel = base.finelementbyid("hotels");

		WebElement roomno = base.finelementbyid("room_nos");
		WebElement datein = base.finelementbyid("datepick_in");
		WebElement dateout = base.finelementbyid("datepick_out");
		WebElement adultroom = base.finelementbyid("adult_room");
		WebElement childroom = base.finelementbyid("child_room");
		WebElement btnsubmit = base.finelementbyid("Submit");
		
		
		
		String hoteldata = base.getdata("sheet", 1, 3);
		base.selectbytext(hotel, hoteldata);
	
		String roomnos = base.getdata("sheet", 1, 5);
		base.selectbytext(roomno, roomnos);
		String indate = base.getdata("sheet", 1, 6);
		base.sendkeys(datein, indate);
		String outdate = base.getdata("sheet", 1, 7);
		base.sendkeys(dateout, outdate);
		String adultroomss = base.getdata("sheet", 1, 8);
		base.sendkeys(adultroom, adultroomss);
		String childrooms = base.getdata("sheet", 1, 9);
		base.sendkeys(childroom, childrooms);
		base.click(btnsubmit);
		WebElement radiobtn = base.findbyxpath("//input[@value='2']");
		Thread.sleep(2000);
		base.click(radiobtn);
		WebElement btncontinue = base.finelementbyid("continue");
		base.click(btncontinue);
		WebElement firstname = base.finelementbyid("first_name");
		String getdata3 = base.getdata("sheet", 1, 10);
		base.sendkeys(firstname, getdata3);
		WebElement lastname = base.finelementbyid("last_name");
		String getdata4 = base.getdata("sheet", 1, 11);
		base.sendkeys(lastname, getdata4);
		WebElement address = base.finelementbyid("address");
		String getdata5 = base.getdata("sheet", 1, 12);
		base.sendkeys(address, getdata5);
		WebElement ccnum = base.finelementbyid("cc_num");
		String getdata6 = base.getdata("sheet", 1, 13);
		base.sendkeys(ccnum, getdata6);
		WebElement cctype = base.finelementbyid("cc_type");
		String getdata7 = base.getdata("sheet", 1, 14);
		base.selectbytext(cctype, getdata7);
		WebElement finelementbyid2 = base.finelementbyid("cc_exp_month");
		String getdata8 = base.getdata("sheet", 1, 15);
		base.selectbytext(finelementbyid2, getdata8);
		WebElement finelementbyid3 = base.finelementbyid("cc_exp_year");
		String getdata9 = base.getdata("sheet", 1, 16);
		base.selectbytext(finelementbyid3, getdata9);
		WebElement finelementbyid4 = base.finelementbyid("cc_cvv");
		String getdata10 = base.getdata("sheet", 1, 17);
		base.sendkeys(finelementbyid4, getdata10);
		WebElement finelementbyid5 = base.finelementbyid("book_now");
		base.click(finelementbyid5);
		Thread.sleep(6000);
		WebElement finelementbyid6 = base.finelementbyid("order_no");
		String getenteredtext = base.getenteredtext(finelementbyid6);
		System.out.println(getenteredtext);

	}

}
