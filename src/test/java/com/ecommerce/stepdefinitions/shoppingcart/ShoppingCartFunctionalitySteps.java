package com.ecommerce.stepdefinitions.shoppingcart;

import com.ecommerce.stepdefinitions.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ShoppingCartFunctionalitySteps extends TestBase {
    @When("the user fills requirement fields with valid credentials")
    public void theUserFillsRequirementFieldsWithValidCredentials(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        String email = credentials.get(0).get(1);
        String password = credentials.get(1).get(1);
        getAppLibrary().getPage().getScp().enterUserCredentials(email, password);
    }

    @And("click the first product on page")
    public void clickTheFirstProductOnPage() {
        getAppLibrary().getPage().getScp().clickTheFirstProductOnPage();
    }

    @When("choose number of tshirt, color and size")
    public void chooseNumberOfTshirtColorAndSize(DataTable dt) {
        List<List<String>> customizeProduct = dt.asLists();
        String qyt = customizeProduct.get(1).get(0);
        String color = customizeProduct.get(1).get(1);
        String size = customizeProduct.get(1).get(2);
        getAppLibrary().getPage().getScp().customNumberOfTshirtColorAndSize(qyt, color, size);
    }

    @And("click {string} link")
    public void clickLink(String addCart) {
        getAppLibrary().getPage().getScp().clickLink(addCart);
    }

    @Then("verify if the product added correctly")
    public void verifyIfTheProductAddedCorrectly(String expectedCartTitle) {
        getAppLibrary().getPage().getScp().verifyIfTheProductAddedCorrectly(expectedCartTitle);
    }

    @And("click the third product on page")
    public void clickTheThirdProductOnPage() {
        getAppLibrary().getPage().getScp().clickTheThirdProductOnPage();
    }

    @And("click {string} button")
    public void clickButton(String proceedToCart) {
        getAppLibrary().getPage().getScp().clickButton(proceedToCart);
    }

    @And("click {string} icon")
    public void clickIcon(String delete) {
        getAppLibrary().getPage().getScp().clickIcon(delete);
    }

    @Then("verify if product removed successfully")
    public void verifyIfProductRemovedSuccessfully(String expectedText) {
        getAppLibrary().getPage().getScp().verifyIfProductRemovedSuccessfully(expectedText);
    }

    @Then("verify if the total price is {string} matching with price that shown on website")
    public void verifyIfTheTotalPriceIsMatchingWithPriceThatShownOnWebsite(String expectedPrice) {
        getAppLibrary().getPage().getScp().verifyIfTheTotalPriceIsMatchingWithPriceThatShownOnWebsite(expectedPrice);
    }
}
