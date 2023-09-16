Feature: Buzz Page
  Background: Buzz Page should display a publication
    Given I am in Demo Orange web page

    @VerifyMessageIsDisplayedInBuzz
    Scenario: Verify is Displayed a publication
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then I click on the buzz button
      And I Write one message "I tests the buzz" in the Post TextBox
      And I click on Post Button
      Then I verification post message in buzz page is "I tests the buzz"
      And I click on the user drop down
      And I click on the logout button