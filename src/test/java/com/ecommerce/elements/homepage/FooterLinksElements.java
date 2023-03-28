package com.ecommerce.elements.homepage;

import com.ecommerce.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FooterLinksElements {
    public FooterLinksElements (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//h4[normalize-space()='Categories']" )
    public WebElement categoriesFooter;

    @FindBy(xpath="//footer//a[contains(@title,'')][normalize-space()='Women']")
    public List<WebElement> categoriesFooterLink ;

    @FindBy(xpath = "//h4[normalize-space()='Information']")
    public WebElement informationFooterLink;

    @FindBy(xpath = "//section[@id='block_various_links_footer']//a[contains(@title,'Specials')]")
    public List<WebElement> informationFooters;

    @FindBy(xpath ="(//a[normalize-space()='My account'])[1]" )
    public WebElement myAccountFooterLink;

    @FindBy(xpath ="//a[@title='My orders']" )
    public List<WebElement> myAccountFooters;

}
