package com.ecommerce.pages.homepage;

import com.ecommerce.elements.homepage.NewsletterFunctionalityElements;
import com.ecommerce.utility.Utility;
import com.github.javafaker.Faker;

public class RegistrationFunctionalityPages extends Utility {
    NewsletterFunctionalityElements nfe;

    public RegistrationFunctionalityPages() {
        nfe = new NewsletterFunctionalityElements();
    }

    public void enterTheValidEMailToCreateAnAccount() {
        Faker fake = new Faker();
        // String name = fake.name().fullName();
        String email = fake.internet().emailAddress();
        sendKeyToElement(nfe.emailCreate, email);
        Utility.waits(1);

    }
}
