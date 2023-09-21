Feature: Validating Longin Functionality

  @LoginWithValidCredentials
  Scenario: Longin with Valid Credentials
    Given User click the account field
    And Click SigIn button and navigate to sigIn page
    When User Enter the Mail Id in the Input Field
    And Enter the Password in the Password Field
    Then SigIn button clicked successfully

	@LoginWithInvalidCredentials
  Scenario Outline: Login With Invalid Credentials
    Given User click the account field on the Home Page
    And Click SigIn button to navigate sigIn page
    When User Enter the Invalid Mail Id <mailID> in the Input Field
    And Enter the Invalid Password <Password> in the Password Field
    And Click the SigIn button
    Then Validate the Error Message	is shown to user

    Examples: 
      | mailID                | Password       |
      | "test123@gmail.com"   | "123456788"    |
      | "harish123@gmail.com" | "password123@" |
