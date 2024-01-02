Feature: Datatable validate using login credential
Scenario:
Given user at the loginpage
When user enters "<username>" 
And user  "<password>"

| username | password |
| dec07@gmail.com | Test@123 |
| abc07@gmail.com | Pass@123 |
| abc07@gmail.com |123456 |

And User clicks on loginButton
And user login successfully
