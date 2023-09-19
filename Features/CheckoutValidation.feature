Feature: Validating Checkout Functionality

	@checkout
  Scenario: Verifying Checkout
    Given User Click the Select a store to see availability Radio button
    And User Enter PinCode in the Input Field "99504"
    And Click the Go button
    And User Select First Listed City, Pick Up here button
    And Click the Checkout button
    And User Click the Continue as Guest button
    And Scroll Down to visible of Email Address Input Field
    And User Enter the Email Address
    And Enter the Mobile Number
    And Click the Want to Want to receive text updates? Check box
    And User Click the Continue to Mobile Setup
    Then Verify the Payment URL
