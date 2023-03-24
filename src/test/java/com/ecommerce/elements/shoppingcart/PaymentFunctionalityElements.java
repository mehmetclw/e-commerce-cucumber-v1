package com.ecommerce.elements.shoppingcart;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PaymentFunctionalityElements {
    public PaymentFunctionalityElements (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Sign in")
    public WebElement singIn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement button;

    @FindBy(linkText = "Women")
    public WebElement women;

    @FindBy(xpath = "//h5[@itemprop='name']/a")
    public List<WebElement> products;

    @FindBy(name = "Submit")
    public WebElement addToCart;

    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']//span[contains(text(),'Proceed to checkout')]")
    public WebElement summaryPageCheckout;

    @FindBy(xpath = "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
    public WebElement addressPageCheckout;

    @FindBy(xpath = "//input[@id='cgv']")
    public WebElement agreeTermsBox;

    @FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
    public WebElement shippingPageCheckout;

    @FindBy(xpath = "//a[@title='Pay by check.']")
    public WebElement payByCheck;

    @FindBy(xpath = "//span[normalize-space()='I confirm my order']")
    public WebElement iConfirmMyOrder;

    @FindBy(xpath = "//p[@class=\"alert alert-success\"]")
    public WebElement actualConfirmMessage;

    @FindBy(xpath = "//a[@title='Pay by bank wire']")
    public WebElement payByBankWire;





}
