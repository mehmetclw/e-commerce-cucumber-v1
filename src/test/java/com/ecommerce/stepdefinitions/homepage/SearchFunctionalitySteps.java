package com.ecommerce.stepdefinitions.homepage;

import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SearchFunctionalitySteps {
    @Given("Go to home page {string}")
    public void goToHomePage(String url) {
        Driver.getDriver().get(url);
    }

    @Then("Go to search box type {string}")
    public void goToSearchBoxType(String item) {
        Driver.getDriver().findElement(By.name("search_query")).sendKeys(item);
        Utility.waits(3);
    }

    @When("click search button")
    public void clickSearchButton() {
        Driver.getDriver().findElement(By.name("submit_search")).click();
        Utility.waits(3);
    }

    @Then("verify the search page is displayed")
    public void verifyTheSearchPageIsDisplayed() {
        String expectedSearchPageTitle = "Search - My Store";
        String searchPageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Search page not displayed",expectedSearchPageTitle,searchPageTitle);

    }

    @And("the expected search results is relevant to {string}")
    public void theExpectedSearchResultsIsRelevantTo(String searchWord) {
        List<WebElement> searchResults=Driver.getDriver().findElements(By.xpath("//ul[@class='product_list grid row']"));

        for (WebElement searchResult : searchResults) {
            String productTitle = searchResult.findElement(By.cssSelector("h5>a")).getText();
            if (!productTitle.contains(searchWord)) {
                System.out.println("Error: Invalid search result - " + productTitle);
            } else {
                System.out.println("Relevant search result ");
            }
    }}

    @Then("verify that {string} error message is displayed")
    public void verifyThatXyzErrorMessageIsDisplayed(String errorMessageDisplayed) {
       String errorMessage=Driver.getDriver().findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertEquals(errorMessageDisplayed,errorMessage);

    }

    @Then("click on  the sort options")
    public void clickOnTheSortOptions() {
        Driver.getDriver().findElement(By.cssSelector("select[id='selectProductSort']")).click();
    }

    @And("select sort price from lowest to highest")
    public void selectSortPriceFromLowestToHighest() {
        Select select =new Select(Driver.getDriver().findElement(By.cssSelector("select[id='selectProductSort']")));
        select.selectByValue("price:asc");
    }

    @Then("verify the search results prices is sorted from low to high")
    public void verifyTheSearchResultsPricesIsSortedFromLowToHigh() {
        List<Float> prices = new ArrayList<Float>();
        List<WebElement> productPrices=Driver.getDriver().findElements(By.xpath("//ul[@id=product_list]"));

        for (WebElement productPrice : productPrices) {
            String priceText = productPrice.getText().replace("$", "");
            prices.add(Float.valueOf(priceText));
        }
        List<Float> sortedPrices = new ArrayList<Float>(prices);
        Collections.sort(sortedPrices);

        if (!prices.equals(sortedPrices)) {
            System.out.println("Error: Search results are not sorted by price correctly");
        } else System.out.println("Prices are sorting form lowest to highest");
    }
}
