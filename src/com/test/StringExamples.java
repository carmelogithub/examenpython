package com.test;

public class StringExamples {

	String s1 = "abc,defghijkl,mnopqrst,uvwxyz";

	public StringExamples() {

		// --- substring

		String s2 = s1.substring(12, 14);

		System.out.println(s2);

		// --- trim

		String s3 = s1.trim();

		System.out.println(s3);

		// ----replace

		 s1 = s1.replace(",", ";");

		System.out.println(s1);

		String s5 = "abc";
		String s6 = "ABC";

		String s7 = s5 + s6;

		String s8 = "abc" + "pqr" + (7 + 8);

		System.out.println(s8);

		System.out.println(s1.length());

		String[] arr = s1.split(",");

		System.out.println(arr.length);

		for (String s : arr) {

			System.out.println(s);

		}
		
		
		if(s5.equals(s6)){
			
			
		}
		
		
		if(s5.equalsIgnoreCase(s6)){
			
		}else{
			
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringExamples se = new StringExamples();
		
		
		
	}

}
