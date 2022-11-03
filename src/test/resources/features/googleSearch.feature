Feature: Google search functionality
  US: As a user, when I am on a Google search page I should be able to search whatever I want and see relevant information.

@smoke
  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple in the google search box and clicks enter
    Then user sees apple - Google Search is in the google title


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "tesla" in the google search box and clicks enter
    Then user sees "tesla - Google Search" is in the google title