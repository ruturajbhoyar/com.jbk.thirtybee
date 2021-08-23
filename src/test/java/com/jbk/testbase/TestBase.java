package com.jbk.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.jbk.pages.AuthenticationPage;
import com.jbk.pages.HomePage;

import common.Logger;
import junit.framework.TestCase;

public class TestBase {
	public static WebDriver driver;
	public Properties prop;
	
	public static Logger log = common.Logger.getLogger(TestCase.class);
	
	public WebDriver initialization(String propertyfileName) throws Exception {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/"+propertyfileName);		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			log.info("initializing browser");
			log.warn("chromedriver file should be at specific location");
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			log.info("chrome browser opened");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("firefox")) {
			log.info("initializing browser");
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
			log.info("mozilla firefox browser opened");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();		
		driver.get(prop.getProperty("url"));
		return  driver ;
	}

	public AuthenticationPage siginbutton(WebDriver driver){
		driver.findElement(By.xpath("//a[@class='login']")).click();
		return new AuthenticationPage(driver);
	}
	
	public HomePage LoadMainPage() {
		HomePage lp = new HomePage(driver);
		return new HomePage(driver);
	}
	/*
	 * public String getScreenshot(String name){
	 * 
	 * TakesScreenshot ts = (TakesScreenshot)driver; File src =
	 * ts.getScreenshotAs(OutputType.FILE); File dest = new
	 * File(System.getProperty("user.dir"))+"/screshot/"+ name +".jpg"); try {
	 * 
	 * } catch (Exception e) {
	 * 
	 * } return name;
	 * 
	 * }
	 */
}
