package com.softwaretestingo.string;
public class StringSplitEx8 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split the String with Specific String
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Welcome to SoftwareTestingo Blog";
		String arr[]=str.split("to");
		for (String a : arr)
			System.out.println(a);
	}
}