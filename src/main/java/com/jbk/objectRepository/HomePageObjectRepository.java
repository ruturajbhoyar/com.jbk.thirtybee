package com.jbk.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjectRepository {

	
	@FindBy(xpath="//a[@class='login']")
	public WebElement signinBtn;
	
	@FindBy(xpath="//*[@id='homefeatured']/li[4]/article/div/div[2]/h3/a")
	public WebElement tinCupPdt;
}
