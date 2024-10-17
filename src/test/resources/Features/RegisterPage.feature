@Register
Feature: Testing functionality of Register Page

  @TS_Register_01
  Scenario: The user launches home page of DSAlgo Project
    Given The user opens DSAlgo portal link
    When The user clicks the "Get Started" Button
    Then The User should be navigated to Home Page

  @TS_Register_02
  Scenario: The user Registers account with empty fields
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then The error "Please fill out this field." appears below Username textbox

  @TS_Register_03
  Scenario: The user Registers account with  Username and other fields empty
    Given The user opens Register Page
    When The user clicks "Register" button after entering Username with other fields empty
      | username   |
      | Raha_a@123 |
    Then The error message "Please fill out this field." appears below Password textbox

  @TS_Register_04
  Scenario: The user Registers account with username, password and Confirm Password empty
    Given The user opens Register Page
    When The user clicks "Register" button after entering Username and password with Password Confirmation field empty
      | username   | password  |
      | Raha_a@123 | aha_1@456 |
    Then The error message "Please fill out this field." appears below Password Confirmation textbox

  @TS_Register_05
  Scenario: The user enters invalid username
    Given The user opens Register Page
    When The user enters a "username" with charaters other than Letters, digits and "@/./+/-/_"
      | username | password  | password confirmation |
      | *&&*&&*  | aha_1@456 | aha_1@456             |
    Then The user is not able to see error msg after entering invalid data

  @TS_Register_06
  Scenario: The user Registers with numeric data in password
    Given The user opens Register Page
    When The user enters a valid "username" and "password" with only numbers
      | username   | password | password confirmation |
      | Raha_a@123 | 12345678 |              12345678 |
    Then The user is not able to see error msg after entering invalid data

  @TS_Register_07
  Scenario: The User Registers password with lessthan 8 characters
    Given The user opens Register Page
    When The user enters a valid "username" and "password" with less than 8 characters
      | username   | password | password confirmation |
      | Raha_a@123 | aha123   | aha123                |
    Then The user is not able to see error msg after entering invalid data

  @TS_Register_08
  Scenario: The user Registers with different passwords
    Given The user opens Register Page
    When The user clicks "Register" button after entering "username" and different passwords in "Password" and "Password Confirmation" fields
      | username   | password  | password confirmation |
      | Raha_a@123 | aha_1@456 | aha_1@4567            |
    Then The user should able to see an error message "password_mismatch:The two password fields didn’t match."

  @TS_Register_09
  Scenario: The user Registers with valid Details
    Given The user opens Register Page
    When The user enters a valid "Username" and "Password" and "Password Confirmation"
      | username    | password   | password confirmation |
      | Raha_a@1234 | aha_1@4567 | aha_1@4567            |
    Then The user should be navigated to Home Page with message "New Account Created. You are logged in as<username>"

  @TS_register_10
  Scenario: The user is Registers with existing username
    Given The user opens Register Page
    When The user enters a valid existing "username" with "password" and "password confirmation"
      | username    | password  | password confirmation |
      | Raha_a@1234 | numpy@123 | numpy@123             |
    Then It should display an error message "Username already exists"

  @TS_Register_11
  Scenario: The user shoule be able to signed out successfully
    Given The user is on the DS Algo Home Page
    When The user click the "Sign out" link
    Then The user should be able to see "Logged out successfully" message
