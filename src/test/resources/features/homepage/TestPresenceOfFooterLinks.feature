Feature: Test the Footer Links
  @EC-145
  Scenario:HoverOver 'Categories' tab in footers section and click all links under it.
  Given go to home page " https://ecommerce.yosemiteint.com/prestashop/index.php"
  And Go to the 'Categories' footer link
  Then Open all links as a new tabs under Categories link
  Then verify the each page titles under Categories link
    @EC-154
  Scenario:HoverOver 'Information' tab in footers section and click all links under it.
    Given go to homePage for Information " https://ecommerce.yosemiteint.com/prestashop/index.php"
    And Go to the 'Information' footer link to test
    Then Open all links as a new tabs under Information link
    Then verify the each page titles under Information link
      @EC-155
  Scenario:HoverOver 'My account' tab in footers section and click all links under it.
    Given Go to home page for My account " https://ecommerce.yosemiteint.com/prestashop/index.php"
    And Go to the 'My account' footer link for testing
    Then Open all links as a new tabs under My account link
    Then verify the each page titles under My account link