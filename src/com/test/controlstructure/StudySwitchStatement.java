package com.test.controlstructure;

public class StudySwitchStatement {

	public static void main(String[] args) {

		testSwitch(2);

		testSwitch(5);

		testSwitch(7);

		testSwitchWithoutBreak(2);
		testSwitchWithoutBreak(5);
		testSwitchWithoutBreak(7);

	}

	private static void testSwitch(int number) {

		switch (number) {

		case 5: {

			System.out.println("Number is 5 :" + number);

			break;
		}

		case 2: {

			System.out.println("Number is 2 :" + number);

			break;
		}
		default: {

			System.out.println("Number is neither 2 nor 5 :" + number);

			break;
		}

		}

	}

	private static void testSwitchWithoutBreak(int number) {

		switch (number) {

		case 2:
		case 5:

			System.out.println("Number is either 2 or 5 :" + number);

			break;

		default:

			System.out.println("Number is neither 2 nor 5 : " + number);

			break;

		}

	}

}
