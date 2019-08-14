package com.assign.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.UserDTO;

@Repository
public class ChangeSettingsDAO {
	@Autowired
	private SessionFactory factory;

	public UserDTO settingsDAO(UserDTO userDTO) {
	   Session session=factory.openSession();
	   Transaction transaction=session.beginTransaction();
	   session.saveOrUpdate(userDTO);
	   transaction.commit();
		return userDTO ;
	}

	

}
