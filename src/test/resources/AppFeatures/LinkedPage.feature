Feature: Linked List Page Navigation through link feature
 

    Scenario: User navigated to Introduction page
    Given user is logged in to DS Algo portal
    Given user is on the "linked-list" after logged in 
    When The user clicks "Introduction" on Linked List Page
    Then The user should be directed to "Introduction" of Linked List Page
    
    Scenario: User navigated to tryEditor page with Run button from Introduction page
   	Given The user is on the "Introduction" page 
   	When user clicks try here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	
  	Scenario Outline: The user run the code in tryEditor with valid input for Introduction page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with Run result
    
    Examples:
           | Sheetname  | RowNumber |
           | pythonCode |         0 |

    Scenario Outline: The user run the code in tryEditor with inValid input for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter inValid pythonCode in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with error message
    
    Examples:
           | Sheetname  | RowNumber |
           | codeInvalid|         0 | 
    
    Scenario: user is directed to Creating Linked List page
    Given The user is on the Linked List  page after logged in
    When The user clicks "Creating Linked LIst" on Linked List Page
    Then The user should be directed to "Creating Linked LIst" of Linked List Page
    
    Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
    Given The user is on the "Creating Linked LIst" page
    When user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
    Scenario Outline: The user run the code in tryEditor with valid input for Creating a Linked List page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with Run result
    
    Examples:
    
           | Sheetname  | RowNumber |
           | pythonCode |         0 |
    
     Scenario Outline: The user run the code in tryEditor with inValid input for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter inValid pythonCode in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with error message
    
    Examples:
           | Sheetname  | RowNumber |
           | codeInvalid|         0 | 
           
    Scenario: user is directed to Types of Linked List page 
    Given The user is on the Linked List  page after logged in
    When The user clicks "Types of Linked List" on Linked List Page
    Then The user should be directed to "Types of Linked List" of Linked List Page
    
    Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
    Given The user is on the "Types of Linked List" page
    When user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
     Scenario Outline: The user run the code in tryEditor with valid input for Types of Linked List page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with Run result
    
    Examples:
    
           | Sheetname  | RowNumber |
           | pythonCode |         0 |
           
    Scenario Outline: The user run the code in tryEditor with inValid input for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter inValid pythonCode in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with error message
    
    Examples:
           | Sheetname  | RowNumber |
           | codeInvalid|         0 |        
    
    Scenario: user is directed to Implement Linked List in Python page  
    Given user is on the "Linked-List" after logged in
    When The user clicks "Implement Linked List in Python" on Linked List Page
    Then The user should be directed to "Implement Linked List in Python" of Linked List Page
    
    Scenario: User navigated to tryEditor page with Run button from Implement Linked List in Python page
    Given The user is on the "Implement Linked List in Python" page
    When user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
    Scenario Outline: The user run the code in tryEditor with valid input for Implement Linked List in Python page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with Run result    
    Examples:
    
           | Sheetname  | RowNumber |
           | pythonCode |         0 |
           
    Scenario Outline: The user run the code in tryEditor with inValid input for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter inValid pythonCode in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with error message
    
    Examples:
           | Sheetname  | RowNumber |
           | codeInvalid|         0 |        
    
    Scenario: user is directed to Traversal Page
     Given user is on the "Linked-List" after logged in
    When The user clicks "Traversal" on Linked List Page
    Then The user should be directed to "Traversal" of Linked List Page
    
    Scenario: User navigated to tryEditor page with Run button from Traversal page
    Given The user is on the "Traversal" page
    When user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
     Scenario Outline: The user run the code in tryEditor with valid input for Traversal page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with Run result
    
    Examples:
    
           | Sheetname  | RowNumber |
           | pythonCode |         0 |
           
    Scenario Outline: The user run the code in tryEditor with inValid input for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter inValid pythonCode in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with error message
    
    Examples:
           | Sheetname  | RowNumber |
           | codeInvalid|         0 |         
           
    Scenario: user is directed to Insertion Page      
    Given The user is on the Linked List  page after logged in
    When The user clicks "Insertion" on Linked List Page
    Then The user should be directed to "Insertion" of Linked List Page
   
    Scenario: User navigated to tryEditor page with Run button from Insertion page 
    Given The user is on the "Insertion" page
    When user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
     Scenario Outline: The user run the code in tryEditor with valid input for Insertion page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with Run result
    
    Examples:
    
           | Sheetname  | RowNumber |
           | pythonCode |         0 |
     
      Scenario Outline: The user run the code in tryEditor with inValid input for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter inValid pythonCode in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with error message
    
    Examples:
           | Sheetname  | RowNumber |
           | codeInvalid|         0 | 
           
     Scenario: user is directed to Deletion Page         
     Given The user is on the Linked List  page after logged in
    When The user clicks "Deletion" on Linked List Page
    Then The user should be directed to "Deletion" of Linked List Page
    
    Scenario: User navigated to tryEditor page with Run button from Deletion page
    Given The user is on the "Deletion" page
    When user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
        
     Scenario Outline: The user run the code in tryEditor with valid input for Deletion page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with Run result
    
    Examples:
    
           | Sheetname  | RowNumber |
           | pythonCode |         0 |
           
    Scenario Outline: The user run the code in tryEditor with inValid input for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter inValid pythonCode in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with error message
    
    Examples:
           | Sheetname  | RowNumber |
           | codeInvalid|         0 |         
    
     Scenario: user is directed to Practice Questions Page       
    Given The user is on the Linked List  page after logged in
    When The user clicks "Deletion" on Linked List Page
    And The user clicks "Practice Questions" on Linked List Page
    Then The user should be directed to "Practice Questions" of Linked List Page
    
   