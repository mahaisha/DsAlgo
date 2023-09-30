@tag
Feature: Tree Feature

Scenario Outline: When click on Topics in Tree page, user is redirected to tryeditor with run button to test
 
	Given user is on the "tree" after logged in
  And The user clicks "<pageName>" link from main tree page
  When user clicks try here button
	Then user should be redirected to a page having an tryEditor with a Run button to test
		
	Examples:
	| pageName |
  |Overview of Trees | 
  |Terminologies | 
  |Types of Trees | 
  |Tree Traversals|
  |Traversals-Illustration|
  |Binary Trees|
	|Types of Binary Trees|
	|Implementation in Python|
	|Binary Tree Traversals|
	|Implementation of Binary Trees|
	|Applications of Binary trees|
	|Binary Search Trees|
	|Implementation Of BST|
	
	
Scenario Outline: The user is able run code in tryEditor for topics in Tree page
	
		
	Given The user is in "Overview of Trees" page having tryEditor with Run button
	When The user enter valid python code in tryEditor from sheetname "<Sheetname>" and rownumber <RowNumber>
	And The user clicks on run button
	Then The user should be presented with Run result
    
	Examples:  
  | Sheetname  | RowNumber |
  | pythonCode |         0 |
	
	


Scenario:
	Given The user is in the Implementation Of BST page after logged in
	When The user clicks "Practice Questions" link
 	Then The user should be directed to "practice" Page
 		
 		
 