package com.dl.reporting.service;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dl.model.ConfigModel;
import com.dl.model.EmailConfig;


public class MailService 
{
	private static final Logger logger = LogManager.getLogger(MailService.class);
	
    public  void sendMail(byte[] reportData, ConfigModel config, String reportName) throws MessagingException 
    {
    	EmailConfig emailConfig = config.getEmailConfig();
    	String senderEmail = emailConfig.getEmailSender();
        String recipientEmail = emailConfig.getEmailRecipient();
        
        String[] recipientList = recipientEmail.split(";");
        
        if (reportName != null)
        {
        	if ("EXCELOPENXML".equals(config.getRenderFormat()))
        	{
        		reportName = reportName + ".xlsx";
        	}
        	else
        	{
        		reportName = reportName + ".pdf";
        	}
        }
        String emailAttachmentName = reportName;

        // SMTP server properties (change based on the server you are using)
        String smtpHost = emailConfig.getSmtpHost();
        String smtpPort = emailConfig.getSmtpPort();

        // Email subject and message
        String subject = emailConfig.getEmailSubject();
        String messageText = emailConfig.getEmailBody();

        // Create JavaMail session
        Properties props = new Properties();
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);
        props.put("mail.smtp.socketFactory.port", smtpPort);
        props.put("mail.smtp.socketFactory.port", smtpPort);
        
//        final String username = "mayur2407@gmail.com"; // Your email address
//        final String password = "jbcc wpij xxsf zxsf"; // Your password for the email account
//      props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        final String username = emailConfig.getSmtpUserName(); 
       final String password = emailConfig.getSmtpPassword(); // Your password for the email account
       
//        props.put("mail.smtp.auth",true);
//        props.put("mail.smtp.starttls.enable",true);

       String smtpProps = emailConfig.getSmtpProps();
       String[] split = smtpProps.split(",");
       
       for (String prop : split) {
    	   String[] property = prop.split(":");
    	   if ("mail.smtp.auth".equals(property[0]))
    	   {
    		   props.put(property[0], true);
    	   }
    	   else if ("mail.smtp.starttls.enable".equals(property[0]))
    	   {
    		   props.put(property[0], true);
    	   }
    	   else if ("mail.smtp.socketFactory.fallback".equals(property[0]))
    	   {
    		   props.put(property[0], true);
    	   }
    	   else
    	   {
    		   props.put(property[0], property[1]);
    	   }
       }

        
//        Session session = Session.getDefaultInstance(props);
        
     // Session creation with authentication
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail)); // Set the sender address
//            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            for (String recipient : recipientList) {
            	recipient = recipient.trim();
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            }
            
            message.setSubject(subject);

            Multipart multipart = new MimeMultipart();

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(messageText);

            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            ByteArrayDataSource source = new ByteArrayDataSource(reportData, "application/octet-stream");
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(emailAttachmentName); // Set the attachment file name

            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            // Send the email
            Transport.send(message);
            logger.info("Email sent successfully to " + emailConfig.getEmailRecipient() + "at " + new Date());   
        } 
        catch (MessagingException e) 
        {
        	logger.error("Failed to send email to " + emailConfig.getEmailRecipient() + "at " + new Date(), e);   
        	throw e;
        }
    }
}
