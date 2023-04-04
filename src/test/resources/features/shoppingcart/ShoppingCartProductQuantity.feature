@regression
Feature: Test the increase of product quantity
  Test the decrease of product quantity

  Background:
    Given Go to the homePage "https://ecommerce.yosemiteint.com/prestashop/index.php"
    And Click "Popular" tab on the homepage
    Then HoverOver the product
    And Click "More" tab on the product
    And increase the number of product


  @EC-134 @sanity
  Scenario: Add a product to cart and increase that products quantity
    And Add to cart the product as clicking "Add to cart" tab
    Then click for check out to "Proceed to checkout" tab
    Then check the price if it is "$60.00" after increase

  @EC-153 @smoke
  Scenario: Decrease that products quantity on the cart
    And decrease the number of product
    And Add to cart the product as clicking "Add to cart" tab
    Then click for check out to "Proceed to checkout" tab
    Then check the price if it is "$30.00" after decrease