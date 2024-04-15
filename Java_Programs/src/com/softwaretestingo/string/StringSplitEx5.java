package com.softwaretestingo.string;
public class StringSplitEx5 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split the String with the Help of Escape Sequence
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Welcome to SoftwareTestingo Blog";
		String arr[]=str.split("\\s");
		for (String a : arr)
			System.out.println(a);
	}
}