package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/hatice akyol/IdeaProjects/Summer2019OnlineCucumberSelenium/src/test/resources/feature",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@smoke_test",
        plugin = {"html:target/default-cucumber-reports"}

)
public class CucumberRunner {
}



