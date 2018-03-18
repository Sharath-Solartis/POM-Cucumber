package com.solartis.test.cucumber.runnerclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber-html-report"},
        glue = "com.solartis.test.cucumber.stepdefenitions",
        features = {"src/main/java/com/solartis/test/cucumber/FeatureFiles/BaseRateCheck.feature"},
        monochrome=true,
        tags = {"@Secound"},
        strict=true,
        dryRun=false 
)

public class Test2Runnerr
{
}