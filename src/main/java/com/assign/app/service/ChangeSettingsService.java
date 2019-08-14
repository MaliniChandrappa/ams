package com.assign.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.app.dao.ChangeSettingsDAO;
import com.assign.app.dto.UserDTO;

@Service
public class ChangeSettingsService {
	@Autowired
	private ChangeSettingsDAO changeSettingsDAO;
	public ChangeSettingsService() {
		System.out.println("Created...."+this.getClass().getSimpleName());
	}
	public UserDTO changeSettingsService(UserDTO userDTO) {
		UserDTO dtoFromDb=changeSettingsDAO.settingsDAO(userDTO);
		return dtoFromDb;
	
		
	}

}
