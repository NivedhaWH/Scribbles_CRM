package com.pom.scribblesAdmin.shared.TestRunner;

import org.testng.annotations.BeforeClass;

import com.pom.scribblesAdmin.shared.Utility.utility;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/report.html", "pretty", 
		"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				features = "./Features/AdminLogin.feature", 
				glue = "com.pom.scribblesAdmin",
				tags = "@validCredentials")

public class LoginpageRF extends AbstractTestNGCucumberTests {
	@BeforeClass
	public void AssignBrowser() {
		utility.BrowserName.set("Chrome");
	}
		

}
