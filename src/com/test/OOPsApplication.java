package com.test;

import com.test.oops.Lambo;
import com.test.oops.manager.HRManager;
import com.test.oops.programmer.JAVAProgrammer;
import com.test.teststatic.MyMath;

public class OOPsApplication {

	public OOPsApplication() {

	}

	public static void main(String[] args) {

		HRManager hrm = new HRManager();

		JAVAProgrammer programmer = new JAVAProgrammer();
		
		programmer.setName("John");
		
		programmer.getName();

		hrm.addTeamMember(programmer);

		hrm.printDetails();

		hrm.giveReport();

		//
		// Employee e = new JAVAProgrammer();
		//
		// Employee e2 = new HRManager();

		Lambo l = new Lambo();

		l.drive();

		l.openDoor();

		// count no of employees using static variable count
		for (int i = 0; i < 10; i++) {

			new JAVAProgrammer();
		}
		
		

	}

}
