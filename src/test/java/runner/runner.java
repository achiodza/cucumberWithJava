package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/assessment.feature",
        glue = "stepdefination",
        publish= true



)
public class runner extends AbstractTestNGCucumberTests {
}
