package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber-html-report"},
        glue = "com.solartis.test.StepDefinitions",
        features = {"src/main/java/FeatureFiles/BaseRateCheck.Feature"},
        monochrome=true,
        tags = {"@First"},
        strict=true,
        dryRun=false 
)

public class Test1Runner
{
}