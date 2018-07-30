package ApplicationPages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import Utility.CommonUtils;
import Utility.Constant;
import Utility.EnvironmentConfig;

/**
 * 
 * @author sahilroy
 * Description- This class provides the locators and the methods for 
 * UserRegisteration step definition file.
 *
 */

public class UserRegisterationPage {
	/**
	 * Defining locator id for identifying different elements displayed on the application
	 */
	
	public static final String ID_RegisterationButton="io.selendroid.testapp:id/startUserRegistration";
	public static final String ID_UserName="io.selendroid.testapp:id/inputUsername";
	public static final String ID_Email="io.selendroid.testapp:id/inputEmail";
	public static final String ID_Password="io.selendroid.testapp:id/inputPassword";
	public static final String ID_Name="io.selendroid.testapp:id/inputName";
	public static final String ID_PreferredLanguage="io.selendroid.testapp:id/input_preferedProgrammingLanguage";
	public static final String ID_TnC="io.selendroid.testapp:id/input_adds";
	public static final String ID_RegisterUserButton="io.selendroid.testapp:id/btnRegisterUser";
	public static final String ID_NameLabel="io.selendroid.testapp:id/label_name_data";
	public static final String ID_UserNameLabel="io.selendroid.testapp:id/label_username_data";
	public static final String ID_PasswordLabel="io.selendroid.testapp:id/label_password_data";
	public static final String ID_EmailLabel="io.selendroid.testapp:id/label_email_data";
	public static final String ID_PreferredLanguageLabel="io.selendroid.testapp:id/label_preferedProgrammingLanguage_data";
	public static final String ID_TnCLabel="io.selendroid.testapp:id/label_acceptAdds_data";
	public static String xpath_Langauge="//android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView["+CommonUtils.getLanguageIndex()+"]";
	
	public static AndroidDriver<AndroidElement> driver;				//Creating reference of android driver

	
	public static void clickOnRegisterationBtn(AndroidDriver<AndroidElement> driver) 			//Method defined for clicking on Registration Button.
	{
		driver.findElement(By.id(ID_RegisterationButton)).click();
	}
	
	public static void fillUserDetails(AndroidDriver<AndroidElement> driver) throws Exception	//Method defined for filling details Registration Page.
	{
		
		driver.findElement(By.id(ID_UserName)).sendKeys(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_UserName));
    	
    	driver.findElement(By.id(ID_Email)).sendKeys(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_Email));
    	
    	driver.findElement(By.id(ID_Password)).sendKeys(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_Password));
    	
    	driver.findElement(By.id(ID_Name)).clear();
    	
    	driver.findElement(By.id(ID_Name)).sendKeys(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_Name));
    	
    	driver.navigate().back();
    	
    	driver.findElement(By.id(ID_PreferredLanguage)).click();
    	
    	driver.findElement(By.xpath(xpath_Langauge)).click();
    	
    	if(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_TnC).equals("Y"))			//Condition to check if user agrees to terms and condition
    	{
    		driver.findElement(By.id(ID_TnC)).click();
    	}
	}
	
	public static void clickOnRegisterUserBtn(AndroidDriver<AndroidElement> driver)			//Method defined for clicking on Register User Button.
	{
    	driver.findElement(By.id(ID_RegisterUserButton)).click();
	}
	
	public static String getName(AndroidDriver<AndroidElement> driver)						//Method defined for getting text of Name label.
	{
		return driver.findElement(By.id(ID_NameLabel)).getText();
	}
	
	public static String getUserName(AndroidDriver<AndroidElement> driver)					//Method defined for getting text of UserName label.
	{
		return driver.findElement(By.id(ID_UserNameLabel)).getText();
	}
	
	public static String getPassword(AndroidDriver<AndroidElement> driver)					//Method defined for getting text of Password label.
	{
		return driver.findElement(By.id(ID_PasswordLabel)).getText();
	}
	
	public static String getEmail(AndroidDriver<AndroidElement> driver)						//Method defined for getting text of Email label.
	{
		return driver.findElement(By.id(ID_EmailLabel)).getText();
	}
	
	public static String getProgrammingLanguage(AndroidDriver<AndroidElement> driver)		//Method defined for getting text of Programming Language label.
	{
		return driver.findElement(By.id(ID_PreferredLanguageLabel)).getText();
	}
	
	public static String getTnC(AndroidDriver<AndroidElement> driver)						//Method defined for getting condition of TnC label.
	{
		return driver.findElement(By.id(ID_TnCLabel)).getText();
	}

}
