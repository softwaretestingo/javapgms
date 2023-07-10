package com.softwaretestingo.stringbuffer;
public class StringBufferInsertEx
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Welcome");
		System.out.println(str);

		str.insert(7, " to ");
		System.out.println(str);

		str.insert(10, " SoftwareTestingo ");
		System.out.println(str);
	}
}