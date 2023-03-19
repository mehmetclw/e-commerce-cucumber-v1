Feature: Search Functionality
  @EC-135
  Scenario:Search for a product with a valid search term
  and check if relevant results are displayed
    Given Go to home page "https://ecommerce.yosemiteint.com/prestashop/index.php"
    Then Go to search box type "Dress"
    When click search button
    Then verify the search page is displayed
    And the expected search results is relevant to "Dress"

  @EC-136
  Scenario:Search with an invalid search term and check error message is displayed
    Given Go to home page "https://ecommerce.yosemiteint.com/prestashop/index.php"
    Then Go to search box type "yxz"
    And click search button
    Then verify that "No results were found for your search \"yxz\"" error message is displayed

  @EC-137
  Scenario:verify the search results is sorted correctly
    Given Go to home page "https://ecommerce.yosemiteint.com/prestashop/index.php"
    Then Go to search box type "T-shirt"
    And click search button
    Then click on  the sort options
    And select sort price from lowest to highest
    Then verify the search results prices is sorted from low to high
