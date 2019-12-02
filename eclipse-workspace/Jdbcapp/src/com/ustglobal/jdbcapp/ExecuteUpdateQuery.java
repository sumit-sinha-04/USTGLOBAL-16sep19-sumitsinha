package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {

	public static void main(String[] args) {


		Connection conn = null;

		java.sql.PreparedStatement pstmt = null;

		try {

			//load the drivers

			Driver driver = new Driver();

			DriverManager.registerDriver(driver);


			//get the connections

			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";

			conn = DriverManager.getConnection(url);
			//issue sql query
			String sql = "update Employee_info set name=?,sal=?,gender=? where id =?";
			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);


			String name = args[1];


			String empsal = args[2];
			int empsal1 = Integer.parseInt(empsal);

			String gender = args[3];
			pstmt.setInt(4,id);
			pstmt.setString(1,name);
			pstmt.setInt(2,empsal1);
			pstmt.setString(3,gender);







			int count =pstmt.executeUpdate();
			//read the result
			System.out.println(count+"row affected");




		} catch (SQLException e) {
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

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}


}	
