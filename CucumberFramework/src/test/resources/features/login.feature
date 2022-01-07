Feature: This feature is to test the login functionality
  Developer: Fenton
  Tester: Tatiana
  Reviewed by: Daniel

  Scenario: Verify user is able to login with valid credentials
    Given user opens website
    And user is on login page
    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is navigated to homepage


  Scenario: Verify user is able to login and logout
    Given user opens website
    And user is on login page
    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is on homege
    When user clicks on logout
    Then verify user is navigated to login page
  @Elmaz  @Falcon
  Scenario: Verify user is facing error with blanket credentials
    Given user opens website
    And user is on login page
    When user clicks login button
    Then verify user is faced with error

  Scenario: Verify Mark is not able to login with invalid credentials
    Given Mark opens website
    And Mark on login page
    When Mark enters invalid login "login" and invalid password "password"
    And clicks on login button
    Then verify error message shows up


