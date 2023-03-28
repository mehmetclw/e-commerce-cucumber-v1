Feature:Payment Functionality

  Background:
    Given go to home page
    And click on "Sign in" link
    When the user enters following valid credentials as email address and password:
      | email address | abcd@gmail.com |
      | password      | 123456         |
    And the user clicks the "Sign in" button
    When click on "Women" link
    And click the first product on the page
    And the user clicks the "Add to cart" button
    And click proceed to checkout
    And click proceed to checkout Summary
    And click proceed to checkout Addresses page
    Then check the agree terms box
    And click proceed to checkout Shipping

  @EC-159
  Scenario: Pay by check verification
    And click on "Pay by check (order processing will be longer)" link
    When click confirm my order button
    Then the user order is confirmed "Your order on My Store is complete."

  @EC-162
  Scenario: Pay by bank wire verification
    And click on "Pay by bank wire (order processing will be longer)" link
    When click confirm my order button
    Then the user order is confirmed "Your order on My Store is complete."