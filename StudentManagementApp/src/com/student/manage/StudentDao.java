package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
				
	public static boolean insertStudentToDB(StudentDetail studentdetail) {
		boolean f=false;
		
		try {
			Connection con=ConnectionProvider.createC();
String q="insert into student(int sId, sname,sMobileNo,sAddress,scity) values()";
			
	 PreparedStatement p=con.prepareStatement(q);
			
			//set the value of parameter
	 p.setString(1,studentdetail.getStudentName());	 
	p.setString(2,studentdetail.getStudentMobileNo());
	p.setString(3,studentdetail.getStudentAddress());
	p.setString(4,studentdetail.getStudentCity());
	 //execute
	 p.executeUpdate();
	 f=true;
	// sname varchar(30), sMobileNo int(50),sAddress varchar(40),scity varchar(50));

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;

		
	}

}
