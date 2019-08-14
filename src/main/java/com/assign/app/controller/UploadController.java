package com.assign.app.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.application.ApplicationConstant;
import com.assign.app.application.StringConstant;
import com.assign.app.dto.UploadDTO;
import com.assign.app.service.UploadService;

@Controller
public class UploadController {

	private final static Logger log = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private UploadService uploadService;

	public UploadController() {
		System.out.println("Created..." + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/upload.ams", method = RequestMethod.POST)
	public ModelAndView uploadController(UploadDTO uploadDTO, @RequestParam MultipartFile uploadFile)
			throws IOException {

		byte[] fileadd = uploadFile.getBytes();
		String fileUrl = "G:/" + uploadFile.getOriginalFilename();
		BufferedOutputStream bufferedInputStream = new BufferedOutputStream(new FileOutputStream(new File(fileUrl)));
		bufferedInputStream.write(fileadd);
		String fileName = new SimpleDateFormat("yyyy_MM_dd_HH_mm'.zip'").format(new Date());
		System.out.println("File Name:" + fileName);
		System.out.println("File Address:" + fileUrl);

		log.info("Uploadcontroller is started");
		log.info(uploadDTO.toString());
		uploadService.uploadService(uploadDTO, fileName);
		log.info("Uploadcontroller is ended");
		return new ModelAndView(ApplicationConstant.INDEX,StringConstant.MESSAGE,StringConstant.MESSAGE_UPLOAD);
	}

}
