package org.projectweb.serviceImpl;
import java.util.List;

import org.projectweb.dao.MailDAO;
import org.projectweb.dao.UserDAO;
import org.projectweb.model.Mail;
import org.projectweb.model.User;
import org.projectweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userdao;
	
	@Autowired
	private MailDAO maildao;
	

	public void save(User user) {
		
		userdao.save(user);
		
	}

	public List<Mail> findAllSend(Integer id) {
		return maildao.findAllSend(id);
	}

	

	public void sendMail(Integer id, Mail mail) {
		User sender = new User();
		sender.setId(id);
		mail.setSender(sender);
		maildao.save(mail);
	}

	public List<User> getAll() {
		return userdao.getAll();
	}

	

	public List<Mail> findAllRecu(Integer id) {
	 return maildao.findAllRecu(id);
	}








	
}