package com.softwaretestingo.stringbuffer;
public class StringBufferDeleteEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Delete Specific SubString from a String using delete() method
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Welcome To SoftwareTestingo");
		System.out.println("Original String: " + str);
		str.delete(8,10);
		System.out.println("After Delete String: " + str);
	}
}