Feature: Filter Price

  @OnlyOneTime
  Scenario: User want to filter price product low to high
    When User launch the web app
    Then User click filter button
    And User sort price low to high
    Then Home Page Should be displayed product price low to high

  Scenario: User want to filter price product high to low
    When User launch the web app
    Then User click filter button
    And User sort price high to low
    Then Home Page Should be displayed product price high to low