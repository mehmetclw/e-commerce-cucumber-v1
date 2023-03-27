package com.ecommerce.stepdefinitions.customeraccounts;

import com.ecommerce.stepdefinitions.TestBase;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.event.WindowAdapter;

public class AccountManagementFunctionalitySteps extends TestBase {
    @And("click {string} on the page")
    public void clickOnThePage(String historyOfMyOrder) {
        getAppLibrary().getPage().getAmfp().clickOnThePage(historyOfMyOrder);
    }

    @Then("verify that user can see history of order")
    public void verifyThatUserCanSeeHistoryOfOrder(String checkExpectedText) {
        getAppLibrary().getPage().getAmfp().verifyThatUserCanSeeHistoryOfOrder(checkExpectedText);
    }

    @And("click {string} on page")
    public void clickOnPage(String myPersonelInfo) {
        getAppLibrary().getPage().getAmfp().clickOnPage(myPersonelInfo);
    }

    @And("enter {string}")
    public void enter(String currentPassword) {
        getAppLibrary().getPage().getAmfp().enter(currentPassword);
    }

    @Then("enter {string} on page")
    public void enterOnPage(String newPassword) {
        getAppLibrary().getPage().getAmfp().enterOnPage(newPassword);
    }

    @Then("enter {string} one more time under confirmation")
    public void enterOneMoreTimeUnderConfirmation(String newPassword) {
        getAppLibrary().getPage().getAmfp().enterOneMoreTimeUnderConfirmation(newPassword);
    }

    @When("click on {string}")
    public void clickOn(String saveButton) {
        getAppLibrary().getPage().getAmfp().clickOn(saveButton);
    }

    @And("verify if user updated password successfully")
    public void verifyIfUserUpdatedPasswordSuccessfully(String expectedText) {
        getAppLibrary().getPage().getAmfp().verifyIfUserUpdatedPasswordSuccessfully(expectedText);
    }

    @And("click on the {string} link")
    public void clickOnTheLink(String myAddress) {
        getAppLibrary().getPage().getAmfp().clickOnTheLink(myAddress);
    }

    @Then("click on {string} button")
    public void clickOnButton(String updateButton) {
        getAppLibrary().getPage().getAmfp().clickOnButton(updateButton);
    }

    @When("enter new address under address")
    public void enterNewAddressUnderAddress() {
        getAppLibrary().getPage().getAmfp().enterNewAddressUnderAddress();
    }

    @And("verify that user changed shipping address successfully")
    public void verifyThatUserChangedShippingAddressSuccessfully(String verifyExpectedAddressText) {
        getAppLibrary().getPage().getAmfp().verifyThatUserChangedShippingAddressSuccessfully(verifyExpectedAddressText);
    }
}
