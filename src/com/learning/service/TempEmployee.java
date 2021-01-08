package com.learning.service;

import com.learning.domain.Employee;

public class TempEmployee extends Employee {
	private int duration;
	public static void main(String[] args) {
		TempEmployee ob=new TempEmployee();
		ob.employeeId=50;
		ob.phoneNumber=123456;
		ob.duration=45;
		}
}
