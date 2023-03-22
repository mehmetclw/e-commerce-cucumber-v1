package com.ecommerce.stepdefinitions.homepage;

import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.SubjectTerm;
import java.io.IOException;
import java.util.Properties;

public class GetEmailDetails {

    public static void main(String[] args) {
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
