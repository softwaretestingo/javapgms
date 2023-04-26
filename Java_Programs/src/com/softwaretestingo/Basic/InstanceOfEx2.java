package com.softwaretestingo.Basic;
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
		Animal animal = new Dog();
        if(animal instanceof Dog) 
        {
            Dog dog = (Dog) animal;
            dog.makeSound();
        }
	}
}