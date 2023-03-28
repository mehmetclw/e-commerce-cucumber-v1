package com.ecommerce.elements.shoppingcart;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturningUserPurchaseElements {

    public ReturningUserPurchaseElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    public WebElement ProceedToCheckout;

    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement shoppingCartSummary;

    @FindBy(css = "#total_price_without_tax")
    public WebElement totalCart;

    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_address1 address_address2']")
    public WebElement userStreetAddress;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_city address_state_name address_postcode']")
    public WebElement userCityStateAddress;

    @FindBy(xpath = "//input[@id='cgv']")
    public WebElement checkTheAgreeTermsBox;

    @FindBy(xpath = "//a[@title='Pay by check.']")
    public WebElement PayByCheck;

    @FindBy(xpath = "//span[normalize-space()='I confirm my order']")
    public WebElement ConfirmMyOrderButton;

    @FindBy(xpath = "//p[@class=\"alert alert-success\"]")
    public WebElement confirmMessage;

    @FindBy(xpath = "//span[normalize-space()='I confirm my order']")
    public WebElement confirmOrderButton;

    @FindBy(xpath = "//a[normalize-space()='View your order history']")
    public WebElement ViewOrderHistory;

    @FindBy(xpath = "//tr[contains(@class,'first_item')]//span[contains(text(),'Details')]")
    public WebElement orderDetailsButton;

    @FindBy(css = "a[class='button btn btn-default standard-checkout button-medium'] span")
    public WebElement ProceedToCheckoutSummary;

    @FindBy(css = "button[name='processAddress'] span")
    public WebElement ProceedToCheckoutAddress;

    @FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
    public WebElement ProceedToCheckoutShipping;

}
