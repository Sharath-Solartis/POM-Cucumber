package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "html:target/site/cucumber-pretty","json:target/cucumber.json"},
        glue = "StepDefinitions",
        features = {"src/main/java/FeatureFiles/BaseRateCheck.Feature"},
        monochrome = true
)
public class TestRunner
{

}
