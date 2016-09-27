package com.main;

public class Main {

	public static void main(String[] args) {
		// To call the abstract class
		
		Shape s = new Area();
		s.setSides(20,36);
		System.out.println("Area of the rectangle is :" + s.calcArea());
		System.out.println("Area of the rectangle is :" + s.calcPerimeter());
		
	}
}
