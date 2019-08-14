package com.assign.app.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartResolver;

import com.assign.app.dto.CreateAssignmentDTO;


@Repository
public class CreateAssignmentDAO {
	@Autowired
	private SessionFactory factory;
	
	public CreateAssignmentDAO() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	public Integer createAssignmentDAOImpl(CreateAssignmentDTO createAssignmentDTO) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Serializable id=session.save(createAssignmentDTO);
		transaction.commit();
		return (Integer)id;
		
		
	}

}
