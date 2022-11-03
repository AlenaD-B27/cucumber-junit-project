@etsy
Feature: Etsy Titles Verification

  Scenario: Home Page Title Verification
    Given user is on "https://www.etsy.com"
    Then user sees "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone" title


  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given user is on the Home page
    Then user types Wooden Spoon in the search box
    And user clicks search button
    Then user sees Wooden spoon is in the title


  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given user is on "https://www.etsy.com"
    Then user types "Wooden Spoon" in the search box
    And user clicks search button
    Then user sees "Wooden spoon" is in the title

