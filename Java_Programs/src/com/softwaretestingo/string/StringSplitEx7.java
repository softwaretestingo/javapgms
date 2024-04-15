package com.softwaretestingo.string;
public class StringSplitEx7 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split the String when multiple space are present
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Hi User Welcome    to    SoftwareTestingo Blog    ";
		String arr[]=str.split("\\s+");
		System.out.println("The Total Number of Words Is: "+arr.length);
		for (String a : arr)
			System.out.println(a);
	}
}