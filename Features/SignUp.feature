Feature: Validation Create An Account

  @CreateAnAccount
  Scenario Outline: Validating Create An Account
    Given User Should click account field on the HomePage
    And Click Create Account button
    When Validate the Create Account URL
    And User Enter the First name <firstName> in the Input Field
    And Enter the Last Name <lastName> in the Input Field
    And Enter the Mail ID <mailID> in the Input Field
    And User Must enter the passwor <password>
    And User Must Re_Enter the Conformation Password <password>
    And Enter the Mobile Number <mobileNumber>
    And Click the Use for Account Recovery check box
    And Click the Create Account clicked
    Then Validate the Account Profile URL

    Examples: 
      | firstName  | lastName | mailID                             | password         | mobileNumber |
      | "Santhosh" | "K"      | "harish.venkatesan12023@gmail.com" | "423329@HarishV" | "8807955398" |
