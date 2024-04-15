package com.softwaretestingo.string;
import java.util.Arrays;
public class StringToCharExample6 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Get Substring From a String using getChars() Method
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="Welcome to Softwaretestingo Blog";  

		//Destination Array Size is 16
		char[] substringChars = new char[16];

		//We are copied from 11-27 and store in Destination array from index 0 
		str.getChars(11, 27, substringChars, 0);
		System.out.println(Arrays.toString(substringChars)); 
	}
}