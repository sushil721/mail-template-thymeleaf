package com.paxcel.mail.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paxcel.mail.domain.Mail;
import com.paxcel.mail.domain.Main;
import com.paxcel.mail.service.EmailService;

@Controller
public class SendController {
	
	private static Logger log = LoggerFactory.getLogger(SendController.class);
	
	@Autowired
	private EmailService emailService;	 
	
	 @GetMapping("/greeting")
	    public String greeting(@RequestParam(name="name", required=false, defaultValue="Sushil ") String name, Model model) {
	        model.addAttribute("name", name);
	        return "greeting";
	    }
	 
	 @GetMapping("/email-template")
	    public String emailTemplate( Model model) {
		   Resource resource = new ClassPathResource("/static/json.json");
		   try {
	            ObjectMapper mapper = new ObjectMapper();
	            model.addAttribute("main",  mapper.readValue(resource.getInputStream(), Main.class));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return "/email-template";
	    }
	
	 
	 @GetMapping("/sendMain")
	  public String sendMessage() {
		  //Exception { log.info("Sending Email with Thymeleaf HTML Template Example");
		  
		  Mail mail = new Mail(); 
		  mail.setFrom("yourmail@gmail.com");
		  mail.setTo("friendsmail@gmail.com");
		  mail.setSubject("Sending Email for Payment-us");
		  
		  Map<String, Object> model = new HashMap<String, Object>();
		  model.put("name",
		  "Sushil Kumar Singh"); model.put("location", "Delhi"); model.put("signature",
		  "Sushil Kr.");
		  mail.setModel(model);
		  
		  try {
			emailService.sendSimpleMessage(mail);
		} catch (MessagingException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		  
		  return "redirect:/greeting";
		}
	  
	 @GetMapping("/col-format-new")
	    public String emailTemplateColFormatNew( Model model) {
		/*
		 * Resource resource = new ClassPathResource("/static/json.json"); try {
		 * ObjectMapper mapper = new ObjectMapper(); model.addAttribute("main",
		 * mapper.readValue(resource.getInputStream(), Main.class)); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
	        return "/col-format-new";
	    }
	 
	 @GetMapping("/sendMessageColFormatNew")
	  public String sendMessageColFormatNew() {
		  //Exception { log.info("Sending Email with Thymeleaf HTML Template Example");
		  
		  Mail mail = new Mail(); 
		  mail.setFrom("sushil.singh@paxcel.net");
		 //mail.setTo("preeti.gupta@paxcel.net");
		  mail.setTo("sushilgiacr@outlook.com");
		 // mail.setTo("amit.tanwar@paxcel.net");
		 // mail.setTo("sushilneron@gmail.com");
		 // mail.setTo("vineet@paxcel.net");
		  mail.setSubject("Ebill generated from ebill renderer.");
	
		/*
		 * Map<String, Object> model = new HashMap<String, Object>(); model.put("name",
		 * "Sushil Kumar Singh"); model.put("location", "Delhi"); model.put("signature",
		 * "Sushil Kr."); mail.setModel(model);
		 */
		  
		  try {
			emailService.sendSimpleMessageNew(mail);
		} catch (MessagingException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		  
		  return "redirect:/greeting";
		}
		 
	 @GetMapping("/ebill-design")
	    public String emailTemplateEbillDesign( Model model) {
		/*
		 * Resource resource = new ClassPathResource("/static/json.json"); try {
		 * ObjectMapper mapper = new ObjectMapper(); model.addAttribute("main",
		 * mapper.readValue(resource.getInputStream(), Main.class)); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
	        return "/ebill-design";
	    }
	 

}
