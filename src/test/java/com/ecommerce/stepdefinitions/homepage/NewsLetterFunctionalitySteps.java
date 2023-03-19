package com.ecommerce.stepdefinitions.homepage;

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
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NewsLetterFunctionalitySteps {

    WebElement newsletterBar;
    String email;
    String mainWindow;

    @And("scroll down the screen")
    public void scrollDownTheScreen() {
        newsletterBar = Driver.getDriver().findElement(By.id("newsletter-input"));
        Utility.scrollTo(newsletterBar);
    }

    @And("enter the valid e-mail:")
    public void enterTheValidEMail(DataTable dt) {
        Map<String, String> email = dt.asMap();
        String newsletterEmail = email.get("e-mail");
        this.email = newsletterEmail;
        newsletterBar.sendKeys(newsletterEmail);
        Utility.waits(1);
    }

    @And("the user clicks the enter button")
    public void theUserClicksTheEnterButton() {
        WebElement newsletterButton = Driver.getDriver().findElement(By.name("submitNewsletter"));
        newsletterButton.click();
        Utility.waits(1);
    }

    @Then("check the message as expected {string}")
    public void checkTheMessageAsExpected(String expectedMessage) {
        WebElement message = Driver.getDriver().findElement(By.cssSelector(".alert.alert-success"));
        String actualMessage = message.getText();
        Assert.assertEquals("NO MATCH", expectedMessage, actualMessage);
        Utility.waits(1);
    }

    @And("go to e-mail inbox {string}")
    public void goToEMailInbox(String url) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open()");
        mainWindow = Driver.getDriver().getWindowHandle();
        Set<String> windows = Driver.getDriver().getWindowHandles();
        Iterator<String> it = windows.iterator();
        while (it.hasNext()) {
            String childWindow = it.next();
            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                Driver.getDriver().switchTo().window(childWindow);
                Driver.getDriver().navigate().to(url);
            }
        }
        String fakeEmailname = email.substring(0, email.indexOf('@'));
        String emailText = email.substring(email.indexOf("t"));
        WebElement fakeEmail = Driver.getDriver().findElement(By.id("inputEmail"));
        fakeEmail.sendKeys(fakeEmailname);
        WebElement emailSelect = Driver.getDriver().findElement(By.id("form-domain-id"));
        Select select = new Select(emailSelect);
        select.selectByVisibleText(emailText);
        WebElement fetchButton = Driver.getDriver().findElement(By.id("fetch-mails"));
        Utility.waits(1);
        fetchButton.click();
    }

    @Then("check the inbox for confirmation e-mail {string}")
    public void checkTheInboxForConfirmationEMail(String checkMessage) {
        List<WebElement> tableRow = Driver.getDriver().findElements(By.cssSelector("table[class*='table table'] tr"));
        String confirmEmail = tableRow.get(0).getText() + " " + tableRow.get(1).getText();
        Assert.assertTrue("NO MATCH", confirmEmail.contains(checkMessage));
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(mainWindow);
        Utility.waits(1);
    }

    @And("enter the valid e-mail to create an account:")
    public void enterTheValidEMailToCreateAnAccount(DataTable dt) {
        Map<String, String> email = dt.asMap();
        String newsletterEmail = email.get("e-mail");
        this.email = newsletterEmail;
        WebElement emailCreate = Driver.getDriver().findElement(By.id("email_create"));
        emailCreate.sendKeys(newsletterEmail);
        Utility.waits(1);
    }

    @And("fill the requirements on the page")
    public void fillTheRequirementsOnThePage(DataTable dt) {
        Map<String, String> registerRequirements = dt.asMap();
        String firstName = registerRequirements.get("First Name");
        String lastName = registerRequirements.get("Last Name");
        String password = registerRequirements.get("Password");
        String currentPassword = registerRequirements.get("Current Password");
        String confirmation = registerRequirements.get("Confirmation");
        String newPassword = registerRequirements.get("New Password");

        if (firstName != null) {
            WebElement firstNameBar = Driver.getDriver().findElement(By.id("customer_firstname"));
            firstNameBar.sendKeys(firstName);
        }
        if (lastName != null) {
            WebElement lastNameBar = Driver.getDriver().findElement(By.id("customer_lastname"));
            lastNameBar.sendKeys(lastName);
        }
        if (password != null) {
            WebElement passwordBar = Driver.getDriver().findElement(By.id("passwd"));
            passwordBar.sendKeys(password);
        }
        if (currentPassword != null) {
            WebElement currentPasswordBar = Driver.getDriver().findElement(By.id("old_passwd"));
            currentPasswordBar.sendKeys(currentPassword);
        }
        if (newPassword != null) {
            WebElement passwordBar = Driver.getDriver().findElement(By.id("passwd"));
            passwordBar.sendKeys(newPassword);
        }
        if (confirmation != null) {
            WebElement confirmationBar = Driver.getDriver().findElement(By.id("confirmation"));
            confirmationBar.sendKeys(confirmation);
            this.email = ItemDetailsVerificationSteps.email;
        }
        Utility.waits(1);
    }

    @And("click on the -Sign up for our newsletter!- checkbox")
    public void clickOnTheCheckbox() {
        WebElement newsletterBox = Driver.getDriver().findElement(By.id("newsletter"));
        newsletterBox.click();
        Utility.waits(1);
    }

}
