package com.test.oops;

/**
 * Non- abstract (concrete class) "using" abstract class and interface to
 * demonstrate abstraction and inheritance
 * 
 * @author nayaneshg
 *
 */
public class Lambo extends Car implements Racing {

	/**
	 * This is Constructor
	 */
	public Lambo() {

	}
	// ------------------------------------------------
	// implementations of abstract methods from racing interface
	// ------------------------------------------------

	@Override
	public void race() {

	}

	@Override
	public void powerBoost() {

	}

	// ------------------------------------------------
	// implementations of abstract methods from Car class
	// ------------------------------------------------

	/**
	 * This is abstract method in class Car , so it will be forced to implement
	 * by JAVA
	 */
	@Override
	public void drive() {

	}

	// ------------------------------------------------
	// implementations of non-abstract methods from Car class
	// ------------------------------------------------

	/**
	 * Polymorphism - (Poly - Many, Morph - form) - Method Overriding
	 * 
	 * openDoor exist at "many" places in different "forms"
	 * 
	 * This method is non-abstract in class Car but overridden to add an
	 * additional functionality to open door mechanism for Lambo class
	 */
	@Override
	public void openDoor() {
		// existing functionality from class car
		super.openDoor();
		/*
		 * new addition to open door functionality. This will be executed after
		 * super.opendoor is executed
		 */
	}
}
