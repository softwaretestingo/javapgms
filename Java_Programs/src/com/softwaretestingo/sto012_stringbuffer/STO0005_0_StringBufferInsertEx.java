package com.softwaretestingo.sto012_stringbuffer;
public class STO0005_0_StringBufferInsertEx
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Adding New String into String using insert() method
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Welcome");
		System.out.println(str);

		str.insert(7, " to ");
		System.out.println(str);

		str.insert(10, " SoftwareTestingo ");
		System.out.println(str);
	}
}