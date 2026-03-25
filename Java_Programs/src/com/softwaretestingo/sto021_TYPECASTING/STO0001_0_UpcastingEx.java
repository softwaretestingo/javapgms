package com.softwaretestingo.sto021_TYPECASTING;
class Animal 
{
	void eat() 
	{
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal 
{
	void bark() 
	{
		System.out.println("Dog is barking");
	}
}
public class STO0001_0_UpcastingEx 
{
	public static void main(String[] args) 
	{
		Animal obj=new Dog();
		obj.eat();
		/* If the Method is Not Available in Parent Class then If you Do Upcasting then 
		 * you Will Get Error
		 */
		//obj.bark();
	}
}