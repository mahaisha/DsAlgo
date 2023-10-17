Feature: Queue feature

Background:
  Given  user is on the "queue" after logged in
  
   
   Scenario Outline: User Interacts with Code Editor on Queue Pages
   
   	When The user clicks "<pageName>" link from main queue page
   	Then check the title of the page "<pageName>"
   	
   	When user clicks try here button
		Then user should be redirected to a page having an tryEditor with a Run button to test
		
		
		When The user enter valid python code in tryEditor from sheetname "<Sheetname1>" and rownumber <RowNumber>
		And  The user clicks on run button
    Then The user should be presented with Run result
    
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter invalid python code in tryEditor from sheetname "<Sheetname2>" and rownumber <RowNumber>
    And  The user clicks on run button
    Then The user should get error message for invalid code
		Examples:
  		| pageName            									| Sheetname1  | RowNumber |Sheetname2 |
  		| Implementation of Queue in Python 		| pythonCode | 0 |codeInvalid |
 			| Implementation using collections.deque| pythonCode | 0 |codeInvalid |
  		| Implementation using array        		| pythonCode | 0 |codeInvalid |
  		| Queue Operations 											|	pythonCode | 0 |codeInvalid |
  