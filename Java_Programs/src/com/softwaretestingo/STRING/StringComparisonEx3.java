package com.softwaretestingo.STRING;
public class StringComparisonEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: String Comparison Using equals() method
	 * 
	 */
	String str1="SoftwareTestingo";
	String str2="SoftwareTestingo";
	String str3 = "Hi";
	String str4 = "user";

	//Comparison Using equals() method
	public void stringcomparison()
	{
		//return 0, because content are same.
		System.out.println(str1.compareTo(str2));

		//return greater than 0, because str1 
		//alphabetically order physically greater than str2.
		System.out.println(str1.compareTo(str3));

		//return less than 0, because str1 
		//alphabetically order  less than str2.
		System.out.println(str3.compareTo(str4));
	}
	public static void main(String[] args) 
	{
		StringComparisonEx3 obj=new StringComparisonEx3();
		obj.stringcomparison();
	}
}