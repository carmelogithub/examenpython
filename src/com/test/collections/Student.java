package com.test.collections;

/**
 * Comparable interface
 * 
 * Comparable interface is used to order the objects of user-defined class.This
 * interface is found in java.lang package and contains only one method named
 * compareTo(Object).
 * 
 * It provide only single sorting sequence i.e. you can sort the elements on
 * based on single datamember only.For instance it may be either rollno,name,age
 * or anything else.
 * 
 * 
 * @author Nayanesh Gupte
 *
 */
public class Student implements Comparable<Student> {

	private String name;

	private String standard;

	private int rollNo;

	private int age;

	public Student() {

	}

	/**
	 * 
	 * @param name
	 * @param standard
	 * @param rollNo
	 * @param age
	 */
	public Student(String name, String standard, int rollNo, int age) {
		super();
		this.name = name;
		this.standard = standard;
		this.rollNo = rollNo;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ----------------------------------------------------------------
	// Override Equals and Hashcode both - equals and hashcode has contract so
	// it is compulsory to override both methods, when Object Comparison is to
	// be done using equals method
	// ----------------------------------------------------------------

	/*
	 * equals method needs to be overridden to compare two objects on certain
	 * parameters.
	 * 
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	@Override
	public boolean equals(Object obj) {

		Student s = (Student) obj;

		if (this.name.equals(s.name) && this.standard.equals(s.standard)) {

			return true;
		}

		return false;
	}

	/*
	 * hashcode needs to be overridden to make sure identifier for memory
	 * location is also taken care of (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {

		int hash = 0;

		hash = name.hashCode();

		hash = hash + standard.hashCode();

		return hash;
	}

	// ----------------------------------------------------------------
	// To print readable value of object
	// ----------------------------------------------------------------

	@Override
	public String toString() {
		return "Student [name=" + name + ", standard=" + standard + ", rollNo=" + rollNo + ", age=" + age + "]";
	}

	// ----------------------------------------------------------------
	// Override and apply logic comparable interface
	// ----------------------------------------------------------------

	@Override
	public int compareTo(Student st) {

		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else {
			return -1;
		}
	}

}
