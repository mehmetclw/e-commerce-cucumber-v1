Feature: As a user
  I want to be able to login
  After that click on women section
  click on product and verify product details.

  Background:
    Given go to home page "https://ecommerce.yosemiteint.com/prestashop/index.php"
    And click on "Sign in" link
    When the user enters following valid credentials as email address and password:
      | email address | abcd@gmail.com |
      | password      | 123456         |
    And the user clicks the "Sign in" button
    When click on "Women" link

  @EC-129
  Scenario: Test the product details from page
    And click the first product on the page
    Then check the product title
    Then check the product details as expected
    Then check the price as expecteed
    And click "Add to Cart" button
    Then check the text at checkout page as expected

  @EC-130
  Scenario: Test the product details from open window
    And click the first product's "Quick view" on the page
    Then check the product title
    Then check the product details as expected
    Then check the price as expecteed
    And click "Add to Cart" button
    Then check the text at checkout page as expected