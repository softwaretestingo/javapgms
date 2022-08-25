package com.softwaretestingo.oops;

class MethodOverridingEx1
{
	public void speed()
	{
		System.out.println("Parent Speed method Executed");
	}
}
public class MethodOverriding extends MethodOverloadingEx1
{
	//This Method Becomes Override the Parent Method
	public void speed()
	{
		System.out.println("Child Speed Method executed");
	}
	public static void main(String[] args) 
	{
		MethodOverriding obj=new MethodOverriding();
		obj.speed();
	}
}