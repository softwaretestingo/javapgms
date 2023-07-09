package com.softwaretestingo.string;
public class CompareToExample2 
{
	public static void main(String[] args) 
	{
		// Initializing Strings
		String str1 = "Software";
		String str2 = new String("Software");
		String str3 = new String("Testingo");

		// Checking str1 string with str2 object
		System.out.println("Difference is : "+ str1.compareTo(str2));

		// Checking str1 string with str3 object
		System.out.print("Difference is : "+str1.compareTo(str3));
	}
} 