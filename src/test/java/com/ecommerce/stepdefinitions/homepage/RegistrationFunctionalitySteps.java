package com.ecommerce.stepdefinitions.homepage;

import com.ecommerce.stepdefinitions.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RegistrationFunctionalitySteps extends TestBase {
    @And("enter the valid e-mail to create an account")
    public void enterTheValidEMailToCreateAnAccount() {
        getAppLibrary().getPage().getUrp().enterTheValidEMailToCreateAnAccount();
    }

    @And("check the message {string}")
    public void checkTheMessage(String expectedMessage) {
        getAppLibrary().getPage().getUrp().checkTheMessage(expectedMessage);
    }

    @Then("verify that error message is displayed {string}")
    public void verifyThatErrorMessageIsDisplayed(String expectedErrorMessage) {
        getAppLibrary().getPage().getUrp().verifyThatErrorMessageIsDisplayed(expectedErrorMessage);
    }
}
