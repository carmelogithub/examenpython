package com.test.oops.programmer;

import com.test.oops.Employee;

/**
 * extends -> is-a relationship
 * 
 * @author nayaneshg
 *
 */
public class JAVAProgrammer extends Employee {

	private String javaProgram;

	public JAVAProgrammer() {
		// TODO Auto-generated constructor stub

		name = "Nayanesh";
	}

	@Override
	protected double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
