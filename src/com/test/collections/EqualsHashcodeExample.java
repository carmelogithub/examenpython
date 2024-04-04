package com.test.collections;

public class EqualsHashcodeExample {

	public EqualsHashcodeExample() {

	}

	public static void main(String[] args) {

		// testPremativeEquals(4, 5);

		Student s1 = new Student();

		Student s2;

		s2 = s1;

		testEquals();
	}

	private void testPrematives() {

		int i = 4;

		int j = 5;

		System.out.println("i= " + i + " j= " + j);
		i = j;

		System.out.println("i= " + i + " j= " + j);

		j = 10;

		System.out.println("i= " + i + " j= " + j);
	}

	private static void testPremativeEquals(int i, int j) {

		if (i == j) {

			System.out.println("i is equal to j");

		} else {

			System.out.println("i is not equals to j");
		}
	}

	private static void testEquals() {

		Student s1 = new Student();
		s1.setName("Raj");
		s1.setStandard("10TH");

		Student s2 = new Student();
		s2.setName("Raj");
		s2.setStandard("10TH");

		if (s1.equals(s2)) {

			System.out.println("Student S1 and S2 are equal");

		} else {

			System.out.println("Student S1 and S2 are not equal");

		}

	}
}
