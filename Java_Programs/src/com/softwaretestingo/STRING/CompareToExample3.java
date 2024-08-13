package com.softwaretestingo.STRING;
public class CompareToExample3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Compare Two Strings Using compareTo() Method
	 * 
	 */
	public static void main(String[] args) 
	{
		// Initializing Strings
        String str1 = "Software";
        String str2 = "Software";
        String str3 = "Testingo";
  
        // Checking str1 string with str2 string
        System.out.println("Difference is : "+ str1.compareTo(str2));
  
        // Checking str1 string with str3 string
        System.out.print("Difference is : "+str1.compareTo(str3));
	}
} 