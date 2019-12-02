package com.ustglobal.empapp1.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empapp1.dao.EmployeeDao;
import com.ustglobal.empapp1.dto.EmployeeInfo;
import com.ustglobal.empapp1.util.EmployeeDaoManager;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id=Integer.parseInt(req.getParameter("id"));
       String password= req.getParameter("password");
	
	
       EmployeeDao dao= EmployeeDaoManager.getEmployeeDao();
    		   EmployeeInfo info=dao.auth(id, password);
    		 
    		   if(info==null) {
    				
    				PrintWriter out= resp.getWriter();
    				out.println("<html>");
    				out.println("<h4 style ='color:red'> Invalid id or password</h4>");
    				out.println("</html>");
    				
    				RequestDispatcher dispatcher=req.getRequestDispatcher("/login");
    				dispatcher.include(req, resp);
    			
	
	}
    		   else {
    				
    				HttpSession session = req.getSession(true);
    				session.setAttribute("info", info);
    				
    				RequestDispatcher dispatcher= req.getRequestDispatcher("/home");
    				dispatcher.include(req, resp);
    				
    				
    			}
}}
