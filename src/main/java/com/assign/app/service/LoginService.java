package com.assign.app.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.app.controller.SignUpController;
import com.assign.app.dao.LoginDAO;
import com.assign.app.dto.ChangePasswordDTO;
import com.assign.app.dto.LoginDTO;
import com.assign.app.dto.UserDTO;
@Service
public class LoginService {

	private  final static Logger log = LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	private LoginDAO loginDAO;
	
	public LoginService() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	public UserDTO loginService(LoginDTO loginDTO){
		
		UserDTO dtoFromDb = loginDAO.loginDAO(loginDTO);
		return dtoFromDb;
	}
	
	public void updateLastLoginAndFailCountService(UserDTO dtoFromDb){
		String email = dtoFromDb.getEmail();
		Date date= new Date();
		int failCount=0;
		boolean newUser =false;
		
		log.info("email-->"+email);
		log.info("date-->"+date);
		log.info("failCount-->"+failCount);
		log.info("newUser-->"+newUser);
		
		loginDAO.updateLastLoginAndFailCountDAO(email, date, failCount, newUser);
	}
	
	public void failedLoginService(UserDTO dtoFromDb){
		loginDAO.failedLoginDAO(dtoFromDb);
	}

	
	
	
	
}
