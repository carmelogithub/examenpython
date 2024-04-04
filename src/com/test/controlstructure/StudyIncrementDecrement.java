package com.test.controlstructure;

public class StudyIncrementDecrement {

	public static void main(String[] args) {

		int i = 0;

		System.out.println("i++ " + (i++));

		System.out.println("i " + i);

		System.out.println("++i " + (++i));

		System.out.println("i " + i);

		System.out.println("i-- " + (i--));

		System.out.println("i " + i);

		System.out.println("--i " + (--i));

		System.out.println(++i - (--i) + i);

	}

}
