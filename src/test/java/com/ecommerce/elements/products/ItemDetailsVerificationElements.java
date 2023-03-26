package com.ecommerce.elements.products;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemDetailsVerificationElements {
    public ItemDetailsVerificationElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//h5[@itemprop='name']/a")
    public List<WebElement> products;

    @FindBy(xpath = "//h1[normalize-space()='Faded Short Sleeves T-shirt']")
    public WebElement title;

    @FindBy(xpath = "//p[contains(text(),'Faded short sleeves t-shirt with high neckline. So')]")
    public WebElement description;

    @FindBy(xpath = "//span[@id='our_price_display']")
    public WebElement price;

    @FindBy(xpath = "//h1[@id='cart_title']")
    public WebElement checkoutCartTextIframe;

    @FindBy(xpath = "//span[normalize-space()='Product successfully added to your shopping cart']")
    public WebElement checkoutCartText;

    @FindBy(css = ".fancybox-iframe")
    public WebElement quickViewIFrame;

    @FindBy(linkText = "Quick view")
    public WebElement quickView;

    @FindBy (css = ".myaccount-link-list>li")
    public List<WebElement> myPersonalInfoButton;

  /*  private String linkText;
    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }
    private By getSignInLocator() {
        return By.linkText(linkText);
    }
    @FindBy(how = How.LINK_TEXT, using = "")
    public WebElement signIn;
      @FindBy(locator = @Locator(how = How.LINK_TEXT, using = ""))
       private WebElement signIn;
    */

}


