package com.softwaretestingo.innerclass;
public class NonStaticNestedClassEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Non Static Nested Class Example
	 * 
	 */
	private int x= 1;
	public void innerInstance()
	{
		innerclass inner = new innerclass();
		inner.seeOuter();
	}
	public static void main(String[] args) 
	{
		NonStaticNestedClassEx1 obj=new NonStaticNestedClassEx1();
		obj.innerInstance();
	}
	//Inner Class Example
	class innerclass
	{
		public void seeOuter () 
		{
			System.out.println("Outer Value of x is :" + x);
		}
	}
}