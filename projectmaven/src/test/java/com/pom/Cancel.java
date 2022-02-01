package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projectmaven.BaseClass;

public class Cancel extends BaseClass {
	public Cancel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement ordernumber;

	@FindBy(xpath = "//a[contains(text(),'Booked')]")
	private WebElement insertvalue;

	@FindBy(id = "order_id_text")
	private WebElement orderno;

	@FindBy(id = "search_hotel_id")
	private WebElement hotelid;

	@FindBy(xpath = "//input[contains(@id,'btn_id_')]")
	private WebElement ids;

	@FindBy(xpath = "//label[contains(text(),'The')]")
	private WebElement cancel;

	public WebElement getOrdernumber() {
		return ordernumber;
	}

	public WebElement getInsertvalue() {
		return insertvalue;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getHotelid() {
		return hotelid;
	}

	public WebElement getIds() {
		return ids;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public void cancelhotel() throws InterruptedException {
		Thread.sleep(6000);
		String getenteredtext = getenteredtext(getOrdernumber());
		click(getInsertvalue());
		sendkeys(getOrderno(), getenteredtext);
		click(getHotelid());
		click(getIds());
		clickokalert();
		Thread.sleep(2000);
		String getext = getext(getCancel());
		System.out.println(getext);
		

	}

}
