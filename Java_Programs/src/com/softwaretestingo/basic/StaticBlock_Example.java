package com.softwaretestingo.basic;
public class StaticBlock_Example 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Static Block Example
	 * @param args
	 */
	static int num;
	static String mystr;
	static
	{
		num = 100;
		mystr = "Static String Varibale Initilized inside static block";
	}
	public static void main(String[] args) 
	{
		System.out.println("Value of num: "+num);
		System.out.println("Value of mystr: "+mystr);
	}
}