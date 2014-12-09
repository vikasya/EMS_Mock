/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.dao;

import java.util.List;

import com.sample.mvc.model.EmployeeCommand;

public interface EmployeeDAO {
	public void addEmployee(EmployeeCommand employee);
	public List<EmployeeCommand> listContact();
	public void deleteEmployee(Integer employeeId);
	public EmployeeCommand getEmployeebyId(Integer employeeID );
	public void updateEmployee(EmployeeCommand employeeCommand);
}
