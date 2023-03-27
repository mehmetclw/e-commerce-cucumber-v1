package com.ecommerce.pages.homepage;

import com.ecommerce.elements.homepage.NewsletterFunctionalityElements;
import com.ecommerce.stepdefinitions.products.ItemDetailsVerificationSteps;
import com.ecommerce.utility.Driver;
import com.ecommerce.utility.Utility;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.SubjectTerm;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class NewsletterFunctionalityPages extends Utility {
    NewsletterFunctionalityElements nfe;

    public NewsletterFunctionalityPages() {
        nfe = new NewsletterFunctionalityElements();
    }

    String email;
    String mainWindow;

    public void scrollDownTheScreen() {
        Utility.scrollTo(nfe.newsletterBar);
    }

    public void enterTheValidEMail(DataTable dt) {
        Map<String, String> email = dt.asMap();
        String newsletterEmail = email.get("e-mail");
        this.email = newsletterEmail;
        sendKeyToElement(nfe.newsletterBar, newsletterEmail);
        Utility.waits(1);
    }

    public void theUserClicksTheEnterButton() {
        clickElement(nfe.newsletterButton);
    }

    public void checkTheMessageAsExpected(String expectedMessage) {
        String actualMessage = getTextElement(nfe.message);
        Assert.assertEquals("NO MATCH", expectedMessage, actualMessage);
        Utility.waits(1);
    }

    public void goToEMailInbox(String url) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open()");
        mainWindow = Driver.getDriver().getWindowHandle();
        Set<String> windows = Driver.getDriver().getWindowHandles();
        Iterator<String> it = windows.iterator();
        while (it.hasNext()) {
            String childWindow = it.next();
            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                Driver.getDriver().switchTo().window(childWindow);
                Driver.getDriver().navigate().to(url);
            }
        }
        String fakeEmailname = email.substring(0, email.indexOf('@'));
        String emailText = email.substring(email.indexOf("@") + 1);
        sendKeyToElement(nfe.fakeEmail, fakeEmailname);
        selectElementByVisibleText(nfe.emailSelect, emailText);
        Utility.waits(1);
        clickElement(nfe.fetchButton);
    }

    public void checkTheInboxForConfirmationEMail(String checkMessage) {
        String confirmEmail = getTextElement(nfe.tableRow.get(0)) + " " + getTextElement(nfe.tableRow.get(1));
        Assert.assertTrue("NO MATCH", confirmEmail.contains(checkMessage));
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(mainWindow);
        Utility.waits(1);
    }

    public void enterTheValidEMailToCreateAnAccount(DataTable dt) {
        Map<String, String> email = dt.asMap();
        String newsletterEmail = email.get("e-mail");
        this.email = newsletterEmail;
        sendKeyToElement(nfe.emailCreate, newsletterEmail);
        Utility.waits(1);
    }

    public void fillTheRequirementsOnThePage(DataTable dt) {
        Map<String, String> registerRequirements = dt.asMap();
        String firstName = registerRequirements.get("First Name");
        String lastName = registerRequirements.get("Last Name");
        String password = registerRequirements.get("Password");
        String currentPassword = registerRequirements.get("Current Password");
        String confirmation = registerRequirements.get("Confirmation");
        String newPassword = registerRequirements.get("New Password");

        if (firstName != null) {
            sendKeyToElement(nfe.firstNameBar, firstName);
        }
        if (lastName != null) {
            sendKeyToElement(nfe.lastNameBar, lastName);
        }
        if (password != null) {
            sendKeyToElement(nfe.passwordBar, password);
        }
        if (currentPassword != null) {
            sendKeyToElement(nfe.currentPasswordBar, currentPassword);
        }
        if (newPassword != null) {
            sendKeyToElement(nfe.passwordBar, newPassword);
        }
        if (confirmation != null) {
            sendKeyToElement(nfe.confirmationBar, confirmation);
            this.email = ItemDetailsVerificationSteps.email;
        }
        Utility.waits(1);
    }

    public void clickOnTheCheckbox() {
        clickElement(nfe.newsletterBox);
    }

    public void goToInbox(String url) {
        String emailPassword = "@Test1234!@";
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open()");
        mainWindow = Driver.getDriver().getWindowHandle();
        Set<String> windows = Driver.getDriver().getWindowHandles();
        Iterator<String> it = windows.iterator();
        while (it.hasNext()) {
            String childWindow = it.next();
            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                Driver.getDriver().switchTo().window(childWindow);
                Driver.getDriver().navigate().to(url);
            }
        }
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user")));
        sendKeyToElement(nfe.emailAddress, email);
        sendKeyToElement(nfe.password, emailPassword);
        clickElement(nfe.logInButton);
        Utility.waits(1);
        clickElement(nfe.openButton);
    }

    public void checkTheInboxForEMail(String expectedMessage) {
        Properties properties = new Properties();
        properties.put("mail.imap.host", "mail.yosemiteint.com"); // Email provider details
        properties.put("mail.imap.port", "993"); // Host port number
        properties.put("mail.imap.ssl.enable", "true"); // using the SSL

        String email = "testaccount@yosemiteint.com";
        String password = "@Test1234!@";
        String newsLetterSubject = "Email Verification";

        try {
            Session session = Session.getDefaultInstance(properties);
            System.out.println("Session created");
            Store store = session.getStore("imap");
            System.out.println("Store created");
            store.connect("mail.yosemiteint.com", email, password);
            System.out.println("Connection Done");

            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            System.out.println("Inbox reached..");

            Message[] messages = inbox.search(new SubjectTerm(newsLetterSubject));

            boolean emailFound = messages.length > 0;
            System.out.println("Emails found " + emailFound);
            if (emailFound) {
                Message message = messages[0]; // Giving the subject which is first matching.
                String subject = message.getSubject();

                String content;
                if (message.getContent() instanceof MimeMultipart) {
                    MimeMultipart multipart = (MimeMultipart) message.getContent();
                    content = getTextFromMimeMultipart(multipart);
                } else {
                    content = message.getContent().toString();
                }

                System.out.println("Email Subject = " + subject);
                System.out.println("Email Content = " + content);
            }

        } catch (NoSuchProviderException e) {
            throw new RuntimeException(e);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getTextFromMimeMultipart(MimeMultipart multipart) throws MessagingException, IOException {
        StringBuilder result = new StringBuilder();
        int count = multipart.getCount();
        for (int i = 0; i < count; i++) {
            BodyPart bodyPart = multipart.getBodyPart(i);
            if (bodyPart.isMimeType("text/plain")) {
                result.append("\n").append(bodyPart.getContent());
            } else if (bodyPart.getContent() instanceof MimeMultipart) {
                result.append(getTextFromMimeMultipart((MimeMultipart) bodyPart.getContent()));
            }
        }
        return result.toString();
    }

}
