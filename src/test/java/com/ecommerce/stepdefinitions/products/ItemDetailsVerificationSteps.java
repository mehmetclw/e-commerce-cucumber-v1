package com.ecommerce.stepdefinitions.products;

import com.ecommerce.elements.products.ItemDetailsVerificationElements;
import com.ecommerce.stepdefinitions.TestBase;
import com.ecommerce.utility.ConfigReader;
import com.ecommerce.utility.Database;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemDetailsVerificationSteps extends TestBase {
    public static String email;
    String iframe;
    String url = ConfigReader.getProperty("url");
    @Given("go to home page")
    public void goToHomePage() {
        getAppLibrary().getFlowsLibrary().navigateToUrl(url);
       // getAppLibrary().getPage().getIdv().navigateToUrl(url);
    }

    @And("click on {string} link")
    public void clickOnLink(String value) {
        getAppLibrary().getPage().getIdv().clickOnLink(value);
    }

    @When("the user enters following valid credentials as email address and password:")
    public void theUserEntersFollowingValidCredentialsAsEmailAddressAndPassword(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        email = credentials.get(0).get(1);
        String password = credentials.get(1).get(1);
        getAppLibrary().getPage().getIdv().enterUserCredentials(email, password);
    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton(String button) {
        getAppLibrary().getPage().getIdv().iFrameHandle(iframe);
        getAppLibrary().getPage().getIdv().theUserClicksTheButton(button);
    }

    @And("click the first product on the page")
    public void clickTheFirstProductOnThePage() {
        getAppLibrary().getPage().getIdv().clickTheFirstProductOnThePage();
    }

    @Then("check the product title {string}")
    public void checkTheProductTitle(String expectedTitle) {
        getAppLibrary().getPage().getIdv().iFrameHandle(iframe);
        String actualTitle = getAppLibrary().getPage().getIdv().checkTheProductTitle();
        Assert.assertEquals("Assertion Failed", expectedTitle, actualTitle);
    }

    @Then("check the product details as expected")
    public void checkTheProductDetailsAsExpected(String expectedDescription) {
        getAppLibrary().getPage().getIdv().iFrameHandle(iframe);
        String actualDescription = getAppLibrary().getPage().getIdv().checkTheProductDetailsDescription();
        Assert.assertEquals("Failed", expectedDescription, actualDescription);
    }

    @Then("check the price as {string}")
    public void checkThePriceAsExpecteed(String expectedPrice) {
        getAppLibrary().getPage().getIdv().iFrameHandle(iframe);
        String actualPrice = getAppLibrary().getPage().getIdv().checkThePrice();
        Assert.assertEquals("Failed", expectedPrice, actualPrice);
    }

    @Then("check the text at checkout page as expected")
    public void checkTheTextAtCheckoutPageAsExpected(String expectedResult) {
        if (iframe != null) {
            String actualResult = getAppLibrary().getPage().getIdv().checkTheText();
            Assert.assertTrue("Failed", actualResult.contains(expectedResult));
        } else {
            String actualResult = getAppLibrary().getPage().getIdv().checkoutCartText();
            Assert.assertEquals("Failed", expectedResult, actualResult);
        }
    }

    @And("click the first product's {string} on the page")
    public void clickTheFirstProductSOnThePage(String quickView) {
        this.iframe = quickView;
        getAppLibrary().getPage().getIdv().clickTheFirstProductSOnThePage();
        Utility.waits(1);
    }
}
