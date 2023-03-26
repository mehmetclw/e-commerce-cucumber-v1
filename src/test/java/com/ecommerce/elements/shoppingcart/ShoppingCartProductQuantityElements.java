package com.ecommerce.elements.shoppingcart;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartProductQuantityElements {
    public ShoppingCartProductQuantityElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[normalize-space()='Popular']")
    public WebElement popularTab;

    @FindBy(xpath = "(//img[@title='Faded Short Sleeves T-shirt'])[2]")
    public WebElement hoverOverProduct;

    @FindBy (xpath ="(//span[contains(text(),'More')])[9]" )
    public WebElement moreTab;

    @FindBy(xpath = "(//i[@class='icon-plus'])[1]")
    public WebElement increaseQuantityOfProduct;

    @FindBy(xpath ="(//span[normalize-space()='Add to cart'])[1]" )
    public WebElement addProductToCart;

    @FindBy(xpath = "(//span[normalize-space()='Proceed to checkout'])[1]")
    public WebElement proceedToCheckOut;

    @FindBy(xpath = "(//span[@id='total_price_without_tax'])[1]")
    public WebElement actualProductPrice;

    @FindBy(xpath = "(//i[@class='icon-minus'])[1]")
    public  WebElement decreaseQuantityOfProduct;

    @FindBy(xpath ="//span[@id='total_price_without_tax']" )
    public WebElement actualProductPriceAfterDecrease;
}
