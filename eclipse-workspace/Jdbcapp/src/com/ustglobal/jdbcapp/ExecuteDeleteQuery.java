package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

//import com.mysql.jdbc.Statement;

public class ExecuteDeleteQuery {

	public static void main(String[] args) {

		Connection conn = null;
		java.sql.PreparedStatement pstmt = null;

		try {
			//load the drivers

//			Driver driver = new Driver();
	//		DriverManager.registerDriver(driver);

			Class.forName("com.mysql.jdbc.Driver");

			//get the connection

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//issue sql  statement


			String sql = "delete from Employee_info where id =?";
			pstmt= conn.prepareStatement(sql);
			// read the function performed

			String empid = args[0];
			int id =Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();
			System.out.println(count+"row affected");
		}
		catch (Exception e) {
			e.printStackTrace();	
		}




		finally {


			try {

				if (conn!=null) {

					conn.close();
				}

				if (pstmt!=null) {

					pstmt.close();
				}
			}

			catch (Exception e) {
				e.printStackTrace();
			}



		} 

	}
}


