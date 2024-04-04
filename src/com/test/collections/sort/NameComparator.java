package com.test.collections.sort;

import java.util.Comparator;

import com.test.collections.Student;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		/**
		 * as we are comparing string, String class already implements
		 * Comparable interface and hence the same compareTo can be used for
		 * comparison
		 */

		return s1.getName().compareTo(s2.getName());
	}

}