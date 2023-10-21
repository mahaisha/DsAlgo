Feature: Registration page on Ds-Algo Portal.
Validating Registration Page .

#registerWithAllFieldsBlank
Scenario: User clicks Register button with all fields empty
Given User is on DS-Algo website
And User clicks on Register link
When User clicks on register button
Then It should display an error "Please fill out this field." below Username textbox

#registerWithUsernameOnly
Scenario: User clicks Register button with only valid username
Given user is on register page
And user enters the valid username
|username|
|NumpyNinja123|
When User clicks on register button
Then It should display an error "Please fill out this field." below Password textbox

#registerWithBlankPasswordConfirmField
Scenario: User tries to register with valis username and valid password
Given user is on register page
And User enters valid username and valid password
|username|password|
|NumpyNinja123|Ninjas123|
When User clicks on register button
Then It should display an error "Please fill out this field." below Password Confirmation textbox

#InvalidCredentials
Scenario Outline: User enters invalid credentials
    Given User enters invalid "<username>" and invalid "<password>"
    And User enters invalid "<password_confirm>"
    When User clicks on register button
    Then User gets an error message "password_mismatch:The two password fields didn’t match."
    Examples: 
      | username  | password | password_confirm  |
      | sdet124   | Welcome1 |  Welcome12        |
      | sdet125   | sdet125  |  sdet125          |
      | NumpyNinja| 12345678 |  12345678         |
      | Ninjas    | abc      |  abc              |
      | !@$&%@!   | Ninja123 | Ninja123          |

#ValidCredentialsWithRandomGeneratorUsingExcel
@skip
Scenario Outline: User enters credentials from an excel sheet
 Given User clicks on Register link
 And User enters valid values from "<sheetname>" and <Rownumber> 
 When User clicks on register button
 Then The user should be redirected to Homepage with the message as New Account Created.
    Examples:
    	|sheetname|Rownumber|
    	|Register |0        |
    	
#LogoutSucessfully
@skip
Scenario: User signs out sucessfully
	Given user is on "NumpyNinja" page
	When User clicks Signout button
	Then User is logged out sucessfully with message "Logged out successfully"