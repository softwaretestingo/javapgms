package com.softwaretestingo.sto019_method.thiskeyword;
class ex3
{  
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Calling Default Constructor from Parameterized Constructor Using this Keyword
	 * 
	 */
	ex3()
	{
		System.out.println("Default Constructor Of Class Ex2 Called");
	}
	ex3(int a)
	{
		// this() should always the first statement otherwise you will get errors
		this();
		System.out.println("Parameterized Constructor Is Called & and the Value: "+a);
	}
}  
public class STO0003_0_ThisKeywordEx3 
{
	public static void main(String[] args) 
	{
		ex3 obj=new ex3(2022);
	}
}