Feature: Registration Functionality

  @EC-104
  Scenario: Enter valid details and check if the user is able to register successfully
    Given go to home page "https://ecommerce.yosemiteint.com/prestashop/index.php"
    And click on "sign in button"
    And enter the valid e-mail to create an account:
      |e-mail| |abc@gmail.com|
    Then the user clicks the "create an account" button
    And scroll down the screen
    And fill the requirements on the page
      | First Name | |Jenifer|
      | Last Name | | Tally  |
      | Email | |ab@gmail.com |
      | Password | | 123456 |
    Then the user clicks the "register" button
    And check the message as expected "your account has been created"

  @EC-105
  Scenario: Enter the invalid details and check if appropriate error message is displayed
    Given go to home page "https://clarusway-sdet-us.atlassian.net/browse/EC-104"
    And the user clicks the "sign in" button
    And the user clicks the "create an account" button
    And scroll down the screen
    Then the user fills requirement fields with valid credentials
      | Email | abc@gmail.com|
      |Last Name |Tally|
    And the user clicks the "register" button
    And verify that "there are 3 errors first name,password,invalid date of birth" error message is displayed
