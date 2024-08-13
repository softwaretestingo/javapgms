package com.softwaretestingo.STRING;
public class StringToCharExample5 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Get Specific Character From a String using toCharArray()
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Softwaretestingo";  
		
		char strChar = str.toCharArray()[0];
		System.out.println("1st character is: "+strChar);  
	}
}