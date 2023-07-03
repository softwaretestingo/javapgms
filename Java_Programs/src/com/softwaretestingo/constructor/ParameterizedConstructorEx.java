package com.softwaretestingo.constructor;

public class ParameterizedConstructorEx 
{
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