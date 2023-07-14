package com.softwaretestingo.basic;
class Animal
{
	public void makeSound() 
	{
		System.out.println("The animal makes a sound");
	}
}
class Dog extends Animal 
{
	public void makeSound() 
	{
		System.out.println("The dog barks");
	}
}
public class InstanceOfEx2
{
	public static void main(String[] args) 
	{
		//We Can call any method of Dog class using animal reference
		//Upcasting
		Animal animal = new Dog();
		
		
		if(animal instanceof Dog) 
		{
			Dog dog = (Dog) animal;
			dog.makeSound();
		}
	}
}