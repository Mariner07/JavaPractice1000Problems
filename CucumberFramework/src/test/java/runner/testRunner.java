package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src//test/resources//features//login.feature",
        glue = "com.automation.stepdef",
        tags="@Elmaz and @Falcon"

)
public class testRunner {

}
