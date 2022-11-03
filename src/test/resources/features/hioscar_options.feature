Feature: hioscar.com care options web app testing

  @intQ
  Scenario: as a user I want to go through insurance plan options selection, submit my choice and land at the page with the title which contains "Oscar".

  Given Open Chrome browser
  When Go to "https://www.hioscar.com/care-options"
  And Click Search network
  * From Coverage year dropdown Select "2023" option
  * From Coverage access dropdown Select "Employer-provided" option
  * From Network partner dropdown Select "Oscar" option
  * From Coverage area dropdown Select "New Jersey"
  Then Click Continue button
  And Verify title contains "Oscar"
