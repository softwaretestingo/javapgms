package com.softwaretestingo.basic;
class Animal
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: instanceof Keyword Example
	 * @param args
	 */
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