package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projectmaven.BaseClass;

public class Login extends BaseClass {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement fndusername;

	@FindBy(id = "password")
	private WebElement fndpasswrod;

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getFndusername() {
		return fndusername;
	}

	public WebElement getFndpasswrod() {
		return fndpasswrod;
	}

	public WebElement getLogin() {
		return login;
	}

	public void login(String user, String password) {
		sendkeys(getFndusername(), user);
		sendkeys(getFndpasswrod(), password);
		click(getLogin());

	}

}