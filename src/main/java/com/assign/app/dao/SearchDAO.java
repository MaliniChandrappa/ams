package com.assign.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.CreateAssignmentDTO;


@Repository
public class SearchDAO {
	
	@Autowired
	private SessionFactory factory;

	
	
	 SearchDAO() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}


	public List<CreateAssignmentDTO> searchDAO(String courseName, String topicName) {
		System.out.println("invoked searchDAO().....");
		String hql="from CreateAssignmentDTO where course=:cou and topic=:top";
		Session session=factory.openSession();
		Transaction transaction= session.beginTransaction();
		 Query query=session.createQuery(hql);
		 query.setParameter("cou", courseName);
		 query.setParameter("top",topicName);
		 List <CreateAssignmentDTO> list=query.list();
		 
		
		return list;
	}
	
	

}
