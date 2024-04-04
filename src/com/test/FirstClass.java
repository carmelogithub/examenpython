package com.test;

import com.test.collections.Student;
import com.test.oops.Lambo;
import com.test.teststatic.MyMath;

public class FirstClass {

	private short smallNumber;

	private int count;

	public long number;

	boolean isCorrect = false;

	float small = 3.14f;

	double big = 123456789.345;

	String description = " Hi, this is my first class";

	final double pi = 3.1428;

	// constructor
	public FirstClass() {

	}

	// constructor
	public FirstClass(int abc) {

	}

	private void drive() {

	}

	void print(String content) {

	}

	int add(int a, int b) {

		return a + b;
	}

	public static void main(String[] args) {

		System.out.println("Main Method");

		FirstClass f = new FirstClass();

		FirstClass f2 = new FirstClass();
		
		FirstClass f3 = new FirstClass(123);

		Student s = new Student();
		s.getAge();

		f.big = 123;

		f2.big = 456;

		int result = f.add(2, 3);

		f.print("Nayanesh");

		System.out.println("Result: " + result);

		int r = MyMath.add(2, 3);
		
		Lambo l = new Lambo();
		l.openDoor();

	}

}
