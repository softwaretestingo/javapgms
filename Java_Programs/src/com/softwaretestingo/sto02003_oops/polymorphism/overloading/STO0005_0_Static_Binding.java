package com.softwaretestingo.sto02003_oops.polymorphism.overloading;
class basevehicle
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Static Binding Example
	 * 
	 */
	public static void speed()
	{
		System.out.println("The Speed Of Vehicle Class");
	}
}
public class STO0005_0_Static_Binding extends basevehicle
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
		basevehicle obj1=new STO0005_0_Static_Binding();
		obj.speed();
		obj.speed();
	}
}