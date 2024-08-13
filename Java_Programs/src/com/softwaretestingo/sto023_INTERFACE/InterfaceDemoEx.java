package com.softwaretestingo.sto023_INTERFACE;
interface MyInterface
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Interface Example
	 * 
	 */
	/* compiler will treat them as:
	 * public abstract void method1();
	 * public abstract void method2();
	 */
	public void method1();
	public void method2();
}
public class InterfaceDemoEx implements MyInterface
{
	/* This class must have to implement both the abstract methods
	 * else you will get compilation error
	 */
	public void method1()
	{
		System.out.println("implementation of method1");
	}
	public void method2()
	{
		System.out.println("implementation of method2");
	}
	public static void main(String[] args) 
	{
		MyInterface obj = new InterfaceDemoEx();
		obj.method1();
	}
}