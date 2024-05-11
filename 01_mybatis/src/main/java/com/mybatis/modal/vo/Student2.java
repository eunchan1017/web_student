package com.mybatis.modal.vo;

import javax.xml.crypto.Data;

public class Student2 {
	private int Student_no;
	private String Student_tel;
	private String Student_addr;
	private String Student_email;
	private Data reg_date;
	public int getStudent_no() {
		return Student_no;
	}
	public void setStudent_no(int student_no) {
		Student_no = student_no;
	}
	public String getStudent_tel() {
		return Student_tel;
	}
	public void setStudent_tel(String student_tel) {
		Student_tel = student_tel;
	}
	public String getStudent_addr() {
		return Student_addr;
	}
	public void setStudent_addr(String student_addr) {
		Student_addr = student_addr;
	}
	public String getStudent_email() {
		return Student_email;
	}
	public void setStudent_email(String student_email) {
		Student_email = student_email;
	}
	public Data getReg_date() {
		return reg_date;
	}
	public void setReg_date(Data reg_date) {
		this.reg_date = reg_date;
	}
	
}
