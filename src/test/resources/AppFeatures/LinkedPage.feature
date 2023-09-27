Feature: Linked Page feature
 

  Scenario: The user is able to naviagte to Linked List Page
  
    Given The user is in the "Linked List"  page after logged in
    When The user clicks "Introduction" button on Linked List Page
    Then The user should be directed to "Introduction" of Linked List Page
    
