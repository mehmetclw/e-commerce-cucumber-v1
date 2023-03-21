Feature: Returning user purchase

  Background:
    Given go to home page " https://ecommerce.yosemiteint.com/prestashop/index.php"
    And click on "Sign in" link
    When the user enters following valid credentials as email address and password:
      | email address | abcd@gmail.com |
      | password      | 123456         |
    And the user clicks the "Sign in" button
    Then the user in the home page "My account - My Store"
    Then Go to search box type "t-shirt"
    Then click search button
    And click the first product on the page
    And the user clicks the "Add to cart" button
    And click proceed to checkout

@EC-142
  Scenario:user able to place order successfully
    Then verify the shopping cart have the t-shirt product "Your shopping cart contains: 1 product"
    And check the price of the tshirt is the same as expected price "$16.51"
    And click proceed to checkout1
    Then Verify that the previously saved address details are pre-filled.
      |expected user street|  expected user city state |
      | 123 knollwood     |  lynchburg, Virginia 24502|
    And click proceed to checkout2
    Then check the agree terms box
    And click proceed to checkout3
    And select pay by check
    When click confirm my order button
    Then the user order is confirmed "Your order on My Store is complete."

  @EC-143
  Scenario:user able to redirect to confirmation page and get all order details

    And click proceed to checkout1
    And click proceed to checkout2
    Then check the agree terms box
    And click proceed to checkout3
    And select pay by check
    When click on confirm my order button
    Then verify that the user in the confirmation page "Order confirmation - My Store"
    And click view order history
    When click Order details button
    Then user able to see his previous order details "Order history - My Store"