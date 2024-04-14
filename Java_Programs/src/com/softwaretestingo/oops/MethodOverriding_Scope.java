package com.softwaretestingo.oops;
class ParentCL
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Method Overriding Scope Example
	 * 
	 */
	public void display()
	{
		System.out.println("Parent Display Method Executed");
	}
}
class ChildCL extends ParentCL
{
	//private void display()
	{
		System.out.println("Child Display Method Executed");
	}
}
public class MethodOverriding_Scope 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	}
}