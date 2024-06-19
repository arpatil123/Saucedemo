
Feature: This is logout feature
Background: User is logged in to saucedemo app
Given User is accessing saucedemo login page
When User enters valid username and password
Then User should be able to navigate to Home Page

Scenario: Verify the filter option
And Click on product sort container
Then Set a suitable option
And Close the browser


Scenario: Verify the log out functionality
And Click on burger menu icon
Then Click on Log out
And Close the browser
