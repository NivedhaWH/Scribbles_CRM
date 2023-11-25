Feature: Accessing the scribbles CRM admin application

  Background: common step
    Given User enters scribbles URL

  @validCredentials
  Scenario: Login with valid credentials
    Given User enter valid username and password
    Then User clicks on login button
    And User verifies the dashboard page
    Then user closes the browser

  @invalidCredentials
  Scenario Outline: Login with invalid credentials
    When User enters invalid "<username>" and "<password>"
    Then User clicks on login button
    And verify user is still in login page
    Then user closes the browser

    Examples: 
      | username   | password        |
      | 8374370427 | admin@scrib     |
      | 8374370427 |                 |
      |   83743704 | admin@scribbles |
      |   83743704 | admin@scrib     |
      |   83743704 |                 |
      |            | admin@scribbles |
      |            | admin@scrib     |
      |            |                 |
