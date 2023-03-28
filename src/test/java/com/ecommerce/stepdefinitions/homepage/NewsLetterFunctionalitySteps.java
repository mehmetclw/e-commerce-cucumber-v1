package com.ecommerce.stepdefinitions.homepage;

import com.ecommerce.stepdefinitions.TestBase;
import com.ecommerce.stepdefinitions.products.ItemDetailsVerificationSteps;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.SubjectTerm;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class NewsLetterFunctionalitySteps extends TestBase {

    @And("scroll down the screen")
    public void scrollDownTheScreen() {
        getAppLibrary().getPage().getNfp().scrollDownTheScreen();
    }

    @And("enter the valid e-mail:")
    public void enterTheValidEMail(DataTable dt) {
        getAppLibrary().getPage().getNfp().enterTheValidEMail(dt);
    }

    @And("the user clicks the enter button")
    public void theUserClicksTheEnterButton() {
        getAppLibrary().getPage().getNfp().theUserClicksTheEnterButton();
    }

    @Then("check the message as expected {string}")
    public void checkTheMessageAsExpected(String expectedMessage) {
        getAppLibrary().getPage().getNfp().checkTheMessageAsExpected(expectedMessage);
    }

    @And("go to e-mail inbox {string}")
    public void goToEMailInbox(String url) {
        getAppLibrary().getPage().getNfp().goToEMailInbox(url);
    }

    @Then("check the inbox for confirmation e-mail {string}")
    public void checkTheInboxForConfirmationEMail(String checkMessage) {
        getAppLibrary().getPage().getNfp().checkTheInboxForConfirmationEMail(checkMessage);
    }

    @And("enter the valid e-mail to create an account:")
    public void enterTheValidEMailToCreateAnAccount(DataTable dt) {
        getAppLibrary().getPage().getNfp().enterTheValidEMailToCreateAnAccount(dt);
    }

    @And("fill the requirements on the page")
    public void fillTheRequirementsOnThePage(DataTable dt) {
        getAppLibrary().getPage().getNfp().fillTheRequirementsOnThePage(dt);
    }

    @And("click on the -Sign up for our newsletter!- checkbox")
    public void clickOnTheCheckbox() {
        getAppLibrary().getPage().getNfp().clickOnTheCheckbox();
    }

    @And("go to inbox {string}")
    public void goToInbox(String url) {
        getAppLibrary().getPage().getNfp().goToInbox(url);
    }

    @Then("check the inbox for e-mail {string}")
    public void checkTheInboxForEMail(String expectedMessage) {
        getAppLibrary().getPage().getNfp().checkTheInboxForEMail(expectedMessage);
    }

}
