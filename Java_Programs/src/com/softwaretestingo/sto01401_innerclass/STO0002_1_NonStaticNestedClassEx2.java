package com.softwaretestingo.sto01401_innerclass;
public class STO0002_1_NonStaticNestedClassEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Non Static Nested Class Example
	 * 
	 */
	// private variable of the outer class
	private int value = 50;

	// inner class
	class JavaInnerClass
	{
		// public variable of the inner class
		public int getValue()
		{
			System.out.println("getValue method of inner class is called");
			return value;
		}
	}
	public static void main(String[] args) 
	{
		//Creating object of outer class
		STO0002_1_NonStaticNestedClassEx2 obj=new STO0002_1_NonStaticNestedClassEx2();
		
		//Creating object of inner class
		STO0002_1_NonStaticNestedClassEx2.JavaInnerClass innerobj=obj.new JavaInnerClass();
		System.out.println("Value : " + innerobj.getValue());
	}
}