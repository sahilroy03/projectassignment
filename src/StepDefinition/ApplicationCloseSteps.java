package StepDefinition;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import ApplicationPages.ApplicationClosePage;
import ApplicationPages.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author sahilroy
 * Description- This class provides the definition to steps created in feature file
 * ApplicationClose.feature
 *
 */

public class ApplicationCloseSteps {

/**
 * Defining ID's of different locators for identifying different elements displayed on the application
 */
	
public static final String ID_AppCloseButton="io.selendroid.testapp:id/buttonTest";
public static final String ID_ConfirmationMessageText="android:id/message";
public static final String ID_ConfirmationPopUpCancelButton="android:id/button2";
public static final String ConfirmationMessage="This will end the activity";
public AndroidDriver<AndroidElement> driver;							//Creating Android driver reference.


	@Given("^Launch the application$")									//Annotation to provide precondition to the test case.
    public void Launch_the_application() throws Throwable				//Method definition for launching the application.
    {
		driver = BasePage.getDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    @When("^Click on the application close button$")					//Annotation to provide input steps to the test case
    public void Cick_on_the_application_close_button() throws Throwable //Method definition for clicking the application close button.
    {	
    	ApplicationClosePage.click_OnAppCloseBtn(driver);
    }
    
    @Then("^verify the text displayed on the confirmation message$")					//Annotation to verify expected condition of the test case
    public void Verify_the_text_displayed_on_the_confirmation_poup() throws Throwable 	//Method definition for verifying text displayed on confirmation message.
    {
    	String message=ApplicationClosePage.getMessageText(driver);
    	Assert.assertEquals(ConfirmationMessage,message);					// Assertion provided for verifying the text displayed on confirmation message.
    	BasePage.CloseApplication(driver);									//Method called to close the application
    }
    
    @And("^Click on the Cancel button$")									//Annotation to add step of the test case
    public void Click_on_cancel_button()									//Method definition for clicking cancel button of confirmation message.
    {
    	ApplicationClosePage.click_OnAppCloseCancelBtn(driver);
    }

    @Then("^Verify the pop up is closed$")									//Annotation to verify expected condition of the test case
    public void Verify_the_poup_is_closed() throws Throwable				//Method definition for verifying that confirmation message is closed.
    {
    	Assert.assertTrue(ApplicationClosePage.isAppCloseBtnDisplayed(driver)); // Assertion provided for verifying that confirmation message is closed.
    	BasePage.CloseApplication(driver);									//Method called to close the application
    	
    }
}
