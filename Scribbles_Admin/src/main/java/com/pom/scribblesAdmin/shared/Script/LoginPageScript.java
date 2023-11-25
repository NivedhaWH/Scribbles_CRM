package com.pom.scribblesAdmin.shared.Script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.scribblesAdmin.shared.POM.Loginpage;
import com.pom.scribblesAdmin.shared.Utility.DriverManager;
import com.pom.scribblesAdmin.shared.Utility.utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageScript {

	WebDriver driver = DriverManager.getDriver().wd;
	WebDriverWait driverWait = utility.driverwait.get();
	
	Loginpage lp = new Loginpage(driver, driverWait);
	
	
	 @Given ("^User enters scribbles URL$") 
	 public void User_enters_scribbles_URL() throws IOException {
		 utility.openApplicationURL(utility.getURL());
	 }
	
	 @Given("^User enter valid username and password$")   
	 public void User_enter_valid_username_and_password () throws Throwable {
		lp.login(utility.getUserNameLogin(), utility.getPasswordLogin());	
	 }
	
	 @Then("^User clicks on login button$")
	 public void User_clicks_on_login_button ()
	 {
		 lp.clickLogin();
	 }
	 
	 @Then("^User verifies the dashboard page$")
	 public void User_verifies_the_dashboard_page() {
		 lp.VerifyPageIsInDashboardPage();
	 }
	 
	 @Then("^user closes the browser$")
	 public void user_closes_the_browser() {
		 utility utill = new utility();
		 utill.postCondition();
	 }
	 
	 @When("^User enters invalid \"(.*?)\" and \"(.*?)\"$")
	 public void User_enters_invalid_username_and_password(String username, String password) throws IOException {
		 lp.invalidLogin(username, password);
	 }
	
	 @And("^verify user is still in login page$")
	 public void verify_user_is_still_in_login_page() {
		 lp.VerifyPageIsstillInLoginPage();
	 }
	
}
