package com.assign.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.application.ApplicationConstant;
import com.assign.app.application.StringConstant;
import com.assign.app.dto.UserDTO;
import com.assign.app.service.SignUpService;

@Controller
@RequestMapping("/")
public class SignUpController {
	@Autowired
	private SignUpService signUpService;
	private final static Logger log =LoggerFactory.getLogger(SignUpController.class);

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(
	            dateFormat, false));
	}
@RequestMapping(value ="/signup.ams", method = RequestMethod.POST)
	public ModelAndView signUpController(UserDTO userDTO) {
		log.info("signupController started");
		log.info(userDTO.toString());
		
		String result = signUpService.signUpService(userDTO);
		log.info("signupController ended");
		return new ModelAndView(ApplicationConstant.INDEX,StringConstant.MESSAGE,StringConstant.MESSAGE_SIGNUP);
	}

	public SignUpController() {
		System.out.println(this.getClass().getSimpleName());
	}
}
