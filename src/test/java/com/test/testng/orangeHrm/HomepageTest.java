package com.test.testng.orangeHrm;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class HomepageTest extends Base {

	LoginPage loginPage;
	HomePage homepage;

	public HomepageTest() {
		super();
	}

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeMethod
	public void createBrowserObject() throws IOException {
		initialization();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
	}

	@Test
	public void subscribeBtn() {
		homepage.verifySubscribebtn();

	}

	@Test
	public void assignLeaveTest() {
		homepage.verifyAssignLeave();
	}

	@Test
	public void verifybtnTest() {
		homepage.verifyBtn();
	}

	@Test
	public void myInfoEditBtn() {
		homepage.verifyMyinfoEdit();
	}

	@AfterMethod
	public void takeScreenshot() {
		//Screenshotutil();
		driver.quit();
		System.out.println("Close browser");
	}

}
