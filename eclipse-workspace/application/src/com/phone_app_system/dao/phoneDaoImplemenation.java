package com.phone_app_system.dao;

import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.phone_app_system.bean.Hotel_Bean;
import com.phone_app_system.bean.Phone_bean;
import com.phone_app_system.validator.Hotel_Validation;

public class phoneDaoImplemenation  implements phone_Dao {
	
	Properties prop = null;
	FileReader reader = null;
	Phone_bean user;

	public phoneDaoImplemenation () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public List<Phone_bean> getAllinfo() {
		Scanner sc = new Scanner(System.in);
		List<Phone_bean> userList = new ArrayList<Phone_bean>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password")); Statement pstmt = conn.createStatement();) {
			{
				int i = 1;
				do {
					System.out.println("Kindly select among the following");
					System.out.println(" 1.) To show all contacts");
					System.out.println(" 2.) To search for contacts");
					System.out.println(" 3.) to operate on contacts");
			//		System.out.println(" 4.) Print total bill..");

					int s = sc.nextInt();
					if (s == 1) {

						CallableStatement cs = conn.prepareCall(prop.getProperty("query"));
						boolean b = cs.execute();

						if (b)

						{
							ResultSet rs = cs.getResultSet();
							while (rs.next()) {
								System.out.println("Name : " + rs.getString(1));
								System.out.println("Number : " + rs.getInt(2));
								System.out.println("Price : " + rs.getString(3));
								System.out.println("............................................");
							}
						} else {
							int x = cs.getUpdateCount();
							if (x > 0) {
								System.out.println("Successful");
							}
						}
					}

					// To place
					// order..............................................................

					else if (s == 2) {
						int y = 1;
						do {
							PreparedStatement pst = conn.prepareStatement(prop.getProperty("query2"));
							System.out.println("Enter item_code: ");
							String it = sc.next();
							int d = Integer.parseInt(it);
							pst.setInt(1, d);
							if (v.idVer(it)) {

								System.out.println("Enter price: ");

								pst.setDouble(2, Double.parseDouble(sc.next()));

								int res = pst.executeUpdate();
								if (res > 0) {

									System.out.println("Order received");
								}
							}
							System.out.println("Do you want another order: Y/N");
							String st = sc.next();
							if (st.equals("Y")) {
								y++;
							} else {
								y = 0;
							}

						} while (y != 0);

					}

					else if (s == 3) {
						System.out.println("Select A to add item");
						System.out.println("Select B to modify item");
						System.out.println("Select C to delete item");

						String z = sc.next();
						if (z.equals("A")) {

							int zz = 1;
							do {
								PreparedStatement pst = conn.prepareStatement(prop.getProperty("query2"));
								System.out.println("Enter item_code: ");

								String it = sc.next();
								int d = Integer.parseInt(it);
								pst.setInt(1, d);
								if (v.idVer(it)) {
									// pst.setInt(1, Integer.parseInt(sc.next()));

									System.out.println("Enter price: ");

									pst.setDouble(2, Double.parseDouble(sc.next()));

									int res = pst.executeUpdate();
									if (res > 0) {
										System.out.println("Order added");
									}
								}
								System.out.println("Do you want another order: Y/N");
								String st = sc.next();
								if (st.equals("Y")) {
									zz++;
								} else {
									zz = 0;
								}
							} while (zz != 0);
						} else if (z.equals("B")) {

							int zx = 1;
							do {
								PreparedStatement pst = conn.prepareStatement(prop.getProperty("query3"));
								System.out.println("Enter item_code: ");

								pst.setInt(1, sc.nextInt());

								System.out.println("Enter price: ");

								pst.setDouble(2, Double.parseDouble(sc.next()));

								int res = pst.executeUpdate();
								if (res > 0) {
									System.out.println("Order modified");
								}
								System.out.println("Do you want another order: Y/N");
								String st = sc.next();
								if (st.equals("Y")) {
									zx++;
								} else {
									zx = 0;
								}
							} while (zx != 0);
						}

						else if (z.equals("C")) {
							int yy = 1;
							do {
								PreparedStatement pst = conn.prepareStatement(prop.getProperty("query4"));
								System.out.println("Enter item_code: ");

								pst.setInt(1, Integer.parseInt(sc.next()));
								int res = pst.executeUpdate();
								if (res > 0) {
									System.out.println("Item deleted");
								}
								
								String st = sc.next();
								if(st.equals("Y")) {
									yy++;
								}
								else {
									yy=0;
								}
							} while (yy != 0);

						} else {
							System.out.println("Choose correct option");
						}

					}

					// To generate the toatal
					// bill...........................................
					else if (s == 4) {
						Statement st = conn.createStatement();
						ResultSet rc = st.executeQuery(prop.getProperty("query5"));
						while (rc.next()) {
							System.out.println("Total bill is: " + rc.getDouble(3));
						}
					} else {
						System.out.println("Kindly choose the correct option");
					}

					// To continue the command.........................
					System.out.println("Do you want to view the options again: Y/N");
					String sst = sc.next();
					if (sst.equals("Y")) {
						i++;
					} else {
						Statement st = conn.createStatement();
						ResultSet rc = st.executeQuery(prop.getProperty("query5"));
						while (rc.next()) {
							System.out.println("Total bill is: " + rc.getDouble(3));
						}
					}
				} while (i != 0);

				return userList;

			}
		}

		catch (Exception e) {
			System.out.println("OOPS,Something went wrong");
			e.printStackTrace();
			System.exit(0);
		}
		sc.close();
		return null;
	}

}
