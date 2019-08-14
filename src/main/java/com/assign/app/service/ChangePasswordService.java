package com.assign.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.app.dao.ChangePasswordDAO;
import com.assign.app.dto.ChangePasswordDTO;
import com.assign.app.dto.UserDTO;
import com.assign.app.util.EncryptionDecryption;
@Service
public class ChangePasswordService {

	private  final static Logger log = LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	private ChangePasswordDAO changePasswordDAO;
	
	public UserDTO getDataByEmail(ChangePasswordDTO pwdDTO) {
		UserDTO dtoFrmDb = changePasswordDAO.getUserDTOByEmail(pwdDTO);
		return dtoFrmDb;
	}
	
	public void changePasswordService(ChangePasswordDTO dtoFrmDb) {
		UserDTO adminDTO = changePasswordDAO.getUserDTOByEmail(dtoFrmDb);
		
		boolean valid = false;
		String email = dtoFrmDb.getEmail();
		String oldPwd = dtoFrmDb.getOldPassword();
		String newPwd = dtoFrmDb.getNewPassword();
		String cnfrmPwd = dtoFrmDb.getConfirmPassword();
		
		System.out.println("old password\t"+ oldPwd);
		System.out.println("newPassword\t"+ newPwd);
		System.out.println("cnfrm pass\t"+ cnfrmPwd);
		
		System.out.println("--------");
		String encryptedpassword = EncryptionDecryption.encrypt(cnfrmPwd);
		
		System.out.println("encrypted pass\t"+ encryptedpassword);
		
		String passFrmDb=adminDTO.getPassword();
		
		System.out.println("from database"+ passFrmDb);
		
		String decrPassFrmDb=EncryptionDecryption.decrypt(passFrmDb);
		
		System.out.println("-----------");
		System.out.println("decry pass from db"+ decrPassFrmDb);
		
		//System.out.println("old password\t"+oldPwd);
		
		
		if (dtoFrmDb != null) {
			if (oldPwd.equals(decrPassFrmDb)) {
				log.info("old password is valid");
				if (cnfrmPwd.equals(newPwd)) {
					log.info("new pasword is valid");
					valid = true;
				}else {log.error("new password is not valid..");}
			}else {log.error("old password is wrong! check ur mail..");}
			if (valid) {
				changePasswordDAO.changePwdDAO(email, encryptedpassword);
			} else {
				log.error("cannot change password");
			}
		}

	}
	
	public void updateNewUserService(UserDTO dtoFrmDb) {
		String email = dtoFrmDb.getEmail();
		boolean newUser = false;
		changePasswordDAO.updateNewUserDAO(email, newUser);
	}
	
}
