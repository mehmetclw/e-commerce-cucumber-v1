package com.ecommerce.pages.customeraccounts;

import com.ecommerce.elements.customeraccounts.AccountManagementFunctionalityElements;
import com.ecommerce.utility.Utility;
import org.junit.Assert;

public class AccountManagementFunctionalityPages extends Utility {
    AccountManagementFunctionalityElements amfe = new AccountManagementFunctionalityElements();

    public void clickOnThePage(String historyOfMyOrder) {
        clickElement(amfe.historyOfOrder);
        waits(1);
    }

    public void verifyThatUserCanSeeHistoryOfOrder(String checkExpectedText) {
        String checkActualText = amfe.checkActualText.getText();
        Assert.assertEquals("Not MATCHED", checkActualText, checkExpectedText);
    }

    public void clickOnPage(String myPersonelInfo) {
        clickElement(amfe.checkPersonalInfo);
    }

    public void enter(String currentPassword) {
        sendKeyToElement(amfe.enterCurrentPassword, currentPassword);
    }

    public void enterOnPage(String newPassword) {
        sendKeyToElement(amfe.enterNewPassword, newPassword);
    }

    public void enterOneMoreTimeUnderConfirmation(String newPassword) {
        sendKeyToElement(amfe.confirmPassword, newPassword);
        waits(2);
    }

    public void clickOn(String saveButton) {
        clickElement(amfe.clickSaveButton);
    }

    public void verifyIfUserUpdatedPasswordSuccessfully(String expectedText) {
        String actualUpdatedPassword = amfe.checkUpdatedPassword.getText();
        Assert.assertEquals("Confirmation Message not displayed", expectedText, actualUpdatedPassword);
        System.out.println("passwordUpdated = " + actualUpdatedPassword);
        waits(2);
    }

    public void clickOnTheLink(String myAddress) {
        clickElement(amfe.myAddressButton);
        waits(2);
    }

    public void clickOnButton(String updateButton) {
        clickElement(amfe.clickUpdateButton);
    }

    public void enterNewAddressUnderAddress() {
        clearElement(amfe.enterNewAddress);
        sendKeyToElement(amfe.enterNewAddress, "12 Street");
        waits(2);
    }

    public void verifyThatUserChangedShippingAddressSuccessfully(String verifyExpectedAddressText) {
        String verifyActualAddressText = amfe.verifyActualAddressText.getText();
        Assert.assertEquals("Text didn't match", verifyActualAddressText, verifyExpectedAddressText);
    }
}
