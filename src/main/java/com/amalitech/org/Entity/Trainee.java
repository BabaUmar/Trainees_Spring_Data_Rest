package com.amalitech.org.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainee_id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Trainee() {
		super();
	}
	public Trainee(String firstName, String lastName, String emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	public Trainee(int trainee_id, String firstName, String lastName, String emailAddress) {
		super();
		this.trainee_id = trainee_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public int getTrainee_id() {
		return trainee_id;
	}
	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
