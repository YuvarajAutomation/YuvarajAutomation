package com.java.basic.day5.assignments;


public class Students {


	public int getStudentInfo(int id) {
		// TODO Auto-generated method stub
		return id;
	}


	public String getStudentInfo(int id, String name) {
		this.getStudentInfo(13);
		return name + id;

	}

	public  String getStudentInfo(long phone, String email) {

		
		return phone +email;
	}

	public static void main(String[] args) {

		Students stud = new Students();

		System.out.println("id ::"+ stud.getStudentInfo(13));
		System.out.println("id and Name ::"+ stud.getStudentInfo(14, "Yuvaraj"));
		System.out.println("Mobile and Mail ::"+ stud.getStudentInfo(8148823713L, "yuvaraj94@gmail.com"));
	}

}
