Feature: Login page feature
  Registered user should be able to login
  

  Scenario: Validate Register link on login page
    Given user is on login page
    When user clicks Register link 
    Then user should be redirected to "Registration" page

	Scenario: Validate Login link on registration page
	Given user is on register page
	When user clicks login link on registartion page
	Then user should be redirected to "Login" page
    
  Scenario: Login with all fields blank
  Given user is on login page
  When user clicks on Login button
  Then It should display an error "Please fill out this field." below username textbox on login page
  
  Scenario: Login with password field blank
  Given user is on login page
  And user enters valid username
  |username|
  |Numpysdet84|
  When user clicks on Login button
  Then It should display an error "Please fill out this field." below Password textbox on login page
  
  Scenario: Login with username field blank
  Given user is on login page
  And user enters valid password
    |password|
    |sdet84batch|
  When user clicks on Login button
  Then It should display an error "Please fill out this field." below username textbox on login page
  
  Scenario Outline: Login with invalid credentials
  Given User enters invalid "<username>" and invalid "<password>" combinations
  When user clicks on Login button
  Then user gets an error message "Invalid Username and Password"
  Examples:
  |username  |password   |
  |Batch124  |Ninjas123  |
  |@345@&*%@ |Selenium123|
  |sdet124   |welome123  |

 Scenario: Login with correct credentials
    Given user is on login page
    When user enters valid username
    |username|
    |Numpysdet84|
    And user enters valid password
    |password|
    |sdet84batch|
    And user clicks on Login button
    Then The user should be redirected to Home Page with the message "You are logged in" and with the user name on the top.
    Then user should be redirected to "NumpyNinja" page
  

 
 
