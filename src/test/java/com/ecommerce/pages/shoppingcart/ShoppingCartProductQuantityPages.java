package com.ecommerce.pages.shoppingcart;

import com.ecommerce.elements.shoppingcart.ShoppingCartProductQuantityElements;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import org.junit.Assert;


public class ShoppingCartProductQuantityPages extends Utility {


        ShoppingCartProductQuantityElements scpqe;

        public ShoppingCartProductQuantityPages() {
            scpqe = new ShoppingCartProductQuantityElements();
        }

        public void clickPopularTabOnTheHomepage(String popular) {
            scrollTo(scpqe.popularTab);
            clickElement(scpqe.popularTab);
            waits(2);
        }

        public void hoverOverTheProduct() {
            hoverOver(scpqe.hoverOverProduct, 3);
        }

        public void clickTabOnTheProduct() {
            clickElement(scpqe.moreTab);
            waits(3);
        }

        public void increaseTheNumberOfProduct() {
            clickElement(scpqe.increaseQuantityOfProduct);
            Utility.waits(2);
        }

        public void addToCartTheProductAsClickingTab(String addToCart) {
            clickElement(scpqe.addProductToCart);
            waits(2);
        }

        public void clickForCheckOutToTab() {
            clickElement(scpqe.proceedToCheckOut);
            waits(2);
        }

        public void checkThePriceIfItIsAfterIncrease(String expectedProductPrice) {
            String actualProductPrice = scpqe.actualProductPrice.getText();
            Assert.assertEquals("Not Matched", actualProductPrice, expectedProductPrice);
        }

        public void decreaseTheNumberOfProduct() {
            clickElement(scpqe.decreaseQuantityOfProduct);
        }

        public void checkThePriceIfItIsAfterIncreasing(String expectedProductPriceAfterDecrease) {
            String actualProductPriceAfterDecrease = scpqe.actualProductPriceAfterDecrease.getText();
            Assert.assertEquals("NotMatched", expectedProductPriceAfterDecrease, actualProductPriceAfterDecrease);
        }
    }

