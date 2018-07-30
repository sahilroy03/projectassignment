package ApplicationPages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import Utility.EnvironmentConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * 
 * @author sahilroy
 * Description- This class provides methods which are primarily needed for test case execution
 *
 */

public class BasePage {
	
	public static DesiredCapabilities setCapabilities() // Method defined to set capabilities for Appium server to run a apk file
	{
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("platformName", EnvironmentConfig.PlatformName);
		capability.setCapability("deviceName", EnvironmentConfig.DeviceName);
		capability.setCapability("app", EnvironmentConfig.apkPath);
		capability.setCapability("appActivity", EnvironmentConfig.AppActivity);
		capability.setCapability("appPackage", EnvironmentConfig.AppPackage);
		return capability;
	}
	
	public static AndroidDriver<AndroidElement> getDriver() throws MalformedURLException //Method to get the android driver object.
	{
		return new AndroidDriver<AndroidElement>(new URL(EnvironmentConfig.AppiumURL), setCapabilities());
	}
	
	public static void CloseApplication(AndroidDriver<AndroidElement> driver) //Method to close the application once execution is finished.
	{
		((AppiumDriver)driver).closeApp();
	}
	
	
}
