package com.softwaretestingo.string;
public class StringSplitEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split a string with the split() method and print the values
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Welcome to SoftwareTestingo Blog";
		String arr[]=str.split(" ");
		for (String a : arr)
			System.out.println(a);
	}
}