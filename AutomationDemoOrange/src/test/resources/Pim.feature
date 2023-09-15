Feature: PIM Page
  Background: PIM Page should display a specific First and Middle Name
    Given I am in Demo Orange web page

    @VerifyEmploymentName
    Scenario: Verify Fist and Middle Name in PIM page
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then I click on the pim button
      And I click on add button
      And I fill the add Employee with
        | Hugo | Luis | Flores | 456 |
      Then I click on the save button
      And I click on the employeeList button
      And I set the employee name field with "Hugo Luis"
      And I click on the search button
      And I verify employee name "Hugo Luis"