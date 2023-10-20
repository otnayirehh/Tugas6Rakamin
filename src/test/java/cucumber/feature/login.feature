Feature: login

  @OnlyOneTime
  Scenario: User login using standard user and registered password
    When User launch the web app
    Then User input registered Username
    And User input registered Password
    Then User tap login button
    And Home Page Should be displayed

  Scenario: User login using incorrect credential
    When User launch the web app
    Then User input unregistered Username
    And User input unregistered Password
    Then User tap login button
    And Error Message should be displayed