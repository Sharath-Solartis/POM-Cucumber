package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "html:target/site/cucumber-pretty","json:target/cucumber1.json" }, 
        glue = "com.solartis.test.StepDefinitions",
        features = {"src/main/java/FeatureFiles/BaseRateCheck.feature" },
        monochrome = true, 
        strict = true,
        dryRun = false,
        tags = {"@First"}       
)

public class Test1Runner
{
}