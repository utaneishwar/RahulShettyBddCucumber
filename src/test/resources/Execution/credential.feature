Feature: login by using different credentials

Scenario Outline:
Given user at the loginpage
When user enters "<username>" 
And user  "<password>"
And User clicks on loginButton
And user login successfully

Examples:

| username | password |
| dec07@gmail.com | Test@123 |
| abc07@gmail.com | Pass@123 |
| abc07@gmail.com |123456 |

