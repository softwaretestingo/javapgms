package com.softwaretestingo.string;
public class StringToCharExample4 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Get Specific Character From a String With Help Of codePointAt()
	 * 
	 */
	public static void main(String[] args) 
	{
		String s="Softwaretestingo";  
		
		//The codePointAt return the unicode of the character thats 
		//why we have done the type casting
		char c=(char) s.codePointAt(0);  
		System.out.println("1st character is: "+c);  
	}
}