package com.test.tatacliq.steps;

import io.cucumber.java.en.*;

public class TatacliqSearchSteps {

    @Given("the user opens the TataCliq main page")
    public void openTataCliqMainPage() {
        System.out.println("Opening TataCliq main page... ");
    }

    @When("the user searches for {string}")
    public void searchForBrand(String brand) {
        System.out.println("Searching for brand: " + brand);
    }

    @Then("the search results should display products related to {string}")
    public void verifySearchResults(String brand) {
        System.out.println("Verifying search results for brand: " + brand);
    }

}
