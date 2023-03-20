package com.ecommerce.stepdefinitions.customeraccounts;

import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.event.WindowAdapter;

public class AccountManagementFunctionalitySteps extends Utility {
    @And("click {string} on the page")
    public void clickOnThePage(String historyOfMyOrder) {
        Driver.getDriver().findElement(By.xpath("//span[text()='Order history and details']")).click();
        waits(1);

    }

    @Then("verify that user can see history of order")
    public void verifyThatUserCanSeeHistoryOfOrder(String expectedText) {
        String actualText = Driver.getDriver().findElement(By.xpath("//p[@class='info-title']")).getText();
        Assert.assertEquals("Not MATCHED", actualText, expectedText);
        waits(2);
        Driver.getDriver().navigate().back();
    }

    @And("click {string} on page")
    public void clickOnPage(String myPersonelInfo) {
        Driver.getDriver().findElement(By.xpath("//span[text()='" + myPersonelInfo + "']")).click();
    }

    @And("enter current password")
    public void enterCurrentPassword() {
        Driver.getDriver().findElement(By.xpath("//input[@id='old_passwd']")).sendKeys("123elifnur");
    }

    @Then("enter new password")
    public void enterNewPassword() {
        Driver.getDriver().findElement(By.xpath("//input[@id='passwd']")).sendKeys("123elifnur");
    }

    @Then("enter new password one more time under confirmation")
    public void enterNewPasswordOneMoreTimeUnderConfirmation() {
        Driver.getDriver().findElement(By.xpath("//input[@id='confirmation']")).sendKeys("123elifnur");
        waits(2);
    }

    @When("click on {string}")
    public void clickOn(String saveButton) {
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='" + saveButton + "']")).click();
    }

    @And("verify if user updated password successfully")
    public void verifyIfUserUpdatedPasswordSuccessfully(String expectedText) {
        WebElement passwordUpdated = Driver.getDriver().findElement(By.xpath("//p[@class='alert alert-success']"));
        Assert.assertEquals("Confirmation Message not displayed", expectedText, passwordUpdated.getText());
        System.out.println("expectedText = " + expectedText);
        System.out.println("passwordUpdated = " + passwordUpdated.getText());
        waits(2);
    }

    @And("click on the {string} link")
    public void clickOnTheLink(String myAddress) {
        Driver.getDriver().findElement(By.xpath("//span[text()='My addresses']")).click();
        waits(2);
    }

    @Then("click on {string} button")
    public void clickOnButton(String updateButtton) {
        Driver.getDriver().findElement(By.xpath("//ul[@class='first_item item box']//span[text()='Update']")).click();
        waits(2);
    }

    @When("enter new address under address")
    public void enterNewAddressUnderAddress() {
        WebElement enterNewAddress = Driver.getDriver().findElement(By.xpath("//input[@id='address1']"));
        enterNewAddress.click();
        enterNewAddress.clear();
        enterNewAddress.sendKeys("12 Street");
        waits(2);
    }

    @And("verify that user changed shipping address successfully")
    public void verifyThatUserChangedShippingAddressSuccessfully(String expectedTitle) {
        String actualText = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='12 Street']")).getText();
        Assert.assertEquals("Text didn't match", actualText, expectedTitle);
    }
}
