Feature:
  As an user I want to be able to register for newsletter

  Background:
    Given go to home page " https://ecommerce.yosemiteint.com/prestashop/index.php"

  Scenario:Test the newsletter functionality from main page
    And scroll down the screen
    And fill the newsletter bar with valid credentials
    And click on newsletter button
    Then check the message as expected " Newsletter : You have successfully subscribed to this newsletter."
    And go to e-mail provider's website
    Then check the inbox for confirmation e-mail.


  Scenario: Test the newsletter functionality while creating an account
    And click on "Sign in" link
    And enter the valid e-mail
    When click on "Create an Account" button
    And fill the requirements on the page
      | First Name | Last Name | Email | Password | Date of Birth |
      |            |           |       |          |               |
    And click on the "Sign up for our newsletter!" checkbox
    And click on "Register" button
    When Go to your e-mail box
    Then check the inbox for confirmation e-mail.