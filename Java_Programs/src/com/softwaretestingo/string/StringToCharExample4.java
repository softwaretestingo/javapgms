package com.softwaretestingo.string;
public class StringToCharExample4 
{
	public static void main(String[] args) 
	{
		String s="Softwaretestingo";  
		
		//The codePointAt return the unicode of the character thats 
		//why we have done the type casting
		char c=(char) s.codePointAt(0);  
		System.out.println("1st character is: "+c);  
	}
}