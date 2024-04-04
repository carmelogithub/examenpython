package com.test.teststatic;

public class TestMath extends MyMath {

	public TestMath() {

	}

	// ----------------------------------------------
	// Static method can not be overridden
	// ----------------------------------------------

	public static int add(int x, int y) {

		return 0;
	}

	public int add(int a, int b, int c, int d) {

		return a + b;
	}

	public static void main(String[] args) {

	}

}
