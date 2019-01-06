package com.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.techfios.pages.HomePage;
import com.techfios.pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginTest() {
		super();
	}

	// initialization
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitle() {
		String title = loginpage.validateLogingPage();
		Assert.assertEquals(title, "Login - TechFios Test Application - Billing");

	}

	@Test(priority = 2)
	public void LogoimmageTest() {
		boolean logo = loginpage.logo();
		Assert.assertTrue(logo);

	}

	@Test(priority = 3)
	public void loginTest() {

		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
