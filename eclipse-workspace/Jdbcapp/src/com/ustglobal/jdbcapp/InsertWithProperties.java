package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class InsertWithProperties {

	public static void main(String[] args) {
		

		Connection conn = null;

		java.sql.Statement stmt = null;

		try {

			//step1 load the driver	

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2 get the connection

			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn =DriverManager.getConnection(url,prop);

			//step3 Issue sql query

			String sql = "insert into Employee_info"+
					" values(6,'sumit',100000,'M')";

			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			//step 4 read the result

			System.out.println(count+"Rows inserted");


		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			//step5 close all jdbc connections
			try {
				if(conn!=null)
					conn.close();
				if(stmt!=null)
					conn.close();
				//		if(res!=null)
				//			res.close();
				//		
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		
		
		
		
		
	}
	
	
}
