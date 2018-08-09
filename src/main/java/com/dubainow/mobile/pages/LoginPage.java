package com.dubainow.mobile.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dubainow.mobile.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends TestBase {
	
	//AndroidDriver<MobileElement> driver;
	
	
	
	@AndroidFindBy(id= "com.deg.mdubai:id/edit_email")
	public MobileElement username;
	
	@AndroidFindBy(id= "com.deg.mdubai:id/edit_password")
	public MobileElement password;
	
	@AndroidFindBy(id= "com.deg.mdubai:id/btn_login")
	public MobileElement loginbtn;
	
	@AndroidFindBy(id="com.deg.mdubai:id/btn_english")
	public MobileElement english;
	
	@AndroidFindBy(id="com.deg.mdubai:id/buttonSkip")
	public MobileElement skip;
	
	
	@AndroidFindBy(id="com.deg.mdubai:id/btn_sign_in")
	public MobileElement loginbt;
	
	
	public  AllServicesPage loginFunction() {
		
		WebDriverWait wait = new WebDriverWait(driver,100);
		english.click();
		MobileElement skip1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(skip));
		skip1.click();
		MobileElement loginbt1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(loginbt));
		loginbt1.click();
		username.sendKeys(prop.getProperty("Username"));
		password.sendKeys(prop.getProperty("Password"));
		loginbtn.click();
		return new AllServicesPage(driver);
		}
	
	public LoginPage() {
		//this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

}
