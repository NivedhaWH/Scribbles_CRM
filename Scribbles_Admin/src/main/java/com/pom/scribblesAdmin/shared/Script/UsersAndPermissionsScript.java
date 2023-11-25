package com.pom.scribblesAdmin.shared.Script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.scribblesAdmin.shared.POM.UsersandPermissions;
import com.pom.scribblesAdmin.shared.Utility.DriverManager;
import com.pom.scribblesAdmin.shared.Utility.utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UsersAndPermissionsScript {

	WebDriver driver = DriverManager.getDriver().wd;
	WebDriverWait driverWait = utility.driverwait.get();

	UsersandPermissions up = new UsersandPermissions(driver, driverWait);

	@Then("^navigate to users and permission module$")
	public void navigate_to_users_and_permission_module() {
		up.clickUAP();
	}

	@And("^click on add role under user roles categories$")
	public void click_on_add_role_under_user_roles_categories() {
		up.uRclickAddRole();
	}

	@Then("^enter role name and select user level$")
	public void enter_role_name_and_select_user_level() throws IOException {
		up.uRenterRoleName(utility.getrolenameUR());
		up.uRselectRoleLevel(utility.getrolelevelUR());
	}

	@And("^click on select all to give access for modules and features for the user role$")
	public void click_on_select_all_to_give_access_for_modules_and_features_for_the_user_role() {
		up.uRselectAllMF();
	}

	@And("^click on submit button$")
	public void click_on_submit_button() {
		up.uRsubmitButton();
	}

	@And("^click on Reset button$")
	public void click_on_Rese_button() {
		up.uRresetButton();
	}

	@And("^click on the search field$")
	public void click_on_the_search_field() {
		up.uRsearchFieldClick();
	}

	@Then("^enter any partial words that you want to search for the role$")
	public void enter_any_partial_words_that_you_want_to_search_for_the_role() throws IOException {
		up.uRsearchFieldText(utility.getsearchUR());
	}

	@And("^Click on user list categories tab$")
	public void Click_on_user_list_categories_tab() {
		up.uLcategoryTab();
	}

	@Then("^Click on Add user$")
	public void Click_on_Add_user() {
		up.uLaddUser();
	}

	@And("^Select scribbles user from the user type dropdown$")
	public void Select_scribbles_user_from_the_user_type_dropdown() throws IOException {
		up.uLselectUserTypeScribblesUser(utility.getUserTypeSU_UL());
	}

	@Then("^Enter name in name field$")
	public void Enter_name_in_name_field() throws IOException {
		up.uLenterName(utility.getUserNameSU_UL());
	}

	@And("^Select role from the role dropdown$")
	public void Select_role_from_the_role_dropdown() throws IOException {
		up.uLselectRole(utility.getUserRoleSU_UL());
	}

	@And("^Select department from the department dropdown$")
	public void Select_departmen_from_the_department_dropdown() throws IOException {
		up.uLselectDepartment(utility.getUserDepSU_UL());
	}

	@Then("^Enter email in email field$")
	public void Enter_email_in_email_field() throws IOException {
		up.uLenterEmail(utility.getUserEmailSU_UL());
	}

	@And("^Enter Mobile number in mobile number field$")
	public void Enter_Mobile_number_in_mobile_number_field() throws IOException {
		up.uLEnterMobileNumber(utility.getUserPhoneNumberSU_UL());
	}

	@And("^Select school admin from the user type dropdown$")
	public void Select_school_admin_from_the_user_type_dropdown() throws IOException {
		up.uLselectUserTypeSchoolAdmin(utility.getUserTypeSA_UL());
	}

	@Then("^Enter name in name field SA$")
	public void Enter_name_in_name_field_SA() throws IOException {
		up.uLenterName(utility.getUserNameSA_UL());
	}

	@And("^Select role from the role dropdown SA$")
	public void Select_role_from_the_role_dropdown_SA() throws IOException {
		up.uLselectRole(utility.getUserRoleSA_UL());
	}

	@Then("^Enter email in email field SA$")
	public void Enter_email_in_email_field_SA() throws IOException {
		up.uLenterEmail(utility.getUserEmailSA_UL());
	}

	@And("^Enter Mobile number in mobile number field SA$")
	public void Enter_Mobile_number_in_mobile_number_field_SA() throws IOException {
		up.uLEnterMobileNumber(utility.getUserPhoneNumberSA_UL());
	}
	
	@Then ("^enter any partial words that you want to search for the user$")
	public void enter_any_partial_words_that_you_want_to_search_for_the_user() throws IOException {
		up.uLsearchFieldText(utility.getsearchUL());;;
	}
}
