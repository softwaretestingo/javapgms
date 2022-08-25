package com.softwaretestingo.Basic;

class Vehicle
{
	public void speed()
	{
		System.out.println("Speed Method of Vehicle Class Executed");
	}
}
class Bike extends Vehicle
{
	public void speed()
	{
		System.out.println("Speed Method Of Bike Class Executed");
	}
}
public class MethodDispatch extends Vehicle
{
	public static void main(String[] args) 
	{
		Vehicle obj=new Vehicle();
		Vehicle obj1=new Bike();
		
		obj.speed();
		obj1.speed();

	}
}