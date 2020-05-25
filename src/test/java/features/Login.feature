Feature: Login functionality

Scenario: As a user I want to login to Flipkart site

Given I am on login page
When I enter "acharya.aparna@gmail.com", "Cindrella1" and click on Submit button
Then I land on home page

Scenario: As a logged in user, I want to logout
When I click logout button
Then I land on home page
And I close browser