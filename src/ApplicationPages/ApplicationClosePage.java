package ApplicationPages;


import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * 
 * @author sahilroy
 * Description- This class provides the locators and the methods for 
 * ApplicationClose step definition file.
 *
 */

public class ApplicationClosePage {
	
	/**
	 * Defining locator id for identifying different elements displayed on the application
	 */
	public static final String ID_AppCloseButton="io.selendroid.testapp:id/buttonTest";
	public static final String ID_ConfirmationMessageText="android:id/message";
	public static final String ID_ConfirmationPopUpCancelButton="android:id/button2";
	public static final String ConfirmationMessage="This will end the activity";
	
	public AndroidDriver<AndroidElement> driver;	//Creating reference of android driver
		
	
	public static void click_OnAppCloseBtn(AndroidDriver<AndroidElement> driver)		//Method defined for clicking on Application Close Button.
	{
		driver.findElement(By.id(ID_AppCloseButton)).click();
	}
	
	public static void click_OnAppCloseCancelBtn(AndroidDriver<AndroidElement> driver)	//Method defined for clicking on Confirmation Message Cancel button.
	{
		driver.findElement(By.id(ID_ConfirmationPopUpCancelButton)).click();
	}
	
	public static boolean isAppCloseBtnDisplayed(AndroidDriver<AndroidElement> driver)	//Method defined for knowing the display of application close button.
	{
		return driver.findElement(By.id(ID_AppCloseButton)).isDisplayed();
	}
	
	public static String getMessageText(AndroidDriver<AndroidElement> driver)			//Method defined for getting the text of message displayed on application closeconfirmation pop up.
	{
		return driver.findElement(By.id(ID_ConfirmationMessageText)).getText();
	}

}
