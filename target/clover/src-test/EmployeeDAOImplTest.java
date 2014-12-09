/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ *//*package com.sample.mvc.daoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sample.mvc.model.EmployeeCommand;
import com.sample.mvc.service.EmployeeService;
import com.sample.mvc.service.EmployeeServiceImpl;

public class EmployeeDAOImplTest {
	
//	EmployeeCommand emp=new EmployeeCommand(105,"vikas","pune");
	EmployeeService emp1=new EmployeeServiceImpl();
	
	@Test
	public void addEmpTest()
	{
		String name="vikas" ,city="Ruchi";
		int code=100 ;
		EmployeeCommand employee=(EmployeeCommand) emp1.listContact();
		String name1=employee.getName(),city1=employee.getCity();
		int code1=employee.getCode();
		System.out.println(code1);
		assertEquals(name, name1);
		assertEquals(city, city1);
		assertEquals(code, code1);
	}
}
*/