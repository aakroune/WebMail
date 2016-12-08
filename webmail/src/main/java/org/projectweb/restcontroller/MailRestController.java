//package org.projectweb.restcontroller;
//
//import javax.validation.Valid;
//
//import org.projectweb.model.Mail;
//import org.projectweb.service.MailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController//Annotation 
//@RequestMapping("/rest/mail")
//public class MailRestController {
//	
//	@Autowired
//	private MailService mailService;
//	
//	@RequestMapping (value="/add", method=RequestMethod.POST)
//	public Mail addmail( @RequestBody Mail mail) {
//		mailService.save(mail);
//		return mail;
//		
//}
//}
