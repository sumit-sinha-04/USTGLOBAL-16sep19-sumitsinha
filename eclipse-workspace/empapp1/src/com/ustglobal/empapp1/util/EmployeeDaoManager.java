package com.ustglobal.empapp1.util;

import com.ustglobal.empapp1.dao.EmployeeDao;
import com.ustglobal.empapp1.dao.EmployeeDaoJdbcImp;

public class EmployeeDaoManager {

	private EmployeeDaoManager()
	
	{}
	
	public static EmployeeDao getEmployeeDao()
	{
		
		
		return new EmployeeDaoJdbcImp();
	}
}
