package com.softwaretestingo.innerclass;
//This is Example Of Anonymous Inner Class That Extends A Class
class greeting
{
	public void sayHello()
	{
		System.out.println("Say Hello To All");
	}
}
public class AnonymousInnerClassEx 
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
