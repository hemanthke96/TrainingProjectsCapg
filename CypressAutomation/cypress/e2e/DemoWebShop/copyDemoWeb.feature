Feature: Automating DemoWebShop website      
      
        Background: Launching Website
            Given I launch the DemoWebShop
            Then I should see Homepage and Logo of the website
       
        Scenario Outline: User should be able to Login to website

                And user is on homepage with logo
                When User clicks on login Page
                And user lands on login Page
                When user enters the following "<email>" and "<password>"
                And user clicks on login button 
                Then user's email is displayed on Homepage 

                Examples:  
                    |email|password|
                    |hemanth31196@gmail.com|Vinaya96@|

        
        Scenario Outline: User should be able to Search for products

                Given user is homepage
                When user search for "<product_name>" 
                And click on search
                Then user should land on search page with Product Name on the top of the page   
                Examples:
                    | product_name | 
                    | Laptop       |


        Scenario Outline: User should be able to add products to shopping cart and Checkout

                Given user is logged in
                When user clicks on Add to Cart on a product
                Then Shopping Cart's value should be updated
                When user clicks on Shopping Cart
                And lands on Shopping Cart Page
                When user selects the following "<country>", "<State>" and "<Zipcode>"
                And clicks on checkout
                Then user should land on checkout page

                Examples:Examples:
                |country      |State     |Zipcode|
                |United States|California|10     |
                    


