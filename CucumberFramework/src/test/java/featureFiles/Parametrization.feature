@Single
Feature: Parameterisation demo

Background: 
Given I access WebdriverUniversity 
When I click on the login button
Then I enter username 

Scenario: Login to account with valid password
And I enter "valid" password
And I click on login button
Then I should be presented with successful validation 

Scenario: Login to account with valid password
And I enter "invalid" password
And I click on login button
Then I should be presented with successful validation