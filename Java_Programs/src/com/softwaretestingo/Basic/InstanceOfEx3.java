package com.softwaretestingo.Basic;
interface intef
{
}
class test1 implements intef
{
}
public class InstanceOfEx3 extends test1
{
	public static void main(String[] args) 
	{
		InstanceOfEx3 obj=new InstanceOfEx3();
		System.out.println(obj instanceof intef);
	}
}