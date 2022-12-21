@All
Feature: Uber booking feature

@Smoke
Scenario: Uber Mini Booking Scenario
Given User want to select "Mini" car
When User Select Pickup "Home" and Drop "Office"
Then Cab is booking for 1000 INR

@Regression @Smoke
Scenario: Uber Sedan Booking Scenario
Given User want to select "Sedan" car
When User Select Pickup "Hotel" and Drop "Airport"
Then Cab is booking for 1500 INR

@ProdSanity
Scenario: Uber Outstation Booking Scenario
Given User want to select "Outstation" car
When User Select Pickup "Pune" and Drop "Mumbai"
Then Cab is booking for 4000 INR