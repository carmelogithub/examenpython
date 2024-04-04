package com.test.controlstructure;

public class StudyForLoop {

	public static void main(String[] args) {

		nestedFOR();

	}

	private static void tetFORCase1() {

		int i = 0;

		for (/* dummy */; i < 10;/* dummy */) {

			System.out.println("Print " + i);

			i++;
		}

	}

	private static void tetFORCase2() {

		for (int i = 0; i < 10;/* dummy */) {

			System.out.println("Print " + i);

			i++;
		}

	}

	private static void tetFORCase3() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Print " + i);

		}

	}

	private static void nestedFOR() {

		for (int i = 10; i > 0; i--) {

			System.out.println("Print i= " + i);

			for (int j = 0; j < i; j++) {

				System.out.println("Print j= " + j);
			}

			System.out.println("__________________________");

		}
	}

}
