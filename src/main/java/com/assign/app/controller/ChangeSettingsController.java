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
import com.assign.app.dto.UserDTO;
import com.assign.app.service.ChangeSettingsService;

@Controller
public class ChangeSettingsController {
	@Autowired
	private ChangeSettingsService changeSettingsService;
	public ChangeSettingsController() {
	    System.out.println("Created...."+this.getClass().getSimpleName());
	}
	@RequestMapping(value="/update.ams",method=RequestMethod.GET)
	public ModelAndView settingsController(HttpServletRequest request){
		HttpSession session=request.getSession(false);
		UserDTO uDto=(UserDTO) session.getAttribute("dtoFromDb");
		return new ModelAndView("settings","user",uDto);
	}
	@RequestMapping(value="/settings.ams",method=RequestMethod.POST)
	public ModelAndView changeSettingsController(UserDTO userDTO,HttpServletRequest request){
		HttpSession session=request.getSession(false);
		UserDTO olduserDTO=(UserDTO) session.getAttribute("dtoFromDb");
	    changeSettingsService.changeSettingsService(userDTO);
		return new  ModelAndView(ApplicationConstant.CHANGESETTINGS,StringConstant.MESSAGE,StringConstant.MESSAGE_SETTINGS).addObject("user",userDTO);
		
	}
	
	

}