package TestRunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

/**
 * 
 * @author sahilroy
 * Description- This class provides a mapping between the feature files provided in Features folder
 * and the Step Definition java files provided under StepDefinition package.
 *
 */

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"StepDefinition"})

public class Runner {

}
