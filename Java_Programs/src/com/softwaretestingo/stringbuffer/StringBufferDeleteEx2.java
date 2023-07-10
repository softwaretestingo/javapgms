package com.softwaretestingo.stringbuffer;
public class StringBufferDeleteEx2 
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Welcome To SoftwareTestingo");
		System.out.println("Original String: " + str);
		str.deleteCharAt(8);
		System.out.println("After Delete Character at 8 position: " + str);
	}
}