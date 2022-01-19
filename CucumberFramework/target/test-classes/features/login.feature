Feature: This feature is to test the login functionality
  Developer: Fenton
  Tester: Tatiana
  Reviewed by: Daniel

  Background:
    Given user opens website
    And user is on login page

  Scenario: Verify user is able to login with valid credentials

    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is navigated to homepage


  Scenario: Verify user is able to login and logout

    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is on homege
    When user clicks on logout
    Then verify user is navigated to login page
  @Elmaz  @Falcon
  Scenario: Verify user is facing error with blanket credentials

    When user clicks login button
    Then verify user is faced with error




  Scenario Outline: Verify Mark is not able to login with invalid credentials

    When Mark enters invalid login "<username>" and invalid password "<password>"
    And clicks on login button
    Then verify error message shows up
#username and password are connecting data in example to the When
# to pass data driven params we need to use<> & for the simple params we just need to pass String
    Examples:
    |username| password|
    |invalid | valid|
    |Valid | invalid|
    |invalid | valid|
    | | |
    |valid | Valid|

  @Smoke @dataTable
  Scenario: Verify user is can able to see web table data
    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is navigated to homepage
    Then verify table has below data
      | Airi Satou         | Accountant                    | Tokyo         | 33 | 2008/11/28 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 2009/10/09 |
      | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 2009/01/12 |
      | Bradley Greer      | Software Engineer             | London        | 41 | 2012/10/13 |
      | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 2011/06/07 |
      | Brielle Williamson | Integration Specialist        | New York      | 61 | 2012/12/02 |
    When user clicks on user badge icon
    And select on logout option
    Then user is on login page





