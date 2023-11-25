package com.pom.scribblesAdmin.shared.Utility;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	public static DriverClass createInstance(DesiredCapabilities cap) {
		DriverClass driver = new DriverClass();
			return driver;
	}
}
