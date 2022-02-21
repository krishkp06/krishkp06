package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.ReportGeneration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\adactin.feature"},glue= {"org.stepdefinition"},plugin= {"pretty","json:C:\\Users\\krishna\\Documents\\krishkp06\\projectmaven\\target\\new.json"}, dryRun = false)
public class TestRunner {
	@AfterClass
	public static void afterclassm() {
		ReportGeneration.jvmreports("C:\\Users\\krishna\\Documents\\krishkp06\\projectmaven\\target\\new.json");

	}
	
	
	

}
