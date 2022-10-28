Feature: Wikipedia Search Functionality and verifications

  Background:
    Given User is on Wikipedia home page

  Scenario: Wikipedia Search Functionality Title Verification

    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title
@scenarioOutlinePractice
  Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT


    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title

    Examples:
      | searchValue      | expectedTitle    |
      | Steve Jobs       | Steve Jobs       |
      | Bill Gates       | Bill Gates       |
      | Chuck Norris     | Chuck Norris     |
      | Lindsey Stirling | Lindsey Stirling |
      | Elon Musk        | Elon Musk        |
      | Dwayne Johnson   | Dwayne Johnson   |
      | Lady Gaga        | Lady Gaga        |
      | Al Pacino        | Al Pacino        |
