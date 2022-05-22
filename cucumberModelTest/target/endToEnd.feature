
Feature: End to end scenario

  
  Scenario: Buy a shirt
    Given Navigate to express.com
    When user click on men menu
    And user click on shirt menu
    And user select a product
    And user select desired size
    And user add the product to the cart
    Then user should see successful message
    

  