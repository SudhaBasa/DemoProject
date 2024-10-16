Feature: Testing functionality of Register Page

  Scenario: User registers account with empty fields
    Given User navigates to Register Account Page
    When User leaves the fields empty and clicks Register button
    Then User should get a proper warning message

    
    