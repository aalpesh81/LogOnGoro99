Feature: User should be Able to Login succesfully

    Scenario Outline: user should be able to login with valid credentials
    Given user is on Guru99 login page
    When user enter valid credentils
    Then user should be able to login successfully
    And user should be albe to see welcome user message

      Examples:
      |username|password|
      |mngr54753|YzUrabu|
