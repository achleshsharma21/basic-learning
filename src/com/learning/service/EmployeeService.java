package com.learning.service;

import com.learning.domain.Employee;

public class EmployeeService extends Employee{
public static void main(String[] args) {
	EmployeeService obj=new EmployeeService();
	System.out.println(obj.employeeId);
	obj.employeeId=10;
	System.out.println(obj.eMail);
	obj.eMail="abc";
	System.out.println(obj.employeeId);
	System.out.println(obj.eMail);
}
}
