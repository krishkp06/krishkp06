package com.testng;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import projectmaven.BaseClass;

public class amazondata extends BaseClass {
	int i;

	@Test(dataProvider = "searchvalues")
	private void search(String s1) throws IOException {

		webdriver();
		loadurl("https://www.amazon.in/");
		max();

		WebElement finelementbyid = finelementbyid("twotabsearchtextbox");
		finelementbyid.sendKeys(s1, Keys.ENTER);
		TakesScreenshot js = (TakesScreenshot) driver;
		File screenshotAs = js.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\krishna\\Desktop\\New folder//img" + i + ".jpeg"));
		i++;
		closeallwindow();

	}

	@DataProvider(name = "searchvalues")
	private Object[][] values() {

		return new Object[][] { { "iphone" }, { "samsung" }, { "redmi note 10 pro" }, { "iphone 13 pro max" },
				{ "rogphone" }, { "wirelesskeyboard" }, { "ps4" }, { "samsung s21 ultra" }, { "gaming latop" },
				{ "logitechwireleskeyboard" } };
	}

	@Test(dataProvider = "searchvalues")
	private void search1(String s1) throws IOException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement finelementbyid = driver.findElement(By.id("twotabsearchtextbox"));
		finelementbyid.sendKeys(s1, Keys.ENTER);
		TakesScreenshot js = (TakesScreenshot) driver;
		File screenshotAs = js.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		FileUtils.copyFile(screenshotAs, new File ("C:\\Users\\krishna\\Desktop\\New folder//i"+i+".jpeg"));
		i++;
		driver.quit();
		
	}
	}
	