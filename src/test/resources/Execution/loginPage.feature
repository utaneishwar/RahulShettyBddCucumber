Feature: log in to rahulshetty page



Background:
Given user should be on login page 
When user enters username as "kunalbhusari@gmail.com"
And user enters password as "Test@1234"
And user click on Loginbutton
Then user should be navigate to next page


Scenario: click on filter functionallity

When user clicks on checkbox beside fashion
And user should be  seen only two product on page 
And user clicks on add to cart button 
And product should be added in the cart
And user clicks on cart icon or basket
Then user navigate on product added cart page
And user clicks on Checkout button
And user fill the cardnumber details
And user Select the Expirymonth and Date




