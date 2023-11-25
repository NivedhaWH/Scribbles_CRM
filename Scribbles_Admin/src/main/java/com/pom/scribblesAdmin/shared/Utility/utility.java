package com.pom.scribblesAdmin.shared.Utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {

	public static ThreadLocal<WebDriverWait> driverwait = new ThreadLocal<WebDriverWait>();
	public String key = "lockunlock";
	public static ThreadLocal<String> BrowserName = new ThreadLocal<String>();

	public void createDriver(String BrowserName) {

		DesiredCapabilities capabilities;
		BrowserName = "Chrome";

		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome is selected");
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			options.setAcceptInsecureCerts(true);
			capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		}

		else {
			System.out.println("firefox is selected");
			capabilities = DesiredCapabilities.firefox();
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
		}

		DriverClass driver = DriverFactory.createInstance(capabilities);
		DriverManager.setDriver(driver);
		DriverManager.getDriver().wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		DriverManager.getDriver().wd.manage().window().maximize();
		driverwait.set(new WebDriverWait(DriverManager.getDriver().wd, 60));
	}

	public void postCondition() {
		DriverManager.getDriver().wd.quit();
	}

	public static void waitForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void openApplicationURL(String appURL) {

		DriverManager.getDriver().wd.navigate().to(appURL);
	}

	public static String getURL() throws IOException {

		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		return properties.getProperty("ScribblesAdminUrl");
	}
	
	public static String getUserNameLogin() throws IOException {

		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserNameLogin = properties.getProperty("UserName");
		return getUserNameLogin;
	}

	public static String getPasswordLogin() throws IOException {

		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getPasswordLogin = properties.getProperty("Password");
		return getPasswordLogin;
	}

	public static String getrolenameUR() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getrolenameUR = properties.getProperty("UserRoleName");
		return getrolenameUR;
	}
	
	public static String getrolelevelUR() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getrolelevelUR = properties.getProperty("UserRoleLevel");
		return getrolelevelUR;
	}
	
	public static String getsearchUR() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getsearchUR = properties.getProperty("UserRoleSearch");
		return getsearchUR;
	}
	
	public static String getUserTypeSU_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserTypeSU_UL = properties.getProperty("UserListTypeSU");
		return getUserTypeSU_UL;
	}
	
	public static String getUserNameSU_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserNameSU_UL = properties.getProperty("UserListNameSU");
		return getUserNameSU_UL;
	}
	
	public static String getUserRoleSU_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserRoleSU_UL = properties.getProperty("UserListRoleSU");
		return getUserRoleSU_UL;
	}
	
	public static String getUserDepSU_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserDepSU_UL = properties.getProperty("UserListDepartmentSU");
		return getUserDepSU_UL;
	}
	
	public static String getUserEmailSU_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserEmailSU_UL = properties.getProperty("UserListEmailSU");
		return getUserEmailSU_UL;
	}
	
	public static String getUserPhoneNumberSU_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserPhoneNumberSU_UL = properties.getProperty("UserListMobileNumberSU");
		return getUserPhoneNumberSU_UL;
	}
	
	public static String getUserTypeSA_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserTypeSA_UL = properties.getProperty("UserListTypeSA");
		return getUserTypeSA_UL;
	}
	
	public static String getUserNameSA_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserNameSA_UL = properties.getProperty("UserListNameSA");
		return getUserNameSA_UL;
	}
	
	public static String getUserRoleSA_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserRoleSA_UL = properties.getProperty("UserListRoleSA");
		return getUserRoleSA_UL;
	}
	
	public static String getUserEmailSA_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserEmailSA_UL = properties.getProperty("UserListEmailSA");
		return getUserEmailSA_UL;
	}
	
	public static String getUserPhoneNumberSA_UL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getUserPhoneNumberSA_UL = properties.getProperty("USerListMobileNumberSA");
		return getUserPhoneNumberSA_UL;
	}
	
	public static String getsearchUL() throws IOException {
		FileReader reader = new FileReader("./TestData/TestData.properties");
		Properties properties = new Properties();
		properties.load(reader);
		String getsearchUL = properties.getProperty("UserRoleSearch");
		return getsearchUL;
	}
	
}
