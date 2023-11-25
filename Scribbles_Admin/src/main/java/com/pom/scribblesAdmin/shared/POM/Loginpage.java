package com.pom.scribblesAdmin.shared.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.scribblesAdmin.shared.Utility.utility;

public class Loginpage {
	
	WebDriver driver;
	WebDriverWait driverWait;
	
	@FindBy(xpath = "//input[@name='phoneNumber']")
	WebElement usernameField;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath = "//h1[@class='heading']")
	WebElement Vdashboard;
				
	public Loginpage (WebDriver driver, WebDriverWait driverWait)
	{
		this.driver=driver;
		this.driverWait=driverWait;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String Password) 
	{
		driverWait.until(ExpectedConditions.visibilityOf(usernameField));
		usernameField.clear();
		usernameField.sendKeys(username);
		
		driverWait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.clear();
		passwordField.sendKeys(Password);	
	}
	
	public void invalidLogin(String username, String password) 
	{
		driverWait.until(ExpectedConditions.visibilityOf(usernameField));
		usernameField.clear();
		usernameField.sendKeys(username);
		
		driverWait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.clear();
		passwordField.sendKeys(password);	
	}
	
	public boolean clickLogin() {
		boolean wasLoginSuccessfull = false;
		utility.waitForSeconds(3);
		
		driverWait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		
		utility.waitForSeconds(3);
		wasLoginSuccessfull = true;
		return wasLoginSuccessfull;
	}
	
	public void VerifyPageIsstillInLoginPage(){
		driverWait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.isDisplayed();
	}
	
	public void VerifyPageIsInDashboardPage(){
		driverWait.until(ExpectedConditions.visibilityOf(Vdashboard));
		Vdashboard.isDisplayed();
	}

}
