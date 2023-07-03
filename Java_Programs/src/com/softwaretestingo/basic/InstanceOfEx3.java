package com.softwaretestingo.basic;
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
public class InstanceOfEx3
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