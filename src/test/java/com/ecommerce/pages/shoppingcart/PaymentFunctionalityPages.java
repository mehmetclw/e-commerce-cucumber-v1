package com.ecommerce.pages.shoppingcart;

import com.ecommerce.elements.shoppingcart.PaymentFunctionalityElements;
import com.ecommerce.utility.ConfigReader;
import com.ecommerce.utility.Utility;

public class PaymentFunctionalityPages extends Utility {
    PaymentFunctionalityElements pfe;
    public PaymentFunctionalityPages(){ pfe = new PaymentFunctionalityElements();}

    public void clickOnLinkSignIn() {
        clickElement(pfe.singIn);
    }

    public void enterUserCredentials(String email, String password) {
        sendKeyToElement(pfe.email, email);
        sendKeyToElement(pfe.password, password);
    }
    public void clickOnButtonSignIn() {
        clickElement(pfe.singIn);
    }
    public void clickOnLinkWomen() {
        clickElement(pfe.women);
    }
    public void clickTheFirstProductOnThePage() {
        clickElement(pfe.products.get(0));
        waits(1);
    }
    public void clickOnButtonAddToCart() {clickElement(pfe.addToCart);
    }
    public void clickOnButtonproceedToCheckout() {
        clickElement(pfe.proceedToCheckout);
    }
    public void clickOnButtonsummaryPageCheckout() {
        clickElement(pfe.summaryPageCheckout);
    }
    public void clickOnButtonaddressPageCheckout() {
        clickElement(pfe.addressPageCheckout);
    }
    public void clickOnButtonagreeTermsBox() {
        clickElement(pfe.agreeTermsBox);
    }
    public void clickOnButtonshippingPageCheckout() {
        clickElement(pfe.shippingPageCheckout);
    }

    public void clickOnpayByCheck() {
        clickElement(pfe.payByCheck);
    }
    public void clickOnpayByBankWire() {
        clickElement(pfe.payByBankWire);
    }
    public void clickOnButtoniConfirmMyOrder() {
        clickElement(pfe.iConfirmMyOrder);
    }
    public void expectedMessageactualConfirmMessage() {getTextElement(pfe.actualConfirmMessage);
    }


}
