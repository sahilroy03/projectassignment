package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import ApplicationPages.BasePage;
import ApplicationPages.UserRegisterationPage;
import Utility.Constant;
import Utility.CommonUtils;
import Utility.EnvironmentConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

/**
 * 
 * @author sahilroy
 * Description- This class provides the definition to steps created in feature file
 * UserRegister.feature
 *
 */

public class UserRegisterationSteps {
	
	// Initializing variables to store text displayed on the details confirmation page.
	String name="";
    String userName="";
    String password="";
    String email="";
    String programmingLanguage="";
    String TnC="";
    String TnCCheck="";
    
	public static AndroidDriver<AndroidElement> driver;				//Creating reference of android driver
	

	@Given("^Launch the mobile application$")						//Annotation to provide precondition to the test case.
    public void Launch_the_mobile_application() throws Throwable	//Method definition for launching the application.					
    {		
		driver = BasePage.getDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }	
	
	@When("^Navigate to the register user page$")					//Annotation to provide input steps to the test case
	public void Navigate_to_register_user_page() throws Throwable	//Method definition for navigating to register user page.					
    {		
		UserRegisterationPage.clickOnRegisterationBtn(driver);
    }	

    @And("^User details are filled$")								//Annotation to add step of the test case		
    public void User_details_are_filled() throws Throwable 			//Method definition for filling the registration form with user details provided in DataInput.xlsx file.				
    {
    	UserRegisterationPage.fillUserDetails(driver);
    }	
    
    @And ("^Register User button is clicked$")						//Annotation to add step of the test case
    public void Register_User_button_is_clicked() throws Throwable 	//Method definition for clicking on Register User button.
    {
    	UserRegisterationPage.clickOnRegisterUserBtn(driver);
    }

    @Then("^User details should be correct on confirmation page$")						//Annotation to verify expected condition of the test case					
    public void User_details_should_be_correct_on_confirmation_page() throws Throwable //Method definition for verifying user details on confirmation page.							
    {    
        name=UserRegisterationPage.getName(driver);
        userName=UserRegisterationPage.getUserName(driver);
        password=UserRegisterationPage.getPassword(driver);
        email=UserRegisterationPage.getEmail(driver);
        programmingLanguage=UserRegisterationPage.getProgrammingLanguage(driver);
        TnC=UserRegisterationPage.getTnC(driver);
        TnCCheck=(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_TnC).equals("Y")?"true":"false");
        
        Assert.assertEquals(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_UserName),userName);						// Assertion provided for verifying username.
        Assert.assertEquals(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_Name),name);								// Assertion provided for verifying user's name.
        Assert.assertEquals(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_Password),password);						// Assertion provided for verifying user's password.
        Assert.assertEquals(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_Email),email);								// Assertion provided for verifying user's email id.
        Assert.assertEquals(CommonUtils.getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_ProgrammingLanguage),programmingLanguage);	// Assertion provided for verifying user's preferred programming language.
        Assert.assertEquals(TnCCheck,TnC);																		// Assertion provided for verifying if terms and conditions check box selection.
        
        BasePage.CloseApplication(driver);			//Method called to close the application     
    }		
    
    
}
