package com.spring.validation;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.spring.validation.validator.Phone;
import com.spring.validation.validator.Year;


//JSR 303


public class Student {


	@NotEmpty @Email
	public String email;  
	@Size(min=6,max=10, message="name  must be at least 6 characters")
	public String name;
	
	@Size(min=6,max=10, message="password  must be at least 6 characters")
	public String password;

	@Size(min=10, message="Phone number must be at least 10 characters") @Phone
	public String mobno;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotNull
	public Date dob;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public address studentaddress;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public address getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(address studentaddress) {
		this.studentaddress = studentaddress;
	}



}
