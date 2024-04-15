package com.softwaretestingo.thiskeyword;
class ex2
{  
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Calling Same Class other method with this keyword 
	 * 
	 */
	void ex21() 
	{
		System.out.println("Inside Print Ex21");
	}
	void ex22() 
	{
		System.out.println("Inside Print Ex22");
		ex21();
		this.ex21();
	}
	
}  
public class ThisKeywordEx2 
{
	public static void main(String[] args) 
	{
		ex2 obj=new ex2();
		obj.ex22();
	}
}