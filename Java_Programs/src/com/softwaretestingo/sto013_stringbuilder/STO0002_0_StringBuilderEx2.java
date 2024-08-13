package com.softwaretestingo.sto013_stringbuilder;
public class STO0002_0_StringBuilderEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Capacity() of StringBuilder
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuilder obj = new StringBuilder(10);

		// print string
		System.out.println("Object capacity = "+ obj.capacity());
	}
}