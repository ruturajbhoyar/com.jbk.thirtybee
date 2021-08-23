package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.AuthenticationPage;
import com.jbk.pages.HomePage;
import com.jbk.testbase.TestBase;

public class HomePageTest extends TestBase{

	
	WebDriver driver;
	public AuthenticationPage ap;
	public HomePage hp;
	
	
	@BeforeMethod
	public void Openbrowser() throws Exception{
		driver= initialization("config.properties");
		hp = LoadMainPage();

	}
	 

	@Test 
	public void validateMsg(){
		Assert.assertEquals(driver.getTitle(), hp.verifytitle());
	}
	
	@Test 
	public void validate(){
		hp.verifyProduct();
	}
	
}

