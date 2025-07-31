package com.test.tatacliq.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"com.test.tatacliq.steps"}

)
public class TestRunner {
}
