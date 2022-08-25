package com.softwaretestingo.Basic;
public class StaticBlock_Example 
{
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