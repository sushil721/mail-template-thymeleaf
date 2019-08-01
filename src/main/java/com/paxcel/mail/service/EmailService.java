package com.paxcel.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;

import com.paxcel.mail.domain.Mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Autowired
    private SpringTemplateEngine templateEngine;


    public void sendSimpleMessage(Mail mail) throws MessagingException, IOException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name());

        //helper.addAttachment("logo.png", new ClassPathResource("logo.png"));
        Context context = new Context();
        context.setVariables(mail.getModel());
        context.setVariable("main", mail.getMain());
       // context.setVariable("view", mail.getMain().getView());
        System.err.println( mail.getMain().getView());
       // context.setVariables(mail.getMain().getView());
        String html = templateEngine.process("email-template", context);

        helper.setTo(mail.getTo());
        helper.setText(html, true);
        helper.setSubject(mail.getSubject());
        helper.setFrom(mail.getFrom());

        emailSender.send(message);
    }

    public void sendSimpleMessageNew(Mail mail) throws MessagingException, IOException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name());

        //helper.addAttachment("logo.png", new ClassPathResource("logo.png"));
        Context context = new Context();
        // context.setVariables(mail.getModel());
        // context.setVariable("main", mail.getMain());
        // context.setVariable("view", mail.getMain().getView());
        // System.err.println( mail.getMain().getView());
        // context.setVariables(mail.getMain().getView());
       // String html = templateEngine.process("ebill-design", context);
        String html = templateEngine.process("ebill_version_4", context);

        helper.setTo(mail.getTo());
        helper.setText(html, true);
        helper.setSubject(mail.getSubject());
        helper.setFrom(mail.getFrom());

        emailSender.send(message);
    }

}
