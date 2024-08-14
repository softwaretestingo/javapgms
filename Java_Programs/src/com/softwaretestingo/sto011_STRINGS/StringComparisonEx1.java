package com.softwaretestingo.sto011_STRINGS;
public class StringComparisonEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: String Comparison Using == Operator
	 * 
	 */
	String str1="SoftwareTestingo";
	String str2="SoftwareTestingo";
	String str3=new String("SoftwareTestingo");
	
	//Comparison Using ==
	public void stringcomparison()
	{
		System.out.println("The Value Of Str1: "+str1);
		System.out.println("The Value Of Str1: "+str2);
		System.out.println("The Value Of Str1: "+str3);
		System.out.println();
		
		
		System.out.println("Comapring str1==str2");
		System.out.println(str1==str2);
		
		System.out.println("Comparing str1==str3");
		System.out.println(str1==str3);
	}
	public static void main(String[] args) 
	{
		StringComparisonEx1 obj=new StringComparisonEx1();
		obj.stringcomparison();
	}
}