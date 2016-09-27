package com.main;

public class MethodOverriding {

	public static void main(String[] args) {
		// To demonstrate Method Overriding
		
		// Creating object of the parent class
		ParentClass pc1 = new ParentClass();
		// Creating object of the child class
		ParentClass pc2 = new ChildClass();
		// Calling the method from Parent Class
		pc1.methodToOverride();
		// Calling the method from Child Class
		pc2.methodToOverride();
	}

}
