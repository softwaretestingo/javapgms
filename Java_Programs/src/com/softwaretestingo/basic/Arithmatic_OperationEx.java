package com.softwaretestingo.basic;
abstract class operations
{
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
public class Arithmatic_OperationEx 
{
	public static void main(String[] args) 
	{
		operations obj=new addition();
		obj.printinfo();
		
		operations  obj1=new subsctraction();
		obj1.printinfo();
	}
}