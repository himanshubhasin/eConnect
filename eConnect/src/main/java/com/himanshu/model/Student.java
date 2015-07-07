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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentid;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String email;
	
	public Student(){
		
	}
	public Student(int studentid, String fname, String lname, String email) {
		super();
		this.studentid = studentid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
