package com.softwaretestingo.sto011_STRINGS;
import java.util.Arrays;
public class StringToCharExample2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert String to Char Array
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Softwaretestingo";  
		
		// create an array of characters 
		char[] strArray = str.toCharArray();

		// print vowelArray
		System.out.println(Arrays.toString(strArray));
	}
}