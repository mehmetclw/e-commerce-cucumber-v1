Feature: Registration Functionality

  Background:
    Given go to home page
    And click on "Sign in" link
    And enter the valid e-mail to create an account
    And the user clicks the "Create an account" button

  @EC-104
  Scenario: Enter valid details and check if the user is able to register successfull
    And fill the requirements on the page
      | First Name |   Jenifer      |
      | Last Name  |   Tally        |
      | Password   |   123456       |
    And click on the -Sign up for our newsletter!- checkbox
    And the user clicks the "Register" button
  #  And check the message as expected "your account has been created"

  @EC-105
  Scenario: Enter the invalid details and check if appropriate error message is displayed
    And fill the requirements on the page
      | First Name | fake   |
      | Password   | 123456 |
    And click on the -Sign up for our newsletter!- checkbox
    And the user clicks the "Register" button
    #And verify that "there are 3 errors first name,password,invalid date of birth" error message is displayed
