package com.test.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * Java Map Interface
 * 
 * A map contains values based on the key i.e. key and value pair.Each pair is
 * known as an entry.Map contains only unique elements.
 * 
 * ----------------------------Entry---------------------------------
 * 
 * Entry is the subinterface of Map. So we will be accessed it by Map.Entry
 * name. It provides methods to get key and value.
 * 
 * Methods of Entry interface:
 * 
 * public Object getKey(): is used to obtain key.
 * 
 * public Object getValue():is used to obtain value.
 * 
 * @author Nayanesh Gupte
 *
 */
public class HashMapExample {

	public HashMapExample() {

	}

	public static void main(String[] args) {

		iterateHashMap();

		iterateLinkedHashMap();
	}

	private static void iterateHashMap() {

		System.out.println("Iterrate LinkedHashMap");

		Map<Integer, Student> mapStudent = new LinkedHashMap<Integer, Student>();

		mapStudent.put(100, new Student("abc", "10th", 10, 15));
		mapStudent.put(200, new Student("def", "10th", 10, 15));
		mapStudent.put(300, new Student("ghi", "10th", 10, 15));
		mapStudent.put(400, new Student("jkl", "10th", 10, 15));
		mapStudent.put(500, new Student("mno", "10th", 10, 15));

		for (Entry<Integer, Student> e : mapStudent.entrySet()) {

			System.out.println("Key: " + e.getKey() + "  Value: " + e.getValue());

		}

		System.out.println(mapStudent.get(200));

		System.out.println("-------------------------------------------------");

	}

	private static void iterateLinkedHashMap() {

		System.out.println("Iterrate HashMap");

		Map<Integer, Student> mapStudent = new HashMap<Integer, Student>();

		mapStudent.put(100, new Student("abc", "10th", 10, 15));
		mapStudent.put(200, new Student("def", "10th", 10, 15));
		mapStudent.put(300, new Student("ghi", "10th", 10, 15));
		mapStudent.put(400, new Student("jkl", "10th", 10, 15));
		mapStudent.put(500, new Student("mno", "10th", 10, 15));

		for (Entry<Integer, Student> e : mapStudent.entrySet()) {

			System.out.println("Key: " + e.getKey() + "  Value: " + e.getValue());

		}

		System.out.println(mapStudent.get(200));

		System.out.println("-------------------------------------------------");

	}

}
