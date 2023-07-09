package com.softwaretestingo.string;
public class StringConcatUsingStringBuffer 
{
	public static void main(String[] args) 
	{
		String s1 = "Welcome";
		String s2 = "Java";

		// create StringBuffer Instance
		StringBuffer newstring=new StringBuffer();

		// using append method to concatenate strings
		StringBuffer concatenate=newstring.append(s1).append(s2);

		// printing
		System.out.println("The String s1 Value:"+s1);
		System.out.println("The String s1 Value:"+s2);
		System.out.println("After Concate: "+concatenate);
	}
}