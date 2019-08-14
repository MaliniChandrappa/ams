package com.assign.app.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserDTO  implements Serializable{
	private String fName;
	private String lName;
	private String cCode;
	private long mobileNumber;
	@Id
	private String email;
	private boolean newUser;
	private String password;
	private int failCount;
	private Date lastLogin;
	public UserDTO() {
		System.out.println(this.getClass().getSimpleName());
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getcCode() {
		return cCode;
	}
	public void setcCode(String cCode) {
		this.cCode = cCode;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isNewUser() {
		return newUser;
	}
	public void setNewUser(boolean newUser) {
		this.newUser = newUser;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getFailCount() {
		return failCount;
	}
	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}
	
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	@Override
	public String toString() {
		return "UserDTO [fName=" + fName + ", lName=" + lName + ", cCode=" + cCode + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", newUser=" + newUser + ", password=" + password + ", failCount=" + failCount
				+ ", lastLogin=" + lastLogin + "]";
	}
	

	
	

}
