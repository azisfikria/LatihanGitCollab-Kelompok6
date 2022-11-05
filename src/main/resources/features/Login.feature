Feature: Login User

  Scenario: User valid login
    When User go to Web Shop Demoqa
    And User click MyAccount Page
    And User enter username password
    And User click button login
    When User valid credentials