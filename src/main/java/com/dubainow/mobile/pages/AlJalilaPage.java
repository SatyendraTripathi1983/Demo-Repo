package com.dubainow.mobile.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dubainow.mobile.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AlJalilaPage extends TestBase{
	
	 
		
		@AndroidFindBy(id = "com.deg.mdubai:id/search")
		public MobileElement search;
		
		
		@AndroidFindBy(id = "com.deg.mdubai:id/search_src_text")
		public MobileElement searchText;
		
		@AndroidFindBy(xpath = "//android.widget.Button[@text='Open']")
		public MobileElement open;
		
		public EntityPage searchforEntity() {
			search.click();
			searchText.sendKeys("Al Jalila");
			WebDriverWait wait = new WebDriverWait(driver,100);
			MobileElement open1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(open));
			open1.click();
			return new EntityPage(driver);
			}
		
		public  AlJalilaPage(AndroidDriver<MobileElement> driver) {
			//this.driver = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			
		}


}
