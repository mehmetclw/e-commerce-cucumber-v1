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
    Then check the product title "Faded Short Sleeves T-shirt"
    Then check the product details as expected
    """
    Faded short sleeves t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!
    """
    Then check the price as "$16.51"
    And the user clicks the "Add to cart" button
    Then check the text at checkout page as expected
    """ Product successfully added to your shopping cart
				"""

  @EC-130
  Scenario: Test the product details from open window
    And click the first product's "Quick view" on the page
    Then check the product title "Faded Short Sleeves T-shirt"
    Then check the product details as expected
    """
    Faded short sleeves t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!
    """
    Then check the price as "$16.51"
    And the user clicks the "Add to cart" button
    Then check the text at checkout page as expected
    """
    SHOPPING-CART SUMMARY
    """