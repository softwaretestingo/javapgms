package com.softwaretestingo.sto022_abstractclass;
abstract class AbstractClassWithConstructorParent
{
	int a;
	AbstractClassWithConstructorParent()
	{
		a=10;
		System.out.println("Abstract Class Constructor Called");
		System.out.println("The Value Of A is: "+a);
	}
	
	public void printSomething()
	{
		System.out.println("Abstract Class Method Called");
	}
}
public class STO0003_0_AbstractClassWithConstructor 
{
	public static void main(String[] args)
	{
		// You Can't Create an Object Of an Abstract Class
		// This Will Give Error "Cannot instantiate the type AbstractClassWithConstructorParent"
		//AbstractClassWithConstructorParent obj=new AbstractClassWithConstructorParent();
		
		/**
		 * But all you can do is, you can create an Anonymous Class.
		 * Anonymous Class: class declared and instantiate at the same place/line
		 * like below
		 */
		// With this object we can access abstract class method and  variables
		AbstractClassWithConstructorParent obj=new AbstractClassWithConstructorParent() {};
		obj.printSomething();
		System.out.println(obj.a);
	}
}
