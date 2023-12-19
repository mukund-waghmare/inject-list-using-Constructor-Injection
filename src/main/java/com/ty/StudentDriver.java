package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext contex=new ClassPathXmlApplicationContext("conf.xml");
		
		Student student=(Student)contex.getBean("student");
		
		student.getSubjectName().stream().forEach((i)->{
			System.out.println(i);
		});
		
		System.out.println("=======================================");
		
		student.getStudentDetails();
	}

}
