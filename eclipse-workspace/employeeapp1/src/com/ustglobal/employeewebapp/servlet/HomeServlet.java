package com.ustglobal.employeewebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.employeewebapp.dto.EmployeeInfo;

@WebServlet("/home")

public class HomeServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session = req.getSession(false);
		
		if(session!=null) {
			EmployeeInfo info=(EmployeeInfo)session.getAttribute("info");
			
			PrintWriter out=resp.getWriter();
			out.println("<h1>Welcome "+info.getName());
			out.println("</h1>");
			out.println("<a href='./search.html'>search</a>");
			out.println("<a href='./changepassword.html'>password</a>");
			out.println("<a href='./logout'>logout</a>");
			
		}else {
			RequestDispatcher dispatcher= req.getRequestDispatcher("/login.html");
			dispatcher.include(req, resp);
		}
		
		
	}//end of doget()
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
	}
}//end of HomeServlet
