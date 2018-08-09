package com.dubainow.mobile.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dubainow.mobile.base.TestBase;
import com.dubainow.mobile.pages.AlJalilaPage;
import com.dubainow.mobile.pages.AllServicesPage;
import com.dubainow.mobile.pages.EntityPage;
import com.dubainow.mobile.pages.LogoutPage;
import com.dubainow.mobile.util.utility;
//import com.dubainow.mobile.pages.HomePage;
import com.dubainow.mobile.pages.LogoutPage;
import com.dubainow.mobile.pages.LoginPage;

public class LogoutPageTest  extends TestBase{
	
	//com.dubainow.mobile.pages.LoginPage loginPage;
	LoginPage loginPage;
	LogoutPage logoutPage;
	AllServicesPage allServices;
	AlJalilaPage alJalila;
	EntityPage entity;
	
	utility utilities;
	
	public LogoutPageTest() {
		super();
	}
		
		@BeforeMethod
		public void setUp() {
			initalization();
		loginPage = new LoginPage();
		utilities = new utility();
		utilities.waiting();
		allServices = loginPage.loginFunction();
		utilities.waiting();
		alJalila = allServices.ClickonUtility();
		entity=alJalila.searchforEntity();
		entity.subscribeforEntityJalila();
		logoutPage = entity.unsubscribeforEntityJalila();
		
	}
		
		
		
		@Test (priority = 1)
		public void logoutTest() {
			utilities = new utility();
			utilities.waiting();
			logoutPage.logoutFunction(driver);
			
		}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
