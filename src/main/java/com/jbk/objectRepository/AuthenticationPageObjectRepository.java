package com.jbk.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPageObjectRepository {
	
	@FindBy(xpath ="//*[@id='login_form']/h3")
	public WebElement subheading;
	
	@FindBy(xpath ="//button[@id='SubmitLogin']")
	public WebElement signinbtn;
	
	@FindBy(xpath="//*[@for='id_gender2']")
	public WebElement selectgender;
	
	@FindBy(id="customer_firstname")
	public WebElement cxFirstName;
	
	@FindBy(id="customer_lastname")
	public WebElement cxLastName;
	
	@FindBy(xpath="//div[@class='help-block']")
	public WebElement wrongpwsenter ;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement pass ;
	
	@FindBy(xpath = "//*[@id='center_column']/p")
	public WebElement loginmsg ;
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstname ;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname ;
	
	@FindBy(xpath = "//input[@id='company']")
	public WebElement company ;
	
	@FindBy(xpath = "//input[@id='address1']")
	public WebElement address ;
	
	@FindBy(xpath = "//input[@id='address2']")
	public WebElement addressLane2 ;
	
	@FindBy(xpath = "//input[@id='city']")
	public WebElement city  ;
	
	@FindBy(xpath = "//select[@name='id_state']")
	public WebElement State  ;

	@FindBy(xpath = "//input[@id='postcode']")
	public WebElement  postecode  ;
	
	@FindBy(xpath = "//select[@id='id_country']")
	public WebElement country  ;
	
	@FindBy(xpath = "//input[@id='phone']")
	public WebElement phone  ;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")
	public WebElement mobileNo  ;
	
	@FindBy(xpath = "//textarea[@id='other']")
	public WebElement  additionalInfo ;
	

	@FindBy(xpath = "//input[@id='alias']")
	public WebElement  addressTitle ;
	
	@FindBy(xpath = "//button[@id='submitAddress']")
	public WebElement  savebtn ;
	
	@FindBy(linkText="Add my first address")
	public WebElement  addAddressbtn ;
	
	@FindBy(xpath = "//*[@id='center_column']/div[1]/p[2]")
	public WebElement  suretyNote ;
	
	//*[@id="center_column"]/p
	//*[@id="center_column"]/div[1]/p[2]
	
	
	
	
	
	
}
