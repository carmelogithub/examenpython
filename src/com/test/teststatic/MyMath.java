package com.test.teststatic;

public class MyMath {

	/**
	 * Global variable
	 */
	static int count;

	/**
	 * Constant
	 * 
	 * public - Can be accessed from any class
	 * 
	 * static - class level , can be accessed even without creating an object of
	 * class MyMath.
	 * 
	 * final - to make sure value will not be changed.
	 */
	public static final double PI = 3.1428;

	/**
	 * Static block - executes even before constructor but only once and before
	 * first object
	 */
	static {

		System.out.println("static block");

	}

	{

	}

	/**
	 * Default Constructor
	 */
	public MyMath() {

		count++;

	}

	// -------------------------------------------------------
	// Method Overloading with instance method
	// -------------------------------------------------------
	/**
	 * Instance Method
	 */
	public void test() {

		/**
		 * local variable
		 */
		int i;

		i = count++;

		System.out.println("print i= " + i);
	}

	/**
	 * Instance Method
	 */
	public void test(int i) {

		i = count++;

		System.out.println("print i= " + i);
	}

	// -------------------------------------------------------
	// Method Overloading with static method
	// -------------------------------------------------------

	/*
	 * Polymorphism - Method Overloading:
	 * 
	 * "No." of parameters are different or "Type" of parameters are different
	 */
	/**
	 * "add" method with "4" "int" parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return
	 */
	public int add(int a, int b, int c, int d) {

		return a + b + c + d;
	}

	/**
	 * "add" method with "2" "int" parameters
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int add(int a, int b) {

		return a + b;
	}

	/**
	 * "add" method with "3" "int" parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int add(int a, int b, int c) {

		return a + b + c;
	}

	/**
	 * "add" method with "2" "float" parameters
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static float add(float a, float b) {

		return a + b;
	}

	/**
	 * "add" method with "2" "double" parameters
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double add(double a, double b) {

		return a + b;
	}

}
