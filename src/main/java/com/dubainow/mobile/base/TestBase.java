package com.dubainow.mobile.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;



import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.dubainow.mobile.util.WebEventListener;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.events.api.general.AppiumWebDriverEventListener;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	public static AndroidDriver<MobileElement>	driver	;
	//public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static AppiumWebDriverEventListener eventListener;
	//protected WebDriverWait wait = new WebDriverWait(driver,100);
	
	public TestBase() {
		
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\SeleniumAppium Scripts\\POMJenkinsAIDExtn\\src\\main\\java\\com\\dubainow\\mobile\\config\\config.properties");
			prop.load(ip);	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initalization() {
		
		File appDir = new File("src");
		//System.out.println(appDir);
		//File app = new File(appDir,"DubaiNowP.apk");
		File app = new File(appDir,prop.getProperty("appName"));
		
		DesiredCapabilities DC = new DesiredCapabilities() ;
		DC.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo5X");
		DC.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android" );
				
//		DC.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.deg.mdubai");
//		DC.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"ae.gov.dsg.mdubai.login.NewLoginActivity");
		DC.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		DC.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		//DC.setCapability("noReset", true);
	
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),DC);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	/*e_driver = new EventFiringWebDriver(driver);
	eventListener = new AppiumWebDriverEventListener();
	e_driver.register(eventListener);
	driver = e_driver;*/
	
	
		
	
	
	

}
}

