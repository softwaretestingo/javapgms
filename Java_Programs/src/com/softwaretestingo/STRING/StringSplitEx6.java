package com.softwaretestingo.STRING;
public class StringSplitEx6 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split String with Multiple Escape Sequence Character
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Learn.Welcome to SoftwareTestingo Blog";
		String arr[]=str.split("\\.|\\s");
		for (String a : arr)
			System.out.println(a);
	}
}