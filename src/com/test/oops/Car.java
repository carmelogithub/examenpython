package com.test.oops;

public abstract class Car {

	protected int wheels;

	protected String color;

	protected String brand;

	/**
	 * Default Constructor
	 */
	public Car() {

	}

	/**
	 * Parameterized constructor - Constructor Overloading
	 * 
	 * @param wheels
	 * @param color
	 * @param brand
	 */
	public Car(int wheels, String color, String brand) {
		super();
		this.wheels = wheels;
		this.color = color;
		this.brand = brand;
	}

	/**
	 * abstract method
	 */
	public abstract void drive();

	/**
	 * non-abstract method
	 */
	public void openDoor() {

		//old program
	}

}
