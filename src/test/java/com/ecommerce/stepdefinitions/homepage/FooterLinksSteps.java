package com.ecommerce.stepdefinitions.homepage;

import com.ecommerce.stepdefinitions.TestBase;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import com.ecommerce.utility.library.AppLibrary;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class FooterLinksSteps extends TestBase {
    List<String> actualTitles = new ArrayList<>();

    @Given("Go to the homepage first {string}")
    public void goToHomePage(String url) {
        Driver.getDriver().get(url);
    }

    @And("Go to the {string} footer link")
    public void goToTheCategoriesFooterLink(String categoriesLink) {
        getAppLibrary().getPage().getFlp().goToTheCategoriesFooterLink(categoriesLink);
    }

    @Then("Open links as a new tabs under Categories link")
    public void openLinksAsANewTabsUnderCategoriesLink(DataTable dt) {
        getAppLibrary().getPage().getFlp().openLinksAsANewTabsUnderCategoriesLink(dt);
    }

    @Then("Verify that being on the right page seeing the <PageTitles> for each tab under Categories Link")
    public void verifyTheEachPagesTitleUnderCategoriesLink(DataTable dt) {
        getAppLibrary().getPage().getFlp().verifyTheEachPagesTitleUnderCategoriesLink(dt);
    }

    @And("Go to the {string} footer link to test")
    public void goToTheInformationFooterLinkToTest(String informationLink) {
        getAppLibrary().getPage().getFlp().goToTheInformationFooterLinkToTest(informationLink);
    }

    @Then("Open links as a new tabs under Information link")
    public void openAllLinksAsANewTabUnderInformationLink(DataTable dt) {
        getAppLibrary().getPage().getFlp().openAllLinksAsANewTabUnderInformationLink(dt);
    }

    @Then("verify the page titles for each tab under Information Link")
    public void verifyTheEachPagesTitlesUnderInformationLink(DataTable dt) {
        getAppLibrary().getPage().getFlp().verifyTheEachPagesTitlesUnderInformationLink(dt);
    }

    @Given("Go to the home page for My account {string}")
    public void goToHomePageForMyAccount(String url) {
        getAppLibrary().getPage().getFlp().goToHomePageForMyAccount(url);
    }

    @And("Go to the {string} footer link for testing")
    public void goToTheMyAccountFooterLinkForTesting(String myAccountLink) {
        getAppLibrary().getPage().getFlp().goToTheMyAccountFooterLinkForTesting(myAccountLink);
    }

    @Then("Open links as a new tabs under My account link")
    public void openAllLinksAsANewTabsUnderMyAccountLink(DataTable dt) {
        getAppLibrary().getPage().getFlp().openAllLinksAsANewTabsUnderMyAccountLink(dt);
    }

    @Then("verify the page titles for each tab under My account link")
    public void verifyTheEachPageTitlesUnderMyAccountLink(DataTable dt) {
        getAppLibrary().getPage().getFlp().verifyTheEachPageTitlesUnderMyAccountLink(dt);
    }
}