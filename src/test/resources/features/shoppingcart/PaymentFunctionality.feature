Feature:Payment Functionality

  Background:
Given go to home page " https://ecommerce.yosemiteint.com/prestashop/index.php"
And click on "Sign in" link
When the user enters following valid credentials as email address and password:
| email address | abcd@gmail.com |
| password      | 123456         |
And the user clicks the "Sign in" button
When click on "Women" link
And click the first product on the page
And click  "Add to Cart" button
And click proceed to checkout
And click proceed to Summary Page Checkout Button
And click proceed to Address Page Checkout
Then check the agree terms box
And click proceed to Shipping Page Checkout

  @EC-159
Scenario: Pay by check verification
And select pay by check
When click confirm my order button
Then the user order is confirmed "Your order on My Store is complete."

  @EC-162
Scenario: Pay by bank wire verification
And select pay by bank wire
When click confirm my order button
Then the user order is confirmed "Your order on My Store is complete."