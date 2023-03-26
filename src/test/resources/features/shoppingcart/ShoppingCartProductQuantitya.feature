Feature: Test the increase of product quantity
  Test the decrease of product quantity


  @EC-134
  Scenario: Add a product to cart and increase that products quantity
    Given Go to the homePage "https://ecommerce.yosemiteint.com/prestashop/index.php"
    And click the popular tab on the page
    Then HoverOver the product
    And Click more tab on the product
    And increase the number of product
    And add to cart the product as clicking Add to cart tab
    Then click for check out to Proceed to checkout tab
    Then check the price if it is as expected after increase

  @EC-153
  Scenario: Decrease that products quantity on the cart
    And decrease the number of product
    Then check the price if it is as expected after decrease