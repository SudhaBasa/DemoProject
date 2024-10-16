Feature: Testing Register page functionality

  Scenario Outline: Register with valid credentials
    Given User navigates to Register Page
    When User enters valid <username> and <password> and clicks login button
    Then User should register successfully

    Examples: 
      | username | password |
      | sudha    |   123456 |
      | name2    |  4758690 |
