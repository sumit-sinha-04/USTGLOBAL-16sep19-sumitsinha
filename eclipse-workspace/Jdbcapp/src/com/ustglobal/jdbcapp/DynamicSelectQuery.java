package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

	public static void main(String[] args) {



		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from Employee_info where id=?";

		Connection  conn= null;
		PreparedStatement pstmt = null;

		ResultSet rs = null;


		try {


			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2 get the connection

			conn = DriverManager.getConnection(url);
			//step3 issue sql query

			pstmt = conn.prepareStatement(sql);

			String empid =args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);

         rs = pstmt.executeQuery();
         
         //step4 read the result
         
         if(rs.next())
         {
        	 int id1 = rs.getInt("id");
        	 int sal = rs.getInt("sal");
        	 String name = rs.getString("name");
        	 String gender = rs.getString("gender");
        	 System.out.println("Id is"+id1);
        	 
        	 System.out.println("name  is"+name);
        	 System.out.println("sal is"+sal);
        	 System.out.println("gender is"+gender);
        	 
        	 
         }


		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {


			try {
				
				
				
				if(conn!=null)
					conn.close();
				if(pstmt!=null)
					pstmt.close();
				if(rs!=null)
					rs.close();
				
				
			} catch (Exception e2) {
			e2.printStackTrace();
			}


		}//end of try  - catch -finally





		//load the driver









	}
}
