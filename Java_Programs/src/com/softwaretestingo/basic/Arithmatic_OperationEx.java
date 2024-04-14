package com.softwaretestingo.basic;
abstract class operations
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Arithmetic Operation In Java
	 */
	abstract public void printinfo();
}
class addition extends operations
{
	public void printinfo()
	{
		int a=110;
		int b=20;
		System.out.println("The Sum Of Values : "+(a+b));
	}
}
class subsctraction extends operations
{
	public void printinfo()
	{
		int a=110;
		int b=20;
		System.out.println("The Substraction Of Values : "+(a-b));
	}
}
class multiplication extends operations
{
	public void printinfo()
	{
		int a=110;
		int b=20;
		System.out.println("The Multiplication Of Values : "+(a*b));
	}
}
class divide extends operations
{
	public void printinfo()
	{
		int a=110;
		int b=20;
		System.out.println("The Divide Of Values : "+(a/b));
	}
}
public class Arithmatic_OperationEx 
{
	public static void main(String[] args) 
	{
		operations obj=new addition();
		obj.printinfo();
		
		operations  obj1=new subsctraction();
		obj1.printinfo();
		
		operations  obj2=new multiplication();
		obj2.printinfo();
		
		operations  obj3=new divide();
		obj3.printinfo();
	}
}