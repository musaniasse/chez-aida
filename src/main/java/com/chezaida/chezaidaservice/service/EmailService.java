package com.chezaida.chezaidaservice.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender emailSender;

    public void sendVerificationEmail(String to, String subject, String text) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(new InternetAddress("niassemoussa94@gmail.com", "Chez AIDA"));
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(text, true);

        emailSender.send(message);
    }
}
