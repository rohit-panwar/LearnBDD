Feature: Hook functionality feature

@Smoke
Scenario: Book train ticket
Given User is on "train-booking" application
When User search for "train"
And complete payment
Then "Train" ticket is booked

@Prod
Scenario: Book flight ticket
Given User is on "flight-booking" application
When User search for "flight"
And complete payment
Then "Flight" ticket is booked