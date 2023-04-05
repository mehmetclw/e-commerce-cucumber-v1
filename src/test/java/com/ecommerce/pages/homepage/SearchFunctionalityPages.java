package com.ecommerce.pages.homepage;

import com.ecommerce.elements.homepage.SearchFunctionalityElements;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchFunctionalityPages extends Utility {
    SearchFunctionalityElements sfe;
   /* private static final Logger loggers = Logger.getLogger(SearchFunctionalityPages.class);*/


    public SearchFunctionalityPages() {
        sfe = new SearchFunctionalityElements();
    }

    public void goToSearchBox(String item) {
        sfe.searchBox.sendKeys(item);
        waits(1);
    }

    public void clickSearchButton() {
        clickElement(sfe.searchButton);
        waits(1);
    }

    public String verifyTheSearchPage() {
        return getCurrentPageTitle();
    }

    public void theExpectedSearchResultsIsRelevantTo(String searchWord) {
        for (WebElement searchResult : sfe.searchResults) {
            String productTitle = searchResult.findElement(By.cssSelector("h5>a")).getText();
            Assert.assertTrue(productTitle.contains(searchWord));
        }
    }

    public void verifyThatXyzErrorMessageIsDisplayed(String expectedErrorMessage) {
        String actualErrorMessage = getTextElement(sfe.errorMessage);
        Assert.assertEquals("Error message", expectedErrorMessage, actualErrorMessage);

    }

    public void verifyTheSearchResultsPricesIsSortedFromLowToHigh() {
        List<Float> prices = new ArrayList<>();
        for (WebElement productPrice : sfe.productPrices) {
            String priceText = productPrice.getText().replace("$", "");
            prices.add(Float.valueOf(priceText));
        }
        List<Float> sortedPrices = new ArrayList<Float>(prices);
        Collections.sort(sortedPrices);
        Assert.assertEquals(prices, sortedPrices);
    }
    public void clickOnTheSortOptions(){
        clickElement(sfe.sortOption);
    }

    public void selectSortPriceFromLowestToHighest(String value){
        selectElementByValue(sfe.sortOption,value);
    }

  /*  @Test
    public void test(){
        loggers.info("INFO MESSAGE");
        loggers.warn("WARNING MESSAGE");
        loggers.error("ERROR MESSAGES");
        loggers.trace("TRACE MESSAGE");
        loggers.fatal("FATAL MeSSAGE");
        loggers.debug("DEBUG MESSAGE");
    }*/
}
