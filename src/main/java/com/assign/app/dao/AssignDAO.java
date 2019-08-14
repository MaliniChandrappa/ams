package com.assign.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.CreateAssignmentDTO;

@Repository
public class AssignDAO {

	@Autowired
	private SessionFactory factory;

	public AssignDAO() {
		System.out.println("created\t" + this.getClass().getSimpleName());

	}

	public CreateAssignmentDTO checkPin(int pin) {
		System.out.println("invoked from assign dao().....");
		String hql = "from CreateAssignmentDTO where pin=:pn";
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("pn", pin);
		CreateAssignmentDTO dto = (CreateAssignmentDTO) query.uniqueResult();
		System.out.println("dto from db " + dto);
		return dto;
	}

}
