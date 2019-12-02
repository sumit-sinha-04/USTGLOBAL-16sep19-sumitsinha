
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import java.sql.*;	

public class MyFirstJdbc {


	public static void main(String[] args) {

		Connection conn = null;

		java.sql.Statement stmt = null;

		ResultSet rs = null;

		try {
			//step 1 register driver
			Driver driver  = new Driver();
			DriverManager.registerDriver(driver);
			//step 2 Get the connection
			String url ="jdbc:mySql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			//step4 issue the sql query

			stmt = conn.createStatement();
			String sql = "select * from Employee_info ";
			rs =stmt.executeQuery(sql);
			//	System.out.println(rs);
			//			Step 4  read the result
			while (rs.next()) {
				int id =  rs.getInt("id");
				String name =rs.getString("name");
				String gender =rs.getString("gender");
				int sal =  rs.getInt("sal");
				System.out.println("Id is:"+ id);
				System.out.println("Name:"+name);
				System.out.println("sal is:"+sal);	
				System.out.println("gender is:"+gender);

				System.out.println("**********************");



			}

		}

		catch (SQLException e) {
			e.printStackTrace();


		}
		//close  all jdbc objects
		finally {

			try {
				if(conn!=null)
					conn.close();
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();


			}

			catch (SQLException e) {
				e.printStackTrace();

			}


		}




	}
}
