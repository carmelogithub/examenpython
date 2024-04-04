package com.test;

import com.test.teststatic.MyMath;

public class TestStatic {

	public TestStatic() {

	}

	public static void main(String[] args) {

		// -------------------------------------------------------
		// Calling static methods - Instances are not required
		// -------------------------------------------------------

		double result = MyMath.add(MyMath.PI, 3.0);

		System.out.println("result: " + result);

		double result2 = MyMath.add(2.5f, 3.5);

		System.out.println("result 2: " + result2);

		// -------------------------------------------------------
		// Calling instance method on objects (instances)
		// -------------------------------------------------------

		MyMath math1 = new MyMath();

		MyMath math2 = new MyMath();

		math1.test();

		math2.test();
	}

}
