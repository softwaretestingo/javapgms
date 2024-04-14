package com.softwaretestingo.basic;
public class InstanceOfEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: instanceof Keyword Of Java Example
	 * @param args
	 */
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