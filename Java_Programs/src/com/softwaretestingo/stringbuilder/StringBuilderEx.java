package com.softwaretestingo.stringbuilder;
public class StringBuilderEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Use Of insert() method in StringBuilder
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuilder obj = new StringBuilder("Software Blog");
		obj.insert(8, "Testingo");

		System.out.println(obj);
	}
}