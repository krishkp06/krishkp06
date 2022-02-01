package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projectmaven.BaseClass;

public class SelectHotel extends BaseClass {

	public SelectHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='2']")
	private WebElement selectbtn;
	@FindBy(id = "continue")
	private WebElement ctn;

	public WebElement getSelectbtn() {
		return selectbtn;
	}

	public WebElement getCtn() {
		return ctn;
	}

	public void page3() {

		click(getSelectbtn());
		click(getCtn());
	}
}
