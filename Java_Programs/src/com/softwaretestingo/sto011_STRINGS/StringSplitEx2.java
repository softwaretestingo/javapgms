package com.softwaretestingo.sto011_STRINGS;
public class StringSplitEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: If you Split a String With null then you will get NullPointerException
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Welcome to SoftwareTestingo Blog";
		String arr[]=str.split(null);
		for (String a : arr)
			System.out.println(a);
	}
}
