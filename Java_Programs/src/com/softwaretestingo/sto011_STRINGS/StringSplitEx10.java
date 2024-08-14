package com.softwaretestingo.sto011_STRINGS;
public class StringSplitEx10 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split the String based on the Space
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Hi User Welcome    to    SoftwareTestingo Blog    ";
		String arr[]=str.split(" ");
		System.out.println("The Total Number of Words Is: "+arr.length);
		for (String a : arr)
			if(!a.isEmpty())
			{
				System.out.println(a);
			}
	}
}