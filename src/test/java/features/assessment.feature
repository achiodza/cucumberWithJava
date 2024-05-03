Feature: Navigate and print Out Facility Name of Given Website

  Scenario: Nedbank Assessment Selenium Tests with Cucumber
    Given Website link to navigate to
    Then Login with Username
    Then Enter Password
    Then Select the Hong Kong Center
    Then Tick the Apply for readmission Option
    Then Select none health care program
    Then Enter todays date and a random comment
    When Click on Book Appointment
    Then Return and print out the Facility Name


