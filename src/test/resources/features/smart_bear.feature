Feature: SmartBear order process

  @wip
  Scenario: As a user, on Order Page I want to be able to see John Wick in the list after I fill out the form with valid data

  When User is logged into SmartBear Tester account on Order page
  And User fills out the form as followed:
  When User selects "FamilyAlbum" from product dropdown
  And User enters "4" to quantity
  And User enters "John Wick" to customer name
  And User enters "Kinzie Ave" to street
  And User enters "Chicago" to city
  And User enters "IL" to state
  And User enters "60056"
  And User selects "Visa" as card type
  And User enters "1111222233334444" to card number
  And User enters "12/22" to expiration date
  And User clicks process button
  Then User verifies "John Wick" is in the list