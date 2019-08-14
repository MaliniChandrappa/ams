package com.assign.app.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assign.app.dto.UploadDTO;
import com.assign.app.entity.UploadDTOEntity;
@Repository
public class UploadDAO {
     @Autowired
     private SessionFactory sFactory;
     public UploadDAO() {
		System.out.println("Craeted....."+this.getClass().getSimpleName());
	}
	public UploadDTO uploadDAO(UploadDTO uDto,String fname) {
		Session session=sFactory.openSession();
		 UploadDTOEntity entity=new UploadDTOEntity();
		 entity.setEmail(uDto.getEmail());
		 entity.setPin(uDto.getPin());
		 entity.setUrl(uDto.getUrl());
		 entity.setFile(fname);
	
		System.out.println("Data in DAO:"+uDto);
		Transaction transaction=session.beginTransaction();
		Serializable id=session.save(entity);
		transaction.commit();
		return uDto;
	}

}
