package com.ecommerce.elements.shoppingcart;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutFunctionalityElements {
    public CheckoutFunctionalityElements (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
