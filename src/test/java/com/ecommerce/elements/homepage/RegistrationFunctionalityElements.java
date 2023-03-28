package com.ecommerce.elements.homepage;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFunctionalityElements {
    public RegistrationFunctionalityElements() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement errorMessage;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement successMessage;
}
