package com.softwaretestingo.STRING;
class PClass
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Calling Parent Class Method With The Help Of Super Keyword
	 * 
	 */
	void show()
	{
		System.out.println("Parent Class Show Method Called");
	}
}
public class Super_Keyword_With_Method extends PClass
{
	void show()
	{
		System.out.println("Child Class Show Method Called");
	}
	
	void callShowMethod()
	{
		show();
		super.show();
	}
	public static void main(String[] args) 
	{
		Super_Keyword_With_Method obj=new Super_Keyword_With_Method();
		obj.callShowMethod();
	}
}