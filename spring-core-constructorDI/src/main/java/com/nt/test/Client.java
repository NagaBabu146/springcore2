package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Employee;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=null;
		Employee employee=null;
		//locate and load the configuration file
		//create IOC container
		context=new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
        employee=context.getBean("emp", Employee.class);
        employee.details();
	}

}
