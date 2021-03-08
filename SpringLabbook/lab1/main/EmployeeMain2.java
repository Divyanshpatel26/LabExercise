package com.abc.lab1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.lab1.bean.Employee2;
import com.abc.lab1.bean.SBU;

public class EmployeeMain2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Lab1.2.xml");
        Employee2 employee =(Employee2) context.getBean("emp");
        
        SBU sbu=(SBU) context.getBean("sbu");
        
        System.out.println("Employee {empAge="+employee.getAge()+", empId="+employee.getEmployeeId()+", empName="+employee.getEmployeeName()+", empSalary="+employee.getSalary()+"}");
    	System.out.println("sbu details=SBU {sbuCode="+sbu.getSbuName()+", sbuHead="+sbu.getSbuHead()+", sbuName="+sbu.getSbuName()+"}");
    	
        
	}

}
