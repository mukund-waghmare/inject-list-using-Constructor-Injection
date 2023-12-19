package com.ty;

import java.util.List;

public class Student {
	
	private String student_Name;
	
	private List<String> subjectName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public String getStudent_Name() {
		return student_Name;
	}



	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}



	public List<String> getSubjectName() {
		return subjectName;
	}



	public void setSubjectName(List<String> subjectName) {
		this.subjectName = subjectName;
	}



	public Student(String student_Name, List<String> subjectName) {
		
		this.student_Name = student_Name;
		this.subjectName = subjectName;
	}
	
	
	public void getStudentDetails()
	{
		System.out.println("Student Name : "+student_Name);
		subjectName.forEach((i)->{
			System.out.println(i);
		});
		
	}
	

}
