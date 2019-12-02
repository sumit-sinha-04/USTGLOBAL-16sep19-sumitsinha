package com.ustglobal.empspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service; 

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}// end of login page


	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		EmployeeBean bean = service.login(id, password);
		if(bean==null) { // If invalid id or password
			request.setAttribute("msg", "Invalid Credentials");
			return "login"; // Go back to login
		}else {
			HttpSession session = request.getSession(); // if credentials are right or true
			session.setAttribute("bean", bean); // set the attributes
			return "home"; // and go back to home
		}
	}// end of login()


	@GetMapping("/register")
	public String registerPage() {
		return "register"; 
	}//end of register page


	@PostMapping("/register")
	public String register(EmployeeBean bean, ModelMap map) {

		int check = service.register(bean); //registering
		if(check>0) {
			map.addAttribute("msg", "You are Registered and id is "+check);
		}else {
			map.addAttribute("msg", "Email is repeated");
		}
		return "login";
	}// end of register()

}
