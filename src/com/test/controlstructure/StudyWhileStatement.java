package com.test.controlstructure;

public class StudyWhileStatement {

	public static void main(String[] args) {

		
		testWhile();
		
		testDoWhile();

		// testIndefiniteWhile();

	}

	private static void testWhile() {

		int i = 0;

		while (i < 0) {

			System.out.println("testWhile Print " + i);

			i++;
		}
	}

	private static void testIndefiniteWhile() {

		while (true) {

			System.out.println("Print ");

		}
	}

	private static void testDoWhile() {

		int i = 0;

		do {

			System.out.println("testDoWhile Print i " + i);

			i++;

		} while (i < 10);
	}

}
