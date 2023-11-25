package com.pom.scribblesAdmin.shared.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.scribblesAdmin.shared.Utility.utility;

public class UsersandPermissions {

	WebDriver driver;
	WebDriverWait driverWait;

	@FindBy(xpath = "//a[@href='/home/users']")
	WebElement UAPfield;

	@FindBy(xpath = "//button[contains(text(), 'Add Role')]")
	WebElement URaddRoleField;

	@FindBy(xpath = "//input[@placeholder='Please Enter a Unique Name']")
	WebElement URenterRoleNameField;

	@FindBy(xpath = "//select[@name='role']")
	WebElement URselectRoleLevelField;

	@FindBy(xpath = "//span[contains(text(),'Select All')]")
	WebElement URselectAllField;

	@FindBy(xpath = "//span[contains(text(),'Departments')]")
	WebElement URselectDepField;

	@FindBy(xpath = "//span[contains(text(),'Organisations')]")
	WebElement URselectOrgField;

	@FindBy(xpath = "//span[contains(text(),'Order Management System')]")
	WebElement URselectOMSField;

	@FindBy(xpath = "//span[contains(text(),'CRM')]")
	WebElement URselectCRMField;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement URselectTasksField;

	@FindBy(xpath = "//span[contains(text(),'Project Management')]")
	WebElement URselectProjectmgmtField;

	@FindBy(xpath = "//span[contains(text(),'School Admin Panel')]")
	WebElement URselectschoolAdminPanelField;

	@FindBy(xpath = "//button[@type='reset']")
	WebElement URResetButtonField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement URSubmitButtonfield;

	@FindBy(xpath = "//input[@placeholder='search']")
	WebElement URSearchField;
	WebElement ULSearchField;

	@FindBy(xpath = "//a[@href='/home/users/list']")
	WebElement ULCategoryfield;

	@FindBy(xpath = "//button[contains(text(), 'Add User')]")
	WebElement ULaddUserField;

	@FindBy(xpath = "//select[@id='user_type']")
	WebElement ULselectTypeFieldSU;
	WebElement ULselectTypeFieldSA;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement ULnameField;

	@FindBy(xpath = "//select[@id='role']")
	WebElement ULselectRoleField;

	@FindBy(xpath = "//select[@id='departmentId']")
	WebElement ULdepartmentField;

	@FindBy(xpath = "//input[@id='email']")
	WebElement ULemailField;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement ULphoneField;

	
	public UsersandPermissions(WebDriver driver, WebDriverWait driverWait) {
		this.driver = driver;
		this.driverWait = driverWait;
		PageFactory.initElements(driver, this);
	}

	public void clickUAP() {
		driverWait.until(ExpectedConditions.elementToBeClickable(UAPfield));
		UAPfield.click();
	}

	public void uRclickAddRole() {
		driverWait.until(ExpectedConditions.elementToBeClickable(URaddRoleField));
		URaddRoleField.click();
	}

	public void uRenterRoleName(String RoleName) {
		driverWait.until(ExpectedConditions.visibilityOf(URenterRoleNameField));
		URenterRoleNameField.clear();
		URenterRoleNameField.sendKeys(RoleName);
	}

	public void uRselectRoleLevel(String rolelevel) {
		driverWait.until(ExpectedConditions.visibilityOf(URselectRoleLevelField));
		Select select = new Select(URselectRoleLevelField);
		select.selectByVisibleText(rolelevel);
	}

	public void uRselectAllMF() {
		driverWait.until(ExpectedConditions.elementToBeClickable(URselectAllField));
		URselectAllField.click();
	}

	public boolean uRresetButton() {
		boolean wasResetSuccessfull = false;
		utility.waitForSeconds(2);

		driverWait.until(ExpectedConditions.elementToBeClickable(URResetButtonField));
		URResetButtonField.click();

		utility.waitForSeconds(2);
		wasResetSuccessfull = true;
		return wasResetSuccessfull;
	}

	public boolean uRsubmitButton() {
		boolean wasSubmitSuccessfull = false;
		utility.waitForSeconds(2);

		driverWait.until(ExpectedConditions.elementToBeClickable(URSubmitButtonfield));
		URSubmitButtonfield.click();

		utility.waitForSeconds(2);
		wasSubmitSuccessfull = true;
		return wasSubmitSuccessfull;
	}

	public void uRsearchFieldClick() {
		driverWait.until(ExpectedConditions.elementToBeClickable(URSearchField));
		URSearchField.click();
	}

	public void uRsearchFieldText(String search) {
		driverWait.until(ExpectedConditions.visibilityOf(URSearchField));
		URSearchField.clear();
		URSearchField.sendKeys(search);
	}

	public void uLcategoryTab() {
		driverWait.until(ExpectedConditions.elementToBeClickable(ULCategoryfield));
		ULCategoryfield.click();
	}

	public void uLaddUser() {
		driverWait.until(ExpectedConditions.elementToBeClickable(ULaddUserField));
		ULaddUserField.click();
	}

	public void uLselectUserTypeScribblesUser(String userSU) {
		driverWait.until(ExpectedConditions.visibilityOf(ULselectTypeFieldSU));
		Select select = new Select(ULselectTypeFieldSU);
		select.selectByVisibleText(userSU);
	}
	
	public void uLselectUserTypeSchoolAdmin(String userSA) {
		driverWait.until(ExpectedConditions.visibilityOf(ULselectTypeFieldSU));
		Select select = new Select(ULselectTypeFieldSU);
		select.selectByVisibleText(userSA);
	}
	
	public void uLenterName(String Username) {
		driverWait.until(ExpectedConditions.visibilityOf(ULnameField));
		ULnameField.sendKeys(Username);
	}

	public void uLselectRole(String userRole) {
		driverWait.until(ExpectedConditions.visibilityOf(ULselectRoleField));
		Select select = new Select(ULselectRoleField);
		select.selectByVisibleText(userRole);
	}

	public void uLselectDepartment(String userDep) {
		driverWait.until(ExpectedConditions.visibilityOf(ULdepartmentField));
		Select select = new Select(ULdepartmentField);
		select.selectByVisibleText(userDep);
	}

	public void uLenterEmail(String userEmail) {
		driverWait.until(ExpectedConditions.visibilityOf(ULemailField));
		ULemailField.sendKeys(userEmail);
	}

	public void uLEnterMobileNumber(String MobileNum) {
		driverWait.until(ExpectedConditions.visibilityOf(ULphoneField));
		ULphoneField.sendKeys(MobileNum);
	}
	
	public void uLsearchFieldClick() {
		driverWait.until(ExpectedConditions.elementToBeClickable(ULSearchField));
		ULSearchField.click();
	}

	public void uLsearchFieldText(String search) {
		driverWait.until(ExpectedConditions.visibilityOf(ULSearchField));
		ULSearchField.clear();
		ULSearchField.sendKeys(search);
	}
}
