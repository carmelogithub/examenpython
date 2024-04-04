package com.test.controlstructure;

public class StudyIfElseStatement {

	public static void main(String[] args) {

		// testIfStatement(24);
		//
		// testIfElseStatement(25);
		//
		// testIfElseLadderStatement(25);

//		testANDCondition(2);
//		testANDCondition(10);
//		testANDCondition(7);
		
		testNot(5);

		// 5/2 = 2*2 +1

	}

	private static void testIfStatement(double number) {

		if (number % 2 == 0) {

			System.out.println("Number is divisible by 2");

		}
	}

	private static void testIfElseStatement(double number) {

		if (number % 2 == 0) {

			System.out.println("Number is divisible by 2");

		} else {

			System.out.println("Number is something else");
		}
	}

	private static void testIfElseLadderStatement(double number) {

		/*
		 * "if" condition should result into boolean result.
		 *
		 * if(boolean){
		 * 
		 * }
		 */
		if (number % 2 == 0) {

			System.out.println("Number is divisible by  2");

		} else if (number % 5 == 0) { // if - else ladder

			System.out.println("Number is divisible by 5");

		} else {

			System.out.println("Number is something else");
		}

	}
	
	/**
	 *  true true true
	 *  true false true
	 *  false true true
	 *  false false false
	 * @param number
	 */

	private static void testORCondition(int number) {

		if (number == 2 || number == 5) {

			System.out.println("Number is 2 or 5");
		} else {

			System.out.println("Number is neither 2 nor 5");
		}

	}

	/**
	 * true true true
	 * true false false
	 * false true false
	 * false false false
	 * @param number
	 */
	private static void testANDCondition(int number) {

		if (number % 2 == 0 && number % 5 == 0) {

			System.out.println("Number is DIVISIBLE 2 AND 5");
		} else {

			System.out.println("Number is neither  divisible 2 nor by 5");
		}

	}
	
	
	private static void testNot(double number){ 
		
		if(!(number % 2==0)){
			
			System.out.println("Number is not divisible  by 2");
			
		}else{
			
			System.out.println("Number is divisible by 2");
		}
		
	}

}
