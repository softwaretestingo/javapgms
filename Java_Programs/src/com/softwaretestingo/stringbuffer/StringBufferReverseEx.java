package com.softwaretestingo.stringbuffer;
public class StringBufferReverseEx 
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("SoftwareTestingo");
		System.out.println("Original String: " + str);
		str.reverse();
		System.out.println("Reversed String: " + str);
	}
}
