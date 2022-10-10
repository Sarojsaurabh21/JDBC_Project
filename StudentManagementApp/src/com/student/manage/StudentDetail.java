package com.student.manage;

public class StudentDetail {
	
	private int StudentId;
	private String StudentName;
	private String StudentMobileNo;
	private String StudentAddress;
	private String StudentCity;
	
	
	
	public StudentDetail() {
		super();
	}



	public StudentDetail(int studentId, String studentName, String studentMobileNo, String studentAddress,
			String studentCity) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentMobileNo = studentMobileNo;
		StudentAddress = studentAddress;
		StudentCity = studentCity;
	}

	
	public int getStudentId() {
		return StudentId;
	}



	public void setStudentId(int studentId) {
		StudentId = studentId;
	}



	public String getStudentName() {
		return StudentName;
	}



	public void setStudentName(String studentName) {
		StudentName = studentName;
	}



	public String getStudentMobileNo() {
		return StudentMobileNo;
	}



	public void setStudentMobileNo(String studentMobileNo) {
		StudentMobileNo = studentMobileNo;
	}



	public String getStudentAddress() {
		return StudentAddress;
	}



	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}



	public String getStudentCity() {
		return StudentCity;
	}



	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}



	@Override
	public String toString() {
		return "StudentDetail [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentMobileNo="
				+ StudentMobileNo + ", StudentAddress=" + StudentAddress + ", StudentCity=" + StudentCity + "]";
	}
	
	

}
