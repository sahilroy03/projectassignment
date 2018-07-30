package Utility;

/**
 * 
 * @author sahilroy
 * Description- This class is used for defining Environment Configuration.
 *
 */

public class EnvironmentConfig {
	
	public static final String apkPath="D:\\Project Assignment\\selendroid-test-app-0.17.0.apk"; 	//Path of the apk file which is under test.
	public static final String PlatformName="Android";												//Name of the platform on which application would run.
	public static final String DeviceName="Nexus 5 API 25";											//Name of the device on which application would run.
	public static final String AppActivity=".HomeScreenActivity";									//appActivity of the application under test.
	public static final String AppPackage="io.selendroid.testapp";									//appPackage of the application under test.
	public static final String AppiumURL="http://0.0.0.0:4723/wd/hub";								//URL of Appium.
	public static final String UserID="User1";														//User ID of the user whose data would be used for test case execution provided in Data Inut Excel.
}
