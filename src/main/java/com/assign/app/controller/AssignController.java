package com.assign.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.application.ApplicationConstant;
import com.assign.app.application.StringConstant;
import com.assign.app.dto.CreateAssignmentDTO;
import com.assign.app.service.AssignService;

@Controller
public class AssignController {

	@Autowired
	private AssignService assignService;

	public AssignController() {
		System.out.println("created \t" + this.getClass().getSimpleName());

	}

	@RequestMapping(value = "/Assign.ams", method = RequestMethod.POST)
	public ModelAndView assignContrller(HttpServletRequest req) {
		System.out.println("inoked assignmentController\t");
		Integer pin = Integer.parseInt(req.getParameter("pin"));
		String email = req.getParameter("assignees");
		System.out.println("Email List : " + email);
		HttpSession session = req.getSession(false);
		if (session.getAttribute("dtoFromDb") != null) {

			boolean status = assignService.AssignService(pin, email);
			if (status) {
				return new ModelAndView(ApplicationConstant.ASSIGN,StringConstant.MESSAGE,StringConstant.MESSAGE_ASSIGN);

			} else {
				return new ModelAndView(ApplicationConstant.ASSIGN,StringConstant.MESSAGE,StringConstant.ERROR_ASSIGN);

			}
		} else {
			System.out.println("session closed");
			return new ModelAndView(ApplicationConstant.SIGNIN,StringConstant.MESSAGE, StringConstant.ERROR_SESSION);
		}
	}
}
