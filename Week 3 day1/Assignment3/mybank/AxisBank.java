package com.java.basic.day5.assignments.mybank;

public class AxisBank extends BankInfo {
	
	
	public void deposit() {
		System.out.println("half deposit money");
	}

	public static void main(String[] args) {

		AxisBank axisBank = new AxisBank();
		axisBank.deposit();
		axisBank.fixed();
		axisBank.saving();
		
	}

}
