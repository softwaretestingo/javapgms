package com.softwaretestingo.stringbuilder;
public class StringBuilderEx5 
{
	public static void main(String[] args) 
	{
		StringBuilder obj = new StringBuilder("AAAABBBCCCC");

		// using StringBuilder(String) constructor
		StringBuilder obj1= new StringBuilder(obj.toString());

		// print string
		System.out.println("Object 1 = "+ obj1.toString());
	}
}