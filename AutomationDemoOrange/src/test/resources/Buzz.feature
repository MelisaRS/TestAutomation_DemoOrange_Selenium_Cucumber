Feature: Buzz Page
  Background: Buzz Page should display a publication
    Given I am in Demo Orange web page

    Scenario: Verify is Displayed a publication
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then I click on the buzz button