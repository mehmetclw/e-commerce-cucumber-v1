package com.ecommerce.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;
import java.util.List;

public class CustomLocator implements ElementLocatorFactory {
    private final String linkText;

    public CustomLocator(String linkText) {
        this.linkText = linkText;
    }

    public ElementLocator createLocator(Class clazz) {
        return new CustomElementLocator(linkText);
    }

    @Override
    public ElementLocator createLocator(Field field) {
        return null;
    }

    private static class CustomElementLocator implements ElementLocator {
        private final String linkText;

        public CustomElementLocator(String linkText) {
            this.linkText = linkText;
        }

        @Override
        public WebElement findElement() {
            return findElements().get(0);
        }

        @Override
        public List<WebElement> findElements() {
            return Driver.getDriver().findElements(By.linkText(linkText));
        }
    }
}

