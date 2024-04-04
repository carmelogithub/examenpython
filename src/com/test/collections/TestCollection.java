package com.test.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestCollection {

	int[] arr = new int[10];

	int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public TestCollection() {

	}

	public static void main(String[] args) {

		TestCollection t = new TestCollection();
		t.iterateArray();

		iterateArrayListExample();

		testHashset();

	}

	private void iterateArray() {

		// --- conventional for loop
		for (int i = 0; i < arr2.length; i++) {

			System.out.println("i= " + i);
		}

		// --- for each loop
		for (int i : arr2) {

			System.out.println("i= " + i);
		}
	}

	private static void iterateArrayListExample() {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		for (String obj : al) {
			System.out.println(obj);
		}
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Ravi");
		
		
	}

	private static void testHashset() {

		Student s1 = new Student();
		s1.setName("Raj");
		s1.setStandard("10TH");

		Student s2 = new Student();
		s2.setName("Raj");
		s2.setStandard("10TH");

		HashSet<Student> h = new HashSet<Student>();
		
		LinkedHashSet<Student> lh = new LinkedHashSet<>();

		if (h.add(s1)) {

			System.out.println("s1 added");

		} else {

			System.out.println("s1 Not added");
		}

		if (h.add(s2)) {

			System.out.println("s2 added");

		} else {

			System.out.println("s2 Not added");
		}
	}

}
