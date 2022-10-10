package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentClass {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Welcome to Student management App");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				
		while(true)
		{
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("press 3 to Display student");
			System.out.println("Press 4 to Exite  App");
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				System.out.println("Enter user name :");
				String name =br.readLine();
				System.out.println("Enter user MobileNo");
				String MobileNo=br.readLine();
				System.out.println("Enter user Address");
				String Address=br.readLine();
				System.out.println("Enter user City");
				String city=br.readLine();
				
				StudentDetail studentdetail=new StudentDetail(c, name,MobileNo,Address,city);
				boolean answer=StudentDao.insertStudentToDB(studentdetail);
				if(answer)
				{
					System.out.println("student Addeded successfully...");
				}else
				{
					System.out.println("Something went  wrong please check again......");
				}
				System.out.println(studentdetail);
			
			}
			else if(c==2)
			{
				
			}
			else if(c==3)
			{
				
			}else if(c==4)
			{
				
				break;
			}else
			{
				System.out.println("");
			}
			
		}
		System.out.println("Thankyou for using my Application.....");
		System.out.println("See you soon....By..By");
		

	}

}
