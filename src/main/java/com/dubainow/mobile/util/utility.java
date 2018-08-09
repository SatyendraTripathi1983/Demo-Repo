package com.dubainow.mobile.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dubainow.mobile.base.TestBase;

public class utility extends TestBase{
	
	public static long PAGELOAD_TIMEOUT = 20 ;
	public static long IMPLICIT_WAIT =20 ;
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
		}
	
	public void waiting() {
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

}
