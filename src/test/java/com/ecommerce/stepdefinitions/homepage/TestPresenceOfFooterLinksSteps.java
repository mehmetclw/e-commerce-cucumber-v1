package com.ecommerce.stepdefinitions.products;

import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import jdk.jshell.execution.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestPresenceOfFooterLinksSteps {
    @Given("Go to homepage {string}")
    public void goToHomePage(String url) {

        Driver.getDriver().get(url);
    }
    @And("Go to the {string} footer link")
    public void goToTheCategoriesFooterLink(String categoriesLink) {
        WebElement CategoriesFooterLink=Driver.getDriver().
                findElement(By.xpath("//h4[normalize-space()='"+categoriesLink+"']"));
        Utility.scrollTo(CategoriesFooterLink);
        Utility.waits(2);
    }

    @Then("Open all links as a new tabs under Categories link")
    public void openAllLinkAsANewTabUnderCategoriesLink() {
        Driver.getDriver().navigate();

        String parentId = Driver.getDriver().getWindowHandle();
        System.out.println("parentId = " + parentId);

        List<WebElement> urls = Driver.getDriver().findElements
                (By.xpath("//footer//a[contains(@title,'')][normalize-space()='Women']"));
        Actions a = new Actions(Driver.getDriver());
        for (WebElement url : urls) {
            //a.moveToElement(url).keyDown(Keys.CONTROL).click().build().perform(); //For windows users
            a.moveToElement(url).keyDown(Keys.COMMAND).click().build().perform();
        }
        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        System.out.println("allWindows = " + allWindows);

    }

    @Then("verify the each page titles under Categories link")
    public void verifyTheEachPagesTitleUnderCategoriesLink() {
        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        Iterator<String> window = allWindows.iterator();
        String parent = window.next();
        while (window.hasNext()) {
            String child = window.next();
            Driver.getDriver().switchTo().window(child);
            System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());
            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
            Utility.waits(5);
            Driver.getDriver().close(); //For closing the current tab use driver.close()
        }
        Driver.getDriver().switchTo().window(parent);

    }

    @Given("go to homePage for Information {string}")
    public void goToHomePageForInformation(String url) {
        Driver.getDriver().get(url);
    }
    @And("Go to the {string} footer link to test")
    public void goToTheInformationFooterLinkToTest(String informationLink) {
        WebElement informationFooterLink = Driver.getDriver().
                findElement(By.xpath("//h4[normalize-space()='" + informationLink + "']"));
        Utility.scrollTo(informationFooterLink);
    }

    @Then("Open all links as a new tabs under Information link")
    public void openAllLinksAsANewTabUnderInformationLink() {
        Driver.getDriver().navigate();
        String parentId = Driver.getDriver().getWindowHandle();
        System.out.println("parentId = " + parentId);

        List<WebElement> urls = Driver.getDriver().findElements(By.xpath("//section[@id='block_various_links_footer']//a[contains(@title,'Specials')]"));
        urls.add(Driver.getDriver().findElement(By.xpath("//section[@id='block_various_links_footer']//a[contains(@title,'New products')]")));
        urls.add(Driver.getDriver().findElement(By.xpath("//a[normalize-space()='Best sellers']")));
        urls.add(Driver.getDriver().findElement(By.xpath("(//a[normalize-space()='Our stores'])[1]")));
        urls.add(Driver.getDriver().findElement(By.xpath("(//a[@title='Contact us'])[2]")));
        urls.add(Driver.getDriver().findElement(By.xpath("//a[@title='Terms and conditions of use']")));
        urls.add(Driver.getDriver().findElement(By.xpath("//a[@title='About us']")));
        urls.add(Driver.getDriver().findElement(By.xpath("//a[@title='Sitemap']")));

        Actions a = new Actions(Driver.getDriver());
        for (WebElement url : urls) {
            //a.moveToElement(url).keyDown(Keys.CONTROL).click().build().perform(); //For windows users
            a.moveToElement(url).keyDown(Keys.COMMAND).click().build().perform();
        }
    }

    @Then("verify the each page titles under Information link")
    public void verifyTheEachPagesTitlesUnderInformationLink() {
            Set<String> allWindows = Driver.getDriver().getWindowHandles();
            System.out.println("allWindows = " + allWindows);

        Iterator<String> window = allWindows.iterator();
        String parent = window.next();
        while (window.hasNext()) {
            String child = window.next();
            Driver.getDriver().switchTo().window(child);
            System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());
            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
            Utility.waits(5);
            Driver.getDriver().close(); //For closing the current tab use driver.close()
        }
        Driver.getDriver().switchTo().window(parent);
        Utility.waits(4);
    }


    @Given("Go to home page for My account {string}")
    public void goToHomePageForMyAccount(String url) {
        Driver.getDriver().get(url);
    }
    @And("Go to the {string} footer link for testing")
    public void goToTheMyAccountFooterLinkForTesting(String myAccountLink) {
        WebElement myAccountFooterLink=Driver.getDriver().
                findElement(By.xpath("(//a[normalize-space()='"+myAccountLink+"'])[1]"));
        Utility.scrollTo(myAccountFooterLink);
    }
    @Then("Open all links as a new tabs under My account link")
    public void openAllLinksAsANewTabsUnderMyAccountLink() {
        Driver.getDriver().navigate();

        String parentId = Driver.getDriver().getWindowHandle();
        System.out.println("parentId = " + parentId);

        List<WebElement> urls = Driver.getDriver().findElements(By.xpath("//a[@title='My orders']"));
        urls.add(Driver.getDriver().findElement(By.xpath("(//a[@title='My credit slips'])[1]")));
        urls.add(Driver.getDriver().findElement(By.xpath("//a[@title='My addresses']")));
        urls.add(Driver.getDriver().findElement(By.xpath("//a[@title='Manage my personal information']")));

        Actions a = new Actions(Driver.getDriver());
        for (WebElement url : urls) {
            //a.moveToElement(url).keyDown(Keys.CONTROL).click().build().perform(); //For windows users
            a.moveToElement(url).keyDown(Keys.COMMAND).click().build().perform();
        }
    }

    @Then("verify the each page titles under My account link")
    public void verifyTheEachPageTitlesUnderMyAccountLink() {
        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        System.out.println("allWindows = " + allWindows);

        //Using iteration to switch between windows
        Iterator<String> window = allWindows.iterator();
        String parent = window.next();
        while (window.hasNext()) {
            String child = window.next();
            Driver.getDriver().switchTo().window(child);
            System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());
            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
            Utility.waits(5);
            Driver.getDriver().close(); //For closing the current tab use driver.close()
        }
        Driver.getDriver().switchTo().window(parent);
        Utility.waits(4);
    }

}
