Feature: This is the login feature for Orange HRM
Scenario: This is login scenario
Given user is on the login page
When the user enters the valid credentials "Admin" and "admin123"
And clicks the login button
Then the user should see the home page