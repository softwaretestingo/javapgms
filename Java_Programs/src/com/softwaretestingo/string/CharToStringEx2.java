package com.softwaretestingo.string;
public class CharToStringEx2 
{
	public static void main(String[] args) 
	{
		// char array to string
		char[] ca = { 'a', 'b', 'c' };
		String str = String.valueOf(ca);
		System.out.println(str);
		// recommended way
		str = new String(ca);
	}
}