package com.praxis.factura.test.common.util;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailSend {
    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;
    static String login = "username";
    static String password = "secret";
    static String to = null;
    static String cc = null;
    static String bcc = null;
    static String subject = null;
    static String body = null;
    
    public void config(String... namesAndValues) {
        if (namesAndValues.length % 2 == 1) {
            throw new IllegalArgumentException("The number of arguments must be pair.");
        }
        String nameConfig = null, valueConfig = null;
        for (int i = 0; i < namesAndValues.length - 1; i += 2) {
            nameConfig = namesAndValues[i].trim().toLowerCase();
            valueConfig = namesAndValues[i +1];
            switch    (nameConfig) {
                case "username":
                case "login":
                    login = valueConfig;
                    break;
                case "password":
                case "pass":
                    password = valueConfig;
                    break;
                case "to":
                    to = valueConfig;
                    break;
                case "cc":
                    cc = valueConfig;
                    break;
                case "bcc":
                    bcc = valueConfig;
                    break;
                case "title":
                case "subject":
                    subject = valueConfig;
                    break;
                case "msg":
                case "body":
                    body = valueConfig;
            }
        }
    }
    public Boolean send(String... namesAndValues) {
        this.config(namesAndValues);
        try {
            return this.send();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
    
    public Boolean send() throws AddressException, MessagingException {
        Boolean success = false;
        // step 1 set connection properties
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.host", "smtp.gmail.com");
        mailServerProperties.put("mail.smtp.socketFactory.port", "465");
        mailServerProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.port", "465");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        // step 2 Authentication
        if (login == null || password == null) {
                return success;
        }
        Session getMailSession = Session.getDefaultInstance(mailServerProperties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(login, password);
            }
        });
        
        // Se compone la parte del texto
        BodyPart texto = new MimeBodyPart();
        texto.setText(body);
        
        // Se compone el adjunto con la imagen
        BodyPart adjunto = new MimeBodyPart();
        adjunto.setDataHandler(
            new DataHandler(new FileDataSource("/home/hems/Documentos/prueba.txt")));
        adjunto.setFileName("prueba.txt");
        
        // Una MultiParte para agrupar texto e imagen.
        MimeMultipart multiParte = new MimeMultipart();
        multiParte.addBodyPart(texto);
        multiParte.addBodyPart(adjunto);

        // step 3 sending Email
        generateMailMessage = new MimeMessage(getMailSession);
        if (to != null) {
            generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        }
        if (cc != null) {
            generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));
        }
        if (bcc != null) {
            generateMailMessage.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc));
        }
        if (subject == null) {
            subject = "subject gmail object";
        }
        generateMailMessage.setSubject(subject);
        if (body == null) {
            body = "It's a simple test";
        }
        generateMailMessage.setContent(multiParte);
        javax.mail.Transport.send(generateMailMessage);
        return success;
    }

}