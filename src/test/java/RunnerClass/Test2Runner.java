package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "html:target/site/cucumber-pretty","json:target/cucumber2.json" }, 
        glue = "com.solartis.test.StepDefinitions",
        features = {"src/main/java/FeatureFiles/BaseRateCheck.feature" },
        monochrome=true,
        tags = {"@Secound"},
        strict=true,
        dryRun=false 
)

public class Test2Runner
{
}