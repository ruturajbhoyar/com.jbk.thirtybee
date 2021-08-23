package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.jbk.pages.AuthenticationPage;
import com.jbk.pages.HomePage;
import com.jbk.testbase.TestBase;

public class AuthenticationTest extends TestBase {

	WebDriver driver;
	public AuthenticationPage ap;
	public HomePage mp;

	@BeforeSuite
	public void Openbrowser() throws Exception {
		driver = initialization("config.properties");
		ap = LoadMainPage().navigateToAuthenticationPage(driver);
	}

	@Test
	public void validateMsg() {
		Assert.assertTrue(ap.verifyloginboxmsg());
	}

	@Test
	public void validateerrorMsgWithoutcridential() {
		Assert.assertEquals(ap.verifyMsgWithoutcridential(), "Please fill out this field.");
		;
	}

	@Test
	public void validateAfterLoginMsg() {
		Assert.assertTrue(ap.verifyUserSingInCridencial());
	}

	@Test
	public void validateAddingNewAddres() {
		Assert.assertTrue(ap.verifyAddingNewAddress());
	}

	@Test
	public void verifyBlankEmailErrMsg() {
		Assert.assertTrue(ap.validateBlankEmailErrMsg());
	}
	
	@Test
	public void verifyWrongPassEnter() {
		Assert.assertTrue(ap.validatewrongPassEnter());
	}
}
