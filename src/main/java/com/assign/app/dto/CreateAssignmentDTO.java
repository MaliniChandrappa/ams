package com.assign.app.dto;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Assign")
public class CreateAssignmentDTO implements Serializable {
	    @Id
		private int pin;
		private String topic;
		private String course;
		private String description;
		private Date deadLine;
		private  String uploadType;
		
		public CreateAssignmentDTO() {
			System.out.println(this.getClass().getSimpleName());
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		public int getPin() {
			return pin;
		}
		
		public String getTopic() {
			return topic;
		}
		public void setTopic(String topic) {
			this.topic = topic;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getDescripation() {
			return description;
		}
		public void setDescripation(String descripation) {
			this.description = descripation;
		}
		public Date getDeadLine() {
			return deadLine;
		}
		public void setDeadLine(Date deadLine) {
			this.deadLine = deadLine;
		}
		public String getUploadType() {
			return uploadType;
		}
		public void setUploadType(String uploadType) {
			this.uploadType = uploadType;
		}
		@Override
		public String toString() {
			return "CreateAssignmentDTO [spin=" + pin + ", topic=" + topic + ", course=" + course
					+ ", description=" + description + ", deadLine=" + deadLine + ", uploadType=" + uploadType + "]";
		}
		
	
}


