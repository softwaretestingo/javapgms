package com.softwaretestingo.sto012_STRINGBUFFER;
public class STO0006_0_StringBufferLengthEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Length of a StringBuffer using length() method
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("SoftwareTestingo");
		int len=str.length();
		System.out.println("The Length Of StringBuffer Object: "+len);
	}
}