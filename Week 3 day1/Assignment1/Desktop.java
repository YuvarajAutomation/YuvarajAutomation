package com.java.basic.day5.assignments.org.system;

import com.java.basic.day5.assignments.org.system.Computer;

public class Desktop extends Computer {

	void desktopsize() {
		System.out.println("15");
	}

	public static void main(String[] args) {
		Desktop comp = new Desktop();
		comp.computerModel();
		comp.desktopsize();

	}

}
