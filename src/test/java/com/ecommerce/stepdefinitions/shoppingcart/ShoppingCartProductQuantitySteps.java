package com.ecommerce.stepdefinitions.shoppingcart;

import com.ecommerce.stepdefinitions.TestBase;
import com.ecommerce.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ShoppingCartProductQuantitySteps extends TestBase {
    @Given("Go to the homePage {string}")
    public void goToHomePage(String url) {

        Driver.getDriver().get(url);
        getAppLibrary().getFlowsLibrary().navigateToUrl(url);
    }

    @And("Click {string} tab on the homepage")
    public void clickPopularTabOnTheHomepage(String popular) {

        getAppLibrary().getPage().getScpqp().clickPopularTabOnTheHomepage(popular);
    }

    @Then("HoverOver the product")
    public void hoverOverTheProduct() {
        getAppLibrary().getPage().getScpqp().hoverOverTheProduct();
    }

    @And("Click {string} tab on the product")
    public void clickTabOnTheProduct(String more) {

        getAppLibrary().getPage().getScpqp().clickTabOnTheProduct();
    }

    @And("increase the number of product")
    public void increaseTheNumberOfProduct() {
        getAppLibrary().getPage().getScpqp().increaseTheNumberOfProduct();
    }

    @And("Add to cart the product as clicking {string} tab")
    public void addToCartTheProductAsClickingTab(String addToCart) {
        getAppLibrary().getPage().getScpqp().addToCartTheProductAsClickingTab(addToCart);
    }

    @Then("click for check out to {string} tab")
    public void clickForCheckOutToTab(String proceedCheckOut) {
        getAppLibrary().getPage().getScpqp().clickForCheckOutToTab();
    }

    @Then("check the price if it is {string} after increase")
    public void checkThePriceIfItIsAfterIncrease(String expectedProductPrice) {
        getAppLibrary().getPage().getScpqp().checkThePriceIfItIsAfterIncrease(expectedProductPrice);
    }

    @And("decrease the number of product")
    public void decreaseTheNumberOfProduct() {
        getAppLibrary().getPage().getScpqp().decreaseTheNumberOfProduct();
    }

    @Then("check the price if it is {string} after decrease")
    public void checkThePriceIfItIsAfterIncreasing(String expectedProductPriceAfterDecrease) {
        getAppLibrary().getPage().getScpqp().checkThePriceIfItIsAfterIncreasing(expectedProductPriceAfterDecrease);
    }
}
