package com.cg.eis.exception;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		int salary=sc.nextInt();
		
		try {
			checkSalary(salary);
		}
		catch(EmployeeException e) {
			System.out.println("Salary below 3000");
		}
	}

	private static void checkSalary(int salary) throws EmployeeException {	
		if(salary>3000)
		{
			System.out.println("Salary more than 3000");
		}
		else
		{
			throw new EmployeeException();
		}
		
	}

}
