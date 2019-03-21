@Single
Feature: Login into gmail account
          Existing user should be able to login to gmail
 
Scenario: Login into gmail with correct creds1
Given User navigates to gmail login page1 
And user enters username in username field1
And user enters password in password field1
When User clicks on Next button1
Then User is logged in successfully1 
