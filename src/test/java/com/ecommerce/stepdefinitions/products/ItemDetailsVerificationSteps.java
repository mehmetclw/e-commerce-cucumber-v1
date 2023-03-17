package com.ecommerce.stepdefinitions.products;

import com.ecommerce.utility.Database;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemDetailsVerificationSteps {
    @Given("go to home page {string}")
    public void goToHomePage(String url) {
        Driver.getDriver().get(url);
    }

    @And("click on {string} link")
    public void clickOnLink(String singInLink) {
        WebElement singIn=Driver.getDriver().findElement(By.linkText(singInLink));
        singIn.click();
       // Driver.getDriver().findElement(By.xpath("//a[normalize-space()='"+singInLink+"']"));
    }

    @When("the user enters following valid credentials as email address and password:")
    public void theUserEntersFollowingValidCredentialsAsEmailAddressAndPassword(DataTable dt) {
        List<List<String>> credentials=dt.asLists();
        String email=credentials.get(0).get(1);
        String password=credentials.get(1).get(1);
        Driver.getDriver().findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        Driver.getDriver().findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
        System.out.println("credentials = " + credentials);
        System.out.println("credentials.get(0) = " + credentials.get(0));
        Utility.waits(3);
    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {
    }

    @And("click the first product on the page")
    public void clickTheFirstProductOnThePage() {
    }

    @Then("check the product title")
    public void checkTheProductTitle() {
    }

    @Then("check the product details as expected")
    public void checkTheProductDetailsAsExpected() {
    }

    @Then("check the price as expecteed")
    public void checkThePriceAsExpecteed() {
    }

    @And("click {string} button")
    public void clickButton(String arg0) {
    }

    @Then("check the text at checkout page as expected")
    public void checkTheTextAtCheckoutPageAsExpected() {
    }

    @And("click the first product's {string} on the page")
    public void clickTheFirstProductSOnThePage(String arg0) {
    }
}
