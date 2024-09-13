@tag
Feature: Check login functionality
@tag1
Scenario: Check login functionality with valid credentials
Given User is on login page
When user enters valid username and password
And click on login button
Then user is navigated to the home page