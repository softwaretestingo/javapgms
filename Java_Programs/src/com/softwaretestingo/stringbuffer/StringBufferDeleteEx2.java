package com.softwaretestingo.stringbuffer;
public class StringBufferDeleteEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Delete Specific Character Of StringBuffer using deleteCharAt()
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Welcome To SoftwareTestingo");
		System.out.println("Original String: " + str);
		str.deleteCharAt(8);
		System.out.println("After Delete Character at 8 position: " + str);
	}
}