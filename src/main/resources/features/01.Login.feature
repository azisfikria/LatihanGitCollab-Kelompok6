Feature: Login Staff

  Scenario: TCC.TMS.257 Staff go to web correct URL
    When TCC.TMS.257 Staff enter correct web URL
    Then TCC.TMS.257 Staff on DIKA TMS login page

  Scenario: TCC.TMS.258 Staff go to web incorrect URL
    When TCC.TMS.258 Staff enter incorrect URL
    Then TCC.TMS.258 Staff on 404 page not found

  Scenario: TCC.TMS.259 Staff login valid
    When TCC.TMS.259 Staff on TMS login page
    And TCC.TMS.259 Staff input username password valid
    And TCC.TMS.259 Staff click button login valid
    Then TCC.TMS.259 Staff on dashboard page

  Scenario: TCC.TMS.260 Staff login invalid
    When TCC.TMS.260 Staff on login page invalid
    And TCC.TMS.260 Staff input username password invalid
    And TCC.TMS.260 Staff click button login invalid
    Then TCC.TMS.260 Notification wrong username or password

  Scenario: TCC.TMS.261 Staff login null
    When TCC.TMS.261 Staff on login page null
    And TCC.TMS.261 Staff null username password
    And TCC.TMS.261 Staff click button login null
    Then TCC.TMS.261 Pop up alert please fill out this field

  Scenario: TCC.TMS.262 Staff logout
    When TCC.TMS.262 Staff on dashboard page
    And TCC.TMS.262 Staff click button profile
    And TCC.TMS.262 Staff click button logout
    Then TCC.TMS.262 Staff back to login page