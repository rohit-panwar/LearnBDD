Feature: Background keyword feature

Background:
Given User is on Login Page
When User Enter UserName and Password
And User clicks on login button
Then User navigated to Order page

Scenario: Amazon Open-Order Status 
When User click on Open Order link
Then user will be able to see all open orders

Scenario: Amazon Completed-Order Status 
When User click on Completed Order link
Then user will be able to see all Completed orders

Scenario: Amazon Pending-Order Status 
When User click on Pending Order link
Then user will be able to see all Pending  orders