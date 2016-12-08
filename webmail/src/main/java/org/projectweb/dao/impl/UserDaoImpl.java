package org.projectweb.dao.impl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.projectweb.dao.UserDAO;
import org.projectweb.model.Mail;
import org.projectweb.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component("UserDAO")
@Transactional
public class UserDaoImpl implements UserDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void save(User user) {
		entityManager.merge(user);
		
	}



	public User getById(Integer id) {
		User user = entityManager.find(User.class, id);
		return user;
	}

	public void delete(User user) {
		entityManager.remove(user);
		
	}

	public List<User> getAll() {
		return entityManager.createQuery("SELECT user FROM User user").getResultList();
	}

	}




