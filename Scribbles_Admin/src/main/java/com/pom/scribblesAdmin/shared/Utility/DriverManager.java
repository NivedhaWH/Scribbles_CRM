package com.pom.scribblesAdmin.shared.Utility;

public class DriverManager {

	public static ThreadLocal<DriverClass> driver = new ThreadLocal<DriverClass>();

	public static DriverClass getDriver() {
		return driver.get();
	}
	
	public static void setDriver(DriverClass drive) {
		driver.set(drive);
	}
	
}
