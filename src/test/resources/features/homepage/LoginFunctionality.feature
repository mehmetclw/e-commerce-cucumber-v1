Feature: Login Functionality

  @EC-105
  Scenario:
    Given go to home page "https://ecommerce.yosemiteint.com/prestashop/index.php"
    And click on "Sign in" link
    When the user enters following valid credentials as email address and password:
      | email address | abcd@gmail.com |
      | password      | 123456         |
    And the user clicks the "Sign in" button