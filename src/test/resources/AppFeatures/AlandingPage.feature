Feature: Landing Page feature

Scenario:
  	Given The user opens DS Algo portal link
  	Then The user should land in DS Algo portal page
  
Scenario:
  	Given The user opens DS Algo portal link
  	When The user clicks the "Get Started" button
  	Then The user should be redirected to homepage
  	
  	
Scenario:
  	Given The user opens Home Page
  	When The user clicks the "Get Started" button
  	Then The user should see 7 panes with different data structires
  	
Scenario Outline: The user is on HomePage and user clicks any of the "Get Started" buttons below the data structures without Sign in.
		Given user is on Home Page
  	When user clicks "<page_name>" page
  	Then It should alert the user with a message "You are not logged in"
  	 Examples: 

      | page_name |
      | data-structures-introduction | 
      | array |
      |linked-list| 
      |stack|
      |queue| 
      |tree| 
      |graph|
      
Scenario Outline: The user is on HomePage and user selects any data structure from drop-down without Sign in.
		Given user is on Home Page
  	When user clicks drop down wihtout signin.
  	When user selects "<data_structure>" from drop down.
  	Then It should alert the user with a message "You are not logged in"
  	 Examples: 

      | data_structure | 
      | array |
      |linked-list| 
      |stack|
      |queue| 
      |tree| 
      |graph|
      

Scenario: User is redirected to SignIn when Sign in is clicked.
		Given The user opens Home Page
		When The user clicks "Sign in"
		Then The user should be redirected to Sign in page
		
Scenario: User is redirected to SignIn when Sign in is clicked.
		Given The user opens Home Page
		When The user clicks "Register"
		Then The user should be redirected to Register form
		
			
			
	  
 
