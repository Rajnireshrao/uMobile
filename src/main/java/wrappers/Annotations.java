package wrappers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
//import utils.DataInputProvider;
//import utils.DataInputProvider;

public class Annotations {
	public static AppiumDriver<MobileElement> driver;
	//public String excelFileName;
	
	@BeforeMethod
	public void launchApp()
	
	{
try {
			
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia 5.1 plus");
			caps.setCapability(MobileCapabilityType.UDID, "PDAID18092102584");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
			caps.setCapability("appPackage", "com.doodle.umobile");
			caps.setCapability("appActivity", "com.doodle.umobile.SplashActivity");
			
		
				URL url = new URL("http://0.0.0.0:4723/wd/hub");
				driver = new AppiumDriver<MobileElement>(url,caps);
				
			} catch (MalformedURLException e) {
				
				e.getMessage();
				System.out.println("Messgae is "+e);
				
			}
		
		System.out.println("App is launched");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		//System.out.println("Permission Allowed");
	
	}
	
	
	/*
	 * @AfterMethod public void closeApp() {
	 * 
	 * }
	 */
	
	

	
	
	/*@DataProvider(name="fetchData")
	public String[][] getData() throws InvalidFormatException, IOException{
		return DataInputProvider
				.readExcel(excelFileName);*/

	 
	
	
	
	
	
	
	
	
	
	

}

