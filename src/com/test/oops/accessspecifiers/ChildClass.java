package com.test.oops.accessspecifiers;

public class ChildClass extends PublicClass {

	public ChildClass() {

		ProtectedClass protectedClass = new ProtectedClass();

		// --- Not accessible because of private access specifier
		// PrivateClass protectedClass = new PrivateClass();

	}

}
