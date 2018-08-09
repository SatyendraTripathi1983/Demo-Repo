package com.dubainow.mobile.testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dubainow.mobile.base.TestBase;
import com.dubainow.mobile.pages.AllServicesPage;
import com.dubainow.mobile.pages.LoginPage;
import com.dubainow.mobile.pages.LogoutPage;
//import com.dubainow.qa.pages.LandingPage;
//import com.dubainow.qa.util.utility;
import com.dubainow.mobile.util.utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	LogoutPage logoutPage;
	AllServicesPage allServices;
	utility utilities;
	
	//AndroidDriver<MobileElement> driver;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
	initalization();
	utilities = new utility();
	//util = new utility();
	loginPage = new LoginPage();
	utilities.waiting();
}
	
	
	@Test (priority =1 )
	public void loginFunctionalityTest() {
		//util.HighLightElement(driver, element);
	allServices = loginPage.loginFunction();
	utilities.waiting();
		
	}
	
	
	
	/*@Test
	public void testingApp() {
		
		loginPage = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		logoutPage = loginPage.loginFunction();
		allServices = logoutPage.logoutFunction();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}*/
	
	@AfterMethod
	public void quite() {
		
		driver.quit();
	}
	

}
