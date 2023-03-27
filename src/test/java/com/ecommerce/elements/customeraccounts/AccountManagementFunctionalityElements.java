package com.ecommerce.elements.customeraccounts;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountManagementFunctionalityElements {
    public AccountManagementFunctionalityElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Order history and details']")
    public WebElement historyOfOrder;
    @FindBy(xpath = "//p[@class='info-title']")
    public WebElement checkActualText;
    @FindBy(xpath = "//span[text()='My personal information']")
    public WebElement checkPersonalInfo;
    @FindBy(xpath = "//input[@id='old_passwd']")
    public WebElement enterCurrentPassword;
    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement enterNewPassword;
    @FindBy(xpath = "//input[@id='confirmation']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement clickSaveButton;
    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement checkUpdatedPassword;
    @FindBy(xpath = "//span[text()='My addresses']")
    public WebElement myAddressButton;
    @FindBy(xpath = "//ul[@class='first_item item box']//span[text()='Update']")
    public WebElement clickUpdateButton;
    @FindBy(xpath = "//input[@id='address1']")
    public WebElement enterNewAddress;
    @FindBy(xpath = "//span[normalize-space()='12 Street']")
    public WebElement verifyActualAddressText;

}
