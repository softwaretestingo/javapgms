package com.softwaretestingo.sto013_stringbuilder;
public class STO0005_0_StringBuilderEx6 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Add New String into Existing String Using append() method
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuilder first = new StringBuilder("Software");
		first.append("Testingo");
		System.out.println("After Append: "+first);

		first.append(111);
		System.out.println("After Adding Different Datatype: "+first);
	}
}