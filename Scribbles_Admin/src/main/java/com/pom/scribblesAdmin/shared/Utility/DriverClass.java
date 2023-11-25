package com.pom.scribblesAdmin.shared.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {

public WebDriver wd;
	
	public DriverClass() {
		System.setProperty("webriver.chrome.driver", "\\Scribbles_Automation\\chromedriver.exe");
		wd = new ChromeDriver(); 
		
	}
}
