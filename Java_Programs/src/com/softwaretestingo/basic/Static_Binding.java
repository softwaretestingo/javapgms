package com.softwaretestingo.basic;

class basevehicle
{
	public static void speed()
	{
		System.out.println("The Speed Of Vehicle Class");
	}
}
public class Static_Binding extends basevehicle
{
	public static void speed()
	{
		System.out.println("The Speed of Static Binding Class");
	}
	public static void main(String[] args) 
	{
		//Obj is Reference & object of Base vehicle class and 
		basevehicle obj=new basevehicle();
		//obj1 is reference of base vehicle class and Object is of Static_Binding
		basevehicle obj1=new Static_Binding();
		obj.speed();
		obj.speed();
	}
}