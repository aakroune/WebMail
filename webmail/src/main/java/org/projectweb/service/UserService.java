package org.projectweb.service;

import java.util.List;

import org.projectweb.model.Mail;
import org.projectweb.model.User;

public interface UserService {
	public void save(User user);
	public List<Mail> findAll(Integer id);
	public User getById(Integer id);
	
	public void sendMail(Integer id, Mail mail);
	public List<User> getAll();

}
