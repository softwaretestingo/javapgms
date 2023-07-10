package com.softwaretestingo.stringbuffer;

public class StringBufferCapacityEx 
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("SoftwareTestingo");
		int len=str.capacity();
		System.out.println("The Capacity Of String Buffer Object: "+len);
	}
}