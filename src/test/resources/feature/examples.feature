Feature: Login feature

Scenario Outline: Login failure scenarios

Given User is on Facebook Login Page
When User enter "<userName>" and "<password>"
And User enter <OTP> in token
Then Unsuccessful login message displayed

Examples:
	|userName         |password         |OTP|
	|incorrectUserName|inCorrectPassword|12345|
	|incorrectUserName|CorrectPassword  |2468|
	|CorrectUserName  |inCorrectPassword|0007100|