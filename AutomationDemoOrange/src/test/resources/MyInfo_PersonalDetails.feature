Feature: My Info with Personal Details in Demo Orange Web

  Background: Completing general user information in Demo Orange
    Given I am in Demo Orange web page

    @ChangeMyInfoWithCorrectInformation
    Scenario: Update the information in Demo Orange with correct information
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then I click on the my info button
      And The personal details should be displayed
      #And I change the first name for "Carlos"
      And I fill the Personal Details with
        | Dante | PauDan | 0026 | 55444111 | 2025-07-12 | 123456789 | 123123123 |
      #And I fill others Personal Details with
      #  | 0026 | 55444111 | 2025-07-12 | 123456789 |  123123123 |
      And I click on the save button of generals details
      And I verify the following data in the Personal Details
        | Dante | PauDan | 0026 | 55444111 | 2025-07-12 | 123456789 | 123123123 |
