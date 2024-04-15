package com.softwaretestingo.stringbuilder;
public class StringBuilderEx4 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: 
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuilder obj = new StringBuilder("AAAABBBCCCC");

		// using StringBuilder(String) constructor
		StringBuilder obj1= new StringBuilder(obj.toString());

		// print string
		System.out.println("Object  = "+ obj1.toString());
	}
}