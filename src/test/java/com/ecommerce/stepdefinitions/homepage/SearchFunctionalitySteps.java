package com.ecommerce.stepdefinitions.homepage;

import com.ecommerce.stepdefinitions.TestBase;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SearchFunctionalitySteps extends TestBase {
    @Then("Go to search box type {string}")
    public void goToSearchBoxType(String item) {
        getAppLibrary().getPage().getSfp().goToSearchBox(item);
    }

    @When("click search button")
    public void clickSearchButton() {
        getAppLibrary().getPage().getSfp().clickSearchButton();
    }

    @Then("verify the search page is displayed {string}")
    public void verifyTheSearchPageIsDisplayed(String expectedSearchPageTitle) {
        String searchPageTitle = getAppLibrary().getPage().getSfp().verifyTheSearchPage();
        Assert.assertEquals("Search page not displayed", expectedSearchPageTitle, searchPageTitle);

    }

    @And("the expected search results is relevant to {string}")
    public void theExpectedSearchResultsIsRelevantTo(String searchWord) {
        getAppLibrary().getPage().getSfp().theExpectedSearchResultsIsRelevantTo(searchWord);
    }

    @Then("verify that {string} error message is displayed")
    public void verifyThatXyzErrorMessageIsDisplayed(String errorMessageDisplayed) {
       getAppLibrary().getPage().getSfp().verifyThatXyzErrorMessageIsDisplayed(errorMessageDisplayed);
    }

    @Then("click on  the sort options")
    public void clickOnTheSortOptions() {
        getAppLibrary().getPage().getSfp().clickOnTheSortOptions();
    }

    @And("select sort price from lowest to highest")
    public void selectSortPriceFromLowestToHighest() {
        getAppLibrary().getPage().getSfp().selectSortPriceFromLowestToHighest("price:asc");
    }

    @Then("verify the search results prices is sorted from low to high")
    public void verifyTheSearchResultsPricesIsSortedFromLowToHigh() {
        getAppLibrary().getPage().getSfp().verifyTheSearchResultsPricesIsSortedFromLowToHigh();
    }
}
