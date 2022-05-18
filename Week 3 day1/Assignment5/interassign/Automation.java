package com.java.basic.day5.assignments.interassign;

public class Automation implements Language,TestTool {

	 
	
	public static void main(String[] args) {
		Automation tool = new Automation();
		tool.Java();
		//tool.Selenium();
				
}

	@Override
	public void Selenium() {
		System.out.println("Version 8.11");
		
	}

	@Override
	public void Java() {
		this.Selenium();
		
		System.out.println("java 8");
		
	}


	
	
}