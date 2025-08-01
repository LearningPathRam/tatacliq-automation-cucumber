Feature: TataCliq Homepage
@smoke


  Scenario: User visits TataCliq homepage 
    Given the user opens the TataCliq homepage
    When the homepage loads successfully
    Then the user should see the TataCliq logo

@smoke2

  Scenario: User searches for brand "womens jeans" in TataCliq homepage

    Given the user opens the TataCliq main page
    When the user searches for "womens jeans"
    Then the search results should display products related to "womens jeans"
    
