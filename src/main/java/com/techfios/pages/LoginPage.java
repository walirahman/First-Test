package com.techfios.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {

	// PageFactory or OR
	// All Locator
	@FindBy(id = "username")
	WebElement un;

	@FindBy(id = "password")
	WebElement pw;

	@FindBy(name = "login")
	WebElement SigninBtn;

	@FindBy(xpath = "//*[@class='logo']")
	WebElement Logo;

	// PageFactory
	public LoginPage() {
		PageFactory.initElements(driver, this);// this mean corrent class object

	}

	// All Action
	public String validateLogingPage() {
		return driver.getTitle();
	}

	public boolean logo() {
		return Logo.isDisplayed();

	}

	public HomePage login(String username, String password) {
		un.sendKeys(username);
		pw.sendKeys(password);
		SigninBtn.click();
		return new HomePage();

	}

}
