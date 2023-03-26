package com.ecommerce.pages.shoppingcart;

import com.ecommerce.elements.shoppingcart.ReturningUserPurchaseElements;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReturningUserPurchasePages extends Utility {
    ReturningUserPurchaseElements rupe;

    public ReturningUserPurchasePages() {
        rupe = new ReturningUserPurchaseElements();
    }

    public void theUserInTheHomePage(String expectedPage) {
        String homePage = Driver.getDriver().getTitle();
        Assert.assertEquals("user not in home page", expectedPage, homePage);
    }

    public void clickProceedToCheckout() {
        clickElement(rupe.ProceedToCheckout);
    }

    public void verifyTheShoppingCartHaveTheTShirtProduct(String expectedShoppingSummary) {
        Assert.assertEquals("shopping cart doesn't have your product",
                expectedShoppingSummary, rupe.shoppingCartSummary.getText());
    }

    public void checkThePriceOfTheTshirtIsTheSameAsExpectedPrice(String expectedTotal) {
        String actualTotalValue = rupe.totalCart.getText();
        Assert.assertEquals("TOTAL DOESN'T MATCH", expectedTotal, actualTotalValue);
    }

    public void verifyThatThePreviouslySavedAddressDetailsArePreFilled(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        String expectedUserStreet = credentials.get(1).get(0);
        String expectedUserCityState = credentials.get(1).get(1);
        Assert.assertEquals("the user Street is not valid", expectedUserStreet, rupe.userStreetAddress.getText());
        Assert.assertEquals("the user city and state not valid", expectedUserCityState, rupe.userCityStateAddress.getText());
    }

    public void checkTheAgreeTermsBox() {
        clickElement(rupe.checkTheAgreeTermsBox);
    }

    public void selectPayByCheck() {
        clickElement(rupe.PayByCheck);
    }

    public void clickConfirmMyOrderButton() {
        clickElement(rupe.confirmOrderButton);
    }

    public void theUserOrderIsConfirmed(String expectedConfirmMessage) {
        String actualConfirmMessage = rupe.confirmMessage.getText();
        Assert.assertEquals("Confirmation Message not displayed", expectedConfirmMessage, actualConfirmMessage);
    }

    public void verifyThatTheUserInTheConfirmationPage(String expectedConfirmPage) {
        String actualConfirmPgeTitle = getCurrentPageTitle();
        Assert.assertEquals(expectedConfirmPage, actualConfirmPgeTitle);
    }

    public void clickViewOrderHistory() {
        clickElement(rupe.ViewOrderHistory);
    }

    public void clickOrderDetailsButton() {
        clickElement(rupe.orderDetailsButton);
    }

    public void userAbleToSeeHisPreviousOrderDetails(String expectedOrderHistory) {
        String actualOrderHistory = getCurrentPageTitle();
        Assert.assertEquals("order history not displayed", expectedOrderHistory, actualOrderHistory);
    }

    public void clickProceedToCheckoutSummary() {
        Utility.scrollTo(rupe.ProceedToCheckoutSummary);
        clickElement(rupe.ProceedToCheckoutSummary);
    }

    public void clickProceedToCheckoutAddress() {
        clickElement(rupe.ProceedToCheckoutAddress);
    }

    public void clickProceedToCheckoutShipping() {
        clickElement(rupe.ProceedToCheckoutShipping);
    }
}
