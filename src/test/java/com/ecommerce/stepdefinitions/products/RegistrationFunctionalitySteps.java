package com.ecommerce.stepdefinitions.products;

import com.ecommerce.stepdefinitions.TestBase;

import io.cucumber.java.en.And;

public class RegistrationFunctionalitySteps extends TestBase {
    @And("enter the valid e-mail to create an account")
    public void enterTheValidEMailToCreateAnAccount() {
        getAppLibrary().getPage().getUrp().enterTheValidEMailToCreateAnAccount();
    }

}
