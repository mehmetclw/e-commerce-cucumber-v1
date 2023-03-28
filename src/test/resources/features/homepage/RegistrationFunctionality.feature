Feature: Registration Functionality

  Background:
    Given go to home page
    And click on "Sign in" link
    And enter the valid e-mail to create an account
    And the user clicks the "Create an account" button

  @EC-104
  Scenario: Enter valid details and check if the user is able to register successfully
    And fill the requirements on the page
      | First Name |   Jenifer      |
      | Last Name  |   Tally        |
      | Password   |   123456       |
    And click on the -Sign up for our newsletter!- checkbox
    And the user clicks the "Register" button
    Then check the message "Your account has been created."

  
  @EC-105
  Scenario: Enter the invalid details and check if appropriate error message is displayed
    And fill the requirements on the page
      | First Name | Jenifer  |
      | Password   | 123456 |
    And click on the -Sign up for our newsletter!- checkbox
    And the user clicks the "Register" button
    Then verify that error message is displayed "There is 1 error"

