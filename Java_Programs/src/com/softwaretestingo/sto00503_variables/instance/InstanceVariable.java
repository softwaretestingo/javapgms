package com.softwaretestingo.sto00503_variables.instance;
public class InstanceVariable 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Instance Variable Example
	 * @param args
	 */
	public String instVariable="Instance Variable";
	public static void main(String[] args) 
	{
		InstanceVariable obj1=new InstanceVariable();
		InstanceVariable obj2=new InstanceVariable();

		System.out.println("Obj1 Value: "+obj1.instVariable);
		System.out.println("Obj2 Value: "+obj2.instVariable);

		//Instance Variable Value Changed
		obj1.instVariable="Variable Value Changed";
		System.out.println("Obj1 Value: "+obj1.instVariable);
		System.out.println("Obj2 Value: "+obj2.instVariable);
	}
}
