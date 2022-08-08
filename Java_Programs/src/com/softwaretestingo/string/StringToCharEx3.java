package com.softwaretestingo.string;
public class StringToCharEx3 
{
	public static void main(String[] args) 
	{
		String str = "SoftwareTestingo";

		//Copy string characters to char array
		char[] chars = new char[8];
		str.getChars(0, 8, chars, 0);
		System.out.println(chars);
	}
}