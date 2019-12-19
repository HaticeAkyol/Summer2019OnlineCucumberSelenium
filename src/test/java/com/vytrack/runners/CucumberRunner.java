package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/hatice akyol/IdeaProjects/Summer2019OnlineCucumberSelenium/src/test/resources/feature",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "not @negative_test"
)
public class CucumberRunner {
}



