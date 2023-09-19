Feature: Validating Menu Functionality


	@menuCategories	
	Scenario: Validating Menu All the Categories	
# Before running this scenario, you need to know some preconditions.
# Don't interact with your keyboard and mouse while running scenarios,
# each and every title is stored in the titles folder.
	Given User Navigate to Menu Categories One by One


  @ShopByDepartment
  Scenario: Verifying Shop By Department
    Given User Click the Menu Drop Down
    And User Select the Department Drop Down "Appliances"
    And User select the Products Drop Down "Washers & Dryers" and select Product Name Or Select Products Name "Front-Loading Washers"
    And Get First Listed Product Name
    And Click the Add To Cart button
    And Click Go To Cart button
    And Scroll Down Until No Thank button visible to User
    And Click No Thank button
    And Get Product Name from the Cart
    Then Verify Added Product and Listed Cart are same By there Name


	@shopByBrands
  Scenario: Verifying Menu Shop By Brands
    Given User Select Menu Drop Down
    And From the Menu Drop Down Select the Brands Drop Down
    And User click Brand Name "Apple"
    And Click the given Category Name "iPhone"
    And Click the Product Name "iPhone 14"
    When Scroll Down to Visible of Active Today Field
    And User select Active Today
    When Scroll Down to Visible of Add To Cart
    And User Click the Add To Cat button
    And click the Lests Get Started button
    And User Select the No
    And Click the Continue button
    And User Select the No Thank
    And User Select Continue with out Trade
    And Select the Get a new number
    And User click the Continue button
    And User select Pan
    And User should Click the continue button 
    Then User Clicked the Go To Cart button
    
    