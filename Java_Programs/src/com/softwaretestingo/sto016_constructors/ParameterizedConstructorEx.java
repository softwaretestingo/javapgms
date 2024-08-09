package com.softwaretestingo.sto016_constructors;
public class ParameterizedConstructorEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Calling Parameterized Constructor
	 * 
	 */
	String name, URL;
	ParameterizedConstructorEx(String name,String URL)
	{
		this.name=name;
		this.URL=URL;
		
		System.out.println("Name is: "+name);
		System.out.println("URL Of the Blog is: "+URL);
	}
	
	public static void main(String[] args) 
	{	
		ParameterizedConstructorEx obj=new ParameterizedConstructorEx("SoftwareTestingo","www.softwaretestingo.com");
	}
}