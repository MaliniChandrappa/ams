package com.assign.app.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.assign.app.dao.UploadDAO;
import com.assign.app.dto.UploadDTO;

@Service
public class UploadService {
	@Autowired
	private UploadDAO uploadDAO;

	public UploadService() {
		System.out.println("Created....." + this.getClass().getSimpleName());
	}

	public UploadDTO uploadService(UploadDTO uDto, String mfile) throws IOException {
		
		uploadDAO.uploadDAO(uDto, mfile);
		return uDto;

	}
}
