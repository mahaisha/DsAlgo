Feature: Array Page Navigation through link feature
 

    Scenario: User navigated to Arrays in Python page
    Given user is logged in to DS Algo portal
    Given user is on the "Array" after logged in
    When The user clicks "Arrays in Python" on Array Page
    Then The user should be redirected to "Arrays in Python" page of Array
    
    Scenario: User navigated to tryEditor page with Run button from Array page
   	Given user is on the "Arrays in Python" of Array page 
   	When user clicks try here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	
  	Scenario Outline: The user run the code in tryEditor with valid input for Arrays in Python page
    Given The user is on try here page having tryEditor with a Run button to test from Arrays link page
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with the Run output
    
    Examples:
           | Sheetname  | RowNumber |
           | pythonCode |         0 |
           
   
   Scenario: user is directed to Arrays Using List page
    Given user is on the "Array" after logged in
    When The user clicks "Arrays Using List" on Array Page
    Then The user should be redirected to "Arrays Using List" page of Array 
    
    Scenario: User navigated to tryEditor page with Run button from Array page
   	Given user is on the "Arrays Using List" of Array page  
   	When user clicks try here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	
  	Scenario Outline: The user run the code in tryEditor with valid input for Arrays Using List page
    Given The user is on try here page having tryEditor with a Run button to test from Arrays link page
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with the Run output
    
    Examples:
           | Sheetname  | RowNumber |
           | pythonCode |         0 |
           
     Scenario: user is directed to Basic Operations in Lists page
    Given user is on the "Array" after logged in
    When The user clicks "Basic Operations in Lists" on Array Page
    Then The user should be redirected to "Basic Operations in Lists" page of Array 
    
    Scenario: User navigated to tryEditor page with Run button from Array page
   	Given user is on the "Basic Operations in Lists" of Array page 
   	When user clicks try here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	
  	Scenario Outline: The user run the code in tryEditor with valid input for Basic Operations in Lists page
    Given The user is on try here page having tryEditor with a Run button to test from Arrays link page
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with the Run output
    
    Examples:
           | Sheetname  | RowNumber |
           | pythonCode |         0 |
           
     Scenario: user is directed to Applications of Array page
    Given user is on the "Array" after logged in
    When The user clicks "Applications of Array" on Array Page
    Then The user should be redirected to "Applications of Array" page of Array 
    
    Scenario: User navigated to tryEditor page with Run button from Array page
   	Given user is on the "Applications of Array" of Array page 
   	When user clicks try here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	
  	Scenario Outline: The user run the code in tryEditor with valid input for Applications of Array page
    Given The user is on try here page having tryEditor with a Run button to test from Arrays link page
    When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
    When The user clicks on run button
    Then The user should be presented with the Run output
    
    Examples:
           | Sheetname  | RowNumber |
           | pythonCode |         0 |     
           
    Scenario: user is directed to Practice Questions Page       
    Given user is on the "Array" after logged in
    When The user clicks "Applications of Array" on Array Page
    Then The user clicks "Practice Questions" on Array Page
    Then The user should be redirected to "Practice Questions" page of Array                       