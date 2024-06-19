Feature: This is background
Background: User is logged in to saucedemo app
Given User is accessing saucedemo login page
When User enters valid username and password
Then User should be able to navigate to Home Page

Scenario: Test Menu Items

And click on breadcrumb icon
Then User should be able to see the menu items

Scenario: Verify add to cart functionlity


And Clicks on add to button
Then Item should be added to the cart

Scenario: Verify check out functionlity

Then Click on the cart container
And Click on checkout
Then Enter the information
And Click on continue
Then Click on finish
