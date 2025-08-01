package com.test.tatacliq.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TatacliqSteps {


    @Given("the user opens the TataCliq homepage")
    public void the_user_opens_the_TataCliq_homepage() {
        // Code to navigate to the TataCliq homepage
        System.out.println("User opened the TataCliq homepage.");
    }

    @When("the homepage loads successfully")
    public void the_homepage_loads_successfully() {
        // Code to perform a search for the specified product
        System.out.println("Navigating to the TataCliq homepage...");
    }

     @Then("the user should see the TataCliq logo")
    public void the_user_should_see_the_TataCliq_logo() {
        // Code to verify that search results contain the specified product
        System.out.println("Homepage loaded successfully.");
    }
}