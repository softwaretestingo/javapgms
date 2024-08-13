package com.softwaretestingo.sto02003_oops.polymorphism.overriding;

import com.softwaretestingo.sto02003_oops.polymorphism.overloading.STO0001_0_MethodOverloadingEx1;

class MethodOverridingEx1
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Method Overriding Example
	 * 
	 */
	public void speed()
	{
		System.out.println("Parent Speed method Executed");
	}
}
public class STO0001_0_MethodOverriding extends STO0001_0_MethodOverloadingEx1
{
	//This Method Becomes Override the Parent Method
	public void speed()
	{
		System.out.println("Child Speed Method executed");
	}
	public static void main(String[] args) 
	{
		STO0001_0_MethodOverriding obj=new STO0001_0_MethodOverriding();
		obj.speed();
	}
}