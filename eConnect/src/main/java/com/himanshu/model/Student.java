package com.himanshu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column
	private String email;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String password;
	@Column
	private String repassword;
	@Column
	private String dob;
	
	/*public Student(){
		
	}
	public Student(int studentid, String fname, String lname, String email) {
		super();
		this.studentid = studentid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}*/
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
