package com.softwaretestingo.InnerClass;
public class NonStaticNestedClassEx2 
{
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
		NonStaticNestedClassEx2 obj=new NonStaticNestedClassEx2();
		
		//Creating object of inner class
		NonStaticNestedClassEx2.JavaInnerClass innerobj=obj.new JavaInnerClass();
		System.out.println("Value : " + innerobj.getValue());
	}
}