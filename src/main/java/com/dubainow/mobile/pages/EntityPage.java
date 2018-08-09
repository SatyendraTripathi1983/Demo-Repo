package com.dubainow.mobile.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dubainow.mobile.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EntityPage extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver,100);
	
	@AndroidFindBy(id = "com.deg.mdubai:id/lbl_add_account")
	public MobileElement addAccount;
	//MobileElement addAccount1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(addAccount));
		
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Nickname']")
	public MobileElement nickName;
	//MobileElement nickName1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(nickName));
	
	
	@AndroidFindBy(id = "com.deg.mdubai:id/lbl_description")
	public MobileElement choose;
	
	@AndroidFindBy(id = "com.deg.mdubai:id/lbl_description")
	public List<MobileElement> chooseOne;
	
	//MobileElement chooseOne1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(chooseOne));
	
	//driver.findElementsById("com.deg.mdubai:id/lbl_description").get(1).click();
	
	//MobileElement addAccount1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(addAccount));
	
	@AndroidFindBy(id = "com.deg.mdubai:id/subscribe_btn")
	public MobileElement save;
	//MobileElement save1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(save));
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Edit']")
	public MobileElement edit;
	//MobileElement edit1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(edit));
	
	@AndroidFindBy(id = "com.deg.mdubai:id/img_delete_account")
	public MobileElement delete;
	//MobileElement delete1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(delete));
	
	@AndroidFindBy(id = "android:id/button1")
	public MobileElement okay;
	//MobileElement okay1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(okay));
	
	
	
	public void subscribeforEntityJalila() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		
		MobileElement addAccount1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(addAccount));
		addAccount1.click();
		MobileElement nickName1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(nickName));
		nickName1.sendKeys(prop.getProperty("Name"));
		MobileElement choose1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(choose));
		choose1.click();
		chooseOne.get(1).click();
		MobileElement save1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(save));
		save1.click();
		
		//return new LogoutPage(driver);
		
		}
	
public LogoutPage unsubscribeforEntityJalila() {
	WebDriverWait wait = new WebDriverWait(driver,100);
	MobileElement edit1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(edit));
	edit1.click();
	delete.click();
	okay.click();
	return new LogoutPage(driver);
		
		}
	
	public  EntityPage(AndroidDriver<MobileElement> driver) {
		//this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

}
