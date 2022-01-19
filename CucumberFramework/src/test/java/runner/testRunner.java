package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//Runner class is a class where we give configuration to which feature file & scenario we want to run on Cucumber Tags

//Background defines a step or series of steps that are common to all the tests in the feature file.

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src//test/resources//features//login.feature",
        glue = "com.automation.stepdef",
        tags="@Elmaz and @Falcon"

)
public class testRunner {

}
