package com.assign.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.assign.app.dto.CreateAssignmentDTO;
import com.assign.app.service.CreateAssignmentService;

@Controller
@RequestMapping("/")
public class CreateAssignmentController {

	@Autowired
	private CreateAssignmentService createAssignmentService;
	private final static Logger log = LoggerFactory.getLogger(CreateAssignmentController.class);

	public CreateAssignmentController() {
		System.out.println("created:\t" + this.getClass().getSimpleName());
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/createAssign.ams", method = RequestMethod.POST)
	public ModelAndView createAssignment(CreateAssignmentDTO dto, HttpServletRequest request) {
		System.out.println("Create assignment createds");
		log.info("CreateAssignment() started");
		log.info(dto.toString());
		HttpSession session = request.getSession(false);
		if (session.getAttribute("dtoFromDb") != null) {
			createAssignmentService.createAssignmentService(dto);
			log.info("CreateAssignment() ended");
			return new ModelAndView(ApplicationConstant.CREATEASSIGNMENT,StringConstant.PIN, StringConstant.MESSAGE_CREATE + dto.getPin());
		} else {
			System.out.println("session closed");
			return new ModelAndView(ApplicationConstant.SIGNIN,StringConstant.MESSAGE,StringConstant.ERROR_CREATE);
		}
		
	}

}
