Feature: Account Management Functionality
  As a user I want to log in
  I want to check if I am able to see my order history

  Background:
    Given go to home page " https://ecommerce.yosemiteint.com/prestashop/index.php"
    And click on "Sign in" link
    When the user fills requirement fields with valid credentials
      | email address | johndoe.info67@gmail.com |
      | password      | 123elifnur               |
    And the user clicks the "Sign in" button

  @EC-148
  Scenario: Check if user able to see history of order
    And click "Order history and details" on the page
    Then verify that user can see history of order
    """
    Here are the orders you've placed since your account was created.
    """

  @EC-149
  Scenario Outline: Check if user can update password
    And click "<info>" on page
    And enter "<current password>"
    Then enter "<new password>"
    Then enter "<new password>" one more time under confirmation
    When click on "Save"
    And verify if user updated password successfully
    """
    Your personal information has been successfully updated.
    """
    Examples:
      | current password | new password | info                      |
      | 123123           | 23123123     | "My personal information" |

  @EC-151
  Scenario: Check if user able to change shipping address
    And click on the "MY ADDRESS" link
    And scroll down
    Then click on "update" button
    And scroll down
    When enter new address under address
    Then click on "Save"
    And verify that user changed shipping address successfully
    """
    12 Street
    """