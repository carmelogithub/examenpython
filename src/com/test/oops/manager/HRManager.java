package com.test.oops.manager;

import com.test.oops.Employee;
import com.test.oops.Manager;

public class HRManager extends Manager {

	private Employee emp;

	public HRManager() {

	}

	public void printDetails() {

		System.out.println("Name: " + emp.getName() + " Rating: " + evaluateTeamMember());
	}

	@Override
	public void addTeamMember(Employee emp) {

		this.emp = emp;

		System.out.println("addTeamMember " + emp.getName());

	}

	@Override
	protected double getSalary() {

		return 0;
	}

	@Override
	public void giveReport() {
		super.giveReport();

	}
}
