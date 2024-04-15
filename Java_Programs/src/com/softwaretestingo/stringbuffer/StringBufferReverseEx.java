package com.softwaretestingo.stringbuffer;
public class StringBufferReverseEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Reverse a String using reverse() method
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("SoftwareTestingo");
		System.out.println("Original String: " + str);
		str.reverse();
		System.out.println("Reversed String: " + str);
	}
}
