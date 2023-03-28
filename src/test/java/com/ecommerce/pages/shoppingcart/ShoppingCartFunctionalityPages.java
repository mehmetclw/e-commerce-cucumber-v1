package com.ecommerce.pages.shoppingcart;

import com.ecommerce.elements.shoppingcart.ShoppingCartFunctionalityElements;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import org.junit.Assert;

public class ShoppingCartFunctionalityPages extends Utility {
    ShoppingCartFunctionalityElements scp = new ShoppingCartFunctionalityElements();

    public void enterUserCredentials(String email, String password) {
        sendKeyToElement(scp.emailAdress, email);
        sendKeyToElement(scp.enterPassword, password);
    }

    public void clickTheFirstProductOnPage() {
        clickElement(scp.clickTshirtLink);
        waits(2);
    }

    public void customNumberOfTshirtColorAndSize(String qyt, String color, String size) {
        Driver.getDriver().switchTo().frame(0);
        clickElement(scp.chooseNumberOfTshirt);
        clearElement(scp.chooseNumberOfTshirt);
        sendKeyToElement(scp.chooseNumberOfTshirt, qyt);
        waits(3);
        clickElement(scp.clickChooseSize);
        selectElementByValue(scp.clickChooseSize, size);
        clickElement(scp.chooseColor);
    }

    public void clickLink(String addCart) {
        clickElement(scp.addToCart);
    }

    public void verifyIfTheProductAddedCorrectly(String expectedCartTitle) {
        String actualCartTitle = scp.actualCartTitle.getText();
        Assert.assertEquals("NOT matched", expectedCartTitle, actualCartTitle);
        waits(2);
    }

    public void clickTheThirdProductOnPage() {
        Utility.scrollByPixel(1000);
        clickElement(scp.clickThirdProduct.get(2));
    }

    public void clickButton(String proceedToCart) {
        clickElement(scp.proceedToCheckOut);
        waits(2);
    }

    public void clickIcon(String delete) {
        clickElement(scp.deleteButton);
        waits(1);
    }

    public void verifyIfProductRemovedSuccessfully(String expectedText) {
        String actualText = scp.actualTitle.getText();
        Assert.assertEquals("DID NOT match", expectedText, actualText);
        waits(2);
    }

    public void verifyIfTheTotalPriceIsMatchingWithPriceThatShownOnWebsite(String expectedPrice) {
        scrollByPixel(1000);
        String actualPrice = scp.actualPrice.getText();
        Assert.assertEquals("did not match", expectedPrice, actualPrice);
        waits(1);
    }
}

