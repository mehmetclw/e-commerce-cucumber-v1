package com.ecommerce.stepdefinitions.products;

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

public class ItemDetailsVerificationSteps {
    @Given("go to home page {string}")
    public void goToHomePage(String url) {
        Driver.getDriver().get(url);
    }

    @And("click on {string} link")
    public void clickOnLink(String value) {
        WebElement singIn = Driver.getDriver().findElement(By.linkText(value));
        singIn.click();
        // Driver.getDriver().findElement(By.xpath("//a[normalize-space()='"+singInLink+"']"));
    }

    @When("the user enters following valid credentials as email address and password:")
    public void theUserEntersFollowingValidCredentialsAsEmailAddressAndPassword(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        String email = credentials.get(0).get(1);
        String password = credentials.get(1).get(1);
        Driver.getDriver().findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        Driver.getDriver().findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton(String singInButton) { //abc
        if (iframe !=null) {
            Driver.getDriver().switchTo().defaultContent();
            Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.cssSelector(".fancybox-iframe")));
        }
        WebElement button = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='" + singInButton + "']"));
        button.click();
    }

    @And("click the first product on the page")
    public void clickTheFirstProductOnThePage() {
        System.out.println("iframe first scenario = " + iframe);
        Utility.waits(1);
        Driver.getDriver().findElements(By.xpath("//h5[@itemprop='name']/a")).get(0).click();
        Utility.waits(3);
    }

    @Then("check the product title {string}")
    public void checkTheProductTitle(String expectedTitle) {
        System.out.println("iframe = " + iframe);
        if (iframe !=null) {
            Driver.getDriver().switchTo().defaultContent();
            Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.cssSelector(".fancybox-iframe")));
        }
        String actualTitle = Driver.getDriver().findElement(By.xpath("//h1[normalize-space()='Faded Short Sleeves T-shirt']")).getText();
        Assert.assertEquals("Assserton Failed", expectedTitle, actualTitle);
    }

    @Then("check the product details as expected")
    public void checkTheProductDetailsAsExpected(String expectedDescription) {
        if (iframe !=null) {
            Driver.getDriver().switchTo().defaultContent();
            Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.cssSelector(".fancybox-iframe")));
        } String actualDescription = Driver.getDriver().findElement(By.xpath("//p[contains(text(),'Faded short sleeves t-shirt with high neckline. So')]")).getText();
        Assert.assertEquals("Failed", expectedDescription, actualDescription);
    }

    @Then("check the price as {string}")
    public void checkThePriceAsExpecteed(String expectedPrice) {
        if (iframe !=null) {
            Driver.getDriver().switchTo().defaultContent();
            Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.cssSelector(".fancybox-iframe")));
        } String actualPrice = Driver.getDriver().findElement(By.xpath("//span[@id='our_price_display']")).getText();
        Assert.assertEquals("Failed", expectedPrice, actualPrice);
    }

    @Then("check the text at checkout page as expected")
    public void checkTheTextAtCheckoutPageAsExpected(String expectedResult) {
        if(iframe !=null){
            String actualResult = Driver.getDriver().findElement(By.xpath("//h1[@id='cart_title']")).getText();
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("actualResult = " + actualResult);
            Assert.assertTrue("Failed", actualResult.contains(expectedResult));
        }else {
            String actualResult = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Product successfully added to your shopping cart']")).getText();
            Assert.assertEquals("Failed", expectedResult, actualResult);
        }
    }

    String iframe;

    @And("click the first product's {string} on the page")
    public void clickTheFirstProductSOnThePage(String quickView) {
        this.iframe = quickView;
        Utility.hoverOver(Driver.getDriver().findElements(By.xpath("//h5[@itemprop='name']/a")).get(0), 2);
        Driver.getDriver().findElement(By.linkText(quickView)).click();
        Utility.waits(2);
    }
}
