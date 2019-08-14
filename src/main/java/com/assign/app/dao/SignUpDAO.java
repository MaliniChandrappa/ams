package com.assign.app.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.UserDTO;

@Repository
public class SignUpDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public String signUpDAO(UserDTO userDTO)
	{
		System.out.println("SignUpDAO Started");
		String hql="from UserDTO where email=:em";
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery(hql);
		//session.save(userDTO);
		query.setParameter("em", userDTO.getEmail());
		UserDTO dtoFrmDB=(UserDTO) query.uniqueResult();
        if(dtoFrmDB != null)
		{
			// System.out.println("email id is already present");
			return "email id is already present";
		}
		else {
			session.save(userDTO);
			transaction.commit();
			return "user created successfully";
		}
		//System.out.println("SignUpDAO Ended");
		
	}
	public SignUpDAO() {
		System.out.println(this.getClass().getSimpleName());
	}

}
