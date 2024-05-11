package com.mybatis.modal.vo;

import java.util.Date;

public class Student {
	private int studentNo;
	private String studentName;
	private String studentPhone;
	private String studentEmail;
	private String studentAddress;
	private Date enrollDate;
	public int getStudentNo() {
		return studentNo;
	}



	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getStudentPhone() {
		return studentPhone;
	}



	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}



	public String getStudentEmail() {
		return studentEmail;
	}



	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}



	public String getStudentAddress() {
		return studentAddress;
	}



	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}



	public Date getEnrollDate() {
		return enrollDate;
	}



	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}





	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(int studentNo, String studentName, String studentPhone, String studentEmail, String studentAddress,
			Date enrollDate) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentEmail = studentEmail;
		this.studentAddress = studentAddress;
		this.enrollDate = enrollDate;
	}



	

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", StudentName=" + studentName + ", StudentPhone=" + studentPhone
				+ ", StudentEmail=" + studentEmail + ", StudentAddress=" + studentAddress + ", enrollDate=" + enrollDate
				+ "]";
	}
}
