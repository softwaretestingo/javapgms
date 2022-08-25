package com.softwaretestingo.Basic;

class basevehicleclass
{
	public void speed()
	{
		System.out.println("The Speed Of Vehicle Class");
	}
}
public class Dynamic_Binding extends basevehicleclass
{
	public void speed()
	{
		System.out.println("The Speed of Dynamic Binding Class");
	}
	public static void main(String[] args) 
	{
		//Reference & Object of Base Vehicle Class
		basevehicleclass obj=new basevehicleclass();
		//Reference is of Base Vehicle Class & Object is of Dynamic Binding Class
		basevehicleclass obj1=new Dynamic_Binding();
		obj.speed();
		obj1.speed();
	}
}