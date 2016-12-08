package org.projectweb.dao;

import java.util.List;

import org.projectweb.model.Mail;
import org.projectweb.model.User;


public interface MailDAO {

	//public Mail getById(int id);
	
	public void save(Mail mail);

	
	
 // public void del(Mail mail);

public List<Mail> findAllSend(Integer id);
public List<Mail> findAllRecu(Integer id);

	

}
