Feature: Home Page feature

   
  Scenario Outline: user is on the Page after logged in 
    Given user is logged in to DS Algo portal
    When user clicks "<page_name>" page
    Then check the title of the page "<title>"

    Examples: 
      | page_name  | title |
      | data-structures-introduction | Data Structures-Introduction |
      | array | Array |
      |linked-list| Linked List |
      |stack| Stack |
      |queue| Queue |
      |tree| Tree |
      |graph| Graph |

 