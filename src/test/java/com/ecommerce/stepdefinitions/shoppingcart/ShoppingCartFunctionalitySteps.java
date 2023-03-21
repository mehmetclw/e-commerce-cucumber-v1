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
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class ShoppingCartFunctionalitySteps extends Utility {
    @When("the user fills requirement fields with valid credentials")
    public void theUserFillsRequirementFieldsWithValidCredentials(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        String email = credentials.get(0).get(1);
        String password = credentials.get(1).get(1);
        Driver.getDriver().findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        Driver.getDriver().findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
    }

    @And("click the first product on page")
    public void clickTheFirstProductOnPage() {
        WebElement clickTShirtLink = Driver.getDriver().findElement(By.xpath("//img[@src='https://ecommerce.yosemiteint.com/prestashop/img/p/1/1-home_default.jpg']"));
        clickTShirtLink.click();
    }

    @When("choose number of tshirt, color and size")
    public void chooseNumberOfTshirtColorAndSize(DataTable dt) {
        List<List<String>> customizeProduct = dt.asLists();
        String qyt = customizeProduct.get(1).get(0);
        String password = customizeProduct.get(1).get(1);
        String size = customizeProduct.get(1).get(2);
        Driver.getDriver().switchTo().frame(0);
        WebElement chooseNumberOfTShirt = Driver.getDriver().switchTo().activeElement().findElement(By.xpath("//input[@id='quantity_wanted']"));
        chooseNumberOfTShirt.clear();
        chooseNumberOfTShirt.sendKeys("2");
        WebElement select = Driver.getDriver().findElement(By.xpath("//select[@id='group_1']"));
        selectElementByIndex(select, 1);
        Driver.getDriver().findElement(By.xpath("//a[@id='color_13']")).click();
        waits(3);
    }

    @And("click {string} link")
    public void clickLink(String addToCart) {
        WebElement addCart = Driver.getDriver().findElement(By.xpath("//span[text()='" + addToCart + "']"));
        addCart.click();
        waits(2);
    }

    @Then("verify if the product added correctly")
    public void verifyIfTheProductAddedCorrectly(String expectedCartTitle) {
        String actualCartTitle = Driver.getDriver().findElement(By.xpath("//span[@class='heading-counter']")).getText();
        Assert.assertEquals("NOT matched", expectedCartTitle, actualCartTitle);
        Driver.getDriver().navigate().back();
        waits(3);
    }

    @And("click the third product on page")
    public void clickTheThirdProductOnPage() {
        Utility.scrollByPixel(1000);
        List<WebElement> clickThirdProduct = Driver.getDriver().findElements(By.xpath("//h5[@itemprop='name']//a"));
        clickThirdProduct.get(2).click();
    }

    @And("click {string} button")
    public void clickButton(String proceedToCart) {
        WebElement proceedCart = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='" + proceedToCart + "']"));
        proceedCart.click();
        waits(2);
    }

    @And("click {string} icon")
    public void clickIcon(String delete) {
        WebElement deleteButton = Driver.getDriver().findElement(By.xpath("//i[@class='icon-trash']"));
        deleteButton.click();
        waits(1);
    }

    @Then("verify if product removed successfully")
    public void verifyIfProductRemovedSuccessfully(String expectedCartTitle) {
        String actualCartTitle = Driver.getDriver().findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertEquals("DID NOT match", expectedCartTitle, actualCartTitle);
        waits(2);
    }

    @Then("verify if the total price is {string} matching with price that shown on website")
    public void verifyIfTheTotalPriceIsMatchingWithPriceThatShownOnWebsite(String expectedPrice) {
        scrollByPixel(1000);
        String actualPrice = Driver.getDriver().findElement(By.xpath("//span[@id='total_price_without_tax']")).getText();
        Assert.assertEquals("did not match", expectedPrice, actualPrice);
        System.out.println("Total price without tax is " + actualPrice);
        waits(1);
    }
}
