package com.paxcel.mail.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paxcel.mail.domain.Mail;
import com.paxcel.mail.domain.Main;
import com.paxcel.mail.service.EmailService;


@RestController
public class RestControllerSendMail {
	
	  private static Logger log = LoggerFactory.getLogger(RestControllerSendMail.class);
	 
      @Autowired
	  private EmailService emailService;
    
	  @PostMapping(value="/requestJson", headers="Accept=application/json",produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<String> sendByJsone(@RequestBody Main main) {
		 System.out.println("Main Head "+main.getPageName());
		 
		  Mail mail = new Mail(); 
			  mail.setFrom("yourmail@gmail.com");
			  mail.setTo("friendsmail@gmail.com");
			  mail.setSubject(main.getPageName());
			  mail.setMain(main);
		  Map<String, Object> model = new HashMap<String, Object>();
			  model.put("name","Sushil Singh"); 
			  model.put("location", "Delhi"); 
			  model.put("signature","Sushil Kr.");
			  mail.setModel(model);
		  System.err.println(main.getView());
		  try {
			  log.info("Before email Send ");
			emailService.sendSimpleMessage(mail);
			log.info("After email Send ");
		} catch (MessagingException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		  
		 log.info("Email Send ");
		 return new ResponseEntity<String>("Mail Send",HttpStatus.OK);
	 }
/*	  
	  @PostMapping(value="/requestJson", headers="Accept=application/json",produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<String> sendByJsone(@RequestBody Main main) {
		 System.out.println("Main Head- "+main.getPageName());
		 System.out.println("View- "+main.getView());
		 log.info("Email Send ");
		 return new ResponseEntity<String>("Mail Send",HttpStatus.OK);
	 }
*/	  

}
