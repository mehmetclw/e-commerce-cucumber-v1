package com.ecommerce.elements.homepage;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewsletterFunctionalityElements {
    public NewsletterFunctionalityElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "newsletter-input")
    public WebElement newsletterBar;

    @FindBy(name = "submitNewsletter")
    public  WebElement newsletterButton;

    @FindBy(css = ".alert.alert-success")
    public  WebElement message;

    @FindBy(id = "inputEmail")
    public  WebElement fakeEmail;

    @FindBy(id = "form-domain-id")
    public   WebElement emailSelect;

    @FindBy(id = "fetch-mails")
    public  WebElement fetchButton;

    @FindBy(css = "table[class*='table table'] tr")
    public   List<WebElement> tableRow;

    @FindBy(id = "email_create")
    public  WebElement emailCreate;

    @FindBy(id = "customer_firstname")
    public  WebElement firstNameBar;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameBar;

    @FindBy(id = "passwd")
    public  WebElement passwordBar;

    @FindBy(id = "old_passwd")
    public  WebElement currentPasswordBar;

    @FindBy(id = "confirmation")
    public   WebElement confirmationBar;

    @FindBy(id = "newsletter")
    public  WebElement newsletterBox;

    @FindBy(id = "user")
    public   WebElement emailAddress;

    @FindBy(id = "pass")
    public   WebElement password;

    @FindBy(id = "login_submit")
    public  WebElement logInButton;

    @FindBy(id = "launchActiveButton")
    public   WebElement openButton;


}
