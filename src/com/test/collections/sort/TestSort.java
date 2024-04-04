package com.test.collections.sort;

import java.util.ArrayList;
import java.util.Collections;

import com.test.collections.Student;

public class TestSort {

	/**
	 * Declare ArrayList Object
	 */
	private ArrayList<Student> listStudents;

	public TestSort() {

		/**
		 * Initialize ArrayList object
		 */
		listStudents = new ArrayList<Student>();

		/**
		 * Add dummy Students object to ArrayList
		 */
		listStudents.add(new Student("Vijay", "10th", 21, 16));
		listStudents.add(new Student("Ajay", "4th", 19, 15));
		listStudents.add(new Student("Jai", "5th", 22, 18));
		listStudents.add(new Student("Nayanesh", "12th", 1, 25));
		listStudents.add(new Student("Rahul", "9th", 3, 12));
		listStudents.add(new Student("Saurabh", "11th", 2, 13));

	}

	public static void main(String[] args) {
		
		TestSort testSort = new TestSort();
		 
		testSort.testComparable();
		
		testSort.testCompartor();

	}

	private void testComparable() {

		System.out.println("Sort using Comparable Interface");

		Collections.sort(listStudents);

		for (Student stud : listStudents) {

			System.out.println(stud);
		}

	}

	private void testCompartor() {

		System.out.println("-----------------------------------");

		System.out.println("Sorting by Name");

		Collections.sort(listStudents, new NameComparator());

		for (Student stud : listStudents) {

			System.out.println(stud);
		}

		System.out.println("-----------------------------------");

		System.out.println("Sorting by Age");

		Collections.sort(listStudents, new AgeComparator());

		for (Student stud : listStudents) {

			System.out.println(stud);
		}

	}

}
