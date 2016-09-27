package com.main;

public class MethodOverLoading {
	
	public void printMessage()
	{
		System.out.println("To demonstrate method overloading without any parameters");
	}
	public void printMessage(String str)
	{
		System.out.println("To demonstrate method overloading with one string parameter");
		System.out.println("Parameter string is : "+ str);
	}
	public void printMessage(String str1, String str2)
	{
		System.out.println("To demonstrate method overloading with two string parameters");
		System.out.println("Parameter Strings are :" +str1+" and "+str2);
	}

	public static void main(String[] args){
		MethodOverLoading mo = new MethodOverLoading();
		mo.printMessage();
		mo.printMessage("Hello");
		mo.printMessage("Hello", "Hiii");
	}
}
