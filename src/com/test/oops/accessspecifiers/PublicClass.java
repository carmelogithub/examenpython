package com.test.oops.accessspecifiers;

/**
 * This class is accessible from any class
 * 
 * @author Nayanesh Gupte
 *
 */
public class PublicClass {

	public PublicClass() {

		DefaultClass defaultClass = new DefaultClass();
	}

	/**
	 * Will be accessible in child class
	 * 
	 * @return
	 */
	protected int pocketMoney() {

		return 0;
	}

	/**
	 * Will not be accessible in child class
	 * 
	 * @return
	 */
	private void salary() {

	}

	protected class ProtectedClass {

		public ProtectedClass() {

		}

	}

	private class PrivateClass {

		public PrivateClass() {

		}
	}

}
