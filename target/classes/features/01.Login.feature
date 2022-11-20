Feature: Login Staff

  Scenario: TCC.TMS.237 Staff go to web correct URL
    When TCC.TMS.237 Staff enter correct web URL
    Then TCC.TMS.237 Staff on DIKA TMS login page

  Scenario: TCC.TMS.238 Staff go to web incorrect URL
    When TCC.TMS.238 Staff enter incorrect URL
    Then TCC.TMS.238 Staff on 404 page not found

  Scenario: TCC.TMS.239 Staff login valid
    When TCC.TMS.239 Staff on TMS login page
    And TCC.TMS.239 Staff input username password valid
    And TCC.TMS.239 Staff click button login valid
    Then TCC.TMS.239 Staff on dashboard page

  Scenario: TCC.TMS.240 Staff login invalid
    When TCC.TMS.240 Staff on login page invalid
    And TCC.TMS.240 Staff input username password invalid
    And TCC.TMS.240 Staff click button login invalid
    Then TCC.TMS.240 Notification wrong username or password

  Scenario: TCC.TMS.241 Staff login null
    When TCC.TMS.241 Staff on login page null
    And TCC.TMS.241 Staff null username password
    And TCC.TMS.241 Staff click button login null
    Then TCC.TMS.241 Pop up alert please fill out this field

  Scenario: TCC.TMS.242 Staff logout
    When TCC.TMS.242 Staff on dashboard page
    And TCC.TMS.242 Staff click button profile
    And TCC.TMS.242 Staff click button logout
    Then TCC.TMS.242 Staff back to login page