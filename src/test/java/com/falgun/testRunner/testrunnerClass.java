package com.falgun.testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.falgun.utility.base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Featuress"} , // Path of feature file
plugin = {"json:target/cucumber.json"}, // cucumber.jason plugin to generate report
glue = "StepDefinitions",tags= {"@cartL"})


public class testrunnerClass extends AbstractTestNGCucumberTests{ 
	@BeforeTest
 public void startURL () {
	 base_class test= new base_class();
	 test.initBrowser();
 }
	
	@AfterTest
 public void closeURL () {
	base_class test= new base_class();
	test.driver.quit();
 }
}
