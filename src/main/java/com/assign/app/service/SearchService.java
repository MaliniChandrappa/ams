package com.assign.app.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.app.dao.SearchDAO;
import com.assign.app.dto.CreateAssignmentDTO;


@Service
public class SearchService {
	
	@Autowired
	private SearchDAO searchDAO;

	 
	public SearchService() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	public List<CreateAssignmentDTO> searchService(String courseName,String topicName) {
		
		System.out.println("invoked searchService().....");
		
	List<CreateAssignmentDTO> list=searchDAO.searchDAO(courseName,topicName);
	System.out.println("search result\t"+list);
		
			
		return  list;
		
	}

}
