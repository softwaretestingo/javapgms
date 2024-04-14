package com.softwaretestingo.string;
public class CharToStringEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert Char Array to String
	 * 
	 */
	public static void main(String[] args) 
	{
		// char array to string
		char[] ca = { 'a', 'b', 'c' };
		String str = String.valueOf(ca);
		System.out.println(str);
		// recommended way
		str = new String(ca);
	}
}