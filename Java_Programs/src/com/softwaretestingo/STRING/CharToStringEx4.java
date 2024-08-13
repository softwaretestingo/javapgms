package com.softwaretestingo.STRING;
public class CharToStringEx4 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert CharArray to String Using copyValueOf()
	 * 
	 */
	public static void main(String[] args) 
	{
		char[] charArray = { 'S', 'o', 'f', 't', 'w', 'a', 'r', 'e'};

		String str = String.copyValueOf(charArray);
		System.out.println(str);
	}
}