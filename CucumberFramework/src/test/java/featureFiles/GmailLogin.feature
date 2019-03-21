@Once
Feature: Login into gmail account
          Existing user should be able to login to gmail
 
Scenario: Login into gmail with correct creds
Given User navigates to gmail login page 
And user enters username in username field
And user enters password in password field
When User clicks on Next button
Then User is logged in successfully 
