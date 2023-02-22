package com.test.testng.orangeHrm;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;

//Creating Test Cases for each scenarios
//Reading Test Data from Property file

public class Tests extends Base {

	LoginPage loginPage;

	public Tests() {
		super();
	}
	
	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser

	@BeforeMethod
	public void createBrowserObject() throws IOException {
		initialization();
		loginPage = new LoginPage();
	}

	@Test
	public void loginTest() {

		loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));

	}

	@AfterMethod
	public void takeScreenshot() {
		//Screenshotutil();
		driver.quit();
		System.out.println("Close browser");

	}

}
