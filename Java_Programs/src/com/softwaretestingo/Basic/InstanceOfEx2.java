package com.softwaretestingo.Basic;
class abc{}
public class InstanceOfEx2 extends abc
{
	public static void main(String[] args) 
	{
		InstanceOfEx2 obj=new InstanceOfEx2();
		System.out.println(obj instanceof InstanceOfEx2);
		System.out.println(obj instanceof abc);
	}
}