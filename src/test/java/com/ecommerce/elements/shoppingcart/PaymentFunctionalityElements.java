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
}
