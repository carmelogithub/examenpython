package com.test.oops;

public abstract class Manager extends Employee {

	protected int teamSize;

	private int rating;

	public Manager() {

	}

	protected abstract void addTeamMember(Employee e);

	public void giveReport() {

	}

	/**
	 * final method - can't be overridden in child class. But it can be used.
	 */
	protected final int evaluateTeamMember() {

		return rating;
	}

}
