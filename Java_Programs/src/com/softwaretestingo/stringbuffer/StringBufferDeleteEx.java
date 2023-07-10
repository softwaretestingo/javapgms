package com.softwaretestingo.stringbuffer;
public class StringBufferDeleteEx 
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Welcome To SoftwareTestingo");
		System.out.println("Original String: " + str);
		str.delete(8,10);
		System.out.println("After Delete String: " + str);
	}
}