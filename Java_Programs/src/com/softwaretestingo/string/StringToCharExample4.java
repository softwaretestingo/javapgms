package com.softwaretestingo.string;

public class StringToCharExample4 
{
	public static void main(String[] args) 
	{
		String s="Softwaretestingo";  
		char c=(char) s.codePointAt(0);  
		System.out.println("1st character is: "+c);  
	}
}