package com.ecommerce.stepdefinitions.shoppingcart;

import com.ecommerce.stepdefinitions.TestBase;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReturningUserPurchaseSteps extends TestBase {
    @Then("the user in the home page {string}")
    public void theUserInTheHomePage(String expectedPage) {
        getAppLibrary().getPage().getRup().theUserInTheHomePage(expectedPage);
    }

    @And("click proceed to checkout")
    public void clickProceedToCheckout() {
        getAppLibrary().getPage().getRup().clickProceedToCheckout();

    }

    @Then("verify the shopping cart have the t-shirt product {string}")
    public void verifyTheShoppingCartHaveTheTShirtProduct(String expectedShoppingSummary) {
        getAppLibrary().getPage().getRup().verifyTheShoppingCartHaveTheTShirtProduct(expectedShoppingSummary);
    }

    @And("check the price of the tshirt is the same as expected price {string}")
    public void checkThePriceOfTheTshirtIsTheSameAsExpectedPrice(String expectedTotal) {
        getAppLibrary().getPage().getRup().checkThePriceOfTheTshirtIsTheSameAsExpectedPrice(expectedTotal);
    }

    @Then("Verify that the previously saved address details are pre-filled.")
    public void verifyThatThePreviouslySavedAddressDetailsArePreFilled(DataTable dt) {

        getAppLibrary().getPage().getRup().verifyThatThePreviouslySavedAddressDetailsArePreFilled(dt);
    }

    @Then("check the agree terms box")
    public void checkTheAgreeTermsBox() {
        getAppLibrary().getPage().getRup().checkTheAgreeTermsBox();
    }

    @And("select pay by check")
    public void selectPayByCheck() {
        getAppLibrary().getPage().getRup().selectPayByCheck();
    }

    @When("click confirm my order button")
    public void clickConfirmMyOrderButton() {
        getAppLibrary().getPage().getRup().clickConfirmMyOrderButton();
    }

    @Then("the user order is confirmed {string}")
    public void theUserOrderIsConfirmed(String expectedConfirmMessage) {
        getAppLibrary().getPage().getRup().theUserOrderIsConfirmed(expectedConfirmMessage);
    }

    @Then("verify that the user in the confirmation page {string}")
    public void verifyThatTheUserInTheConfirmationPage(String expectedConfirmPage) {
        getAppLibrary().getPage().getRup().verifyThatTheUserInTheConfirmationPage(expectedConfirmPage);
    }

    @And("click view order history")
    public void clickViewOrderHistory() {
        getAppLibrary().getPage().getRup().clickViewOrderHistory();
    }

    @When("click Order details button")
    public void clickOrderDetailsButton() {
        getAppLibrary().getPage().getRup().clickOrderDetailsButton();
    }

    @Then("user able to see his previous order details {string}")
    public void userAbleToSeeHisPreviousOrderDetails(String expectedOrderHistory) {
        getAppLibrary().getPage().getRup().userAbleToSeeHisPreviousOrderDetails(expectedOrderHistory);
    }

    @And("click proceed to checkout Summary")
    public void clickProceedToCheckoutSummary() {
        getAppLibrary().getPage().getRup().clickProceedToCheckoutSummary();
    }

    @And("click proceed to checkout Addresses page")
    public void clickProceedToCheckoutAddress() {
        getAppLibrary().getPage().getRup().clickProceedToCheckoutAddress();
    }

    @And("click proceed to checkout Shipping")
    public void clickProceedToCheckoutShipping() {
        getAppLibrary().getPage().getRup().clickProceedToCheckoutShipping();
    }

}
