Feature: Data table implementaion 

Scenario: User registrations using Data Table
Given User is on Registration page
When User enter the user details without columns
	|Rohit|Panwar|9876543210|Pune|
	|Krrish|Singh|0123456789|Ratlam|
	|Payal|Panwar|9988776655|Mandsaur|
	
When User enter the user details with columns
	|firstname|lastname|contact|city|
	|Rohit|Panwar|9876543210|Pune|
	|Krrish|Singh|0123456789|Ratlam|
	|Payal|Panwar|9988776655|Mandsaur|
Then User registration is successfull


