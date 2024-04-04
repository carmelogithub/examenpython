package com.test.oops;

/**
 * Interface are 100% abstract.
 * 
 * This class talks about functional behavior and not properties like abstract
 * class.
 * 
 * @author nayanesh
 *
 */
public interface Racing {

	/**
	 * by default Constant - public static final
	 */
	int MAX_POWER = 12000;

	/**
	 * methods in interfaces are by default abstract method
	 */
	void race();

	void powerBoost();

}
