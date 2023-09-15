Feature: Admin Job - Employment Status Page
  Background: Admin Job Page should display all employments status
    Given I am in Demo Orange web page

    @VerifyEmploymentStatus
    Scenario Outline: Verify Employments Status are displayed in the admin job page
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then I click on the admin button
      And I click on the job comboBox
      And I click on the employment status selection
      And The employment status "<employmentStatus>" should be displayed
      Examples:
        | employmentStatus     |
        | Freelance            |
        | Full-Time Contract   |
        | Full-Time Permanent  |
        | Full-Time Probation  |
        | Part-Time Contract   |
        | Part-Time Internship |
      #And I click on the user drop down
      #And I click on the logout button

