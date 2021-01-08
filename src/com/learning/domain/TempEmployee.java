package com.learning.domain;

public class TempEmployee extends Employee {
	private int duration;
	public static void main(String[] args) {
		TempEmployee ob=new TempEmployee();
		ob.employeeId=50;
		ob.phoneNumber=123456;
		ob.duration=15;
		System.out.println(ob.duration);
		}
}
