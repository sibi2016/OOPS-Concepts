package com.main;

public class Cicle implements ShapeConstants {
	
	// Implementing the methods of Parent
	public double radius;
	
	public void circle(double radius)
	{
		this.radius = radius;
		
	}
	
	public void circleArea()
	{
		double area = pi*radius*radius;
		System.out.println("Area of the circle :"+area);
	}
	public void circlePerimeter()
	{
		double circum = 2*pi*radius;
		System.out.println("Area of the circle :"+circum);
	}
	
	public static void main(String[] args){
		
		ShapeConstants sc = new Cicle();
		sc.circle(5.6);
		sc.circleArea();
		sc.circlePerimeter();
		
	}
	
}
