package com.test.tatacliq.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.test.tatacliq.steps"},
        dryRun = false,
        tags = "@smoke",
        // name = "jeans",
        // monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}

)
public class TestRunner {
}
