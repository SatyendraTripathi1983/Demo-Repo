package com.dubainow.mobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LogoutPage {
	
	//AndroidDriver<MobileElement> driver;
	public MobileElement more;
	
	//WebElement edit = driver.findElementByXPath("//android.widget.TextView[@text='Edit']");
	
	@AndroidFindBy (xpath = "//android.widget.FrameLayout[@resource-id='com.deg.mdubai:id/navigation_more']")
	public MobileElement more1;
	
	@AndroidFindBy (id="com.deg.mdubai:id/textView_logout")
	public MobileElement logoutbtn;

	@AndroidFindBy (id="android:id/button1")
	public MobileElement okay;
	
	
	public void logoutFunction(AndroidDriver<MobileElement> driver)
	{
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 WebDriverWait wait = new WebDriverWait(driver,100);
	// more = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='com.deg.mdubai:id/navigation_more']")));
	MobileElement  more = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(more1));
	 more.click();
	 MobileElement  logoutbtn1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(logoutbtn));
		logoutbtn1.click();
		
		MobileElement okay1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(okay));
		okay1.click();
		//return new AllServicesPage();
	}
	
	public LogoutPage(AndroidDriver<MobileElement> driver) {
		//this.driver = driver ;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
}
