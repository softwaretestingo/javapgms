package com.softwaretestingo.interfacepackage;
interface Interface1
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Interface Extend Another Interface Example
	 * 
	 */
	public void method1();
}
interface Interface2 extends Interface1 
{
	public void method2();
}
public class InterfaceExtendEx implements Interface2
{
	/* Even though this class is only implementing the
	 * interface Interface2, it has to implement all the methods
	 * of Interface1 as well because the interface Interface2 extends Interface1
	 */
	public void method1()
	{
		System.out.println("method1");
	}
	public void method2()
	{
		System.out.println("method2");
	}
	public static void main(String args[])
	{
		Interface2 obj = new InterfaceExtendEx();
		obj.method2();
	}
}