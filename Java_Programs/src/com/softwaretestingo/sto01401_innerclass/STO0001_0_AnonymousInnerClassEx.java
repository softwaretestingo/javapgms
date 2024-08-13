package com.softwaretestingo.sto01401_innerclass;
class greeting
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: This is Example Of Anonymous Inner Class That Extends A Class
	 * 
	 */
	public void sayHello()
	{
		System.out.println("Say Hello To All");
	}
}
public class STO0001_0_AnonymousInnerClassEx 
{
	public static void main(String[] args) 
	{
		//Anonymous Inner class 1
		greeting engObj=new greeting()
		{
			// This is equivalent code of extending greeting class and then overriding sayHello() method
			public void sayHello()
			{
				System.out.println("Hello");
			}
		};
		
		//Anonymous Inner class 2
		greeting hindiObj=new greeting()
		{
			// This is equivalent code of extending greeting class and then overriding sayHello() method
			public void sayHello()
			{
				System.out.println("Namaste");
			}
		};
		
		//This will call Anonymous Inner class 1 Method
		engObj.sayHello();
		
		//This will call Anonymous Inner class 2 Method
		hindiObj.sayHello();
		
		//Call outer class method
		greeting obj=new greeting();
		obj.sayHello();
	}
}