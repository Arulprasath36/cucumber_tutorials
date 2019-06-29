@SimpleLogin @DataDriven
Feature: Login feature
@Positive
Scenario: positive scenario
Given user is on login page
When the user enters the valid username and password
And click on the login button
Then the user should be navigated to home page

@Negative
Scenario: Negative scenario
Given user is on login page
When the user enters the valid username and password
And click on the login button
Then the user should be navigated to home page