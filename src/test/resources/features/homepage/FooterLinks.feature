@regression
Feature: Test the Footer Links

  As a user I want to be able to open all Footer Links.

  Background:
    Given go to home page

  @EC-145 @smoke
  Scenario:HoverOver 'Categories' tab in footers section and click all links under it.
    And Go to the 'Categories' footer link
    Then Open links as a new tabs under Categories link
      | Links | WomenLink |
    Then Verify that being on the right page seeing the <PageTitles> for each tab under Categories Link
      | PageTitles | Women - My Store |


  @EC-154 @sanity
  Scenario:HoverOver 'Information' tab in footers section and click all links under it.
    And Go to the 'Information' footer link to test
    Then Open links as a new tabs under Information link
      | Links | Specials | New Products | Best Sellers | Our stores | Contact us | Terms and conditions of use | About us | Sitemap |
    Then verify the page titles for each tab under Information Link
      | Page Titles | Prices drop - My Store | New products - My Store | Best sales - My Store | Stores - My Store | Contact us - My Store | Terms and conditions of use - My Store | About us - My Store | Sitemap - My Store |


  @EC-155 @smoke
  Scenario:HoverOver 'My account' tab in footers section and click all links under it.
    And click on "Sign in" link
    When the user enters following valid credentials as email address and password:
      | e-mail   | fakeshop1@trash-mail.com |
      | password | 12345678                   |
    And the user clicks the "Sign in" button
    And Go to the 'My account' footer link for testing
    Then Open links as a new tabs under My account link
      | Links | My orders | My credit slips | My addresses | My personal info |
    Then verify the page titles for each tab under My account link
      | Page Titles | Order history - My Store | Credit slip - My Store | Addresses - My Store | Identity - My Store |