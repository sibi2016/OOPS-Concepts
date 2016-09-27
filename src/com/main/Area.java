package com.main;

public class Area extends Shape {
	
	// Assuming the shape to be rectangle.
	// Calculating the area and perimeter.
	
	int width;
	int length;
	
	public void setSides(int width, int length)
	{
		this.width = width;
		this.length = length;
	}
	public int calcArea()
	{
		int area = width*length;
		return area;
	}
	public int calcPerimeter()
	{
		int peri = 2*(width+length);
		return peri;
	}
}
