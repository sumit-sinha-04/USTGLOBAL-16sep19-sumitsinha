package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;
//import com.mysql.PreparedStatement;

public class ExecuteDynamicQuery {

	public static void main(String[] args) {






		Connection conn = null;

		//		java.sql.Statement stmt = null;

		java.sql.PreparedStatement pstmt = null;
		try {
			//load the drivers

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);


			//get the connection

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//issue sql  statement

			String sql = "insert into Employee_info"+
					" values(?,?,?,?)";

			pstmt=  conn.prepareStatement(sql);



			String empid =args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);




			String name =args[1];
			pstmt.setString(2,name);

			String salary1=args[2];
			int sal = Integer.parseInt(salary1);
			pstmt.setInt(3,sal);

			String gender =args[3];
			pstmt.setString(4,gender);



			int count = pstmt.executeUpdate();
			System.out.println(count+"row affected");
		}
		catch (Exception e) {
			e.printStackTrace();	
		}













	}
}
