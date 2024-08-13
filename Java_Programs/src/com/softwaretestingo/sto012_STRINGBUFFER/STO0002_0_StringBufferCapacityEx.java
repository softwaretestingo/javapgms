package com.softwaretestingo.sto012_STRINGBUFFER;
public class STO0002_0_StringBufferCapacityEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Capacity of StringBuffer using capacity() method
	 * 
	 */
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("SoftwareTestingo");
		int len=str.capacity();
		System.out.println("The Capacity Of String Buffer Object: "+len);
	}
}