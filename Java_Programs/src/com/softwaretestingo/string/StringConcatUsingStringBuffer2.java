package com.softwaretestingo.string;
public class StringConcatUsingStringBuffer2 
{
	public static void main(String[] args) 
	{
		String s1 = "Welcome to SoftwareTestingo on: ";
		Integer s2 = 2023;

		// create StringBuffer Instance
		StringBuffer newstring=new StringBuffer();

		// using append method to concatenate strings
		StringBuffer concatenate=newstring.append(s1).append(s2);

		// printing
		System.out.println("The String s1 Value: "+s1);
		System.out.println("The String s2 Value: "+s2);
		System.out.println("After Concate: "+concatenate);
	}
}