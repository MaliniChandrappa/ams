package com.assign.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.ChangePasswordDTO;
import com.assign.app.dto.UserDTO;
@Repository
public class ChangePasswordDAO {

	@Autowired
	private SessionFactory factory;
	
	public ChangePasswordDAO() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	public UserDTO getUserDTOByEmail(ChangePasswordDTO dtoFrmDb) {
		String hql="from UserDTO where email=:em";
		Session session=factory.openSession();
		Query query=session.createQuery(hql);
		query.setParameter("em", dtoFrmDb.getEmail());
		UserDTO dtoFrmDB=(UserDTO) query.uniqueResult();
		return dtoFrmDB;

	}
	
	public void changePwdDAO(String email,String password) {
		String hql="update UserDTO set password=:pwd where email=:em";
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter("pwd",password);
		query.setParameter("em",email);
		query.executeUpdate();
		transaction.commit();		
	}
	
	public void updateNewUserDAO(String email,boolean newUser) {
		String hql="update UserDTO set newUser=:nu where email=:em";
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter("nu",newUser);
		query.setParameter("em",email);
		query.executeUpdate();
		transaction.commit();
	}

	

	
}
