package com.book.Handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import com.book.model.UserDetails;
import com.book.services.RegisterService;
//@component is to make a one component of class in below.

@Component
public class RegistrationHandler {

	// it is used to create a object as like new()
	@Autowired(required=true)
	RegisterService regser;

	// it is to link the model attributes b/w java and jsp
	public UserDetails startFlow() {
		return new UserDetails();
	}
	
	public String validateDetails(UserDetails userDetails, MessageContext messageContext) {
		// it is to validate the sign up page in java class
		String status = "success";
		if (userDetails.getUser_firstname().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("user_firstname")
					.defaultText("Username cannot be Empty").build());
			status = "failure";
		}
		if (userDetails.getUser_lastname().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("user_lastname")
					.defaultText("Username cannot be Empty").build());
			status = "failure";
		}
		if (userDetails.getMail_id().isEmpty()) {
			messageContext.addMessage(new MessageBuilder().error().source("mail_id")
					.defaultText("User's email id cannot be Empty").build());
			status = "failure";
		}
		if (userDetails.getMobile_number() == null) {
			messageContext.addMessage(new MessageBuilder().error().source("mobile_number")
					.defaultText("User's mobile number cannot be Empty").build());
			status = "failure";
		}
		if (userDetails.getPassword() == null) {
			messageContext.addMessage(
					new MessageBuilder().error().source("password").defaultText("Please enter your password").build());
			status = "failure";
		}
		if (userDetails.getConfirm_password() == null) {
			messageContext.addMessage(new MessageBuilder().error().source("confirm_password")
					.defaultText("Please enter your password").build());
			status = "failure";
		}
		// this is to save the data to the database
		if (status.equals("success")) {
			regser.saveOrUpdate(userDetails);
		}

		return status;
	}

}
