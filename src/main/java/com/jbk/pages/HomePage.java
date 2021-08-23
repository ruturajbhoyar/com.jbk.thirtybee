package com.jbk.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.jbk.objectRepository.HomePageObjectRepository;

public class HomePage extends HomePageObjectRepository {
	public HomePage mp;
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public String verifytitle() {
		String Expected = "BEE";
		return Expected;
	}
	
	public String verifyProduct() {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		WebElement flag = tinCupPdt;
		js.executeScript("arguments[0].scrollIntoView();", flag);
		return null;
		
	}
	
	public AuthenticationPage navigateToAuthenticationPage (WebDriver driver){
		signinBtn.click();
		return new AuthenticationPage(driver);
	}
}
