package com.softwaretestingo.sto019_method.instanceofkeyword;
interface Vehicle_interface 
{
	public void drive();
}
class Car implements Vehicle_interface 
{
	public void drive() 
	{
		System.out.println("The car is driving");
	}
}
public class STO0003_0_InstanceOfEx3
{
	public static void main(String[] args) 
	{
		Vehicle_interface vehicle = new Car();
		if(vehicle instanceof Vehicle_interface) 
		{
			vehicle.drive();
		}
	}
}