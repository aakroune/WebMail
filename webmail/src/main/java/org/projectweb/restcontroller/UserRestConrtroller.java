package org.projectweb.restcontroller;

import java.util.List;

import org.projectweb.model.Mail;
import org.projectweb.model.User;
import org.projectweb.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//Annotation 
@RequestMapping("/rest/user")
public class UserRestConrtroller {
	@Autowired
	private UserService userService;


	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userService.save(user);
		
	}
	
	@RequestMapping(value="{id}/sendmail", method=RequestMethod.POST)
	public void addMail(@PathVariable("id") Integer id, @RequestBody Mail mail) {
		userService.sendMail(id, mail);
	}
	
	@RequestMapping(value="{id}/sent", method=RequestMethod.GET)
	public  List<Mail>listSent(@PathVariable Integer id) {
	
		return userService.findAllSend(id);
	}
	@RequestMapping(value="{id}/recu", method=RequestMethod.GET)
	public List<Mail> listRecu(@PathVariable Integer id) {
		return userService.findAllRecu(id);
	}

}
