package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/api.feature",
        glue = "apisteps",
        publish= true

)

public class apirunner extends AbstractTestNGCucumberTests {

}
