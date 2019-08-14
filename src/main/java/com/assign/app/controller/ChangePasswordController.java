
package com.assign.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.application.ApplicationConstant;
import com.assign.app.application.StringConstant;
import com.assign.app.dto.ChangePasswordDTO;
import com.assign.app.dto.UserDTO;
import com.assign.app.service.ChangePasswordService;

@Controller
@RequestMapping("/")
public class ChangePasswordController {

	@Autowired
	private ChangePasswordService service;
	private static Logger log = LoggerFactory.getLogger(LoginController.class);

	public ChangePasswordController() {
		System.out.println(this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/changePassword.ams", method = RequestMethod.POST)
	public ModelAndView changePasswordController(ChangePasswordDTO dto, HttpServletRequest request) {
		log.info("changePasswordController is started");
		UserDTO userDTO = service.getDataByEmail(dto);
		HttpSession session = request.getSession(false);
		log.info("Session is Checked.....");
		if (session != null)
			if (session.getAttribute("dtoFromDb") != null) {
				log.info("Session is not nulll...");
				service.changePasswordService(dto);
				service.updateNewUserService(userDTO);
				log.info("changePasswordController is ended");
				return new ModelAndView(ApplicationConstant.HOME, StringConstant.MESSAGE,
						StringConstant.MESSAGE_CHANGEPASS).addObject("user", userDTO);
			}
		log.info("Session is Closed................");
		return new ModelAndView(ApplicationConstant.SIGNIN,StringConstant.MESSAGE,StringConstant.ERROR_CHANGEPASS);
	}

}
