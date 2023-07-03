package com.softwaretestingo.basic;
public class InstanceOfEx1 
{
	public static void main(String[] args) 
	{
		String abc="Hello World";
		if(abc instanceof String) 
		{
		   System.out.println("abc is an instance of String");
		} 
		else 
		{
		   System.out.println("abc is not an instance of String");
		}
	}
}