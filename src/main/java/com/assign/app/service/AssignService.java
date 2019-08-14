package com.assign.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.assign.app.dao.AssignDAO;
import com.assign.app.dto.CreateAssignmentDTO;


@Service
public class AssignService {
	@Autowired
	private AssignDAO assignDAO;
	@Autowired
	private MailSender mailSender;
	public AssignService() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	public boolean AssignService(int pin, String emails) {
		System.out.println("invoked assignService ()....");
		String[] emailArray=emails.split(",");
		
		CreateAssignmentDTO assignDTO=assignDAO.checkPin(pin);
		if(assignDTO!=null) {
			for(int i=0;i<emailArray.length;i++) {
				sendMail(assignDTO,emailArray[i]);
			}}
		else
			{
				return false;
		}
		
		return true;
	
	}
	public String sendMail(CreateAssignmentDTO assignDTO,String email) {
		SimpleMailMessage simpleMessage=new SimpleMailMessage();
		simpleMessage.setTo(email);
		simpleMessage.setSubject("your new task from Assignment management:");
		simpleMessage.setText("Course:"+assignDTO.getCourse()+"\n Topic is:"+assignDTO.getTopic()
		+"\nDeadLine is:"+assignDTO.getDeadLine()+"\n upload type:"+assignDTO.getUploadType()+"\n description about project:"+assignDTO.getDescripation()+"\n pin:"+assignDTO.getPin());
		mailSender.send(simpleMessage);
		return "Mail sent to"+email;
	
	}
	

}
