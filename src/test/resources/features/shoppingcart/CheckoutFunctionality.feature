Feature:Checkout Functionality

  Background:
    Given go to home page
    And click on "Sign in" link
    When the user enters following valid credentials as email address and password:
      | email address | abcd@gmail.com |
      | password      | 123456         |
    And the user clicks the "Sign in" button
    When click on "Women" link
    And click the first product on the page
    Then the user clicks the "Add to cart" button
@EC-163
    Scenario: Checkout verification
    And click proceed to checkout
    And click proceed to checkout Summary
    And click proceed to checkout Addresses page
    Then check the agree terms box
    And click proceed to checkout Shipping