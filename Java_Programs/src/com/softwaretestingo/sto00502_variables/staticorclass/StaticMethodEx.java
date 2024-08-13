package com.softwaretestingo.sto00502_variables.staticorclass;
public class StaticMethodEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Static Keyword Example
	 * @param args
	 */
	//Static Variable
	static int a=10;
	
	//Static Method
	static void display()
	{
		System.out.println("The Static Value Of a Is: "+a);
	}
	public static void main(String[] args) 
	{
		display();
	}
}
