package com.ecommerce.pages.products;

import com.ecommerce.elements.products.ItemDetailsVerificationElements;
import com.ecommerce.utility.Utility;


public class ItemDetailsVerificationPages extends Utility {
    ItemDetailsVerificationElements idve = new ItemDetailsVerificationElements();

    public void clickOnLink(String value) {
        clickElementByLinkText(value);
    }

    public void enterUserCredentials(String email, String password) {
        sendKeyToElement(idve.email, email);
        sendKeyToElement(idve.password, password);
    }

    public void iFrameHandle(String iframe) {
        if (iframe != null) {
            switchToDefaultContent();
            switchToFrame(idve.quickViewIFrame);
        }
    }

    public void theUserClicksTheButton(String button) {
        clickElementButton(button);
        }

    public void clickTheFirstProductOnThePage() {
        clickElement(idve.products.get(0));
        waits(1);
    }

    public String checkTheProductTitle() {
        return getTextElement(idve.title);
    }

    public String checkTheProductDetailsDescription() {
        return getTextElement(idve.description);
    }

    public String checkThePrice() {
        return getTextElement(idve.price);
    }

    public String checkTheText() {
        return getTextElement(idve.checkoutCartTextIframe);
    }

    public String checkoutCartText() {
        return getTextElement(idve.checkoutCartText);
    }

    public void clickTheFirstProductSOnThePage() {
        hoverOver(idve.products.get(0), 1);
        clickElement(idve.quickView);
        waits(1);
    }


}
