package org.projectweb.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="mail")
public class Mail { 
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column (name="objet")
	private String subject;
	@Column (name="contenu")
	private String description;
	
	@Column (name = "date_sent")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateSent = new Date ();

	public List<User> getReceivers() {
		return receivers;
	}

	public void setReceivers(List<User> receivers) {
		this.receivers = receivers;
	}

	@ManyToOne 
	@JoinColumn (name = "user_id")
	private User sender;
	
	@ManyToMany (fetch =FetchType.EAGER)
	@JoinTable (name = "mailTo",
	                joinColumns = @JoinColumn (name = "mail_id", referencedColumnName = "id"),
	                inverseJoinColumns = @JoinColumn (name = "receivers_id", referencedColumnName = "id"))
	
	private List<User> receivers;
	
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateSent() {
		return dateSent;
	}

	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

//	public List<User> getReceivers() {
//		return receivers;
//	}
//
//	public void setReceivers(List<User> receivers) {
//		this.receivers = receivers;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}
