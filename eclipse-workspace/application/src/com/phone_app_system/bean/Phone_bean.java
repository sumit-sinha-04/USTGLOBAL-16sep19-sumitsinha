package com.ustglobal.main;

import java.util.Scanner;

import com.ustglobal.firstproject.LogicaOfProject;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc= new Scanner(System.in);
		System.out.println("Choice your Number...............");
		int ch = sc.nextInt();


		switch (ch) {
		case 1: LogicaOfProject lp1= new LogicaOfProject();
		System.out.println("All Employee Details is  ..............");
		lp1.getAllEmployee();

		break;
		case 2:
			LogicaOfProject lp2= new LogicaOfProject();
			System.out.println("Enter the number ");
			int id=sc.nextInt();
			System.out.println("Enter the Name   ");
			String name= sc.next();
			System.out.println("Enter the salary ");
			int sal= sc.nextInt();
			System.out.println("Enter the Gender ");
			String gender = sc.next();
			lp2.getInsertEmployee(id ,name , sal , gender);

			break;
		case 3:	LogicaOfProject lp3= new LogicaOfProject();
				System.out.println("Enter the id ");
				int id3=sc.nextInt();
				System.out.println("Enter the Name   ");
				String name3= sc.next();
				System.out.println("Enter the salary ");
				int sal3= sc.nextInt();
				System.out.println("Enter the Gender ");
				String gender3 = sc.next();
				lp3.getUpdateEmployee(id3, name3, sal3, gender3);

		break;
		case 4:	LogicaOfProject lp4= new LogicaOfProject();
		lp4.getDeleteEmployee();
		System.out.println("delete success");

		break;
		default:
			break;
		}
	}
}