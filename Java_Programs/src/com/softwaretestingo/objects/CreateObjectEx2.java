package com.softwaretestingo.objects;
public class CreateObjectEx2  implements Cloneable
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		// Way 1: using new operator or keyword
		CreateObjectEx2 obj=new CreateObjectEx2();

		// Way 2: using clone() method of Object class
		CreateObjectEx2 obj1 = (CreateObjectEx2)obj.clone();

		// invoking display() method
		obj1.display();
	}
	
	//display() method to test
	public void display()
	{
		System.out.println("display() method is invoked");
	}
}