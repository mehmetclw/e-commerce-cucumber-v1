package com.ecommerce.stepdefinitions.shoppingcart;

import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartProductQuantityaSteps {
    @Given("Go to the homePage {string}")
    public void goToHomePage(String url) {
        Driver.getDriver().get(url);
    }
    @And("click the popular tab on the page")
    public void clickThePopularTabOnThePage() {
        WebElement popularTab = Driver.getDriver().findElement(By.xpath("//a[normalize-space()='Popular']"));
        Utility.scrollTo(popularTab);
        popularTab.click();
        Utility.waits(2);
    }
    @Then("HoverOver the product")
    public void hoverOverTheProduct() {
        WebElement clickProduct= Driver.getDriver().findElement
                (By.xpath("(//img[@title='Faded Short Sleeves T-shirt'])[2]"));
        Utility.hoverOver(clickProduct,3);
    }
    @And("Click more tab on the product")
    public void clickMoreTabOnTheProduct() {
        WebElement moreTab=Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'More')])[9]"));
        moreTab.click();
        Utility.waits(3);
    }
    @And("increase the number of product")
    public void increaseTheNumberOfProduct() {
        WebElement increaseQuantityOfProduct = Driver.getDriver().findElement(By.xpath("(//i[@class='icon-plus'])[1]"));
        increaseQuantityOfProduct.click();
        Utility.waits(2);
    }
    @And("add to cart the product as clicking Add to cart tab")
    public void addToCartTheProductAsClicking() {
        WebElement addProductToCart=Driver.getDriver().findElement(By.
                xpath("(//span[normalize-space()='Add to cart'])[1]"));
        addProductToCart.click();
        Utility.waits(2);
    }
    @Then("click for check out to Proceed to checkout tab")
    public void clickForCheckOutToTab() {
        WebElement proceedToCheckOut=Driver.getDriver().findElement(By.
                xpath("(//span[normalize-space()='Proceed to checkout'])[1]"));
        proceedToCheckOut.click();
        Utility.waits(2);
    }
    @Then("check the price if it is as expected after increase")
    public void checkThePriceIfItIsAsExpectedAfterIncrease() {
        String expectedProductPrice = "$60.00";
        String actualProductPrice = Driver.getDriver().findElement(By.xpath("(//span[@id='total_price_without_tax'])[1]")).getText();
        Assert.assertEquals("Not Matched",actualProductPrice, expectedProductPrice);
    }
    @And("decrease the number of product")
    public void decreaseTheNumberOfProduct() {
        WebElement decreaseQuantityOfProduct = Driver.getDriver().findElement(By
                .xpath("(//i[@class='icon-minus'])[1]"));
        decreaseQuantityOfProduct.click();
    }
    @Then("check the price if it is as expected after decrease")
    public void checkThePriceIfItIsAsExpectedAfterDecrease() {
        String expectedProductPrice2 = "$30.00";
        String actualProductPrice2 = Driver.getDriver().findElement(By.xpath("//span[@id='total_price_without_tax']")).getText();
        Assert.assertEquals("NotMatched",expectedProductPrice2, actualProductPrice2);
    }
}
