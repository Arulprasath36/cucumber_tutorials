@DataDriven
Feature: With Examples
Scenario Outline: This is login scenario
Given Proceed to login page
When user enters "<UserName>" and password "<Password>"
And clicked button 

Examples:
|UserName | Password|
|Admin    | admin123|
|Admin    | admin13|
