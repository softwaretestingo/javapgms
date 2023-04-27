package com.softwaretestingo.Basic;
public class ClassVariable 
{
	public static int intVar=10;
	public static void main(String[] args) 
	{
		ClassVariable obj1=new ClassVariable();
		ClassVariable obj2=new ClassVariable();
		System.out.println("Object1: "+obj1.intVar);
		System.out.println("Object2: "+obj2.intVar);

		//Initialize Class Variable Inside Main Method
		obj1.intVar=20;
		System.out.println("Updated Value: "+obj1.intVar); 
		System.out.println("After Update the Value: "+intVar); 
		System.out.println("By Calling From a Newly Created Object: "+obj2.intVar);
	}
}