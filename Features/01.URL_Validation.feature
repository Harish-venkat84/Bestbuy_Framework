Feature: Validating Choose Country and Base URL and Bottom Links URL 

  @ValidatingBaseURL
  Scenario: Validating Base URL
    Given Verifying that the Base URL is not broken

  @ChooseCountry
  Scenario: Validating Choose Country
    Given User Should Click the given Country

  @ValidatingBottomLinks
  Scenario: Validating Bottom Links
    Given Verifying the Bottom Links are working fine
