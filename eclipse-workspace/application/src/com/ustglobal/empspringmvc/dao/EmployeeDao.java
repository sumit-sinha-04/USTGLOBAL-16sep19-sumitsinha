package com.ustglobal.empspringmvc.dao;

import com.ustglobal.empspringmvc.EmployeeBean;

public interface EmployeeDao {

	public EmployeeBean login(int id,String password);
public boolean register(EmployeeBean bean);
public boolean deleteEmployee(int id);
public EmployeeBean searchEmployee(int id);
public boolean updateEmployee(EmployeeBean bean);
public boolean changePassword(int id,String password);

}