package org.stepdefinition;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import projectmaven.BaseClass;

public class AfterRun extends BaseClass {
	
	
	
	
	
	
	
	@After
	
	private void Afterclass(Scenario s ) throws IOException {
//		takescreenshot("C:\\Users\\krish\\OneDrive\\Documents\\GitHub\\krishkp06\\projectmaven\\screenshots\\img"+timeStamp()+".png");
		
		
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image.png");
		
		
		
		
		closeallwindow();

	}
	

}
