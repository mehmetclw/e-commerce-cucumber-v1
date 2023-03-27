Feature:
  As an user I want to be able to register for the newsletter

  Background:
    Given go to home page

  @EC-131
  Scenario:Test the newsletter functionality from main page
    And scroll down the screen
    And enter the valid e-mail:
      | e-mail | fakeshop@trash-mail.com |
    And the user clicks the enter button
    Then check the message as expected "Newsletter : You have successfully subscribed to this newsletter."
    And go to e-mail inbox "https://www.trash-mail.com/inbox/"
    Then check the inbox for confirmation e-mail "[My Store] Newsletter confirmation"

  @EC-132
  Scenario: Test the newsletter functionality while creating an account
    And click on "Sign in" link
    And enter the valid e-mail to create an account:
      | e-mail | fakeshop@trash-mail.com |
    And the user clicks the "Create an account" button
    And fill the requirements on the page
      | First Name | fake   |
      | Last Name  | shop   |
      | Password   | 123456 |
    And click on the -Sign up for our newsletter!- checkbox
    And the user clicks the "Register" button
    And go to e-mail inbox "https://www.trash-mail.com/inbox/"
    Then check the inbox for confirmation e-mail "[My Store] Newsletter confirmation"

  @EC-133
  Scenario:Test the newsletter functionality while changing personal settings
    And click on "Sign in" link
    When the user enters following valid credentials as email address and password:
      | e-mail   | fakeshop1@trash-mail.com |
      | password | 123456                   |
    And the user clicks the "Sign in" button
    And the user clicks the "My personal information" button
    And fill the requirements on the page
      | Current Password | 123456 |
      | New Password     | 123456 |
      | Confirmation     | 123456 |
    And click on the -Sign up for our newsletter!- checkbox
    And the user clicks the "Save" button
    And go to e-mail inbox "https://www.trash-mail.com/inbox/"
    Then check the inbox for confirmation e-mail "[My Store] Newsletter confirmation"


  Scenario:Test the newsletter functionality from main page with example email
    And scroll down the screen
    And enter the valid e-mail:
      | e-mail | testaccount@yosemiteint.com |
    #And the user clicks the enter button
    #Then check the message as expected "Newsletter : You have successfully subscribed to this newsletter."
    And go to inbox "https://mail.yosemiteint.com/webmail"
    Then check the inbox for e-mail "[My Store] Newsletter confirmation"


  Scenario: Test the newsletter functionality while creating an account with example email
    And click on "Sign in" link
    And enter the valid e-mail to create an account:
      | e-mail | testaccount@yosemiteint.com |
    And the user clicks the "Create an account" button
    And fill the requirements on the page
      | First Name | fake   |
      | Last Name  | shop   |
      | Password   | 123456 |
    And click on the -Sign up for our newsletter!- checkbox
    #And the user clicks the "Register" button
    And go to inbox "https://mail.yosemiteint.com/webmail"
    Then check the inbox for e-mail "[My Store] Newsletter confirmation"