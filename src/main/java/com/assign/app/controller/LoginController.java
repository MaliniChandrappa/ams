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
import com.assign.app.dto.LoginDTO;
import com.assign.app.dto.UserDTO;
import com.assign.app.service.LoginService;
import com.assign.app.util.EncryptionDecryption;

@Controller
@RequestMapping("/")
public class LoginController {

	private final static Logger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	public LoginController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/signin.ams", method = RequestMethod.POST)
	public ModelAndView loginController(LoginDTO loginDTO, HttpServletRequest request) {

		System.out.println("CAlling loginController()....");

		log.info("LoginController is started");
		log.info(loginDTO.toString());
		UserDTO dtoFromDb = loginService.loginService(loginDTO);

		log.info("dtoFromDb-->" + dtoFromDb);

		if (dtoFromDb != null) {
			String passFromLogin = loginDTO.getPassword();
			String decryptedpass = EncryptionDecryption.decrypt(dtoFromDb.getPassword());
			System.err.println("passFromLogin" + passFromLogin);
			System.err.println("Decryted Pass" + decryptedpass);
			if (passFromLogin.equals(decryptedpass)) {
				if (dtoFromDb.isNewUser()) {
					return new ModelAndView("changePassword");
				} else {

					log.info("Login successful");
					HttpSession session = request.getSession(true);
					session.setAttribute("dtoFromDb", dtoFromDb);
					session.setMaxInactiveInterval(600);
					loginService.updateLastLoginAndFailCountService(dtoFromDb);
					return new ModelAndView(ApplicationConstant.HOME, StringConstant.MESSAGE,
							StringConstant.MESSAGE_LOGIN).addObject("user", dtoFromDb);
				}
			} else {
				log.info("Incorrect Password");

				int failCount = dtoFromDb.getFailCount();
				dtoFromDb.setFailCount(failCount + 1);

				loginService.failedLoginService(dtoFromDb);

				return new ModelAndView(ApplicationConstant.SIGNIN, StringConstant.MESSAGE, StringConstant.ERROR_PASS);
			}
		} else {
			log.info("wrong email id");
			return new ModelAndView(ApplicationConstant.SIGNIN, StringConstant.MESSAGE, StringConstant.ERROR_EMAIL);
		}
	}

	@RequestMapping(value = "/signin.ams", method = RequestMethod.GET)
	public ModelAndView logoutController(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		session.invalidate();
		System.out.println("Signout successful,session closed");
		return new ModelAndView(ApplicationConstant.SIGNIN, StringConstant.MESSAGE, StringConstant.MESSAGE_SIGNOUT);

	}
}
