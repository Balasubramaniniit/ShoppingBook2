/*
package com.book.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
// entity is to create table in database

@Entity

@Table(name = "Register")

@Component
public class BornUser implements Serializable {

	// It is to store and non erase variable in the space private static final
	long serialVersionUID = 4657462015039726030L;
	// @Id is to make primary key

	@Id
	@NotEmpty
	@Size(min = 2, max = 30)
	private String user_firstname;
	@NotEmpty
	@Size(min = 2, max = 30)
	private String user_lastname;
	@NotEmpty(message = "Please enter your password.")
	@Size(min = 6, max = 15, message = "Your password must between 6 and 15 characters")
	private String password;
	@NotEmpty(message = "Please re-enter your  password.")
	@Size(min = 6, max = 15, message = "Your password must between 6 and 15 characters")
	private String confirm_password;
	@NotEmpty
	@Email
	private String mail_id;
	@NotEmpty
	@Size(min = 1, max = 10)
	private String mobile_number;

	public String getUser_firstname() {
		return user_firstname;
	}

	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}

	public String getUser_lastname() {
		return user_lastname;
	}

	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

}*/
