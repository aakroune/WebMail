package org.projectweb.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.projectweb.dao.MailDAO;
import org.projectweb.model.Mail;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component("mailDAO")
@Transactional

public class MailDaoImpl implements MailDAO {
	@PersistenceContext
	private EntityManager entityManager;
	

	public void save(Mail mail) {
	 entityManager.merge(mail);
	}

	public List<Mail> findAllSend(Integer user_id) {
		
		   
		List<Mail> listSend  = entityManager.createQuery("SELECT mail FROM Mail mail where mail.sender.id =:id", Mail.class).setParameter("id", user_id).getResultList();
 		return listSend;
 	}

	public List<Mail> findAllRecu(Integer id) {
		String query = "Select m from Mail m INNER JOIN m.receivers u where u.id = :id";
		return entityManager.createQuery(query, Mail.class)
							.setParameter("id", id)	
							.getResultList();
	}

	
	}




	
	
	

	


