package com.ecommerce.pages.homepage;

import com.ecommerce.elements.homepage.NewsletterFunctionalityElements;
import com.ecommerce.elements.homepage.RegistrationFunctionalityElements;
import com.ecommerce.utility.Utility;
import com.github.javafaker.Faker;
import org.junit.Assert;

public class RegistrationFunctionalityPages extends Utility {
    NewsletterFunctionalityElements nfe;
    RegistrationFunctionalityElements rfe;

    public RegistrationFunctionalityPages() {
        nfe = new NewsletterFunctionalityElements();
        rfe = new RegistrationFunctionalityElements();
    }

    public void enterTheValidEMailToCreateAnAccount() {
        Faker fake = new Faker();
        // String name = fake.name().fullName();
        String email = fake.internet().emailAddress();
        sendKeyToElement(nfe.emailCreate, email);
        Utility.waits(1);
    }
    public void checkTheMessage(String expectedSuccessMessage) {
        String actualMessage=getTextElement(rfe.successMessage);
        Assert.assertEquals("No match",expectedSuccessMessage,actualMessage);
    }
    public void verifyThatErrorMessageIsDisplayed(String expectedErrorMessage) {
        String actualErrorMessage=getTextElement(rfe.errorMessage);
        Assert.assertTrue("No match",actualErrorMessage.contains(expectedErrorMessage));
    }
}
