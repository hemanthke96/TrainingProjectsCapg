Feature: Test file

  Scenario: Login Functionality
    Given Open web Browser and user is on homepage
    And Click on login link in homepage and Enter the Details
    Then Click on Login to login successfully
    
	Scenario: Search a product and get the data of the product
		Given Open web Browser and user is on homepage
		And Click on Seach Box and enter the product to be searched.
		Then Click on enter and get the details of the product 