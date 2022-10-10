package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	
	  static Connection con;
	public static Connection createC() throws SQLException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/7462jsf","root","root");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
		
	}
			
				
				
			

	
	
}
