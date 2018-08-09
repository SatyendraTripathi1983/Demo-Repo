package com.dubainow.mobile.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dubainow.mobile.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AllServicesPage extends TestBase {
	
	@AndroidFindBy (id = "com.deg.mdubai:id/btnCancel" )
	public MobileElement enoc;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Utilities & Bills']")
	public MobileElement utility;
	
	public   AlJalilaPage ClickonUtility() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		 MobileElement enoc1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(enoc));
		enoc1.click();
		
		 MobileElement utility1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(utility));
		utility1.click();
		return new AlJalilaPage(driver);
		}
	
	public  AllServicesPage(AndroidDriver<MobileElement> driver) {
		//this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	
	

}
