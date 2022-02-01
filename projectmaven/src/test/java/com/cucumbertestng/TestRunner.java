package com.cucumbertestng;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\adactin.feature" }, glue = {"org.stepdefinition"})
public class TestRunner {

}
,mxmc