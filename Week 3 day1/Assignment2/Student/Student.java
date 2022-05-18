package com.java.basic.day5.assignments.org.Student;

import com.java.basic.day5.assignments.org.Department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Yuvaraj");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
       System.out.println("ECE");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("23322");
	}

	public static void main(String[] args) {

		
		Student access = new Student();
		
		access.collegeCode();
		access.collegeName();
		access.collegeRank();
		
		access.deptName();
		
		access.studentName();
		access.studentDept();
		access.studentId();
		
	}

}
