package com.ustglobal.empapp1.dao;

import com.ustglobal.empapp1.dto.EmployeeInfo;

public interface EmployeeDao {

public EmployeeInfo auth(int id,String password);
public EmployeeInfo searchEmployee(int id);
public boolean changePassword(int id,String password);
public boolean registerEmployee(EmployeeInfo info);	

}
