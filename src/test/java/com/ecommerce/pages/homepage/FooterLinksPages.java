package com.ecommerce.pages.homepage;

import com.ecommerce.elements.homepage.FooterLinksElements;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FooterLinksPages extends Utility {
    FooterLinksElements fle;

    public FooterLinksPages() {
        fle = new FooterLinksElements();
    }
    List<String> actualTitles = new ArrayList<>();

    public void goToTheCategoriesFooterLink(String categoriesLink) {
        scrollTo(fle.categoriesFooter);
        waits(2);
    }
    public void openLinksAsANewTabsUnderCategoriesLink(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        System.out.println(credentials.get(0).get(1));
        Driver.getDriver().navigate();

        String parentId = Driver.getDriver().getWindowHandle();

        List<WebElement> categoriesFooterLink = Driver.getDriver().findElements
                (By.xpath("//footer//a[contains(@title,'')][normalize-space()='Women']"));

        Actions a = new Actions(Driver.getDriver());
        for (WebElement url : categoriesFooterLink) {
            //a.moveToElement(url).keyDown(Keys.CONTROL).click().build().perform(); //For windows users
            a.moveToElement(url).keyDown(Keys.COMMAND).click().build().perform();
            Set<String> allWindows = Driver.getDriver().getWindowHandles();
            System.out.println("allWindows = " + allWindows);
            Iterator<String> window = allWindows.iterator();
            String parent = window.next();
            while (window.hasNext()) {
                String child = window.next();
                Driver.getDriver().switchTo().window(child);
                while (child != null) {
                    actualTitles.add(Driver.getDriver().getTitle());
                    child = null;
                }
                waits(5);
                Driver.getDriver().close(); //For closing the current tab use driver.close()
            }
            Driver.getDriver().switchTo().window(parent);
            waits(3);
        }
    }
    public void verifyTheEachPagesTitleUnderCategoriesLink(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        String expectedTitle = credentials.get(0).get(1);
        String actualTitle = actualTitles.get(0);
        Assert.assertEquals("Titles not matched", actualTitle, expectedTitle);
    }
    public void goToTheInformationFooterLinkToTest(String informationLink) {
        scrollTo(fle.informationFooterLink);
    }

    public void openAllLinksAsANewTabUnderInformationLink(DataTable dt) {
        List<List<String>> credentials = dt.asLists();

        Driver.getDriver().navigate();
        String parentId = Driver.getDriver().getWindowHandle();

        List<WebElement> informationFooters = Driver.getDriver().findElements(By.xpath("//section[@id='block_various_links_footer']//a[contains(@title,'Specials')]"));
        informationFooters.add(Driver.getDriver().findElement(By.xpath("//section[@id='block_various_links_footer']//a[contains(@title,'New products')]")));
        informationFooters.add(Driver.getDriver().findElement(By.xpath("//a[normalize-space()='Best sellers']")));
        informationFooters.add(Driver.getDriver().findElement(By.xpath("(//a[normalize-space()='Our stores'])[1]")));
        informationFooters.add(Driver.getDriver().findElement(By.xpath("(//a[@title='Contact us'])[2]")));
        informationFooters.add(Driver.getDriver().findElement(By.xpath("//a[@title='Terms and conditions of use']")));
        informationFooters.add(Driver.getDriver().findElement(By.xpath("//a[@title='About us']")));
        informationFooters.add(Driver.getDriver().findElement(By.xpath("//a[@title='Sitemap']")));

        Actions a = new Actions(Driver.getDriver());
        for (WebElement url : informationFooters) {
            //a.moveToElement(url).keyDown(Keys.CONTROL).click().build().perform(); //For windows users
            a.moveToElement(url).keyDown(Keys.COMMAND).click().build().perform();
            Set<String> allWindows = Driver.getDriver().getWindowHandles();

            Iterator<String> window = allWindows.iterator();
            String parent = window.next();
            while (window.hasNext()) {
                String child = window.next();
                Driver.getDriver().switchTo().window(child);
                while (child != null) {
                    actualTitles.add(Driver.getDriver().getTitle());
                    child = null;
                }
                waits(5);
                Driver.getDriver().close(); //For closing the current tab use driver.close()
            }
            Driver.getDriver().switchTo().window(parent);
            waits(4);
        }
    }

    public void verifyTheEachPagesTitlesUnderInformationLink(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        String expectedTitlePriceDrop = credentials.get(0).get(1);
        String expectedTitleNewProducts = credentials.get(0).get(2);
        String expectedTitleBestSales = credentials.get(0).get(3);
        String expectedTitleStores = credentials.get(0).get(4);
        String expectedTitleContactUs = credentials.get(0).get(5);
        String expectedTitleTerms = credentials.get(0).get(6);
        String expectedTitleAboutUs = credentials.get(0).get(7);
        String expectedTitleSitemap = credentials.get(0).get(8);

        Assert.assertEquals("not matched", expectedTitlePriceDrop, actualTitles.get(0));
        Assert.assertEquals("not matched", expectedTitleNewProducts, actualTitles.get(1));
        Assert.assertEquals("not matched", expectedTitleBestSales, actualTitles.get(2));
        Assert.assertEquals("not matched", expectedTitleStores, actualTitles.get(3));
        Assert.assertEquals("not matched", expectedTitleContactUs, actualTitles.get(4));
        Assert.assertEquals("not matched", expectedTitleTerms, actualTitles.get(5));
        Assert.assertEquals("not matched", expectedTitleAboutUs, actualTitles.get(6));
        Assert.assertEquals("not matched", expectedTitleSitemap, actualTitles.get(7));
    }

    public void goToHomePageForMyAccount(String url) {
        Driver.getDriver().get(url);
    }

    public void goToTheMyAccountFooterLinkForTesting(String myAccountLink) {
        scrollTo(fle.myAccountFooterLink);
    }

    public void openAllLinksAsANewTabsUnderMyAccountLink(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        Driver.getDriver().navigate();

        String parentId = Driver.getDriver().getWindowHandle();

        List<WebElement> myAccountFooters = Driver.getDriver().findElements(By.xpath("//a[@title='My orders']"));
        myAccountFooters.add(Driver.getDriver().findElement(By.xpath("(//a[@title='My credit slips'])[1]")));
        myAccountFooters.add(Driver.getDriver().findElement(By.xpath("//a[@title='My addresses']")));
        myAccountFooters.add(Driver.getDriver().findElement(By.xpath("//a[@title='Manage my personal information']")));

        Actions a = new Actions(Driver.getDriver());
        for (WebElement url : myAccountFooters) {
            //a.moveToElement(url).keyDown(Keys.CONTROL).click().build().perform(); //For windows users
            a.moveToElement(url).keyDown(Keys.COMMAND).click().build().perform();
            Set<String> allWindows = Driver.getDriver().getWindowHandles();

            //Using iteration to switch between windows
            Iterator<String> window = allWindows.iterator();
            String parent = window.next();
            while (window.hasNext()) {
                String child = window.next();
                Driver.getDriver().switchTo().window(child);
                while (child != null) {
                    actualTitles.add(Driver.getDriver().getTitle());
                    child = null;
                }
                waits(5);
                Driver.getDriver().close(); //For closing the current tab use driver.close()
            }
            Driver.getDriver().switchTo().window(parent);
            Utility.waits(4);
        }
    }

    public void verifyTheEachPageTitlesUnderMyAccountLink(DataTable dt) {
        List<List<String>> credentials = dt.asLists();
        String expectedTitleOrderHistory = credentials.get(0).get(1);
        String expectedTitleCreditSlip = credentials.get(0).get(2);
        String expectedTitleAddresses = credentials.get(0).get(3);
        String expectedTitleIdentity = credentials.get(0).get(4);

        Assert.assertEquals("not matched", expectedTitleOrderHistory, actualTitles.get(0));
        Assert.assertEquals("not matched", expectedTitleCreditSlip, actualTitles.get(1));
        Assert.assertEquals("not matched", expectedTitleAddresses, actualTitles.get(2));
        Assert.assertEquals("not matched", expectedTitleIdentity, actualTitles.get(3));
    }
}

