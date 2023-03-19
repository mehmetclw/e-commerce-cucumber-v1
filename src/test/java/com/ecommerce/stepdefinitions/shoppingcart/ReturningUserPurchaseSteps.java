package com.ecommerce.stepdefinitions.shoppingcart;

import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReturningUserPurchaseSteps {
    @Then("the user in the home page {string}")
    public void theUserInTheHomePage(String expectedPage) {
        String homePage=Driver.getDriver().getTitle();
        Assert.assertEquals("user not in home page",expectedPage,homePage);
    }

    @And("click proceed to checkout")
    public void clickProceedToCheckout() {
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();

    }

    @Then("verify the shopping cart have the t-shirt product {string}")
    public void verifyTheShoppingCartHaveTheTShirtProduct(String expectedShoppingSummary) {
        WebElement shoppingCartSummary=Driver.getDriver().findElement(By.xpath("//span[@class='heading-counter']"));

        Assert.assertEquals("shopping cart doesn't have your product",expectedShoppingSummary,shoppingCartSummary.getText());
    }

    @And("check the price of the tshirt is the same as expected price {string}")
    public void checkThePriceOfTheTshirtIsTheSameAsExpectedPrice(String expectedTotal) {
        WebElement totalCart=Driver.getDriver().findElement(By.cssSelector("#total_price_without_tax"));
        Assert.assertEquals("TOTAL DOESN'T MATCH",expectedTotal,totalCart.getText());
    }

    @Then("Verify that the previously saved address details are pre-filled.")
    public void verifyThatThePreviouslySavedAddressDetailsArePreFilled(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        String expectedUserStreet= credentials.get(1).get(0);
        String expectedUserCityState=credentials.get(1).get(1);
        WebElement userStreetAddress=Driver.getDriver().findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_address1 address_address2']"));
        WebElement userCityStateAddress=Driver.getDriver().findElement(By.cssSelector("ul[id='address_delivery'] li[class='address_city address_state_name address_postcode']"));
        Assert.assertEquals("the user Street is not valid",expectedUserStreet,userStreetAddress.getText());
        Assert.assertEquals("the user city and state not valid",expectedUserCityState,userCityStateAddress.getText());
    }

    @Then("check the agree terms box")
    public void checkTheAgreeTermsBox() {
        Driver.getDriver().findElement(By.xpath("//input[@id='cgv']")).click();
    }

    @And("select pay by check")
    public void selectPayByCheck() {
        Driver.getDriver().findElement(By.xpath("//a[@title='Pay by check.']")).click();
    }

    @When("click confirm my order button")
    public void clickConfirmMyOrderButton() {
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='I confirm my order']")).click();
    }

    @Then("the user order is confirmed {string}")
    public void theUserOrderIsConfirmed(String expectedConfirmMessage) {
        WebElement confirmMessage= Driver.getDriver().findElement(By.xpath("//p[@class=\"alert alert-success\"]"));
        Assert.assertEquals("Confirmation Message not displayed",expectedConfirmMessage,confirmMessage.getText());

    }

    @When("click on confirm my order button")
    public void clickOnConfirmMyOrderButton() {
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='I confirm my order']")).click();
    }

    @Then("verify that the user in the confirmation page {string}")
    public void verifyThatTheUserInTheConfirmationPage(String expectedConfirmPage) {
        String confirmPage=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedConfirmPage,confirmPage);
    }

    @And("click view order history")
    public void clickViewOrderHistory() {
        Driver.getDriver().findElement(By.xpath("//a[normalize-space()='View your order history']")).click();
    }

    @When("click Order details button")
    public void clickOrderDetailsButton() {
        Driver.getDriver().findElement(By.xpath("//tr[contains(@class,'first_item')]//span[contains(text(),'Details')]")).click();
    }

    @Then("user able to see his previous order details {string}")
    public void userAbleToSeeHisPreviousOrderDetails(String expectedOrderHistory) {
        String orderHistory=Driver.getDriver().getTitle();
        Assert.assertEquals("order history not displayed",expectedOrderHistory,orderHistory);
    }

    @Then("scrollDown")
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)");
    }

    @And("click proceed to checkout1")
    public void clickProceedToCheckout1() {
        Driver.getDriver().findElement(By.cssSelector("a[class='button btn btn-default standard-checkout button-medium'] span")).click();

    }

    @And("click proceed to checkout2")
    public void clickProceedToCheckout2() {
        Driver.getDriver().findElement(By.cssSelector("button[name='processAddress'] span")).click();
    }

    @And("click proceed to checkout3")
    public void clickProceedToCheckout3() {
        Driver.getDriver().findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
    }

}
