package com.softwaretestingo.sto012_STRINGBUFFER;
public class STO0001_0_StringBufferAppendEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: StringBuffer append() method Example
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Software");
		// appends a string in the previously defined string.
		str.append("Testingo"); 
		System.out.println("After Append the Value: "+str);
	}
}