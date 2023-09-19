Feature: Validating Longin Functionality

	@Login
  Scenario: Longin with Valid Credentials
    Given User click the account field
    And Click SigIn button and navigate to sigIn page
    When User Enter the Mail Id in the Input Field
    And Enter the Password in the Password Field
    Then SigIn button clicked successfully
