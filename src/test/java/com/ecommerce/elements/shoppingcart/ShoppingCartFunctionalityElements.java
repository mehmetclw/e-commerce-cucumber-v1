package com.ecommerce.elements.shoppingcart;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartFunctionalityElements {
    public ShoppingCartFunctionalityElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAdress;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement enterPassword;

    @FindBy(xpath = "//img[@src='https://ecommerce.yosemiteint.com/prestashop/img/p/1/1-home_default.jpg']")
    public WebElement clickTshirtLink;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    public WebElement chooseNumberOfTshirt;

    @FindBy(xpath = "//select[@id='group_1']")
    public WebElement clickChooseSize;

    @FindBy(xpath = "//a[@id='color_13']")
    public WebElement chooseColor;
    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement actualCartTitle;

    @FindBy(xpath = "//h5[@itemprop='name']/a")
    public List<WebElement> clickThirdProduct;

    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    public WebElement proceedToCheckOut;

    @FindBy(xpath = "//i[@class='icon-trash']")
    public WebElement deleteButton;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    public WebElement actualTitle;

    @FindBy(xpath = "//span[@id='total_price_without_tax']")
    public WebElement actualPrice;


}
