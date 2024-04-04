package com.test.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HandleExceptionTest {

	public HandleExceptionTest() {

	}

	public static void main(String[] args) {

		checkedException("abc");

		uncheckedException();
		

	}

	private static void uncheckedException() {

		try {
			readFile("D://test");
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
		// optional parent exception
		catch (Exception e) {

			e.printStackTrace();
		}

	}

	private static void readFile(String inputPath) throws FileNotFoundException, IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {

			in = new FileInputStream(inputPath);
			out = new FileOutputStream("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

	private static void checkedException(String s ) {


		try {

			char c = s.charAt(5);

			System.out.println("Chaeracter is  " + c);

		} catch (Exception exception) {

			System.err.println(exception.getMessage());
			exception.printStackTrace();

		} finally {

			System.out.println("I'm always executed");

		}
	}

}
