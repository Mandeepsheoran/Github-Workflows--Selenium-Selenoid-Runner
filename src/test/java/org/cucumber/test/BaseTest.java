package org.cucumber.test;

import org.cucumber.driver.DriverSetup;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	@BeforeClass
	public static void initDriver() {
		DriverSetup.getDriver();
	}
	
	@AfterClass
	public static void quitDriver() {
		DriverSetup.tearDownDriver();
	}

}
