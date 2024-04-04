package com.test.oops;

/**
 * Abstract class - Contains abstract as well as non-abstract methods
 * 
 * @author nayanesh
 *
 */
public abstract class Employee {

	/** name of the employee */
	protected String name;

	protected String designation;

	protected double salary;

	/**
	 * final - Constant - can't be changed
	 * 
	 * This constant is object (instance) level constant. Value can't be changed
	 * for this particular object. But it will have different value for other
	 * objects.
	 */
	protected final long empID;

	public static int count;

	// -----------------------------------------------------------------------------------------------
	// Constructor Overloading - Multiple constructors with different no of
	// parameters
	// -----------------------------------------------------------------------------------------------

	/**
	 * Constructor - 1
	 */
	public Employee() {
		/*
		 * Initializing final variable is mandatory so that it won't be changed
		 * by any mean in future using reference of this object
		 */
		this.empID = 0;

		count = count + 1;

		System.out.println("Count: " + count);
	}

	/**
	 * Constructor - 2
	 * 
	 * @param empID
	 */
	public Employee(long empID) {
		this.empID = empID;
	}

	// -------------------------------------------------------
	// Encapsulation - Getters-setters
	// -------------------------------------------------------

	protected abstract double getSalary();

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
