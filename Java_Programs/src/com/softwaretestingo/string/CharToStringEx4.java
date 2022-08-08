package com.softwaretestingo.string;
public class CharToStringEx4 
{
	public static void main(String[] args) 
	{
		char[] charArray = { 'S', 'o', 'f', 't', 'w', 'a', 'r', 'e'};

		String str = String.copyValueOf(charArray);
		System.out.println(str);
	}
}