Scenario: Verify user can able to login with valid credentials
  Given user opens website
  And user is on login page
  When user enters username "admin" and password "admin123"
  And click on login button
  Then verify user is navigated to homepage
  When user hover mouse on PIM menu
  And click on Add Employee link
  Then verify user is navigated to add employee page
  When user enters valid details on add employee page
  And click on save button
  Then verify user is navigated to personal details page