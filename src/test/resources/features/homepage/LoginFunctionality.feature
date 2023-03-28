Feature: As user I want to login my account

  @EC-105
  Scenario: Login with valid credentials
    Given go to home page
    And click on "Sign in" link
    When the user enters following valid credentials as email address and password:
      | email address | abcd@gmail.com |
      | password      | 123456         |
    And the user clicks the "Sign in" button