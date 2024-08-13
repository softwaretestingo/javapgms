package com.softwaretestingo.STRING;
public class StringSplitEx9 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split the String into Nth Parts
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Welcome@to@SoftwareTestingo@Blog ";
		String arr[]=str.split("@", 3);
		for (String a : arr)
			System.out.println(a);
	}
}