Feature:Shopping Cart Functionality
  As a user I want to log in
  Add the product to my cart successfully

  Background:To sign in with credentials
    Given go to home page " https://ecommerce.yosemiteint.com/prestashop/index.php"
    And click on "Sign in" link
    When the user fills requirement fields with valid credentials
      | email address | johndoe.info67@gmail.com |
      | password      | 123elifnur               |
    And the user clicks the "Sign in" button
    When click on "Women" link

  @EC-128
  Scenario: Add the product to shopping cart
    And click the first product on page
    When choose number of tshirt, color and size
      | Qty | color  | size |
      | 2   | orange | M    |
    And click "Add to cart" link
    Then verify if the product added correctly
    """
    Your shopping cart contains: 2 products
    """

  @EC-146
  Scenario: Remove the added product to shopping cart
    Then click the third product on page
    And click "Add to cart" link
    And click "Proceed to checkout" button
    And click "delete" icon
    Then verify if product removed successfully
    """
    Your shopping cart is empty.
    """

  @EC-147
  Scenario: Verify if added product is calculated correctly
    And click the first product on page
    When choose number of tshirt, color and size
      | Qty | color  | size |
      | 2   | orange | M    |
    And  click "Add to cart" link
    Then verify if the total price is "$33.02" matching with price that shown on website


