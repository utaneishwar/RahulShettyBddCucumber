Feature: Recharge Icon

Scenario:
Given user should have Paytm-com page 
And user click on user Recharge prepaid mobile
Then user navigate on paytm-com-recharge page
#And user clicks on prepaid radio button
And user wait until the page loaded
Then user clicks on mobile number textfield and provide mobno "8788584611"
#And user clicks on operator text field and should show dropdown of operator
#Then user should select operator from dropdown and show related plan to inside 
#And user clicks on circle textfield and should show dropdown of circle
And user wait until the page loaded
#Then user should select circle from this dropdown
#And user wait until the page loaded
And user click on Amount and should able to provide amount according plan "15"
And user wait until the page loaded
And user wait until the page loaded
Then user clicks on proceed to recharge button
And user wait until the page loaded