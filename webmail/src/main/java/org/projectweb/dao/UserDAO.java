package org.projectweb.dao;

import java.util.List;

import org.projectweb.model.Mail;
import org.projectweb.model.User;

public interface UserDAO {
	public void save (User user);
	
	public List<User> getAll();
	

}
