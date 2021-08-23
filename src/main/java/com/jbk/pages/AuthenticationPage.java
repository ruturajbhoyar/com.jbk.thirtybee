package com.jbk.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.objectRepository.AuthenticationPageObjectRepository;

public class AuthenticationPage extends AuthenticationPageObjectRepository {

	WebDriver driver;
	public Alert al = null;

	public AuthenticationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyloginboxmsg() {
		String actual = subheading.getText();
		System.out.println("{" + actual);
		String expected = "ALREADY REGISTERED?";
		if (actual.equals(expected)) {
			System.out.println("msg is match");
			return true;
		} else {
			System.out.println("msg is not match");
			return false;
		}
	}

	public String verifyMsgWithoutcridential() {
		signinbtn.click();
		al = driver.switchTo().alert();
		String actual = al.getText();
		return actual;
	}
	
	public boolean validatewrongPassEnter() {
		Email.sendKeys("ruturaj@gmail.com");
		signinbtn.click();
		selectgender.click();
		 cxFirstName.sendKeys("ruturaj");
		 cxLastName.sendKeys("bhoyar");
		 pass.sendKeys("1234");
		String actual = wrongpwsenter.getText();
		System.out.println(actual);
		String expected = "(Five characters minimum)";
		if (actual.equals(expected)) {
			System.out.println("Msg is match");
			return true;
		} else {
			System.out.println("Msg is not match");
			return false;
		}
	}

	public boolean verifyUserSingInCridencial() {
		Email.sendKeys("testuser@bee.com");
		pass.sendKeys("welcome@123123");
		signinbtn.click();
		String expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
		String actual = loginmsg.getText();

		if (expected.equals(actual)) {
			System.out.println("msg is match");
			return true;
		} else {
			System.out.println("msg is not match");
			return false;
		}
	}
	public boolean verifyAddingNewAddress() {
		Email.sendKeys("testuser@bee.com");
		pass.sendKeys("welcome@123123");
		signinbtn.click();
		addAddressbtn.click();
		firstname.sendKeys("Abhilash");
		lastname.sendKeys("gawande");
		company.sendKeys("wipro");
		address.sendKeys("221B Beaker street");
		addressLane2.sendKeys("Near amsterdam");
		city.sendKeys("Hawaii");
		Select select = new Select(State);
		select.selectByVisibleText("California");
		postecode.sendKeys("93624");
		Select select1 = new Select(country);
		select1.selectByValue("21");
		phone.sendKeys("2546895");
		mobileNo.sendKeys("5986247351");
		addressTitle.sendKeys("home");
		savebtn.click();
		String actual = suretyNote.getText();
		String expected = "Be sure to update your personal information if it has changed.";
		if (expected.equals(actual)) {
			System.out.println("msg is match");
			return true;
		} else {
			System.out.println("msg is not match");
			return false;
		}
	}

	public boolean validateBlankEmailErrMsg() {
		//signin.click();
		signinbtn.click();
		String validationmsg = Email.getAttribute("validationMessage");
		 System.out.println(validationmsg);
		String expErrorMsg = "Please fill out this field.";
		if (validationmsg.equals(expErrorMsg)) {
			System.out.println("blank username msg match");
			return true;
		} else {
			System.out.println("blank username msg not match");
			return false;
		}

	}

}
