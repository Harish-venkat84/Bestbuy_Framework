Feature: Validation Search and Add To Cart Functionality

  @SearchAndAddToCart
  Scenario: Validating Search Functionality
    Given User Enter the Product Name or Product Category Name "laptop"
    And User Select the First Listed Product on the Search List
    When Scroll Down to First Listed Product
    And Get the Name of the Product
    And User Click AddToCart button
    When Poup Displayed to use and click the GoToCart
    And Get the Name of the Product Which is Present in Cart
    Then Validate the Both Names to verify Both are Same Product
