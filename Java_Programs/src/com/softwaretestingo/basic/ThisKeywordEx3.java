package com.softwaretestingo.basic;
class ex3
{  
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
public class ThisKeywordEx3 
{
	public static void main(String[] args) 
	{
		ex3 obj=new ex3(2022);
	}
}