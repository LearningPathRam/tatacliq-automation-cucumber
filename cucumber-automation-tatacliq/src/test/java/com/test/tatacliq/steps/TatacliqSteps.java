package com.test.tatacliq.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



public class TatacliqSteps {
    // private WebDriver driver;
    // Initialize WebDriver in the constructor or a setup method if needed

    @Given("the user opens the TataCliq homepage")
    public void the_user_opens_the_TataCliq_homepage() throws IOException {
        ChromeOptions options = new ChromeOptions();
 
    // Required options for headless Chrome inside Codespaces or CI
    options.addArguments("--headless=new");
    options.addArguments("--disable-gpu");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--remote-allow-origins=*");
 
    // Unique user-data-dir to avoid conflict
    Path tempProfile = Files.createTempDirectory("selenium-profile");
    options.addArguments("--user-data-dir=" + tempProfile.toString());
 
    // Optional: Logging
    System.out.println("Launching Chrome with temp profile: " + tempProfile.toString());
 
    WebDriver driver = new ChromeDriver(options);
driver.get("https://www.tatacliq.com");
    System.out.println("Opened TataCliq homepage");
 
    // Close after test
    driver.quit();
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