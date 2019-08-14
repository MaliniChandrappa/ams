package com.assign.app.service;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.assign.app.controller.LoginController;
import com.assign.app.dao.SignUpDAO;
import com.assign.app.dto.UserDTO;
import com.assign.app.util.EncryptionDecryption;
import com.assign.app.util.GenerateRandomPassword;




@Service
public class SignUpService {
	@Autowired
	private SignUpDAO signUpDAO;
	@Autowired
	private MailSender sender;
	@Autowired
	private GenerateRandomPassword generator;
	@Autowired
	private EncryptionDecryption enDecryption;
	private static Logger log = LoggerFactory.getLogger(SignUpService.class);

	public String signUpService(UserDTO userDTO) {
		System.out.println("signupService started");
		userDTO.setNewUser(true);

		// genrated random password
		String password=generator.generatePassword();
		System.out.println("Password  Generated is: "+password);
		String pwdfromEncrypt=enDecryption.encrypt(password);
		System.out.println("password encrypted\t"+pwdfromEncrypt);
		userDTO.setPassword(pwdfromEncrypt);
		log.info(userDTO.toString());
		String result = signUpDAO.signUpDAO(userDTO);

		// email
		String email = userDTO.getEmail();
		password=userDTO.getPassword();
		String decryptPWD=enDecryption.decrypt(password);
		String subject = "Conformation mail form ASSIGNMENT MANAGEMENT";
		String text = "Your account is created \n" + "please login by using\n" + "email : \n" + email + "password :"
				+password;
		//System.out.println("random password"+RandomPassword.generatePassword(userDTO));

		String emailResult = sendMail(email, subject, text, password);
		System.out.println("sentDecryptPWd:"+decryptPWD);
		log.info(emailResult.toString());
		System.out.println("signupService ended");
		return result;

	}

	public SignUpService() {
		System.out.println(this.getClass().getSimpleName());
	}

	public String sendMail(String to, String subject, String text, String password) {
		SimpleMailMessage simpleMessage = new SimpleMailMessage();

		simpleMessage.setTo(to);
		simpleMessage.setSubject(subject);
		simpleMessage.setText(text);
		sender.send(simpleMessage);

		return "mail sent to " + to;

	}
}
