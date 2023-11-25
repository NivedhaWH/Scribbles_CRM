package com.pom.scribblesAdmin.shared.Utility;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;

public class CommonStep {

WebDriverWait driverWait;
	
	@Before
	public void beforeFeature()
	{
		utility utility = new utility();
		utility.createDriver("Chrome");
	}
}
