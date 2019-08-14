package com.assign.app.controller;

import java.util.List;

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
import com.assign.app.service.SearchService;

@Controller
@RequestMapping("/")
public class SearchController {
	@Autowired
	private SearchService searchService;
	
	public SearchController() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="/search.ams", method=RequestMethod.POST)
	public ModelAndView searchController(HttpServletRequest req)
	{
		System.out.println("invoked searchController()...");
		String courseName=req.getParameter("course");
		String topicName=req.getParameter("topic");
		HttpSession session=req.getSession(false);
		if(session.getAttribute("dtoFromDb")!=null){
		List<CreateAssignmentDTO> list= searchService.searchService( courseName,topicName);
		return new  ModelAndView(ApplicationConstant.SEARCH,StringConstant.LIST,list);
		}
		else
		{
			System.out.println("session closed");
			return  new ModelAndView(ApplicationConstant.SIGNIN,StringConstant.MESSAGE,StringConstant.ERROR_SEARCH);
		}

	}

}
